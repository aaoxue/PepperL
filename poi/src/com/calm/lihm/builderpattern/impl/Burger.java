/**  
 * @author lihm
 * @Title: Burger.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:24:14 
*/
package com.calm.lihm.builderpattern.impl;

import com.calm.lihm.builderpattern.Item;
import com.calm.lihm.builderpattern.Packing;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:24:14
 * @Description: TODO
 */
public abstract class Burger implements Item{
	@Override
	public Packing packing(){
		return new Wrapper();
	}
	@Override
	
	public abstract float price();
}
