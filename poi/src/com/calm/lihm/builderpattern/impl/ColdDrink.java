/**  
 * @author lihm
 * @Title: ColdDrink.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:26:01 
*/
package com.calm.lihm.builderpattern.impl;

import com.calm.lihm.builderpattern.Item;
import com.calm.lihm.builderpattern.Packing;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:26:01
 * @Description: TODO
 */
public abstract class ColdDrink implements Item{
	@Override
	public Packing packing(){
		return new Bottle();
	}
	@Override
	public abstract float price();
}
