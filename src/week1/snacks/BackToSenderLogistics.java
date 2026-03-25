package week1.snacks;

public class BackToSenderLogistics {
    private int basePay = 5000;

    public Object calculateRiderWage(int successfulDeliveries) {

        if (successfulDeliveries < 0) return("Successful deliveries cannot be negative");
        if (successfulDeliveries > 100) return("Successful deliveries cannot exceed the daily quota of 100");


        int amountPerParcel = 0;

        if (successfulDeliveries < 50) amountPerParcel = 160;
        if (successfulDeliveries >= 50 && successfulDeliveries <= 59) amountPerParcel = 200;
        if (successfulDeliveries >= 60 && successfulDeliveries <= 69) amountPerParcel = 250;
        if (successfulDeliveries >= 70) amountPerParcel = 500;


        return (successfulDeliveries * amountPerParcel) + basePay;
    }
}