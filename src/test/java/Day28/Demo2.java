package Day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		
	Workbook wb = WorkbookFactory.create(new FileInputStream("./data/POS.xlsx"));;	
	Sheet s = wb.getSheet("LoginSheet");
	String un = s.getRow(1).getCell(0).getStringCellValue();
	String pw = s.getRow(1).getCell(1).getStringCellValue();
	//String eurl = s.getRow(1).getCell(2).getStringCellValue();
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://pos.aksharatraining.in/pos/public/login");
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pw);
	driver.findElement(By.xpath("//button[text()='Go']")).click();
	
	
	
	
	}

}
