package Filters;

import Product.*;

import java.util.List;

public class FilterForType implements FilterType{
    @Override
    public void filtering(List<Product> products, TypeProduct nameFilter) {
        products.stream()
                .filter(product -> product.getTypeProduct().equals(nameFilter))
                .forEach(System.out::println);
    }
}
