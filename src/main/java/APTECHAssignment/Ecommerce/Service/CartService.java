package APTECHAssignment.Ecommerce.Service;

import APTECHAssignment.Ecommerce.Model.ShoppingCart;

public class CartService {

    //final cant be changed
    private final ShoppingCart ShoppingCart;   // this means cartService object will have its own shoppingCart

// so with the final we cant do this this.ShoppingCart = new ShoppingCart(); later

    //the constructor so this
    public CartService(ShoppingCart shoppingCart) {
        this.ShoppingCart = shoppingCart;
    }

}
