package com.myorg.utilities;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CommonUtils {
	public static void switchToWindow(){
		String parentWindowHandle =new WebDriverTestBase().getDriver().getWindowHandle();
		for(String window :new WebDriverTestBase().getDriver().getWindowHandles()){
			if(!window.equals(parentWindowHandle)){
				new WebDriverTestBase().getDriver().switchTo().window(window);
			}
			
		}
	}

}
