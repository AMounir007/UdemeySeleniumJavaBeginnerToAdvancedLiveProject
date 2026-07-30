package practices;


import abstractHelperClasses.TestCase;
import org.testng.annotations.Test;

public class TestNavigation extends TestCase {

    @Test
    public void testNavigation() {
        driver.get("https://www.example.com");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
    }

}
