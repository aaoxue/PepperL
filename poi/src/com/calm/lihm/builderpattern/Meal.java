/**  
 * @author lihm
 * @Title: Meal.java 
 * @Description: TODO
 * @date 2016年7月29日 下午2:30:45 
*/
package com.calm.lihm.builderpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: lihm
 * @Date：2016年7月29日 下午2:30:45
 * @Description: TODO
 */
public class Meal {
	private java.util.List<Item> items=new ArrayList<>();
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost=0.0f;
		for(Item item:items){
			cost+=item.price();
		}
		return cost;
	}
	
	public void showItems(){
		for (Item item : items) {
			System.out.print("Item : "+item.name());
			System.out.print(",Packing : "+item.packing().pack());
			System.out.println(",Price : "+item.price());
		}
	}
}
