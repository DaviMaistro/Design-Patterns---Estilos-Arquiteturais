public class FixedDiscount implements DiscountStrategy {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    public double apply(double subtotal) {
        double total = subtotal - amount;
        if (total < 0) {
            total = 0;
        }
        return total;
    }
}
