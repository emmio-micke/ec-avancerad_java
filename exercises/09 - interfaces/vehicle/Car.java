public class Car implements IVehicle {

    int mileage;

    int year;

    int numDoors;

    // constructor goes here

    // indicate whether car was built before given year

    boolean builtBefore(int otherYear) {

        return this.year < otherYear;

    }

}