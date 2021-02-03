package car;

public class Car {

  private String regNo;
  private String make;
  private String model;
  private CarOwner owner;

  public Car(String carRegNo, String carMake, String carModel) {
    this.regNo = carRegNo;
    this.make = carMake;
    this.model = carModel;
    this.owner = null;
  }

  public String getRegNo() {
    return this.regNo;
  }

  public void setRegNo(String newRegNo) {
    this.regNo = newRegNo;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String newMake) {
    this.make = newMake;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String newModel) {
    this.model = newModel;
  }

  public CarOwner getOwner() {
    return this.owner;
  }

  public void setOwner(CarOwner newOwner) {
    this.owner = newOwner;
  }

  public String toString() {
    return this.make + " " + this.model + ", " + this.owner;
  }
}
