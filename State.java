public abstract class State {
    private SalesTaxBehavior stb;
    private String name;

    /**
     * Constructs a State of the given name and the given SalesTaxBehavior
     * @param name Name of the state
     */
    public State(String name) {
        this.name = name;
    }

    /**
     * Gives the name of the state
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the state
     * @param name The name to set the state name to
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalesTaxBehavior(SalesTaxBehavior stb) { this.stb = stb; }

    /**
     * Prints out a message displaying the amount of tax for a given state and value
     * @param value Amount to be taxed on
     */
    public void showTax(double value) {
        System.out.println(String.format("The sales tax on $%.2f in %s is $%.2f.", value, name, stb.compute(value)));
    }
}
