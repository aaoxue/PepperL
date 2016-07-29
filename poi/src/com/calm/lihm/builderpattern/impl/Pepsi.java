/**  
 * @author lihm
 * @Title: Pepsi.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:29:58 
*/
package com.calm.lihm.builderpattern.impl;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:29:58
 * @Description: TODO
 */
public class Pepsi extends ColdDrink{

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "pepsi drink";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.impl.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 2.8f;
	}

}
