package Guru99TestPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import capstoneProject.Homepage_Guru99;

public class TC_LoginpageLoginFunctionality extends Guru99TC {
	
	Homepage_Guru99 obj_Homepage_Guru99;
	@Test
	public void TC_3_LoginPageLoginFuncionality() {
		obj_Homepage_Guru99 = obj_PageValidation_Guru99.PageValidationLoginFunction(guru99_WD);
		
		boolean result = obj_Homepage_Guru99.HomepageTitleCheck(guru99_WD);
		AssertJUnit.assertTrue(result);
		
	}
}
