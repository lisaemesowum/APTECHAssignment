package APTECHAssignment.Ecommerce.Model;

//THIS IS USED FOR STORING ALL THE PRODUCTS FOR CUSTOMER AND THE SHOPPING CART
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCatalog {
    //we use private so only productCatalog will assets it
  private  List<Products> products = new ArrayList<>();  //this is to store products to support fast retrival


//                           METHODS

//                      ADD A NEW PRODUCT
    public String addProduct(Products product){
        products.add(product);  // adding the new products to the arraylist
        return product.getName() + "✔️Product Added";
    }
//                       Remove Products
    public String removeProducts(String name) {
        Iterator<Products> productsIterator = products.iterator();
        while(productsIterator.hasNext()){
            Products Remove = productsIterator.next();
            if(Remove.getName().equalsIgnoreCase(name)){
                return name + " ❌❌❌❌ Products successfully Removed";
            }
        }
        return  "Product not found at all ";
    }

//                   RETRIEVE A PRODUCT BY INDEX

    public Products retrieveProduct(int index){
        // starting from 0 And checks if the index is valid and
       if(index >= 0 && index < products.size()){ //.size return the number of products
           return products.get(index);
       }
       return null; //invalid
    }
//                     Display all products
  public List<Products> displayAllProducts() {
      return products;  //return the entire list
  }
}

