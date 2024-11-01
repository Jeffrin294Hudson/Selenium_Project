package Guru99TestPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginpageUIValidation extends Guru99TC{
  @Test
  public void TC_2_LoginPageUICheck() {
	  boolean result = obj_PageValidation_Guru99.LoginpageUICheck(guru99_WD);
	  
	  AssertJUnit.assertTrue(result);
  }
}
