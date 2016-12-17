package scripts;

import org.testng.annotations.Test;
import pom.EnterTimeTrack;
import pom.LoginPage;
import generics.Excel;

public class ValidLoginLogout extends BaseTest{
	@Test
	public void testValidLoginLogout(){
		String un=Excel.getCellValue("XL_Path", "ValidLoginLogout", 1, 0);
		String pw=Excel.getCellValue("XL_Path", "ValidLoginLogout", 1, 1);
		String hp=Excel.getCellValue("XL_Path", "ValidLoginLogout", 1, 2);
		String lp=Excel.getCellValue("XL_Path", "ValidLoginLogout", 1, 3);
		
		
	//enter valid username
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//enter valid password
	l.setPassword(pw);
	//click login
	l.clickLogin();
	//verify homepage'
	EnterTimeTrack e=new EnterTimeTrack(driver);
	e.verifyTitle(hp);
	e.clickLogoutLink();
	e.verifyTitle(lp);
	
	}
}
