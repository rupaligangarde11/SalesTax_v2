import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void shouldApplyBasicTax10PercentIfProductIsNotExempted() {
        Item item = new Item("MusicCd",14.99,false,false);
        TaxCalculator basicTax = new TaxCalculator();
        assertEquals(1.5,basicTax.computeTax(item),0.1);
    }

    @Test
    public void shouldApplyImportDutyTaxAndBasicTaxIfProductIsNotExemptedAndImported() {
        Item item = new Item("perfume",47.50,false,true);
        TaxCalculator basicTax = new TaxCalculator();
        assertEquals(7.15,basicTax.computeTax(item),0.1);
    }

    @Test
    public void shouldApplyImportDutyTax5percentIfProductExemptedAndIsImported() {
        Item item = new Item("chocolateBox",10.00,true,true);
        TaxCalculator importdutyTax = new TaxCalculator();
        assertEquals(0.50,importdutyTax.computeTax(item),0);
    }

    @Test
    public void shouldApplyBasicTax10percentIfProductIsExemptedAndNotImported() {
        Item item = new Item("book", 10.00, true, false);
        TaxCalculator importdutyTax = new TaxCalculator();
        assertEquals(0.0, importdutyTax.computeTax(item), 0);
    }
}
