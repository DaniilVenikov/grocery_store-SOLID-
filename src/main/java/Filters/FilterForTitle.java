package Filters;

import Product.Product;

import java.util.Comparator;
import java.util.List;

public class FilterForTitle implements MainFilter {
    @Override
    public void filtering(List<Product> product) {
        product.stream()
                .sorted(Comparator.comparing(Product::getTitle))
                .forEach(System.out::println);
    }
}
