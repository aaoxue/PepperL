/**  
 * @author lihm@shishike.com
 * @Title: Desc.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2016年1月19日 上午11:15:43 
 * @version V1.0  
*/
package com.calm.lihm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lihm@shishike.com
 * @Date：2016年1月19日 上午11:15:43
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Desc {
String desc();
int age() default 18;
}
