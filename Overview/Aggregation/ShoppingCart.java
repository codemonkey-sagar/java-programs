import java.util.*;

class ShoppingCart {
  int custid;
  Vector itemsv;

  ShoppingCart(int custid) {
    this.custid = custid;
    itemsv = new Vector();
  }

  public void addItem(ProductItem pit) {
    itemsv.addElement(pit);
  }

  public void removeItem(ProductItem pit) {
    itemsv.remove(pit);
  }

  public void doPayment(){
    float amt = 0.0f;
    
    for(int i = 0; i < itemsv.size(); i++) {
      amt += ((ProductItem) itemsv.get(i)).getPrice();
    }

    System.out.println("Total Price: " + amt);
  }
}