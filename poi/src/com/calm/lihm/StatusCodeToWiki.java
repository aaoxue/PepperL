/**  
 * @author lihm@shishike.com
 * @Title: StatusCodeToWiki.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2016年6月27日 上午9:43:47 
 * @version V1.0  
*/
package com.calm.lihm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: lihm@shishike.com
 * @Date：2016年6月27日 上午9:43:47
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class StatusCodeToWiki {

	/** 
	 * @Author lihm@shishike.com
	 * @Title: main 
	 * @Description: TODO
	 * @Param @param args TODO
	 * @Return void 返回类型 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = StatusCode.class;
		System.out.println("|字段名    |变量名   |");
		System.out.println("----------|--------|");
		for (int i = 0; i < clazz.getDeclaredFields().length-1; i++) {
			System.out.println(StatusCode.values()[i].getCode()+"|"+StatusCode.values()[i].getMessage()+"|");
			
		}
	}

}
