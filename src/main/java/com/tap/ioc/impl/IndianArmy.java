package com.tap.ioc.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.interfaces.Services;
import com.tap.ioc.gov.PrimeMinister;

public class IndianArmy implements Services 
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
		System.out.println("Indian Army says PM is: "+ pm.name);
		System.out.println("Indian Army bean-factory object address: "+ pm);
	}

}
