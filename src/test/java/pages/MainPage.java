package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//*[@id=\"search\"]")
    public WebElement SearchField;

    @FindBy(xpath = "//button[@id='sm-but']")
    public WebElement findVacancyButton;

}
