package com.djapps.graphql.service;

import com.djapps.graphql.entity.Product;
import com.djapps.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product addProduct(String name, String category, int price, int stock) {
        Product product = new Product(name, category, price, stock);
        return productRepository.save(product);
    }

    public Product updateStock(int id, int stock) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("product not found with id:"+id));
        product.setStock(product.getStock() + stock);
        return productRepository.save(product);
    }


    public Product deleteProduct(int id) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("product not found with id:"+id));
        productRepository.delete(product);
        return product;
    }


}
