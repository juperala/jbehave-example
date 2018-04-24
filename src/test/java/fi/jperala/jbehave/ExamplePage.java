package fi.jperala.jbehave;

import org.jbehave.web.selenium.WebDriverProvider;

public class ExamplePage {

    WebDriverProvider provider;

    public ExamplePage(WebDriverProvider provider) {
        this.provider = provider;
    }

    public void open() {
        provider.get().get("http://www.google.com/");
    }

    public void login() {
        provider.get().get("http://www.google.com/search?q=login");
    }

    public void logout() {
        provider.get().get("http://www.google.com/search?q=logout");
    }
}
