import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemTest {
    @Test
    public void checkWhetherProductIsExempted() {
        Item item = new Item(1,"book",10.00,true,false);
        assertTrue(item.isExempted());
    }

    @Test
    public void checkWhetherProductIsImported(){
        Item item = new Item(1, "Chocolate Box",10.00,true,true);
        assertTrue(item.isImported());
    }

    @Test
    public void shouldCalculateNewProductCostIsEqualToProductCostPlusTax() {
        Item item = new Item(1, "chocolateBox",10.00,true,true);
        assertEquals(10.50,item.addTaxToProductCost(0.5),0);
    }

    @Test
    public void shouldCalculateNewProductCost16Point49byAddingTaxValue1PointFive() {
        Item item = new Item(1, "MusicCd",14.99,false,false);
        assertEquals(16.49,item.addTaxToProductCost(new TaxCalculator().computeTax(item)),0.1);
    }
}
