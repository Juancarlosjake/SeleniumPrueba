package SeleniumGlueCode;

import Pages.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class Test extends BasePage {
    private ChromeDriver driver = BasePage.getDriver();
    WebElement btonAcercaDeNosotros = driver.findElement(By.xpath("//a[contains(text(),'Acerca de nosotros')]"));
    WebElement btonInformacionCorp = driver.findElement(By.linkText("Información Corporativa"));
    WebElement btonSostenibilidad = driver.findElement(By.linkText("Sostenibilidad"));
    @Given("^El usuario navega a banitsmo\\.com$")
    public void el_usuario_navega_a_banitsmo_com() throws Throwable {

        driver.get("https://www.banistmo.com/wps/portal/banistmo/personas/");
        int segundosAEsperar = 10;
        driver.manage().timeouts().implicitlyWait(segundosAEsperar , TimeUnit.SECONDS);
    }

    @When("^Hace click en la seccion Acerca de nosotros$")
    public void hace_click_en_la_seccion_Acerca_de_nosotros() throws Throwable {
        btonAcercaDeNosotros.click();
    }

    @When("^Hace click en el seccion informacion corporativa$")
    public void hace_click_en_el_seccion_informacion_corporativa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        btonInformacionCorp.click();
    }

    @Then("^Hace click en la seccion sostenibilidad$")
    public void hace_click_en_la_seccion_sostenibilidad() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         btonSostenibilidad.click();
        String titlePage = "Sostenibilidad - Acerca de Banistmo";
        Assert.assertEquals(titlePage,driver.getTitle());
    }


}
