public class Item {
    private int quantity;
    private  String productName;
    private  double productCost;
    private  boolean isExempted;
    private  boolean isImported;

    public Item(int quantity, String productName, double ProductCost, boolean isExempted, boolean isImported) {
        this.quantity = quantity;
        this.productName = productName;
        productCost = ProductCost;
        this.isExempted = isExempted;
        this.isImported = isImported;
    }


    public boolean isExempted() {
        return isExempted;
    }

    public boolean isImported() {
        return isImported;
    }

    public double productCost() {
        return productCost;
    }

    public double addTaxToProductCost(double tax) {
        return productCost+tax;
    }
}
