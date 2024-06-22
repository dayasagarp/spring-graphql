package com.djapps.graphql;

import com.djapps.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGraphqlApplication {

	@Autowired
	private ProductRepository productRepository;

//    @PostConstruct
//    public void initDB() {
//        List<Product> products = Stream.of(
//                new Product("TV", "Electronics", 500, 10),
//                new Product("Laptop", "Electronics", 1000, 10),
//                new Product("Office Chair", "Furniture", 1000, 10),
//                new Product("Mobile", "Electronics", 500, 20),
//                new Product("Shirt", "Fashion", 20, 100),
//                new Product("Water Bottle", "Accessories", 20, 100)
//
//        ).collect(Collectors.toList());
//		productRepository.saveAll(products);
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphqlApplication.class, args);
    }

}
