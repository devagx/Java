package com.assignment1.config;

import com.assignment1.onlineretailer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyConfiguration {
    @Bean
    public Map<Integer, Item> catalog() {
        Map<Integer, Item> items = new HashMap<>();

        items.put(0, new Item(0, "TV", 100.00));
        items.put(1, new Item(1, "HIFI", 50.00));
        items.put(2, new Item(2, "COMPUTER", 1000.00));
        items.put(3, new Item(3, "KEYBOARD", 10.00));

        return items;
    }
}