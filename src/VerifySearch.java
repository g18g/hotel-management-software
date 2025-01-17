package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicelements {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com");
		dr.findElement(By.name("q")).sendKeys("Selinium");
		Thread.sleep(1000);
		List<WebElement> suggestions=dr.findElements(By.className("G43f7e"));
		for(WebElement s:suggestions)
			System.out.println(s.getText());
		dr.quit();

}
}

