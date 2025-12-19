package pl.edu.vistula.first_rest_api_spring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.first_rest_api_spring.product.domain.Product;
import pl.edu.vistula.first_rest_api_spring.product.support.ProductMapper;


import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    protected final Map<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity){
        setID(entity);
        return entity;
    }

    private Product setID(Product entity){
        entity.setId(counter);
        map.put(counter, entity);
        counter++;
        return entity;
    }

}
