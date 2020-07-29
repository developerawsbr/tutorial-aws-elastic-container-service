package br.com.devaws.productsapi.productsapi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductsController {
    @GetMapping("/")
    public List<Products> listProducts() {
        ArrayList<Products> list = new ArrayList<Products>();
        list.add(new Products("Produto1", "Codigo1"));
        list.add(new Products("Produto2", "Codigo2"));
        list.add(new Products("Produto3", "Codigo3"));
        return list;
    }
    
}