public class Eye {

  public String color;

  public Eye(String eyeColor) {
    this.color = eyeColor;
  }

  public void changeColor(String newColor) {
    this.color = newColor;
  }

  public String toString() {
    return "eye color: " + this.color;
  }
}
