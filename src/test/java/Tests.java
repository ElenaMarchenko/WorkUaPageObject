import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
        features = {
                "src/test/resources/features/smoke/Smoke_send_CV.feature",

        },
        glue = "stepdefinitions")

public class Tests {
}
