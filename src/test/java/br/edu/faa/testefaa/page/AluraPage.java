package br.edu.faa.testefaa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AluraPage extends BasePage{
    @FindBy(id = "login-email")
    public WebElement campoEmail;

    @FindBy(id = "password")
    public WebElement campoSenha;

    @FindBy(css = "#form-default > button")
    public WebElement botaoEntrar;

    public AluraPage(WebDriver driver) {
        super(driver);
    }
}
