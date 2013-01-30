import java.net.URL
import org.openqa.selenium.remote.{DesiredCapabilities, RemoteWebDriver}
import org.specs2.mutable.Specification
import org.openqa.selenium.By

class SeleniumTest extends Specification {
  "iPhoneDriver" should {
    val driver = new RemoteWebDriver(new URL("http://localhost:3001/wd/hub"), DesiredCapabilities.iphone());
    driver.get("http://www.google.com/")
     "google" in {
       driver.getTitle must_== "Google"

       val qElem = driver.findElement(By.id("lst-ib"))
       qElem.sendKeys("selenium")
       val searchBtn = driver.findElement(By.id("tsbb"))
       searchBtn.click()

       driver.getTitle must_!= "Google"
     }
  }

}

