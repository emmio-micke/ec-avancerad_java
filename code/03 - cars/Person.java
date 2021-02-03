public class Person {

  private String name;
  private String address;
  private int age;

  public Person(String personName, String personAddress, int personAge) {
    this.setName(personName);
    this.address = personAddress;
    this.age = personAge;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    if (newName.length() >= 2) {
      this.name = newName;
    }
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String newAddress) {
    if (newAddress.length() >= 2) {
      this.address = newAddress;
    }
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) {
    if (newAge >= 0) {
      this.age = newAge;
    }
  }
}

class CarOwner extends Person {

  public CarOwner(String personName, String personAddress, int personAge) {
    super(personName, personAddress, personAge);
  }

  public String toString() {
    return "Owner is " + this.getName() + ", " + this.getAge() + " years.";
  }
}
