package Product;

public class Product {
    private TypeProduct typeProduct;
    private String title;
    private String producer;
    private double price;


    public Product(TypeProduct typeProduct, String title, String producer, double price) {
        this.typeProduct = typeProduct;
        this.title = title;
        this.producer = producer;
        this.price = price;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

}
