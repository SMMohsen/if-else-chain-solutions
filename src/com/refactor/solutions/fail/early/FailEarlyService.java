package com.refactor.solutions.fail.early;


public class FailEarlyService {


    /*
     * this example uses fail early technique to avoid multiple if-else chain
     * we have an order and want to apply discount to it's price
     * but first we wnat to validate that the order price not less than 0
     * and discount not greater than 50%
     */
    public static void main(String[] args) {

        Product Iphone = new Product("Iphone",100.0,10.0);

        Product headPhone = new Product("headPhone",-150.0,10.0);
        Iphone = applyDiscount(Iphone);
        System.out.println("this is Iphone new price "+Iphone.getPrice());
        headPhone = applyDiscount(headPhone);
        System.out.println("this is headPhone new price "+headPhone.getPrice());

    }


    public static Product applyDiscount(Product product) {

        if(product.getPrice() <= 0 || product.getDiscount() > 50)
            throw new RuntimeException("Invalid product information");
        Double newPrice =  product.getPrice() - (product.getPrice() * (product.getDiscount() / 100.0));
        product.setPrice(newPrice);
        return product;
    }
}
