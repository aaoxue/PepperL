/**  
 * @author lihm
 * @Title: BuilderPatternDemo.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:38:19 
*/
package com.calm.lihm.builderpattern;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:38:19
 * @Description: TODO
 */
public class BuilderPatternDemo {

	/** 
	 * @Author lihm
	 * @Description: TODO
	 * @Param @param args
	 * @Return void 返回类型 
	 */
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " +vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " +nonVegMeal.getCost());

	}

}
