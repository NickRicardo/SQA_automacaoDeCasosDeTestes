package br.edu.faa.testefaa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private String caminhoDriver = "C:\\chromedriver-win64\\chromedriver.exe";

    /**
     * Rigorous Test :-)
     */
    @Test
    public void deveSerPossivelPesquisarTextoNoGoogle(){

        System.setProperty("webdriver.chrome.driver", caminhoDriver);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement campoPesquisa = driver.findElement(By.name("q"));
        campoPesquisa.sendKeys("Nutella" + Keys.ENTER);


        //Aqui fazer varias coisas
        driver.quit();

        //1º o Selenium para abrir o navegador ele precisa de um driver;
        assertTrue(true);
    }
}
