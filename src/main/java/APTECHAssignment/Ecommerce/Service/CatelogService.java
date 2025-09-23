package APTECHAssignment.Ecommerce.Service;

import APTECHAssignment.Ecommerce.Model.ProductCatalog;
import APTECHAssignment.Ecommerce.Model.Products;

import java.util.List;

public class CatelogService {
    private final ProductCatalog productCatalog;

    public CatelogService(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

//    add product
    public String addProduct(Products products){
        return productCatalog.addProduct(products);
    }
    //remove product
    public String removeProduct(String productsName){
        return  productCatalog.removeProducts(productsName);
    }
//    display product
    public List<Products> displayProduct(){
        return productCatalog.displayAllProducts();
    }
//    retrieve product
    public Products retrieve( int index){
       if(index < 0){
           System.out.println("❌Invalid Index: must start from 0 or greater");
           return  null;
       }
       return productCatalog.retrieveProduct(index);
    }

//     total product
    public String catelogSummaryProduct(){
        List<Products> allProducts = productCatalog.displayAllProducts();
        if(allProducts.isEmpty()){
            return "Empty";
        }
        double totalValues = 0.0;
        int totalQuantity = 0;

        for(Products TP : allProducts){
            totalValues += TP.getQuantity() * TP.getQuantity();
            totalQuantity += TP.getQuantity();
        }
        return "Total Product: " + totalQuantity + "All Values : $" +String.format("%.2f",totalValues);

    }


}
