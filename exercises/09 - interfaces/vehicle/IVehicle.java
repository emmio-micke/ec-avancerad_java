public interface IVehicle {

    // indicate how much a basic tune-up costs

    public double tuneUpCost();

    // determine whether vehicle can hold given num of passengers

    public boolean canCarry(int numPassengers);

}