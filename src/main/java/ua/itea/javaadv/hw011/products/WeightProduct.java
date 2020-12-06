package ua.itea.javaadv.hw011.products;

public class WeightProduct extends Product {
    double weight;

    public WeightProduct() {
    }

    public WeightProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WeightProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
