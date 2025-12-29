package pl.edu.vistula.first_rest_api_spring.product.api.response;

import pl.edu.vistula.first_rest_api_spring.product.domain.Product;
import pl.edu.vistula.first_rest_api_spring.product.repository.ProductRepository;

public class ProductResponse {

    private final long id;
    private final String name;

    public ProductResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){return name;}
}
