package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
public class MaxPriceFilteringStrategy implements FilteringStrategy {
    private double maxPrice;


    @Override
    public boolean filter(Product product) {
       return (product.getPrice() <= maxPrice);
    }

    // Write your code here!
}
