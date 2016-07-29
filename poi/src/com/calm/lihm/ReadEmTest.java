/**  
 * @author lihm@shishike.com
 * @Title: SpringTest.java 
 * @Package com.calm.lihm 
 * @Description: TODO
 * @date 2016年4月7日 上午9:13:39 
 * @version V1.0  
*/
package com.calm.lihm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.xml.sax.EntityResolver;

/**
 * @Author: lihm@shishike.com
 * @Date：2016年4月7日 上午9:13:39
 * @Description: TODO
 * @Version: 1.0
 * @CopyRight：Copyright ＠2050 keruyun Incorporated. All rights reserved.
 */
public class ReadEmTest {
	 public static void main(String[] args){
		 System.out.println(new Timestamp(1467702434000l));
//		          ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//读取bean.xml中的内容
//		          Person p = ctx.getBean("person",Person.class);//创建bean的引用对象
//		          p.info();
//		          DefaultListableBeanFactory dlbfBeanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
////		          XmlBeanDefinitionReader
		      }
}
