package APTECHAssignment.Ecommerce.Model;

public class Products {
   private int id;
   private String name;
   private String description;
   private int quantity;
   private double price;

    public Products(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
//   FOR ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//   FOR NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// DESCRIPTION
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//  FOR QUANTITY
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//  FOR PRICE
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products { " +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", description ='" + description + '\'' +
                ", quantity =" + quantity +
                ", price = " + price +
                '}';
    }
}
