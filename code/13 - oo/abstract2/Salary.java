public class Salary extends Employee {
    private double salary; // Annual salary

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
    // Remainder of class definition
}