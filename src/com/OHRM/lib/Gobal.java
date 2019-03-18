package com.OHRM.lib;

import org.openqa.selenium.WebDriver;

public class Gobal
{

	public WebDriver driver =null;
	public String url = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public String username_value = "roott";
	public String password_value = "Livetech7.30";
	// id="txtUsername"
	public String username_element = "txtUsername";
	//id="txtPassword"
	public String password_element = "txtPassword";
	//btnLogin
	public String Login_element = "btnLogin";
			
}
