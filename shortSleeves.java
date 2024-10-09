/*
 * Represents a dessert that can be sold at a food truck
 */
public class shortSleeves {

  private String size;    // The size of a cloth
  private double price;     // The price of a cloth
private String color; // The color of the cloth
  /*
   * Sets flavor to "plain" and price to 0.50
   */
  public shortSleeves() {
    this("medium", 25.00, "red");
  }

  /*
   * Sets flavor to the specified flavor and
   * price to the specified price
   */
  public shortSleeves(String size, double price, String color) {
    this.size = size;
    this.price = price;
    this.color = color;
  }

  /*
   * Returns the value assigned to flavor
   */
  public String getSize() {
    return size;
  }

  /*
   * Returns the value assigned to price
   */
  public double getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }
  /*
   * Sets flavor to newFlavor
   */
  public void setSize(String newSize) {
    size = newSize;
  }

  /*
   * Sets price to newPrice
   */
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }

  public void setColor(String newColor) {
    color = newColor;
  }
   /*
   * toSrting method
   */
public String toString(){
  return "size: " + size + "\nPrice: "+ price + "\ncolor: " + color;
}
 
}
