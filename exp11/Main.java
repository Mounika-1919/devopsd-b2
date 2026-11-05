
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(new java.io.File("program.html").toURI().toString());

            driver.findElement(By.id("increment-button")).click();

            String result = driver.findElement(By.id("output")).getText();

            System.out.println("Output after clicking: " + result);

            if (result.equals("1")) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
            }

        } finally {
            driver.quit();
        }
    }
}
