package com.microservice.microserviceproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.microservice.microserviceproduct.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.microservice.microserviceproduct.entity.Product;
import com.microservice.microserviceproduct.service.ProductServiceImpl;

@SpringBootApplication


public class MicroserviceProductApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);

        Product p = new Product("Microservice Gateway", 149.99);
        productService.addProduct(p);

        System.out.println("Produit ajouté avec succès ! Total en base : " + productService.getAllProducts().size());

        context.close();
    }
}