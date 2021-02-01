public class Image {

  int size;

  public Image() {}

  public Image(int size) {
    this.size = size;
  }

  public static void main(String[] args) {
    XrayImage image1 = new XrayImage(100, 50);

    System.out.println(image1.size);
    System.out.println(image1.level);
  }
}

class XrayImage extends Image {

  int level;

  public XrayImage(int size_value, int level_value) {
    this.size = size_value;
    this.level = level_value;
  }
}
