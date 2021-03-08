package org.datas;

import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.text.SimpleDateFormat; 
import java.time.Duration; 
import java.util.Date; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.DateUtil; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.FluentWait; 
import org.openqa.selenium.support.ui.Select; 
 
 


public class BaseClass {
	
	public static WebDriver driver  ; 
	 public static Actions a = null; 
	 public static TakesScreenshot tk; 
	 public static Alert al; 
	 public static JavascriptExecutor js; 
	 public static Select s; 
	 public static Robot r; 
	
		 public static void lauchBrowser() { 
		  System.setProperty("webdriver.chrome.driver", 
		    "D:\\Vineetha Official\\New Pkg\\PojoClass\\Driver\\chromedriver.exe"); 
		  driver = new ChromeDriver(); 
		  
		 
		 } 
		 
		 public static void loadUrl(String url) { 
		 
		  driver.get(url); 
		 } 
		 
		 public static void maxBrowser() { 
		  driver.manage().window().maximize(); 
		 } 
		 
		 public static void setWait() {
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		}
		 
		 public static void fill(WebElement element, String text) { 
		  element.sendKeys(text); 
		 } 
		 
		 public static void fillUsingJavaScriptExe(WebElement element, String text) { 
		  js = (JavascriptExecutor) driver; 
		  js.executeScript("arguments[0].setAttribute('value'," + text + ")", element); 
		 } 
		 
		 public static void btnClick(WebElement element) { 
		  element.click(); 
		 } 
		 
		 public static void clickUsingJavScript(WebElement element) { 
		  js.executeScript("arguments[0].click()", element); 
		 } 
		 
		 public static void pageTitle() { 
		  String title = driver.getTitle(); 
		  System.out.println("Page Title: " + title); 
		 } 
		 
		 public static void pageUrl() { 
		  String url = driver.getCurrentUrl(); 
		  System.out.println("Page url: " + url); 
		 } 
		 
		 public static void performDragDrop(WebElement src, WebElement dest) { 
		  a = new Actions(driver); 
		  a.dragAndDrop(src, dest).perform(); 
		 } 
		 
		 public static void hover(WebElement target) { 
		  a = new Actions(driver); 
		  a.moveToElement(target).perform(); 
		 } 
		 
		 public static void hoverClick(WebElement target) { 
		  a = new Actions(driver); 
		  a.moveToElement(target).click().perform(); 
		 } 
		 
		 public static void clickDouble() { 
		  a.doubleClick().perform(); 
		 } 
		 
		 public static void rightClick(WebElement element) { 
		  a.contextClick(element).perform(); 
		 } 

		 
		 public static void clearBox(WebElement element) { 
		  element.clear(); 
		 } 
		 
		 public static void frameMove(String f) { 
		  driver.switchTo().frame(f); 
		 } 
		 
		 public static void backToParent() { 
		  driver.switchTo().defaultContent(); 
		 } 
		 
		 public static void copyAllText() throws AWTException { 
		  r = new Robot(); 
		  r.keyPress(KeyEvent.VK_CONTROL); 
		  r.keyPress(KeyEvent.VK_A); 
		 
		  r.keyRelease(KeyEvent.VK_CONTROL); 
		  r.keyRelease(KeyEvent.VK_A); 
		 
		  r.keyPress(KeyEvent.VK_CONTROL); 
		  r.keyPress(KeyEvent.VK_C); 
		 
		  r.keyRelease(KeyEvent.VK_CONTROL); 
		  r.keyRelease(KeyEvent.VK_C); 
		 
		 } 
		 
		 public static void paste() { 
		  r.keyPress(KeyEvent.VK_CONTROL); 
		  r.keyPress(KeyEvent.VK_V); 
		 
		  r.keyRelease(KeyEvent.VK_CONTROL); 
		  r.keyRelease(KeyEvent.VK_V); 
		 } 
		 
		 public static void cut() { 
		  r.keyPress(KeyEvent.VK_CONTROL); 
		  r.keyPress(KeyEvent.VK_X); 
		 
		  r.keyRelease(KeyEvent.VK_CONTROL); 
		  r.keyRelease(KeyEvent.VK_X); 
		 } 
		 
		 public static void moveByTab() { 
		  r.keyPress(KeyEvent.VK_TAB); 
		  r.keyRelease(KeyEvent.VK_TAB); 
		 } 
		 
		 public static void performEnter() { 
		  r.keyPress(KeyEvent.VK_ENTER); 
		  r.keyRelease(KeyEvent.VK_ENTER); 
		 } 
		 
		 public static void moveAndClick(WebElement element1, WebElement element2) { 
		  a.moveToElement(element1).click().perform(); 
		 } 
		 
		 public static void screeShot(String name) throws IOException { 
		  tk = (TakesScreenshot) driver; 
		  File src = tk.getScreenshotAs(OutputType.FILE); 

		 
		  File dest = new File("C:\\Selenium\\Q.png" + name + "+png"); 
		  FileUtils.copyFile(src, dest); 
		 } 
		 
		 public static void simpleAlert() { 
		  driver.switchTo().alert(); 
		 } 
		 
		 public static void ConfirmAlert() { 
		  driver.switchTo().alert().accept(); 
		 } 
		 
		 public static void dismissAlert() { 
		  driver.switchTo().alert().dismiss(); 
		 } 
		 
