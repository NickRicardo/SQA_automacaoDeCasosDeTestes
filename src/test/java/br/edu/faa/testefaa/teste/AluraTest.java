package br.edu.faa.testefaa.teste;

import br.edu.faa.testefaa.page.AluraPage;
import br.edu.faa.testefaa.page.GooglePage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class AluraTest extends BaseTest{

    protected static AluraPage aluraPage;

    @BeforeClass
    public static void prepararAmbienteParaTeste(){
        aluraPage = new AluraPage(driver);
    }

    @Test
    public void TC001_nao_deve_conseguir_efetuar_login_com_email_invalido(){
        aluraPage.campoEmail.sendKeys("meuexemplo@exemplo.com" + Keys.TAB);
        aluraPage.campoSenha.sendKeys("112345" + Keys.TAB);
        aluraPage.botaoEntrar.click();
    }
}
