package br.com.devaws.productsapi.productsapi;

public class Products {
    private String name;
    private String code;

    public Products(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }
}