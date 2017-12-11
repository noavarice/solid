/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author alexrazinkov
 */
public class OrderGood {
    private Customer customer;
    
    private String productName;
    
    private int count;
    
    public OrderGood(final Customer customer, final String product, final int count) {
        this.customer = customer;
        productName = product;
        this.count = count;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public int getCount() {
        return count;
    }
}
