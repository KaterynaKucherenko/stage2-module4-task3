package com.mjc.stage2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopStock  {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }
    public List executeFilteringStrategy(FilteringStrategy filteringStrategy){
        List<Product> resList = new ArrayList<>();
        for(Product product : productList){
            if(filteringStrategy.filter(product)){
                resList.add(product);
            }
        }
      return  resList;
    }
    // Write your code here!
}
