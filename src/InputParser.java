public class InputParser {
    private Item item;

    public Item parseInput(String input) {
        boolean isImported;
        String productName;
        String[] formattedInput = input.split(" ");
        int quantity = Integer.parseInt(formattedInput[0]);
        if(formattedInput[1]=="imported") {
            isImported = true;

        }
        else{
            isImported = false;
        }

        double productCost = Double.parseDouble(formattedInput[formattedInput.length-1]);
        return item;
    }
}
