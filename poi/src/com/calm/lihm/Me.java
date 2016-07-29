/**  
 * @author lihm@shishike.com
 * @Title: Me.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2016年1月19日 上午11:19:38 
 * @version V1.0  
*/
package com.calm.lihm;

import java.lang.reflect.Method;

/**
 * @Author: lihm@shishike.com
 * @Date：2016年1月19日 上午11:19:38
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class Me {
	
	private int age;
	@Desc(age=20,desc="大美妞")
	public String descMe(){
		return "hello";
	}
	
	public static void main(String args[]) throws ClassNotFoundException{
		System.out.println(new Me().descMe());
		//使用类加载齐加载类
		Class class1 = Class.forName("com.calm.lihm.Me");
		boolean b = class1.isAnnotationPresent(Desc.class);
		if (b) {
			Desc desc = (Desc) class1.getAnnotation(Desc.class);
			System.out.println(desc.age()+"desc:"+desc.desc());
		}
		Method[] methods = class1.getMethods();
		for (Method method:methods) {
			boolean methodBoolean = method.isAnnotationPresent(Desc.class);
			if (methodBoolean) {
				Desc descMethodDesc = method.getAnnotation(Desc.class);
				System.out.println("method"+descMethodDesc.age()+descMethodDesc.desc());
			}
		}
	}

}
