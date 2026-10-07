package ie.atu.cicd1orderservice.client;

import ie.atu.cicd1orderservice.dto.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "${catalog.service.url}")
public interface CatalogClient {

    @GetMapping("/products/{id}")
    ProductResponse GetProductById(@PathVariable("id") Long id);
}
