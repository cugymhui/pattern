package com.learn.pattern.prototype;

import java.util.HashMap;

/**
 * @author ymhui
 * @date 2019/7/16
 * @time 16:26
 * description
 */
public class Manager {
    private HashMap<String, Product> shouCase = new HashMap<>();

    public void register(String name, Product product){
        shouCase.put(name, product);
    }

    public Product create(String productName){
        Product product = shouCase.get(productName);
        return product.createClone();
    }
}
