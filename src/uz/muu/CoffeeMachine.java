package uz.muu;

import java.util.LinkedList;
import java.util.List;

public class CoffeeMachine {
    List<CoffeeInfo> coffeeInfoList = new LinkedList<>();
    List<Product> productList = new LinkedList<>();

    public void addCoffee(String name, double price, double coffeeAmount, double milkAmount, double waterAmount) {
        coffeeInfoList.add(new CoffeeInfo(name, price, coffeeAmount, milkAmount, waterAmount));
    }

    public double getPrice(String coffeeName) {
        for (CoffeeInfo coffee :
                coffeeInfoList) {
            if (coffee.getCoffeeName().equals(coffeeName)){
                return coffee.getPrice();
            }
        }
        return -1.0;
    }

    public void rechargeCard(int cardId, double credit) {

    }

    public double getCredit(int cardId) {
        return 0.0;
    }

    public int sell(String coffeeName, int cardId) {
        return 0;
    }

    public void refillProduct(String productName, int amount) {
        for (Product product :
                productList) {
            if (product.getProductName().equals(productName)){
                product.setAmount(product.getAmount() + amount);
                return;
            }
        }
        productList.add(new Product(productName, amount));
    }

    public boolean availableCoffee(String coffeeName) {
        CoffeeInfo coffeeInfo = getCoffeeInfo(coffeeName);
        if (coffeeInfo == null){
            System.out.println("Coffee NOT found.");
            return false;
        }

        boolean productsAvailable = true;
        if (coffeeInfo.getCoffeeAmount() > availableProduct("Coffee")){
            System.out.println("Coffee amount NOT enough.");
            productsAvailable = false;
        }
        if (coffeeInfo.getMilkAmount() > availableProduct("Milk")){
            System.out.println("Milk amount NOT enough.");
            productsAvailable =  false;
        }
        if (coffeeInfo.getWaterAmount() > availableProduct("Water")){
            System.out.println("Water amount NOT enough.");
            productsAvailable =  false;
        }

        return productsAvailable;
    }

    private CoffeeInfo getCoffeeInfo(String coffeeName) {
        for (CoffeeInfo coffee :
                coffeeInfoList) {
            if (coffee.getCoffeeName().equals(coffeeName)){
                return coffee;
            }
        }
        return null;
    }


    public double availableProduct(String productName) {
        for (Product product :
                productList) {
            if (product.getProductName().equals(productName)){
                return product.getAmount();
            }
        }
        return -1;
    }
}
