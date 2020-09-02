package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.SearchResults;
import pages.vacancy;
import pages.zCallOut;

public class MainPageSteps {
    @Managed
    WebDriver driver;

    MainPage mainPage;

    SearchResults searchResult;

    vacancy Vacancy;

    zCallOut CallOut;





    @Step

    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA\\Tools\\CD\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.work.ua/");
    }

    @Step
    public void FillSearchBarWithPosition() {
        mainPage.SearchField.sendKeys("QA engineer");

    }
    @Step
    public void clickOnSearchButton() {
        mainPage.findVacancyButton.click();
    }

    @Step
    public void clickOnVacancy() throws Throwable {
        Thread.sleep(5000);
        searchResult.getVacancy.click();
    }
    @Step
    public void clickOnCallOutButton() throws Throwable {
        Thread.sleep(5000);
        Vacancy.CallOut.click();
    }
    @Step
    public void FillData() {
        CallOut.user_name.sendKeys("Igor Naumov");
        CallOut.Email.sendKeys("NaumovIgor@gmail.com");
        CallOut.Phone.sendKeys("0123456798");
    }
    @Step
    public void ClickOnSendButton() {
        CallOut.Submitbtn.click();
    }
}
