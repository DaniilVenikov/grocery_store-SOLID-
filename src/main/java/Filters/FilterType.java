package Filters;

import Product.*;

import java.util.List;


public interface FilterType {
    void filtering(List<Product> products, TypeProduct nameFilter);
}
