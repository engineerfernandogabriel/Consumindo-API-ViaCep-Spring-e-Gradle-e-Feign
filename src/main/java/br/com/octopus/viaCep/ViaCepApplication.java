package br.com.octopus.viaCep;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ViaCep API with Feign-Gradle", version = "1.0", description = "API para consulta de CEP"))
public class ViaCepApplication {

	public static void main(String[] args) {

		SpringApplication.run(ViaCepApplication.class, args);
	}

}
