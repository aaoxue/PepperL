/**  
 * @author lihm@shishike.com
 * @Title: CheckWeixinBill.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2015年12月7日 下午12:32:58 
 * @version V1.0  
*/
package com.calm.lihm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: lihm@shishike.com
 * @Date：2015年12月7日 下午12:32:58
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class ModifyData {
	 public static String getUUID() {
	        UUID u = UUID.randomUUID();
	        return u.toString().replaceAll("-", "");
	    }
	public static void main(String[] args) {
		//格式  transaction_no1,pay_record_id1-transaction_no2,pay_record_id2
		String data = "CPRP10038600,2015123121001004620020630279-CPRP10038749,2015123121001004880048687027";
		List<String[]> list = new ArrayList<String[]>();
		
		for(String s:data.split("-")){
			String[] arrs = new String[2];
			String[] ss = s.split(",");
			arrs[0]=ss[0];//pay_record_id
			arrs[1]=ss[1];//transaction_no
			list.add(arrs);
		}
		if(list!=null && list.size()>0){
			for(String[] arr:list){
				//插入cashier_notify sql
				
				System.out.println("-- 通知数据处理");
				String sql1 = "insert into cashier_notify(appid,relate_id,notify_type,notify_status,count,next_notify_time,data,url,status,create_time,uuid) "
						+ "select * from (select p.appid appid,p.id relate_id,1 notify_type,1 notify_status,0 count,NOW() next_notify_time,"
						+ "CONCAT('{\"actualFee\":',p.pay_fee,',\"appid\":',p.appid,',\"couponFee\":0,\"outTradeNo\":\"',p.out_trade_no,'\",\"payFee\":',p.pay_fee,',\"payTime\":\"',"+System.currentTimeMillis()+",'\",\"tradeState\":PAYSUCCESS,\"tradeStateDesc\":\"SUCCESS\",\"cashierBusinessNo\":\"CPRP\",\"transactionNo\":"+arr[1]+"}') data,"
						+ "pr.notify_url url,1 status,now() create_time,'"+getUUID()+"' uuid "
						+ "from cashier_pay_record pr,cashier_pay p where p.id=pr.pay_id and p.pay_status = 1 and pr.id="+arr[0].replace("CPRP", "")+") as a;";
				System.out.println(sql1);
				System.out.println("-- 未支付数据处理");
				String sql2 = "update cashier_pay p set p.transaction_no='"+arr[1]+"'"
						+ ",p.notify_status=1,p.pay_platform=-6,p.pay_type=2,p.pay_time=now(),p.pay_status=3 where p.pay_status=1 and id=(select pay_id from cashier_pay_record pr "
								+ "where p.id=pr.pay_id and pr.id="+arr[0].replace("CPRP", "")+");";
//				System.out.println(sql2);
				//修改cashier_pay sql  --- 未支付数据处理
//				System.out.println("作废数据处理");
				String sql4 = "update cashier_pay_record p set p.status=1"
						+ " where p.status=2 and p.id="+arr[0].replace("CPRP", "")+";";
//				System.out.println(sql4);
				String sql3 = "update cashier_pay_record p set p.status=2"
						+ " where p.status=1 and p.pay_platform!=-6 and p.pay_type!=2 and p.pay_id=(select pay_id from cashier_pay_record where id="+arr[0].replace("CPRP", "")+");";
//				System.out.println(sql3);
				String sql = "update cashier_pay_record p set transaction_no='"+arr[0]+"' ,pay_status=3,coupon_fee="+0+
						",actual_fee="+0+",notify_status=1 where id=(select pay_id from cashier_pay_record pr "
								+ "where p.id=pr.pay_id and pr.id="+arr[1]+");";
//				System.out.println(sql);
				System.out.println("");
				
			}
		}
	}


}
