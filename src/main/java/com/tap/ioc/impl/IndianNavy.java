package com.tap.ioc.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.interfaces.Services;
import com.tap.ioc.gov.PrimeMinister;

public class IndianNavy implements Services
{
	ClassPathXmlApplicationContext ax;
	
	public void setCX(ClassPathXmlApplicationContext ax)
	{
		this.ax = ax;
	}
	
	
	@Override
	public void addPM() 
	{
		PrimeMinister pm = (PrimeMinister)ax.getBean("pm");
		System.out.println("Indian Navy says PM is: "+ pm.name);
		System.out.println("Indian Navy bean-factory object address: "+ pm);
	}

}
