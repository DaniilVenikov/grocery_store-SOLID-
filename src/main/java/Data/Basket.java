package Data;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket implements IBasket {
    private List<Product> products = new ArrayList<>();

    @Override
    public void printBasket() {
        products.forEach(System.out::println);
    }

    @Override
    public void deleteProduct(String title){
        products.removeIf(nextProduct -> nextProduct.getTitle().equals(title));
    }
}
