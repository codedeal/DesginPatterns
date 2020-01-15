package com.winfactory;

import com.basefactory.Guifactory;
import com.guielements.Button;
import com.guielements.CheckBox;
import com.products.WinButton;
import com.products.WinCheckbox;

public class WinFactory implements Guifactory
{

	@Override
	public Button createButton() 
	{
		System.out.print("for windows button");
		return new WinButton();
		
	}

	@Override
	public CheckBox createCheckBox() 
	{
		
		System.out.print("for windows checkboxx");
		return new WinCheckbox();
	}

}
