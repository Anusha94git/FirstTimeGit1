package com.OHRMTestScripts;

import org.testng.annotations.Test;

import com.OHRM.lib.General;

public class TC_101
{
	@Test
	public void LoginTestRun()
	{
		General g= new General();
		g.setup();
		g.login();
		g.teardown();
	}
	
}
