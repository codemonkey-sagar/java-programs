/*
WAP that simulates the shopping cart for the operations
  1. Add item
  2. Remove item
  3. Display the total bill for all items and
  4. Exit
It allows the customer to add/remove teh shopping items in the card. Finally displays the total bill for the items selected by the customer. 
 */

class Aggregation {
  public static void main(String[]args) {
    int count = 0;
    ShoppingCart sc = new ShoppingCart(1);

    ProductItem it1 = new ProductItem(count++, 200);
    sc.addItem(it1);

    ProductItem it2 = new ProductItem(count++, 300);
    sc.addItem(it2);

    ProductItem it3 = new ProductItem(count++, 1300);
    sc.addItem(it3);

    ProductItem it4 = new ProductItem(count++, 1000);
    sc.addItem(it4);

    sc.removeItem(it3);
    System.out.println();
    sc.doPayment();
    System.out.println();
  }
}