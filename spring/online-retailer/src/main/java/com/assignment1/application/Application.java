package com.assignment1.application;


import com.assignment1.config.ResourcesBean;
import com.assignment1.onlineretailer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@ComponentScan(basePackages = "com.assignment1")
@Configuration
@EnableAutoConfiguration
public class Application {
    private static Map<Integer, Item> catalog;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        ICartService service = ctx.getBean(ICartService.class);
        Map<Integer, Item> catalog = ctx.getBean(HashMap.class);
        Map<Integer, Integer> cartItems;

        service.addItemToCart(0, 1);
        service.addItemToCart(0, 1);
        service.addItemToCart(1, 1);

        cartItems = service.getAllItemsInCart();

        ResourcesBean resourcesBean = ctx.getBean(ResourcesBean.class);
        System.out.println("Profile-specific properties: " + resourcesBean);

        System.out.println("Contact Email " + service.getContactEmail());

        for (Map.Entry<Integer, Integer> item : cartItems.entrySet()) {
            int itemId = item.getKey();
            System.out.println(
                    "Item Key:" + item.getKey() +
                            " | Item value = " + item.getValue() +
                            " | Catalog Unit Price = " + catalog.get(itemId).getPrice() +
                            " | Catalog Description = " + catalog.get(itemId).getDescription()
            );
        }

        System.out.printf("Total cart cost £%.2f, sales tax %.2f, delivery charge £%.2f%n",
                service.calculateCartCost(),
                service.calculateSalesTax(),
                service.calculateDeliveryCharge());

        System.out.println("Removing item 0 from cart........");

        service.removeItemFromCart(0);

        System.out.printf("Total cart cost £%.2f, sales tax %.2f, delivery charge £%.2f%n",
                service.calculateCartCost(),
                service.calculateSalesTax(),
                service.calculateDeliveryCharge());


    }
}
