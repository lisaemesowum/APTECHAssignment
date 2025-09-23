package APTECHAssignment.Ecommerce.Service;

import APTECHAssignment.Ecommerce.Model.Products;
import APTECHAssignment.Ecommerce.Model.ShoppingCart;

import java.util.List;

public class CartService {

    //final cant be changed
    private final ShoppingCart shoppingCart;   // this means cartService object will have its own shoppingCart

// so with the final we cant do this this.ShoppingCart = new ShoppingCart(); later

    //the constructor
    public CartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

//    add product
    public String addProduct(Products products){
        // check if the product is valid
        if(products == null){
            return "❌❌❌❌ Invalid Product! Try Again";
        }
        return shoppingCart.addItem(products);
    }

//    Remove item
   public String removeItem(String ProductName){
        if(ProductName == null || ProductName.isBlank() ){
            return "invalid product name!";
        }
        return shoppingCart.removeItem(ProductName);
   }

//   view cart
    public String ViewCart(){
        List<Products> CartItem = shoppingCart.viewCart();
        if(CartItem.isEmpty()){
            return  "Cart is Empty";
        }
        StringBuilder Scart = new StringBuilder("🛒🛒 Your Cart Items: \n");
        for(Products pro : CartItem){
            //append is like  concatenate inside the StringBuilder is like a printer
            Scart.append("➖ ").append(pro.getName()).append(" -").append(pro.getDescription()).append(" [💲").append(pro.getPrice()).append("] \n");
        }
        return Scart.toString();  //converts the builder into a normal String
    }
}
