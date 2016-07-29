/**  
 * @author lihm@shishike.com
 * @Title: CheckWeixinBill.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2015年12月7日 下午12:32:58 
 * @version V1.0  
*/
package com.calm.lihm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Author: lihm@shishike.com
 * @Date：2015年12月7日 下午12:32:58
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class CheckWeixinBill {
	public static String excelPath="/Users/Mac/File/";

	public static void main(String args[]){
		Map<String, String> weixinMap = getWeixinListFromExcel();
		Map<String, String> tradeMap = getTradeListFromExcel();
		for (String key:tradeMap.keySet()) {
			if (weixinMap.containsKey(key)) {
				if (weixinMap.get(key).equals(tradeMap.get(key))) {
					continue;
				}else {
					System.out.println(key+"数据不一致，客如云："+tradeMap.get(key)+"---财付通："+weixinMap.get(key));
				}
			}else {
				System.out.println(key+"在财付通中未找到对应记录");
			}
		}
		
		for (String key:weixinMap.keySet()) {
			if (tradeMap.containsKey(key)) {

			}else {
				System.out.println(key+"在客如云中未找到对应记录");
			}
		}
	}
	@SuppressWarnings("resource")
	public static Map<String, String> getWeixinListFromExcel() {
		Map<String, String> weixinMap = new HashMap<String, String>();
		try {
			FileInputStream file = new FileInputStream(excelPath+"1.xlsx");
			
			Workbook book=null;
			try {
				
				book=new XSSFWorkbook(file);
				
			} catch (Exception e) {
				POIFSFileSystem ts = new POIFSFileSystem(file);
				book=new HSSFWorkbook(ts);
			}
//			HSSFWorkbook wb = new HSSFWorkbook(ts);
			Sheet sheet = book.getSheetAt(1);
			Row row=null;
			int i=2;
			while(sheet.getRow(i)!=null){
				row=sheet.getRow(i);
				System.out.println(row.getCell(1)+"--微信-"+row.getCell(6));
				weixinMap.put(row.getCell(1).toString(), row.getCell(6).toString());
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return weixinMap;
	}
	
	
	@SuppressWarnings("resource")
	public static Map<String, String> getTradeListFromExcel() {
		Map<String, String> tradeMap = new HashMap<String, String>();
		try {
			FileInputStream file = new FileInputStream(excelPath+"1.xlsx");
			
			Workbook book=null;
			try {
				
				book=new XSSFWorkbook(file);
				
			} catch (Exception e) {
				POIFSFileSystem ts = new POIFSFileSystem(file);
				book=new HSSFWorkbook(ts);
			}
//			HSSFWorkbook wb = new HSSFWorkbook(ts);
			Sheet sheet = book.getSheetAt(0);
			Row row=null;
			int i=0;
			while(sheet.getRow(i)!=null){
				row=sheet.getRow(i);
				System.out.println(row.getCell(3)+"--客如云-"+row.getCell(5));
				tradeMap.put(row.getCell(3).toString(), row.getCell(5).toString());
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tradeMap;
	}

}
