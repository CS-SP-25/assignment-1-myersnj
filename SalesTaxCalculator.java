public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Process commandline arguments
        if (args.length < 2)
            return;
        String stateName = args[0];
        double value;
        try {
            value = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            return;
        }

        // Create State Object based on given name
        State s;
        switch(stateName) {
            case "Alaska":
                s = new Alaska();
                s.setSalesTaxBehavior(new NoTax());
                break;
            case "Hawaii":
                s = new Hawaii();
                s.setSalesTaxBehavior(new FourPointFivePercent());
                break;
            case "Indiana":
                s = new Indiana();
                s.setSalesTaxBehavior(new SevenPercent());
                break;
            default:
                return;
        }
        // Print the tax for the given value
        s.showTax(value);
    }
}
