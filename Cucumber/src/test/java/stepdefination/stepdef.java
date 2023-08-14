import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderQuantitySteps {

    private WebDriver driver;

    @Given("User searches for HP Pen Drive")
    public void user_searches_for_HP_Pen_Drive() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.example.com");

        // Search for the HP Pen Drive
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("HP Pen Drive");
        searchBox.submit();
    }

    @When("Add the first result on the page with quantity {int}")
    public void add_the_first_result_on_the_page_with_quantity(Integer qty) {
        // Find the first result on the page
        WebElement firstResult = driver.findElement(By.cssSelector(".search-results li:first-child"));

        // Get the quantity input field and set the value
        WebElement qtyInput = firstResult.findElement(By