package Filters;

import Product.Product;

import java.util.Comparator;
import java.util.List;

public class FilterForPrice implements MainFilter {

    @Override
    public void filtering(List<Product> product) {
        product.stream()
                .sorted(Comparator.comparingDouble(Product:: getPrice))
                .forEach(System.out::println);
    }
}
