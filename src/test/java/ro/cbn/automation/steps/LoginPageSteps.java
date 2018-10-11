package ro.cbn.automation.steps;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import ro.cbn.automation.pages.LoginPage;
import ro.cbn.automation.selenium.WebDriverOperations;
import ro.cbn.automation.util.SpringContext;

public class LoginPageSteps extends SpringContext {

    @Value("${test.url}")
    private String url;

    @Value("${test.username}")
    private String username;

    @Value("${test.password}")
    private String password;

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private WebDriverOperations webDriverOperations;

    @Given("^I login on dispatcher with admin credentials$")
    public void iLoginOnDispatcherWithAdminCredentials() {
        loginPage.navigateToMainPage(url);
        loginPage.login(username, password);
    }

//    @Then("^I search reg nr$")
//    public void iSearchRegNr(DataTable dataTables) {
//        List<String> list = dataTables.asList();
//        for (String i : list) {
//            System.out.println("Aici afisez reg:" + i);
//        }
//    }
//
//    @And("^I get a a car with licence nr$")
//    public void iGetAACarWithLicenceNr(DataTable dataTables) {
//        List<String> list = dataTables.asList();
//        for (String i : list) {
//            System.out.println("Aici afisez licent nr: " + i);
//        }
//    }

}
