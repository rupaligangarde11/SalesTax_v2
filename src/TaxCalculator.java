public class TaxCalculator {
    private double tax = 0.0;
    private final double basicTax = 10.0;
    private final double importDutyTax = 5.0;

    public double computeTax(Item item) {

        if (!item.isImported()) {
            if(!item.isExempted()){
                tax= basicTax * item.productCost()/100.0;
            }
        }else if(!item.isExempted()){
            tax= basicTax * item.productCost()/100.0 + item.productCost() * importDutyTax / 100.0;
        }
        else {
            tax = item.productCost() * importDutyTax / 100.0;
        }
        return tax;
    }
}