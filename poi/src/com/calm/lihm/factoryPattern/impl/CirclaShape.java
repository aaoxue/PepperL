/**  
 * @author lihm
 * @Title: CirclaShape.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:30:07 
*/
package com.calm.lihm.factoryPattern.impl;

import com.calm.lihm.factoryPattern.Shape;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:30:07
 * @Description: TODO
 */
public class CirclaShape implements Shape {

	/* (non-Javadoc)
	 * @see com.calm.lihm.factoryPattern.Shape#getShapeStr()
	 */
	@Override
	public String getShapeStr() {
		// TODO Auto-generated method stub
		return "circle";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.factoryPattern.Shape#getPremeter()
	 */
	@Override
	public Integer getPremeter() {
		// TODO Auto-generated method stub
		return 20;
	}

}
