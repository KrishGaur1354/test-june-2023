package com.example.testcontainers;

import com.example.testcontainers.config.ContainersEnviroment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

public class ProductRepositoryTest extends ContainersEnviroment {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void When_GetProducts_Expect_EmptyList(){
        List<Product> list = productRepository.findAll();
        assertEquals(0, list.size());
    }
}
