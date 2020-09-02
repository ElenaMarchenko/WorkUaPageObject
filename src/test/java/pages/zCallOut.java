package pages;

import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class zCallOut {

    @FindBy(name = "user_name")
    public WebElement user_name;

    @FindBy(name = "email")
    public WebElement Email;

    @FindBy(name = "user_phone")
    public WebElement Phone;

    @FindBy(id = "submitbtn")
    public WebElement Submitbtn;

    public static void getDriver() {
    }
}
