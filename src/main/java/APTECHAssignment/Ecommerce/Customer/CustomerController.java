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
    public void RemoveFromCart(){

    }
}
