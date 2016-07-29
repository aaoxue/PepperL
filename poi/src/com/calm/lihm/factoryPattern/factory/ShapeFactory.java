/**  
 * @author lihm
 * @Title: ShapeFactory.java 
 * @Description: TODO
 * @date 2016年7月4日 下午5:32:13 
*/
package com.calm.lihm.factoryPattern.factory;

import com.calm.lihm.factoryPattern.Shape;
import com.calm.lihm.factoryPattern.impl.CirclaShape;
import com.calm.lihm.factoryPattern.impl.SquareShape;

/**
 * @Author: lihm
 * @Date：2016年7月4日 下午5:32:13
 * @Description: TODO
 */
public class ShapeFactory {
	Shape shape;
	public Shape getShape(String type){
		switch (type) {
		case "square":
			shape=new SquareShape();
			break;
		case "circle":
			shape=new CirclaShape();
			break;
		}
		return shape;
	}
}
