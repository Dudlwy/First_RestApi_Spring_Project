package pl.edu.vistula.first_rest_api_spring.product.api.response;

public class ProductResponse {

    private final long id;
    private final String name;

    public ProductResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){return name;}
}
