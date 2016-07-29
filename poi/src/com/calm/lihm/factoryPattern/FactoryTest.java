/**  
 * @author lihm
 * @Title: FactoryTest.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:35:44 
*/
package com.calm.lihm.factoryPattern;

import com.calm.lihm.factoryPattern.factory.ShapeFactory;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:35:44
 * @Description: TODO
 */
public class FactoryTest {

	/** 
	 * @Author lihm
	 * @Description: TODO
	 * @Param @param args
	 * @Return void 返回类型 
	 */
	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		Shape shape = factory.getShape("square");
		System.out.println(shape.getShapeStr());
		Shape shape2=factory.getShape("circle");
		System.out.println(shape2.getShapeStr());

	}

}
