package abstract1;

public class AbstractDemo {

    public static void main(String[] args) {
        /* Following is not allowed and would raise error */
        Employee e = new Employee("George W.", "Houston, TX", 43);
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        // New version:
        /*
         * Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00); Employee
         * e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
         * System.out.println("Call mailCheck using Salary reference --");
         * s.mailCheck();
         * System.out.println("\n Call mailCheck using Employee reference--");
         * e.mailCheck();
         */
    }
}