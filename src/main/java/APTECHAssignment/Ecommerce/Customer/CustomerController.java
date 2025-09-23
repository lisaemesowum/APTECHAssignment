package APTECHAssignment.Ecommerce.Customer;

import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.Products;
import APTECHAssignment.Ecommerce.Model.ShoppingCart;


import java.time.LocalDate;

public class CustomerController {
       private ShoppingCart shoppingCart;
        private Roles userRole;


   public CustomerController(ShoppingCart shoppingCart , Roles  userRole){
       this.shoppingCart = shoppingCart;
       this.userRole =  userRole;
   }

   /// add to cart
    public void addToCart(int id, String name, String description , double price){
        if(userRole == Roles.CUSTOMER){
            Products cart = new Products(id , name, description , price);
            String entryDate = LocalDate.now().toString();
            String result = shoppingCart.addItem(cart);
            System.out.println(result + "Added on: "+ entryDate);
        }else{
            System.out.println(" ❌❌❌ Access Denied , Only Customers can Add products.");
        }
    }
//    remove from cart
    public void RemoveFromCart(String ProductName){
        if( userRole == Roles.CUSTOMER){
            String result = shoppingCart.removeItem(ProductName);
            System.out.println(result);
        }else{
            System.out.println(" ❌❌❌PRODUCT DENIED TO CART");
        }
    }

//    view cart

   public  void viewCart() {
       if (userRole == Roles.CUSTOMER) {
           System.out.println(" 🛒🛒🛒 Cart Items:");
           for (Products CP : shoppingCart.viewCart()) {
               System.out.println("-" + CP.getName() + "| $" + CP.getPrice() + "|" + CP.getQuantity());
           }
       } else {
           System.out.println(" ❌❌❌Cart DENIED");
       }
   }
    // Checkout Summary
    void  totalNumberItem(){
        if (userRole == Roles.CUSTOMER){
            String total = shoppingCart.totalNumberItem();
            System.out.println(total);
        }else{
            System.out.println("❌❌❌❌❌❌❌");
        }
    };



}
