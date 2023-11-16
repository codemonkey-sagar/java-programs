class ProductItem {
  int id;
  private float price;
  
  ProductItem(int id, float price) {
    this.id = id;
    this.price = price;
  }

  public String toString() {
    return "ID: " + id + " PRICE: " + price;
  }

  float getPrice() {
    return price;
  }
}