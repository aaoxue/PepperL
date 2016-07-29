/**  
 * @author lihm@shishike.com
 * @Title: Person.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2016年4月7日 上午9:14:17 
 * @version V1.0  
*/
package com.calm.lihm;

/**
 * @Author: lihm@shishike.com
 * @Date：2016年4月7日 上午9:14:17
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info(){
	System.out.println("name:"+getName()+" age:"+getAge());
	}
}
