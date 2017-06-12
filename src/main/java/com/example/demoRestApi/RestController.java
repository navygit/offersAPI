package com.example.demoRestApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class RestController {

    private Service service;


    @Autowired
    RestController(Repository repository ) {
        this.service = new Service(repository);
    }

    /*Function to calculate and save offer  */
    private Resource CalculateOffer(Model model) {
        Integer productOriginalPrice = model.getProductPrice();
        Integer offerPercentage = model.getOffer();
        Integer newOfferPriceOfProduct = productOriginalPrice - (productOriginalPrice * offerPercentage/100);
        Model newModel = new Model();
        if(offerPercentage <= 0 || productOriginalPrice <= 0 ){
          throw new IllegalArgumentException("please enter a positive number");
        }
        newModel.setDefinedCurrency(model.getDefinedCurrency());
        newModel.setOffer(model.getOffer());
        newModel.setOfferPrice(newOfferPriceOfProduct);
        newModel.setProduct(model.getProduct());
        newModel.setProductDescription(model.getProductDescription());
        newModel.setProductPrice(model.getProductPrice());
        Resource resource = new Resource(service.save(newModel));
        return resource;
    }

    /*Controller */
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public ResponseEntity<?> jsonRequest (@RequestBody Model model) {
        return new ResponseEntity<>(CalculateOffer(model), HttpStatus.OK);
    }

    /*Controller */
    @RequestMapping(value = "/product/{product}/{productDescription}/{offer}/{productPrice}/{definedCurrency}", method = RequestMethod.GET)
    public ResponseEntity<?> urlRequest (@PathVariable String product,@PathVariable String productDescription,@PathVariable Integer offer,@PathVariable Integer productPrice,@PathVariable String definedCurrency) {
        if(offer <= 0 || productPrice <= 0 ){
          throw new IllegalArgumentException("please enter a positive number");
        }
        Integer newOfferPriceOfProduct = productPrice - (productPrice * offer/100);
        Model model = new Model();
        model.setOffer(offer);
        model.setProductPrice(productPrice);
        model.setProduct(product);
        model.setProductDescription(productDescription);
        model.setOfferPrice(newOfferPriceOfProduct);
        model.setDefinedCurrency(definedCurrency);
        Resource resource = new Resource(service.save(model));
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }

}
