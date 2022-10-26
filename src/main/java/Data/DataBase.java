package Data;
import Filters.*;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Product> products = new ArrayList<>();
    private Filter filter;



    public DataBase(Filter filter){
        this.filter = filter;
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Product> toFilter(String filterName){
        return filter.filtering(products, filterName);
    }

    public void addProduct(Product product){
        products.add(product);
    }

}
