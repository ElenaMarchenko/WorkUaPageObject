package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults {

    @FindBy(xpath = "//input[@id='search']")
    public WebElement SearchField;

    @FindBy(xpath = "//button[@id='sm-but']")
    public WebElement findVacancyButton;

    @FindBy(xpath = "//button[@id='signJsa']")
    public WebElement subscription;

    @FindBy(xpath = "//a[contains(text(),'Strong Junior QA Engineer')]")
    public WebElement getVacancy;
}
