package util;

import Entities.Product;

import java.util.function.Predicate;

public class ProductPredi implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
