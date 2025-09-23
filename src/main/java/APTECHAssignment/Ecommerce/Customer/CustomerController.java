package APTECHAssignment.Ecommerce.Customer;

import APTECHAssignment.Ecommerce.Enum.Roles;
import APTECHAssignment.Ecommerce.Model.Products;
import APTECHAssignment.Ecommerce.Model.ShoppingCart;
import APTECHAssignment.Ecommerce.Service.CartService;


import java.time.LocalDate;
import java.util.List;

public class CustomerController {
       private CartService cartService;
        private Roles userRole;


   public CustomerController(CartService cartService , Roles  userRole){
       this.cartService = cartService;
       this.userRole =  userRole;
   }

   /// add to cart
    public void addToCart(int id, String name, String description , double price){
        if(userRole == Roles.CUSTOMER){
            Products cart = new Products(id , name, description , price);
            String entryDate = LocalDate.now().toString();
            String result = cartService.addProduct(cart);
            System.out.println(result + "Added on: "+ entryDate);
        }else{
            System.out.println(" ❌❌❌ Access Denied , Only Customers can Add products.");
        }
    }
//    remove from cart
    public void RemoveFromCart(String ProductName){
        if( userRole == Roles.CUSTOMER){
            String result = cartService.removeItem(ProductName);
            System.out.println(result);
        }else{
            System.out.println(" ❌❌❌PRODUCT DENIED TO CART");
        }
    }

//    view cart

//   public  String viewCart() {
//       if (userRole == Roles.CUSTOMER) {
////          List<Products> cartItem = cartService.viewCart();
//           for (Products CP : cartService.viewCart() ) {
//               System.out.println("-" + CP.getName() + "| $" + CP.getPrice() + "|" + CP.getQuantity());
//           }
//           System.out.println("Total Items: " + cartService.TotalItem());
//           System.out.println("Total cost: " +cartService.totalCost());
//       } else {
//           System.out.println(" ❌❌❌Cart DENIED");
//       }
//       return "";
//   }
    // Checkout Summary
    void  totalNumberItem(){
        if (userRole == Roles.CUSTOMER){
            String total = String.valueOf(cartService.TotalItem());
            System.out.println(total);
        }else{
            System.out.println("❌❌❌❌❌❌❌");
        }
    };



}
