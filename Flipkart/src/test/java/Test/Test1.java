package Test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericlib.BaseClass;
import com.pom.LoginPage;

@Test
public class Test1 extends BaseClass
{

	public void PrintAllPhonesName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String productName = elib.readDatafromExcel("Sheet1",1,0);
		
		LoginPage log=new LoginPage(driver);
		log.getPopup().click();
		log.getSearchTextfield().sendKeys(productName);
		log.getSearchButton().click();
		//after that to write the data from Excelsheet
		List<WebElement> allphones = log.getAllphones();
		
		for(WebElement wb:allphones)
		{
			System.out.println(wb.getText());
		}
		
		 
		 
	}
}
