package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class validacaoGamaAcademy_quemSomos {
	
	
	
	public validacaoGamaAcademy_quemSomos() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();
	}
	
	public WebDriver browser;
	
	@Dado("que eu estou no site da gama academy {string}")
	public void que_eu_estou_no_site_da_gama_academy(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		browser.get("https://www.gama.academy/");
	}
	
	@Dado("fecho o anuncio")
	public void fecho_o_anuncio() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		WebElement input = browser.findElement(By.cssSelector(".ub-emb-close"));
		input.click();
	}
	
	@Dado("cliclo na opcao {string}")
	public void cliclo_na_opcao(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement input = browser.findElement(By.cssSelector(".nav-menu a"));
		input.click();
		
	}

	@Entao("devo ver o item do {string}")
	public void devo_ver_o_item_do(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement input = (WebElement) browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
		assertEquals(string, input.getText());
		browser.quit();
		
	}
}
