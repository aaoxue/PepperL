/**  
 * @author lihm
 * @Title: MealBuilder.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:35:20 
*/
package com.calm.lihm.builderpattern;

import com.calm.lihm.builderpattern.impl.ChickenBurger;
import com.calm.lihm.builderpattern.impl.Coke;
import com.calm.lihm.builderpattern.impl.Pepsi;
import com.calm.lihm.builderpattern.impl.VegBurger;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:35:20
 * @Description: TODO
 */
public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
