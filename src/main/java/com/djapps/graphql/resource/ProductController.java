package com.djapps.graphql.resource;

import com.djapps.graphql.entity.Product;
import com.djapps.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category){
        return productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product addProduct(@Argument String name, @Argument String category, @Argument int price, @Argument int stock){
        return productService.addProduct(name, category, price, stock);
    }

    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock){
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product deleteProduct(@Argument int id){
        return productService.deleteProduct(id);
    }



}
