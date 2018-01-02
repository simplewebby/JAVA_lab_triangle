//Tsagan Garyaeva
//COMP-271
//lab 3 triangle




package java271;
public abstract class GeometricObject {
  protected String color = "white";
  protected boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
   
  }

  protected GeometricObject(String color, boolean filled) {
	  this.color = color;
	  this.filled = filled;
  }
  
  
  /** Return color 
 * @param color2 */
  public String getColor() {
    return color;
  }

  /** Set a new color 
 * @param color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
     so, the get method name is isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled =filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString() {
    return "\ncreated on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

public abstract double getArea();

public abstract double getPerimeter();
  
}