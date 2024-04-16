package com.adenbofa.adenbofabank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "The Aden Bank App",
                description = "Backend API for Aden Bank",
                version = "v1.0",
                contact = @Contact(
                        name = "Daerego Braide",
                        email = "phronesis4xt@gmail.com",
                        url = "http://github.com/mandereh/adenbofa_bank"
                ),
                license = @License(
                        name = "The Adenbofa Bank",
                        url = "http://github.com/mandereh/adenbofa_bank"
                )

        ),
        externalDocs = @ExternalDocumentation(
                description = "The Aden Bank Documentation",
                url = "http://github.com/mandereh/adenbofa_bank"
        )
)
public class AdenbofaBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdenbofaBankApplication.class, args);
    }

}
