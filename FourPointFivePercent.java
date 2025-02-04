public class FourPointFivePercent implements SalesTaxBehavior {
    /**
     * Computes the amount of tax
     * @param value The amount to be taxed
     * @return 4.5% of the value
     */
    public double compute(double value) {
        return value * .045;
    }
}
