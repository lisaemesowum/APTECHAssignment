package APTECHAssignment.Ecommerce.Admin;

import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.Products;
import APTECHAssignment.Ecommerce.Service.CatelogService;

import java.time.LocalDate;

public class AdminController {
//      link with productCatalog to add, remove etc
    private CatelogService catalog;
    private Roles AdminRole;

//    constructor
    public AdminController(CatelogService catalog , Roles AdminRole){
        this.catalog = catalog;
        this. AdminRole =  AdminRole;
    }
    // admin to add product  only allow role is admin
    public void addProducts(int id, String name, String description , double price, String entryDate){
       if( AdminRole == Roles.ADMIN){
           Products products = new Products(id, name,description , price);
            LocalDate.now().toString();
           String result = catalog.addProduct(products);
           System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
           System.out.println("|" +result + " Added on : "+ entryDate);
           System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|\n");
       }else{
           System.out.println(" ❌❌❌ Access Denied , Only Admins can Add products.");
       }
    }

//    remove products
    public void removeProducts(String name){
        if( AdminRole == Roles.ADMIN){
            String result = catalog.removeProduct(name);

            System.out.println(result);
        }else{
            System.out.println(" ❌❌❌ Access Denied , Only Admins can Remove.");
        }
    }

//    display products
    public void viewCatalog(){
        System.out.println("Products Catalogs: ");
        for(Products DC : catalog.displayProduct()){
            System.out.println("|💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶|");
            System.out.println("|" + DC.getId() + "." + DC.getName() + " - $" + DC.getPrice() + "|"+ DC.getDescription()  +"|");
            System.out.println("|💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶💶|\n");
        };
    }
}
