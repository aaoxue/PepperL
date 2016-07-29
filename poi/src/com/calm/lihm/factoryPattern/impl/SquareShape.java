/**  
 * @author lihm
 * @Title: SquareShape.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:30:56 
*/
package com.calm.lihm.factoryPattern.impl;

import com.calm.lihm.factoryPattern.Shape;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:30:56
 * @Description: TODO
 */
public class SquareShape implements Shape {

	/* (non-Javadoc)
	 * @see com.calm.lihm.factoryPattern.Shape#getShapeStr()
	 */
	@Override
	public String getShapeStr() {
		// TODO Auto-generated method stub
		return "square";
	}

	/* (non-Javadoc)
	 * @see com.calm.lihm.factoryPattern.Shape#getPremeter()
	 */
	@Override
	public Integer getPremeter() {
		// TODO Auto-generated method stub
		return 25;
	}

}
