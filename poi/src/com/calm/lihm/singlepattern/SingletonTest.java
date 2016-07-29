/**  
 * @author lihm
 * @Title: SingletonTest.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:53:57 
*/
package com.calm.lihm.singlepattern;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:53:57
 * @Description: TODO
 */
public class SingletonTest {

	/** 
	 * @Author lihm
	 * @Description: TODO
	 * @Param @param args
	 * @Return void 返回类型 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger inc = new AtomicInteger();
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}

}
