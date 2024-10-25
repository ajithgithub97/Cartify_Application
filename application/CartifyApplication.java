package cartyfy.application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartifyApplication {
	
	
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.cartify.pk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("(//span[text()='Shop By Categories'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='collection-grid-item__title-wrapper']/div)[3]")).click();
	driver.findElement(By.xpath("(//div[@class='grid-view-item product-card']/a)[1]")).click();
	driver.findElement(By.xpath("//button[@name='add']/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='cart-popup']/a")).click();
	 String subtotal = driver.findElement(By.xpath("//span[@class='cart-subtotal__price']")).getText();
	 System.out.println("SubTotal Price: "+subtotal);
	 driver.quit();
}
}
