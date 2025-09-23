package APTECHAssignment.Ecommerce.EcommerceImpl;

import APTECHAssignment.Ecommerce.Admin.AdminController;
import APTECHAssignment.Ecommerce.Customer.CustomerController;
import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.ProductCatalog;
import APTECHAssignment.Ecommerce.Model.ShoppingCart;
import APTECHAssignment.Ecommerce.Service.CartService;
import APTECHAssignment.Ecommerce.Service.CatelogService;

import javax.management.relation.Role;
import java.util.Scanner;

public class EcommerceApp {
    public static void main(String[]args){

//        for the modela
        ProductCatalog catalogs = new ProductCatalog();
        ShoppingCart cart = new ShoppingCart();

//        Service
        CartService cartService = new CartService(cart);
        CatelogService catelogService = new CatelogService(catalogs) ;

//        roles control
        AdminController admin = new AdminController(catelogService , Roles.ADMIN);
        CustomerController customer = new CustomerController(cartService , Roles.CUSTOMER);

        Scanner input = new Scanner(System.in);

//        while(true){
            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
            System.out.println("|         👋👋👋👋👋👋👋👋👋👋👋👋👋👋 WELCOME TO E-COMMERCE APP 👋👋👋👋👋👋👋👋👋👋👋👋👋👋👋👋             |");
            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
            System.out.println("| SELECT YOUR ROLE 👇                                                                                              |");
            System.out.println("| 1: Admin       👧:                                                                                                |");
            System.out.println("| 2: Customer    🧝‍♂️:                                                                                                |");
            System.out.println("| 0: Exit        ❌:                                                                                               |");
            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
//        }

















    }
}
