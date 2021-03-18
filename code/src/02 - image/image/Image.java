package image;

public class Image {

    private int size;

    public Image() {
    }

    public Image(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        XrayImage image1 = new XrayImage(100, 50);

        System.out.println(image1.getSize());
        System.out.println(image1.level);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int sizeValue) {
        if (sizeValue > 50) {
            this.size = sizeValue;
        }
    }
}

class XrayImage extends Image {

    public int level;

    public XrayImage(int size_value, int level_value) {
        this.setSize(size_value);
        this.level = level_value;
    }
}
