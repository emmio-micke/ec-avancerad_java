public class Main {

  /*
Konstruera en klass Person. En person ska ha ett namn, adress och alder. Utforma en konstruktor och nagra lampliga metoder for Person.

Konstruera en klass Bilagare som arver Person.
Konstruera en klass Bil med registreringsnummer, modell och marke. En bil ska ha en Bilagare. Konstruera metoder som anropas nar man koper eller saljer en bil (alltsa byter bilagare).
Lagg till kod som skapar upp nagra bilar och bilagare. Lat bilagarna kopa och salja ett par bilar i programmet. Skriv, till sist, ut alla bilagarna samt vilka bilar de (eventuellt) ager.
OBS - losningen ska folja Best Practices for inkapsling

   */

  public static void main(String[] args) {
    Person peter = new Person("Peter", "Gatan 4", 33);

    peter.setName("Kalle");
    peter.setAddress("Stigen 5");
    peter.setAge(34);

    System.out.println(peter.getName());
    System.out.println(peter.getAddress());
    System.out.println(peter.getAge());
  }
}
