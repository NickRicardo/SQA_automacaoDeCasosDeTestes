package br.edu.faa.testefaa.teste;

import br.edu.faa.testefaa.page.GooglePage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    private static GooglePage googlePage;

    @BeforeClass
    public static void prepararAmbienteParaTeste(){
        googlePage = new GooglePage(driver);
    }

    @Test
    public void TC001_deve_ser_possivel_pesquisar_no_google_o_texto_nutella(){
    googlePage.campoPesquisa.sendKeys("Nutella" + Keys.ENTER);

    String titulo = googlePage.tituloLink.getText();

    assertTrue(titulo, titulo.contains("Nutella"));
    }

    @Test
    public void TC002_deve_ser_possivel_pesquisar_no_google_o_texto_batata_frita(){
        googlePage.campoPesquisa.sendKeys("Batata Frita" + Keys.ENTER);

        String titulo = googlePage.tituloLink.getText();

        assertTrue(titulo, titulo.contains("Nutella"));
    }


}

