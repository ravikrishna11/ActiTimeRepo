package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class ActiTimeHomePagePO extends BasePage {

	public ActiTimeHomePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	public WebElement logoutBtn() {
		return logoutBtn;
		
	}
	public void logout() {
		logoutBtn.click();
	}

}
