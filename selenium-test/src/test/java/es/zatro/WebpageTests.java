package es.zatro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebpageTests {

	@Test
	public void testWebsite() { // Test Method

		// Create driver

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Go to zatro.es

		String url = "https://www.zatro.es/";
		driver.get(url);
		System.out.println("Page is opened.");

		// sleep for 3 seconds
		sleep(3000);

		// Click the search button

		driver.findElement(By.cssSelector("div.JS-buscar-btn.buscar-btn")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Search for adidas
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("adidas");
		driver.findElement(By.className("new-btnBuscar")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Close pop up

		driver.findElement(By.cssSelector("div.js-cerrar-popup-newsletter")).click();

		// sleep for 4 seconds
		sleep(4000);

		// Click the second item
		driver.findElement(By.id("product2351")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Select the second available shoe size

		driver.findElement(By.cssSelector("button.product-data__talla__select.js-open-tallas")).click();
		driver.findElement(By.cssSelector("li[data-value='12242']")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Add it to the shopping car

		driver.findElement(By.cssSelector("div.product-data__inner .cont-botones [class='add-cart ui-button-1']"))
				.click();

		// sleep for 3 seconds
		sleep(3000);

		// Click tramitar pedido

		driver.findElement(By.linkText("TRAMITAR PEDIDO")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Click on Mi Cesta

		driver.findElement(By.cssSelector("div.JS-cesta-btn span:nth-of-type(1)")).click();

		// sleep for 3 seconds
		sleep(3000);

		// Assert that the item on the basket is the same as you clicked

		assertEquals("Nmd_r2 pk", driver.findElement(By.cssSelector("[class='titulo ui-text-2']")).getText());
		System.out.println("The Item on the basket is checked");
		
		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
