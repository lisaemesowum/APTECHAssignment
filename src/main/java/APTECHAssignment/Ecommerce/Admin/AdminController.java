package APTECHAssignment.Ecommerce.Admin;

import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.ProductCatalog;
import APTECHAssignment.Ecommerce.Model.Products;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class AdminController {
//      link with productCatalog to add, remove etc
    private ProductCatalog catalog;
    private Roles AdminRole;

//    constructor
    public AdminController(ProductCatalog catalog , Roles AdminRole){
        this.catalog = catalog;
        this. AdminRole =  AdminRole;
    }
    // admin to add product  only allow role is admin
    public void addProducts(int id, String name, String description , double price){
       if( AdminRole == Roles.ADMIN){
           Products products = new Products(id, name,description , price);
           String entryDate = LocalDate.now().toString();
           String result = catalog.addProduct(products);
           System.out.println(result + "Added on: "+ entryDate);
       }else{
           System.out.println(" ❌❌❌ Access Denied , Only Admins can Add products.");
       }
    }

//    remove products
    public void removeProducts(String name){
        if( AdminRole == Roles.ADMIN){
            String result = catalog.removeProducts(name);
            System.out.println(result);
        }else{
            System.out.println(" ❌❌❌ Access Denied , Only Admins can Remove.");
        }
    }

//    display products
    public void viewCatalog(String name){
        System.out.println("Products Catalogs: ");
        for(Products DC : catalog.displayAllProducts()){
            System.out.println( DC.getId() + "." + DC.getName() + " - $" + DC.getPrice() + "|"+ DC.getDescription());
        };
    }
}
