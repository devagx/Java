package linkedinlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {
    private ArrayList<RestaurantMenuItem> menuItems = new ArrayList<>();

    public RestaurantMenu() {
    }

    public void addMenuItem(RestaurantMenuItem newMenuItem) throws IllegalArgumentException {
        menuItems.add(newMenuItem);
    }

    public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
        return menuItems.contains(newMenuItem);
    }
}
