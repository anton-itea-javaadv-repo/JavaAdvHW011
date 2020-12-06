package ua.itea.javaadv.hw011;

import ua.itea.javaadv.hw011.products.Product;
import ua.itea.javaadv.hw011.products.WeightColorProduct;
import ua.itea.javaadv.hw011.products.WeightProduct;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T extends Product> {
    List<T> listOfProducts = new ArrayList<>();

    public void putProduct(T product) {
        listOfProducts.add(product);
    }

    public static void showProduct(Shelf<? extends Product> shelf) {
        System.out.println("Shelf contains [");
        for (Product p: shelf.listOfProducts) {
            System.out.println("name: " + p.getName() + ", price: " + p.getPrice());
        }
        System.out.println("]");
    }

    public static void showWeightProduct(Shelf<? extends WeightProduct> shelf) {
        System.out.println("Shelf contains [");
        for (WeightProduct p: shelf.listOfProducts) {
            System.out.println("name: " + p.getName() + ", price: " + p.getPrice() + ", weight: " + p.getWeight());
        }
        System.out.println("]");
    }

    public static void showWeightColorProduct(Shelf<? extends WeightColorProduct> shelf) {
        System.out.println("Shelf contains [");
        for (WeightColorProduct p: shelf.listOfProducts) {
            System.out.println("name: " + p.getName() +
                    ", price: " + p.getPrice() +
                    ", weight: " + p.getWeight() +
                    ", color: " + p.getColor()
                    );
        }
        System.out.println("]");
    }
}
