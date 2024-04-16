package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierSteps {
	WebDriver driver;

@Given("^Launch Browser$")
public void launch_Browser() throws Throwable {
    driver = FunctionLibrary.startBrowser();
}

@When("^Launch Url \"([^\"]*)\"$")
public void launch_Url(String url) throws Throwable {
    FunctionLibrary.openUrl(url);
}

@When("^wait For Username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_Username_with_and(String Locator_Type, String Locator_Value) throws Throwable {
    FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^Enter username with \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\"$")
public void enter_username_with_and_and(String Locator_Type, String Locator_Value,String Test_Data) throws Throwable {
    FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}

@When("^Enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_password_with_and_and(String Locator_Type, String Locator_Value,String Test_Data) throws Throwable {
	FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}

@When("^Click login button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_login_button_with_and(String Locator_Type, String Locator_value) throws Throwable {
    FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@When("^wait for supplier link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_supplier_link_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^Click supplier link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_supplier_link_with_and(String Locator_Type, String Locator_value) throws Throwable {
	 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@When("^wait for Add \\+ icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Add_icon_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^click Add \\+ icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Add_icon_with_and(String Locator_Type, String Locator_value) throws Throwable {
	 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@When("^Wait for supplier number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_supplier_number_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^capture Supplier num with \"([^\"]*)\" and \"([^\"]*)\"$")
public void capture_Supplier_num_with_and(String Locator_Type, String Locator_Value) throws Throwable {
    FunctionLibrary.capturesup(Locator_Type, Locator_Value);
}

@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_in_with_and(String Test_Data, String Locator_Type , String Locator_Value) throws Throwable {
    FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
}

@When("^Click On Add Button after adding notes with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_On_Add_Button_after_adding_notes_with_and(String Locator_Type, String Locator_value) throws Throwable {
	 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@When("^Wait For Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_Ok_Button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_On_Ok_Button_with_and(String Locator_Type, String Locator_value) throws Throwable {
	 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@When("^Wait For Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_Alert_with_and(String Locator_Type, String Locator_Value) throws Throwable {
	 FunctionLibrary.waitForElement(Locator_Type, Locator_Value, "10");
}

@When("^Click On Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_On_Alert_with_and(String Locator_Type, String Locator_value) throws Throwable {
	 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}

@Then("^user validate the supplier table$")
public void user_validate_the_supplier_table() throws Throwable {
    FunctionLibrary.supplierTable();
}

@When("^user closes the browser$")
public void user_closes_the_browser() throws Throwable {
    FunctionLibrary.closeBrowser();
}


}
