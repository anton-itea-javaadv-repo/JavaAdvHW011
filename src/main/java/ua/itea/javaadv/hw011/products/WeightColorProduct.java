package ua.itea.javaadv.hw011.products;

public class WeightColorProduct extends WeightProduct {
    String color;

    public WeightColorProduct() {
    }

    public WeightColorProduct(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "WeightColorProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
