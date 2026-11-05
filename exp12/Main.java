
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(new java.io.File("program.html").toURI().toString());

            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            if (title.equals("My Containerized Application")) {
                System.out.println("Homepage Test Passed");
            }

            driver.findElement(By.name("name")).sendKeys("John Doe");

            driver.findElement(By.name("email"))
                  .sendKeys("john.doe@example.com");

            driver.findElement(By.name("submit")).click();

            String result = driver.findElement(By.id("result")).getText();

            System.out.println("Result: " + result);

            if (result.equals("Form submitted successfully!")) {
                System.out.println("Form Test Passed");
            }

        } finally {
            driver.quit();
        }
    }
}
