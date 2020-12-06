package ua.itea.javaadv.hw011;

import ua.itea.javaadv.hw011.products.Product;
import ua.itea.javaadv.hw011.products.WeightColorProduct;
import ua.itea.javaadv.hw011.products.WeightProduct;

public class Main {
    public static void main(String[] args) {
        Shelf<Product> shelf = new Shelf<>();
        shelf.putProduct(new Product("product 1", 1.99D));
        shelf.putProduct(new Product("product 2", 2.99D));
        shelf.putProduct(new Product("product 3", 3.99D));
        Shelf.showProduct(shelf);

        Shelf<WeightProduct> shelf2 = new Shelf<>();
        shelf2.putProduct(new WeightProduct("wproduct 1", 1.99D, 11.0D));
        shelf2.putProduct(new WeightProduct("wproduct 2", 2.99D, 12.0D));
        shelf2.putProduct(new WeightProduct("wproduct 3", 3.99D, 13.0D));
        Shelf.showWeightProduct(shelf2);

        Shelf<WeightColorProduct> shelf3 = new Shelf<>();
        shelf3.putProduct(new WeightColorProduct("wcproduct 1", 1.99D, 11.0D, "black"));
        shelf3.putProduct(new WeightColorProduct("wcproduct 2", 2.99D, 12.0D, "yellow"));
        shelf3.putProduct(new WeightColorProduct("wcproduct 3", 3.99D, 13.0D, "green"));
        Shelf.showWeightColorProduct(shelf3);
    }
}
