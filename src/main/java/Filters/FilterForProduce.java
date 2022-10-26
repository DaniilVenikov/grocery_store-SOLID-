package Filters;

import Filters.Filter;
import Product.Product;

import java.util.List;
import java.util.stream.Collectors;

public class FilterForProduce implements Filter {

    @Override
    public List<Product> filtering(List<Product> product, String filterName) {
        return product.stream()
                .filter(x -> x.getProducer().equals(filterName))
                .collect(Collectors.toList());
    }
}
