package APTECHAssignment.Ecommerce.EcommerceImpl;

import APTECHAssignment.Ecommerce.Admin.AdminController;
import APTECHAssignment.Ecommerce.Customer.CustomerController;
import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.ProductCatalog;
import APTECHAssignment.Ecommerce.Model.ShoppingCart;
import APTECHAssignment.Ecommerce.Service.CartService;
import APTECHAssignment.Ecommerce.Service.CatelogService;

import javax.management.relation.Role;
import java.time.LocalDate;
import java.util.Scanner;

public class EcommerceApp {
    String entryDate = LocalDate.now().toString();
    private static int idCounter = 0;
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

        while(true){
            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
            System.out.println("|         👋👋👋👋👋👋👋👋👋👋👋👋👋👋 WELCOME TO E-COMMERCE APP 👋👋👋👋👋👋👋👋👋👋👋👋👋👋👋👋             |");
            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
            System.out.println("| SELECT YOUR ROLE 👇                                                                                             |");
            System.out.println("| 1: Admin       👧:                                                                                              |");
            System.out.println("| 2: Customer    🧝‍♂️:                                                                                               |");
            System.out.println("| 0: Exit        ❌:                                                                                               |");

            System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
            System.out.println("| Enter:                                                                                                            |");

//            print
            int choose = input.nextInt();
            input.nextLine();

            switch(choose){
                case 1:
                    System.out.println("|➖➖➖➖➖➖➖ ADMIN MENU ➖➖➖➖➖➖➖➖➖|");
                    System.out.println("| 1: Add Product                                 |");
                    System.out.println("| 2: Remove Product                              |");
                    System.out.println("| 3: View Catalog                                |");
                    System.out.println("| 0: Back                                        |");
                    System.out.println("|➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖|");
                    System.out.println("| Enter:                                         |");

                    int AdminChoice = input.nextInt();
                    input.nextLine();

                    switch (AdminChoice){
                        case 1:
                            System.out.println("Enter Product ID");
                            int id = input.nextInt();
                            input.nextLine();
                            System.out.println();
                            System.out.println("Enter Product Name");
                            String name = input.nextLine();
                            System.out.println("Enter Description");
                            String description= input.nextLine();
                            System.out.println("Enter Price");
                            double price = input.nextDouble();
                            String entryDate = LocalDate.now().toString();
                            admin.addProducts(id,name,description,price,entryDate);
                        break;
                        case 2:
                            System.out.println("Enter Product Name to Remove: ");
                            String removeP = input.nextLine();
                            admin.removeProducts(removeP);
                        break;
                        case 3:
                            admin.viewCatalog();
                        break;
                        case 0:
                            System.out.println(" Returning to main menu");
                        break;
                        default:
                            System.out.println(" invalid choice, try again");
                    }

            }
        }

















    }
}
