package Data;

import Product.*;

import java.util.ArrayList;
import java.util.List;

public class Basket implements IBasket {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void printBasket() {
        if(products.isEmpty()){
            System.out.println("Ваша карзина пуста");
        } else products.forEach(System.out::println);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(String title){
        products.removeIf(nextProduct -> nextProduct.getTitle().equals(title));
    }
}
