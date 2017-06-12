package com.example.demoRestApi;

import com.sun.javafx.sg.prism.NGShape;

import javax.persistence.*;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String product;

    private String productDescription;

    private Integer offer;

    private Integer productPrice;

    private String definedCurrency;

    private Integer offerPrice;

    public Model(){}

    public Model(String product, String productDescription, Integer offer, Integer productPrice, String definedCurrency, int offerPrice) {
        this.product = product;
        this.productDescription = productDescription;
        this.offer = offer;
        this.productPrice = productPrice;
        this.definedCurrency = definedCurrency;
        this.offerPrice = offerPrice;
    }

    public long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getOffer() {
        return offer;
    }

    public void setOffer(Integer offer) {
        this.offer = offer;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getDefinedCurrency() {
        return definedCurrency;
    }

    public void setDefinedCurrency(String definedCurrency) {
        this.definedCurrency = definedCurrency;
    }

    public Integer getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Integer offerPrice) {
        this.offerPrice = offerPrice;
    }
}
