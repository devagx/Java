package linkedinlearning.cucumbercourse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;

public class MenuManagementSteps {
    private RestaurantMenuItem newMenuItem;
    private RestaurantMenu locationMenu = new RestaurantMenu();

    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        newMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        // Write code here that turns the phrase above into concrete actions
        locationMenu.addMenuItem(newMenuItem);
        System.out.println("Step 2");

    }

    @Then("Menu Item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String string) {
        // Write code here that turns the phrase above into concrete actions
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3: " + exists);
    }
}
