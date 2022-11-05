package Filters;

import Product.Product;

import java.util.List;

public class FilterForProduce implements FilterProduce{

    @Override
    public void filtering(List<Product> products, String produce) {
        products.stream()
                .filter(product -> product.getProducer().equals(produce))
                .forEach(System.out::println);
    }
}
