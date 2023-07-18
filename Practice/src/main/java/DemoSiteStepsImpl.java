
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSiteStepsImpl {
	@Given("hit the url {string}")
	public void hit_the_url(String string) {
	    System.out.println("juhi1");
	}

	@When("click on login button")
	public void click_on_login_button() {
		  System.out.println("juhi2");
	}

	@When("logIn to the application")
	public void log_in_to_the_application() {
		  System.out.println("juhi3");
	}

	@When("add {int} products to the cart  print sub total and validate using assertion.")
	public void add_products_to_the_cart_print_sub_total_and_validate_using_assertion(Integer int1) {
		  System.out.println("juhi4");
	}

	@Then("print sub total")
	public void print_sub_total() {
		  System.out.println("juhi5");
	}

	@Then("validate using assertion.")
	public void validate_using_assertion() {
		  System.out.println("juhi6");
	}

}
