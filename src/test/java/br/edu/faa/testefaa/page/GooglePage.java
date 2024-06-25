package br.edu.faa.testefaa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{

    @FindBy(name = "q")
    public WebElement campoPesquisa;

    @FindBy(css = "#rso > div.hlcw0c > div > div > div > div > div > div > div > div.yuRUbf > div > span > a > div > div > div > div:nth-child(1) > span")
    public WebElement tituloLink;

    public GooglePage(WebDriver driver){
        super(driver);
    }
}
