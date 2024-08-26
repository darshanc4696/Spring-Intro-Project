package com.tap.ioc.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.ioc.impl.IndianArmy;
import com.tap.ioc.impl.IndianNavy;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext	cx = new ClassPathXmlApplicationContext("beans.xml");
    	
    	IndianArmy ia = (IndianArmy)cx.getBean("ia");
    	IndianNavy in = (IndianNavy)cx.getBean("in");
    	
    	ia.setCX(cx);
    	in.setCX(cx);
    	
    	ia.addPM();
    	in.addPM();
    }
}
