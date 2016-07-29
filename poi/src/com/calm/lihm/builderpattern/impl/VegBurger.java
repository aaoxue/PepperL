/**  
 * @author lihm
 * @Title: VegBurger.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:27:40 
*/
package com.calm.lihm.builderpattern.impl;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:27:40
 * @Description: TODO
 */
public class VegBurger extends Burger{

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.impl.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.5f;
	}

}
