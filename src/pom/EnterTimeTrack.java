package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrack extends BasePage{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTime;
	
	@FindBy(xpath="(//span[@class='productVersion'])")
	private WebElement productVersion;
	
	@FindBy(xpath="//img[@title='close]")
	private WebElement closeButton;
	
	public EnterTimeTrack(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickLogoutLink(){
		logoutLink.click();
	}
	public void clickHelp(){
		help.click();
	}
	public void clickAboutActiTime(){
		aboutActiTime.click();
	}
	public void verifyProductVersion(String eVersion){
		String aVersion=productVersion.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	public void clickCloseButton(){
		closeButton.click();
	}

}
