import Data.Basket;
import Data.DataBase;
import Filters.*;
import Product.*;
import Service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product milkAvida = new Product(TypeProduct.DAIRY_PRODUCT, "milkAvida", "Avida", 65.9);
        Product milkParma = new Product(TypeProduct.DAIRY_PRODUCT, "milkParma", "Parma", 59.5);
        Product breadBlack = new Product(TypeProduct.BAKED_GOODS, "breadBlack", "Parma", 50.0);
        List<Product> productList = new ArrayList<Product>();
        productList.add(milkAvida);
        productList.add(milkParma);
        DataBase dataBase = DataBase.get();
        Basket basket = new Basket();
        dataBase.setProducts(productList);
        dataBase.addProduct(breadBlack);
        dataBase.addProduct(new Product(TypeProduct.MEET, "steakMiratorg", "Miratorg", 699.99));

        dataBase.printProduct();

        Menu menu = new Menu(basket);
        menu.showMenu();

    }
}
