package uz.muu;

public class CoffeeInfo {
    private String coffeeName;
    private double price, coffeeAmount, milkAmount, waterAmount;

    public CoffeeInfo(String coffeeName, double price, double coffeeAmount, double milkAmount, double waterAmount) {
        this.coffeeName = coffeeName;
        this.price = price;
        this.coffeeAmount = coffeeAmount;
        this.milkAmount = milkAmount;
        this.waterAmount = waterAmount;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(double coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public double getMilkAmount() {
        return milkAmount;
    }

    public void setMilkAmount(double milkAmount) {
        this.milkAmount = milkAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        return "CoffeeInfo{" +
                "coffeeName='" + coffeeName + '\'' +
                ", price=" + price +
                ", coffeeAmount=" + coffeeAmount +
                ", milkAmount=" + milkAmount +
                ", waterAmount=" + waterAmount +
                '}';
    }
}
