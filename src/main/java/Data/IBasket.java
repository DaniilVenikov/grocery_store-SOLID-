package Data;

import Product.Product;

public interface IBasket {
    void printBasket();
    void addProduct(Product product);
    void deleteProduct(String titleProduct);
}
