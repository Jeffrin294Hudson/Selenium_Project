package Guru99TestPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import capstoneProject.Homepage_Guru99;

public class TC_HomepageUIValidation extends Guru99TC{
	Homepage_Guru99 obj_Homepage_Guru99;
	
  @Test
  public void TC_5_HomePageUICheck() {
		obj_Homepage_Guru99 = obj_PageValidation_Guru99.PageValidationLoginFunction(guru99_WD);
		boolean result = obj_Homepage_Guru99.HomepageUICheck(guru99_WD);	
		Assert.assertTrue(result);
  }
}
