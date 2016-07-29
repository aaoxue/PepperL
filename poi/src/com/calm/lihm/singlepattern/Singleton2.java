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
public class Singleton2 {
	/**
	 * volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。

　　  *2）禁止进行指令重排序。
	 */
	private volatile static Singleton2 singleton;
	private Singleton2(){};
	public static Singleton2 getInstance(){
		if (singleton==null) {
			synchronized (Singleton2.class) {
				if (singleton==null) {
					singleton=new Singleton2();
				}
			}
		}
		return singleton;
	}
}
