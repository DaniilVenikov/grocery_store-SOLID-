package Filters;

import Product.Product;

import java.util.List;

public interface Filter {
    List<Product> filtering(List<Product> product, String filterName);
}
