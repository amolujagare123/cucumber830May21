package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {


    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {

        System.out.println("=================>> I open browser >>>");
    }


    WebDriver driver;

    @Given("Login page is opned")
    public void login_page_is_opned() {

        System.out.println("Login page is opned");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");

    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
    @Then("I should be redirected to home page")
    public void i_should_be_redirected_to_home_page() {
        System.out.println("I should be redirected to home page");

        String expected = "http://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(expected,actual);
    }

}
