// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TesteBuscaCredenciada {

    private WebDriver driver;

    // iniciar
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(70000, TimeUnit.MILLISECONDS);
    }

    // finalizar
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void buscaCredenciada() {

        driver.get("https://www.soc.com.br/blog-de-sst/");
        driver.findElement(By.xpath("//a[contains(text(),'Funcionalidades')]")).click();
        driver.findElement(By.linkText("Rede SOCNET")).click();
        driver.findElement(By.cssSelector(".elementor-animation-grow .elementor-button-text")).click();
        driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11533520");
        driver.findElement(By.cssSelector("#div-filtro-conveniencias .elemento-filtro:nth-child(2) .cbx-estilizado")).click();
        driver.findElement(By.id("botao-buscar")).click();
        {
            WebElement element = driver.findElement(By.id("botao-buscar"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .truncate")).click();
        driver.findElement(By.cssSelector(".btn-alinhado")).click();
        driver.findElement(By.cssSelector(".nome-empresa:nth-child(1) > .truncate")).click();
        driver.close();


    }

}
