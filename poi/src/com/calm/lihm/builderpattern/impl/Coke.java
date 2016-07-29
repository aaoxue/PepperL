/**  
 * @author lihm
 * @Title: Coke.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:29:17 
*/
package com.calm.lihm.builderpattern.impl;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:29:17
 * @Description: TODO
 */
public class Coke extends ColdDrink{

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "coke drink";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.impl.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 2.5f;
	}

}
