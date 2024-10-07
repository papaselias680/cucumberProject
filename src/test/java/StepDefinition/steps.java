package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {

    WebDriver driver;

    @Given("I am in the login page")
    public void i_am_in_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


    }

    @And("I enter username (.*)$")
    public void i_enter_username_standard_user(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    @And("I enter password (.*)$")
    public void i_enter_password_secret_sauce(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();

    }
    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {
        driver.findElement(By.xpath("//span[contains(.,'Products')]")).isDisplayed();

    }




    @Given("I am on the Home page")
    public void iAmOnTheHomePage() {

    }

    @And("I want to add items to cart")
    public void iWantToAddItemsToCart() {
    }

    @When("I click Add To Cart button")
    public void iClickAddToCartButton() {
    }

    @And("I click cart icon")
    public void iClickCartIcon() {
    }

    @Then("Shopping cart is displayed")
    public void shoppingCartIsDisplayed() {
    }


    @After
    public void closeBrowser(){
        driver.quit();

    }
}
