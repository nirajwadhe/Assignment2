class Product {
  private String name;
  private double price;
  private int quantity_in_stock;

  public Product(String name, double price, int quantity_in_stock) {
    this.name = name;
    this.price = price;
    this.quantity_in_stock = quantity_in_stock;
    
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity_in_stock() {
    return quantity_in_stock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity_in_stock(int quantity_in_stock) {
    this.quantity_in_stock = quantity_in_stock;
  }
  
}