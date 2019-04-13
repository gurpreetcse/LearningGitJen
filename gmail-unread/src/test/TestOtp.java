package test;

import org.testng.annotations.Test;

import pages.OtpFill;

public class TestOtp extends DriverStart {
	
	@Test(priority=0)
	public void testFill()
	{
		otpfill=new OtpFill(driver);
		System.out.println("Testing");
		otpfill.code("111111");
		
	}
	

}
