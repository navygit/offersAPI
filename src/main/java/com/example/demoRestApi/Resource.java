package com.example.demoRestApi;

public class Resource {

    private String product;

    private String productDescription;

    private Integer offerPercentage;

    private Integer productOriginalPrice;

    private String definedCurrency;

    private Integer offerPrice;

    public Resource() {}

    public Resource(Model model) {
        this.product = model.getProduct();
        this.definedCurrency = model.getDefinedCurrency();
        this.offerPercentage = model.getOffer();
        this.productOriginalPrice = model.getProductPrice();
        this.productDescription = model.getProductDescription();
        this.offerPrice = model.getOfferPrice();
    }

    public String getProduct() {
        return product;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Integer getOfferPercentage() {
        return offerPercentage;
    }

    public Integer getProductOriginalPrice() {
        return productOriginalPrice;
    }

    public String getDefinedCurrency() {
        return definedCurrency;
    }

    public Integer getOfferPrice() {
        return offerPrice;
    }
}
