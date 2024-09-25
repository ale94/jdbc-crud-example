package ar.com.ale94;

import ar.com.ale94.model.Product;
import ar.com.ale94.service.ProductService;

public class App {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Crear producto
        service.post(new Product("Iphone", 1200D, 2));
        service.post(new Product("Samsung A50", 800D, 1));
        service.post(new Product("Notebook Asus", 2200D, 2));
        System.out.println();

        // Obtener producto por ID
        System.out.println(service.getProductById(2));
        System.out.println();

        // Obtener todos los productos
        service.getProducts();
        System.out.println();

        // Eliminar productos
//        service.delete(1);
//        service.delete(2);

        // Actualizar
        service.update(new Product("Iphone", 999D, 2), 1);
        service.update(new Product("Iphone", 998D, 2), 2);
    }
}
