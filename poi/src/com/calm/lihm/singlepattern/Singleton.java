/**  
 * @author lihm
 * @Title: Singleton.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:50:57 
*/
package com.calm.lihm.singlepattern;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:50:57
 * @Description: TODO
 */
public class Singleton {
	private static Singleton singleton=new Singleton();
	private Singleton(){};
	public static synchronized Singleton getInstance(){
		return singleton;
	}
	public void showMessage(){
		System.out.println("hello, singleton!");
	}
}
