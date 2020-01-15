package com.application;

import com.basefactory.Guifactory;
import com.guielements.Button;


public class Application 
{
	Guifactory factory;
	Button button;
	
	public Application(Guifactory factory) 
	{
		this.factory = factory;
		
	}
	void createUI()
	{
		this.button= factory.createButton();
	}
	
	void paint()
	{
		button.paint();
	}

}
