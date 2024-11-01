package Guru99TestPackage;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TC_LoginpageTitleCheck extends Guru99TC{
  @Test
  public void TC_1_LoginPageTitleCheck() {
	  
	  boolean result = obj_PageValidation_Guru99.LoginpageTitleCheck(guru99_WD);
	  Assert.assertTrue(result);
	  
  }
}
