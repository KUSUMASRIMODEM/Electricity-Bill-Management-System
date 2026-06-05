import java.util.Scanner;

public class ElectricityBillManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("          ELECTRICITY BILL MANAGEMENT ");

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        int previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        int currentReading = sc.nextInt();

        if(currentReading <= previousReading) {
            System.out.println("Invalid Meter Readings!");
            return;
        }

        int unitsConsumed = currentReading - previousReading;

        double energyCharges = 0;

        if(unitsConsumed <= 100) {
            energyCharges = unitsConsumed * 1.5;

        } else if(unitsConsumed <= 200) {
            energyCharges =
                    (100 * 1.5) +
                    ((unitsConsumed - 100) * 2.5);

        } else {
            energyCharges =
                    (100 * 1.5) +
                    (100 * 2.5) +
                    ((unitsConsumed - 200) * 4);
        }

        double fixedCharges = 20.0;
        double customerCharges = 50.0;
        double electricityDuty = energyCharges * 0.05;

        double totalBill = energyCharges + fixedCharges + customerCharges + electricityDuty;

        System.out.println("              BILL DETAILS");

        System.out.println("Customer ID       : " + customerId);
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Previous Reading  : " + previousReading);
        System.out.println("Current Reading   : " + currentReading);
        System.out.println("Units Consumed    : " + unitsConsumed);

        System.out.println("\nCharges Breakdown");

        System.out.println("Energy Charges    : " + energyCharges);
        System.out.println("Fixed Charges     : " + fixedCharges);
        System.out.println("Customer Charges  : " + customerCharges);
        System.out.println("Electricity Duty  : " + electricityDuty);

        System.out.println("Total Bill Amount : " + totalBill);

        sc.close();
    }
}