package fi.jperala.jbehave.issue;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.ScenarioType;
import org.jbehave.core.annotations.When;
import org.jbehave.web.selenium.WebDriverProvider;

public class ExampleSteps {

    ExamplePage page;

    public ExampleSteps(WebDriverProvider provider) {
        page = new ExamplePage(provider);
    }

    @AfterScenario(uponType = ScenarioType.ANY)
    public void logout() {
        page.logout();
    }

    @Given("user is on app page")
    public void openApp() {
        page.open();
    }

    @Given("user is logged in")
    public void logIn() {
        page.login();
    }
}
