package APTECHAssignment.Ecommerce.Model;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List<Products> Cart = new LinkedList<>();

//                    ADD ITEM
    public String addItem(Products product){
        if(product == null){
            return "❌❌❌❌❌❌❌Invalid product";
        }
        Cart.add(product); //this added the product to the linkedlist;
       return  product.getName() + " ✔️ Product added to cart";
    }

//                    REMOVE ITEM
   public String removeItem(String name){
        //safe way to remove product as we use arraylist and LinkedList
       Iterator <Products> iterator = Cart.iterator();  // it loops through list safely. we use it because it is removing items not to cause concurrentModificationException
       while(iterator.hasNext()){  //checks if there’s another product in the cart
           Products rItem = iterator.next();  //gets the next product and stores it in rItem
           if(rItem.getName().equalsIgnoreCase(name)){
               iterator.remove();
               return  name + " ❌❌ Removed from Cart";
           }
       }
       return  "Product not Added to Cart";

   }
//   view cart contents in order of addition
    public List<Products> viewCart(){
        return Cart;
    }
}
