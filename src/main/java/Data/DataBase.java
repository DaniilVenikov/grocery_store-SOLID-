package Data;
import Filters.*;

import Product.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataBase {
    private static DataBase dataBase = null;
    private static Set<String> producersSet = new HashSet<>();

    private List<Product> products = new ArrayList<>();
    private final FilterType filterType = new FilterForType();
    private final FilterProduce filterProduce = new FilterForProduce();
    private MainFilter mainFilter;



    private DataBase(){}

    public static DataBase get(){
        if(dataBase == null) dataBase = new DataBase();
        return dataBase;
    }

    public List<Product> getProducts(){
        return products;
    }

    public void printProduct(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void printFilterMenu(){
        mainFilter.filtering(products);
    }

    public void setFilter(MainFilter mainFilter){
        this.mainFilter = mainFilter;
    }

    public void setProducts(List<Product> productList){
        this.products = productList;
        for (Product product : productList){
            producersSet.add(product.getProducer());
        }
    }


    public void addProduct(Product product){
        products.add(product);
        producersSet.add(product.getProducer());
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public Set<String> getProducersSet() {
        return producersSet;
    }

    public FilterProduce getFilterProduce() {
        return filterProduce;
    }

    public static void setProducersSet(Set<String> producersSet) {
        DataBase.producersSet = producersSet;
    }


    @Override
    public String toString() {
        return "DataBase{" +
                "products=" + products + '\n' +
                ", filterType=" + filterType + '\n' +
                ", filterProduce=" + filterProduce + '\n' +
                ", mainFilter=" + mainFilter + '\n' +
                '}';
    }
}
