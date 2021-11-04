package com.assignment1.onlineretailer;

import java.util.Map;

public interface ICartRepository {
    void add(int itemId, int quantity);

    void remove(int itemId);

    Map<Integer, Integer> getAll();
}
