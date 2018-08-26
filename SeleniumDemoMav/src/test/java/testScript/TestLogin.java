package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.ActiTimeLoginPagePO;

public class TestLogin extends BaseTest {
   @Test(priority=1)
   public void testValidUnPw() {
	   try {
		ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
		   loginPO.login("ravikrishna540","ADE2aJaP");
		   String eTitle="actiTIME - Login";
		   String aTitle=driver.getTitle();
		   System.out.println(eTitle);
		   loginPO.checkTitle(eTitle);
		   Assert.assertEquals(aTitle, eTitle);
	} catch (Exception e) {
		Reporter.log("Exception generated",true);
		Assert.fail();
	}
	   
   }
   @Test(priority=2)
   public void testInvalidun() {
	   try {
		ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
		   loginPO.login("ravi", "ADE2aJaP");
		   loginPO.checkWebElement(loginPO.errorMsg());
		   boolean aStatus=loginPO.errorMsg().isDisplayed();
		   boolean eStatus=true;
		   Assert.assertEquals(aStatus, eStatus);
	} catch (Exception e) {
		Reporter.log("Exception generated",true);
		Assert.fail();
	}
	   
   }
   @Test(priority=3)
   public void Invalidpwd() {
	   try {
		ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
		   loginPO.login("ravikrishna540", "krishna");
		   loginPO.checkWebElement(loginPO.errorMsg());
		   boolean aStatus=loginPO.errorMsg().isDisplayed();
		   boolean eStatus=true;
		   Assert.assertEquals(aStatus, eStatus);
	} catch (Exception e) {
		Reporter.log("Exception generatd",true);
        Assert.fail();
	}
   }
}
