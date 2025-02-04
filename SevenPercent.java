public class SevenPercent implements SalesTaxBehavior {
    /**
     * Computes the amount of tax
     * @param value The amount to be taxed
     * @return 7% of the value
     */
    public double compute(double value) {
        return value * .07;
    }
}
