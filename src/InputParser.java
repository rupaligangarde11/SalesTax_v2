public class InputParser {
    private Item item;

    public Item parseInput(String input) {
        boolean isImported;
        boolean isExempted = false;

        String productName = null;
        String[] formattedInput = input.split(" ");
        int quantity = Integer.parseInt(formattedInput[0]);
        if(formattedInput[1]=="imported") {
            isImported = true;

        }
        else{
            isImported = false;
        }

        productName= formattedInput[formattedInput.length-3];
        if(productName.equals("book")||productName.equals("chocolate")||productName.equals("chocolates")||productName.equals("pills"))
            isExempted = true;
        double productCost = Double.parseDouble(formattedInput[formattedInput.length-1]);
        return new Item(quantity,productName,productCost,isExempted,isImported);
    }


    @Override
    public String toString() {
        return " ";
    }
}
