public class Main {

  /*
x Konstruera en klass Person. En person ska ha ett namn, adress och alder. Utforma en konstruktor och nagra lampliga metoder for Person.

x Konstruera en klass Bilagare som arver Person.

x Konstruera en klass Bil med registreringsnummer, modell och marke. En bil ska ha en Bilagare. Konstruera metoder som anropas nar man koper eller saljer en bil (alltsa byter bilagare).

x Lagg till kod som skapar upp nagra bilar och bilagare.

x Lat bilagarna kopa och salja ett par bilar i programmet.

Skriv, till sist, ut alla bilagarna samt vilka bilar de (eventuellt) ager.
OBS - losningen ska folja Best Practices for inkapsling

   */

  public static void main(String[] args) {
    Car car1 = new Car("ABC123", "Volvo", "XC50");
    Car car2 = new Car("CDE234", "Citroen", "C4");

    CarOwner owner1 = new CarOwner("Peter", "Gatan 4", 33);
    CarOwner owner2 = new CarOwner("Mathilde", "Vagen 33", 28);
    CarOwner owner3 = new CarOwner("Karro", "Stigen 12", 39);

    car1.setOwner(owner3);
    car2.setOwner(owner2);

    System.out.println(car1.getOwner());
    System.out.println(car2.getOwner());

    car1.setOwner(owner1);
    car2.setOwner(owner3);

    System.out.println(car1.getOwner());
    System.out.println(car2.getOwner());

    System.out.println(car1);
    System.out.println(car2);
  }
}
