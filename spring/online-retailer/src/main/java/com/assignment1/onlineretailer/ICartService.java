package com.assignment1.onlineretailer;

import java.util.Map;

public interface ICartService {
    void addItemToCart(int id, int quantity);

    void removeItemFromCart(int id);

    Map<Integer, Integer> getAllItemsInCart();

    double calculateCartCost();

    String getContactEmail();

    double calculateSalesTax();

    double calculateDeliveryCharge();
}
