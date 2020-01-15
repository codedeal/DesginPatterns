package com.macfactory;

import com.basefactory.Guifactory;
import com.guielements.Button;
import com.guielements.CheckBox;
import com.products.LinuxButton;
import com.products.LinuxCheckbox;


public class LinuxFactory implements Guifactory
{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		System.out.print("for linux button");
		return new LinuxButton();
	}

	@Override
	public CheckBox createCheckBox() 
	{
		
		System.out.print("for windows checkboxx");
		return new LinuxCheckbox();
	}

}
