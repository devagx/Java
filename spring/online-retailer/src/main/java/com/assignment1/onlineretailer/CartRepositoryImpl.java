package com.assignment1.onlineretailer;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements ICartRepository {
    private Map<Integer, Integer> cart = new HashMap<>();

    @Override
    public void add(int itemId, int quantity) {
        cart.merge(itemId, quantity, Integer::sum);
    }

    @Override
    public void remove(int itemId) {
        cart.remove(itemId);
    }

    @Override
    public Map<Integer, Integer> getAll() {
        return cart;
    }
}
