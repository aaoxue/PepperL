/**  
 * @author lihm
 * @Title: ChickenBurger.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:28:35 
*/
package com.calm.lihm.builderpattern.impl;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:28:35
 * @Description: TODO
 */
public class ChickenBurger extends Burger{

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.builderpattern.impl.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
