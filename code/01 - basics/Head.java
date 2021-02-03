public class Head {

  private Eye leftEye;
  private Eye rightEye;

  public Head(Eye eye1, Eye eye2) {
    this.leftEye = eye1;
    this.rightEye = eye2;
  }

  public static void main(String args[]) {
    Eye firstEye = new Eye("green");
    Eye secondEye = new Eye("blue");

    Head head1 = new Head(firstEye, secondEye);

    firstEye.color = "grey";

    System.out.println(firstEye);
    System.out.println(head1.rightEye);
    // System.out.println(secondEye.color);
  }
}
