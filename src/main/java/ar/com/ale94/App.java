package ar.com.ale94;

import ar.com.ale94.model.Product;
import ar.com.ale94.service.ProductService;

public class App {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Create products
        service.post(new Product("Iphone", 1200D, 2));
        service.post(new Product("Samsung A50", 800D, 1));
        service.post(new Product("Notebook Asus", 2200D, 2));

        // Read By Id
        System.out.println(service.getProductById(2));
    }
}
