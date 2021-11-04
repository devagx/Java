package com.assignment1.onlineretailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CartServiceImpl implements ICartService {

    private ICartRepository repository;

    @Value("${contactEmail}")
    private String contactEmail;

    @Value("${onlineRetailer.salesTaxRate}")
    private double salesTaxRate;

    @Value("${onlineRetailer.deliveryCharge.normal}")
    private double standardDeliveryCharge;

    @Value("${onlineRetailer.deliveryCharge.threshold}")
    private double deliveryChargeThreshold;

    @Autowired
    @Value("#{catalog}")
    private Map<Integer, Item> catalog;

    @Autowired
    public CartServiceImpl(ICartRepository repository) {
        this.repository = repository;
    }

    public double calculateSalesTax() {
        return salesTaxRate * calculateCartCost();
    }

    public double calculateDeliveryCharge() {
        double totalCost = calculateCartCost();
        if (totalCost == 0 || totalCost >= deliveryChargeThreshold) {
            return 0;
        }
        else {
            return standardDeliveryCharge;
        }
    }

    @Override
    public String getContactEmail() {
        return contactEmail;
    }

    @Override
    public void addItemToCart(int id, int quantity) {
        if (catalog.containsKey(id))
            repository.add(id, quantity);
    }

    @Override
    public void removeItemFromCart(int id) {
        repository.remove(id);
    }

    @Override
    public Map<Integer, Integer> getAllItemsInCart() {
        return repository.getAll();
    }

    @Override
    public double calculateCartCost() {
        Map<Integer, Integer> items = repository.getAll();
        double totalPrice = 0;
        for (Map.Entry<Integer, Integer> item : items.entrySet()) {
            int itemId = item.getKey();
            int quantity = item.getValue();
            double itemCost = catalog.get(itemId).getPrice() * quantity;
            totalPrice += itemCost;
        }
        return totalPrice;
    }
}
