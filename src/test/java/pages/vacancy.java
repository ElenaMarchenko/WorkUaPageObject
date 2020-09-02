package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class vacancy {

    @FindBy(xpath = "//ul[@class='list-inline']//a[@class='btn btn-default sendr']")
    public WebElement CallOut;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-white-heart']")
    public WebElement SaveVacancy;

    @FindBy(xpath = "//a[@id='dropdownMenu1']")
    public WebElement moreButton;

}
