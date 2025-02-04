public class NoTax implements SalesTaxBehavior {
    /**
     * Computes the amount of tax
     * @param value The amount to be taxed
     * @return always 0.0
     */
    public double compute(double value) {
        return 0.0;
    }
}
