package ar.com.ale94.service;

import ar.com.ale94.dao.ProductDAO;
import ar.com.ale94.model.Product;

public class ProductService {

    ProductDAO productDAO = new ProductDAO();

    public void post(Product product) {
        this.productDAO.createUser(product);
    }

    public Product getProductById(int id) {
        return this.productDAO.getProductById(id);
    }
}