		 public static void promptAlert(String name) { 
		  driver.switchTo().alert().sendKeys(name); 
		 
		  String text = al.getText(); 
		  System.out.println("Alert text: " + text); 
		  al.accept(); 
		 
		 } 
		 
		 public static void performWindowHandle() { 
		  String s = driver.getWindowHandle(); 
		  Set<String> handleList = driver.getWindowHandles(); 
		  Iterator<String> it = handleList.iterator(); 
		  String parent = it.next(); 
		  String child = it.next(); 
		  driver.switchTo().window(child); 
		 
		 } 
		 
		 public static void elementDisplayed(WebElement element) { 
		  boolean b = element.isDisplayed(); 
		  System.out.println("Element Displayed: " + b); 
		 } 
		 
		 public static void elementEnabled(WebElement element) { 
		  boolean b = element.isEnabled(); 
		  System.out.println("Element enabled: " + b); 
		 } 
		 
		 public static void elementSelected(WebElement element) { 
		  boolean b = element.isSelected(); 
		  System.out.println("Element Selected: " + b); 
		 } 
		 
		 public static void takeText(WebElement element) { 
		  String text = element.getText(); 
		  System.out.println(text); 
		 } 
		 
		 public static void takeTextUsingJavScript(WebElement element) { 
		  Object o = js.executeScript("return arguments[0].getAttribute('value')", element); 
		  String text = (String) o; 
		  System.out.println(text); 
		 } 
		 
		 public static void scrollUp(WebElement element) { 
		  js.executeScript("arguments[0].scrollIntoView(true)", element); 
		 } 
		 
		 public static void scrolldown(WebElement element) { 
		  js.executeScript("arguments[0].scrollIntoView(false)", element); 
		 } 
		 
		 public static void highLight(WebElement element) { 
		  js.executeScript("arguments[0].setAttribute('style','background:yellow')", element); 
		 } 
		 
		 public static void takeTextGetAttribute(WebElement element) { 
		  String text = element.getAttribute("value"); 
		  System.out.println(text); 
		 } 
		 
		 public static void performSelectByIndex(WebElement element, int index) { 
		  s = new Select(element); 
		  s.selectByIndex(index); 
		 } 
		 
		 public static void performSelectByValue(WebElement element, String value) { 
		  s = new Select(element); 
		  s.selectByValue(value); 
		 } 
		 
		 public static void performSelectByVisibleText(WebElement element, String value) { 
		  s = new Select(element); 
		  s.selectByVisibleText(value); 
		 } 
		 
		 public static void optionsLists() { 
		  List<WebElement> l = s.getOptions(); 
		  for (WebElement element : l) { 
		   String text = element.getText(); 
		   System.out.println(text); 
		  } 
		 
		 } 
		 
		 public static void firstOptionName() { 
		  WebElement element = s.getFirstSelectedOption(); 
		  String text = element.getText(); 
		  System.out.println(text); 
		 
		 } 
		 
		 public static void checkMultiple() { 
		  boolean b = s.isMultiple(); 
		  System.out.println("Multiple: " + b); 
		 } 
		 
		 public static void deSelectAllFromDropDown() { 
		  s.deselectAll(); 
		 } 
		 
		 public static void explicitFluentWaitForAlert() { 
		  FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)) 
		    .pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class); 
		  f.until(ExpectedConditions.alertIsPresent()); 
		 } 
		 
		 public static void explicitFluentWaitForElementVisibility(WebElement element) { 
		  FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)) 
		    .pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class); 
		  f.until(ExpectedConditions.visibilityOfAllElements(element)); 
		 } 
		 
		 public static void moveUrl(String url) { 
		  driver.navigate().to(url); 
		 } 
		 
		 public static void moveNext() { 
		  driver.navigate().forward(); 
		 } 
		 
		 public static void moveBack() { 
		  driver.navigate().back(); 
		 } 
		 
		 public static void pageRefresh() { 
		  driver.navigate().refresh(); 
		 } 
		 
		 public static void browserQuit() { 
		  driver.quit(); 
		 } 
		 
		 public static void browserClose() { 
		  driver.close(); 
		 } 
		 
		 public static String excelData(int rowNo,int columnNo) throws IOException { 
		 
		  File f = new File( 
		    "C:\\\\Data\\\\Workspace\\\\MavenOne\\\\Excel Loc\\\\Student Details.xlsx"); 
		  FileInputStream finStream = new FileInputStream(f); 
		 
		  Workbook w = new XSSFWorkbook(finStream); 
		  Sheet s = w.getSheet("Sheet1"); 
		  { 
		   Row r = s.getRow(rowNo); 
		    { 
		    Cell c = r.getCell(columnNo); 
		    String value = ""; 
		    int cellType = c.getCellType(); 
		    
		    if (cellType == 1)
		    { 
		     value = c.getStringCellValue(); 
		    }
		    else if (DateUtil.isCellDateFormatted(c))
		    { 
		     Date d = c.getDateCellValue(); 
		     SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy"); 
		     value = sim.format(d); 
		 
		    }
		    else { 
		     double d = c.getNumericCellValue(); 
		     long l = (long) d; 
		     value = String.valueOf(l); 
		    } 
		    return value; 
		 
		   } 
		 
} 
} 
} 


