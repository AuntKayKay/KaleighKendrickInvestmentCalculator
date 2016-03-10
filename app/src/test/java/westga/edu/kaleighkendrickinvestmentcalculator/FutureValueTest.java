package westga.edu.kaleighkendrickinvestmentcalculator;

import org.junit.Test;

import westga.edu.kaleighkendrickinvestmentcalculator.model.InvestmentCalculator;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class FutureValueTest {

    /**
     * Test to ensure that InvestmentCalculator is appropriately created with zero values.
     */
    @Test
    public void  testInvestmentCalculator() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        assertEquals("The Payment Amount is 0.0, the Rate Period is 0.0, the Period is 0.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetPaymentAmount() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPaymentAmount(8);
        assertEquals("The Payment Amount is 8.0, the Rate Period is 0.0, the Period is 0.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetRatePeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setRatePeriod(8);
        assertEquals("The Payment Amount is 0.0, the Rate Period is 0.08, the Period is 0.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetPeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPeriod(8);
        assertEquals("The Payment Amount is 0.0, the Rate Period is 0.0, the Period is 8.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetPaymentAmountAndRatePeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPaymentAmount(1);
        testCalculator.setRatePeriod(2);
        assertEquals("The Payment Amount is 1.0, the Rate Period is 0.02, the Period is 0.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetRatePeriodAndPeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setRatePeriod(1);
        testCalculator.setPeriod(2);
        assertEquals("The Payment Amount is 0.0, the Rate Period is 0.01, the Period is 2.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testSetPaymentAmountAndPeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPaymentAmount(1);
        testCalculator.setPeriod(2);
        assertEquals("The Payment Amount is 1.0, the Rate Period is 0.0, the Period is 2.0, and the Periodic Payment 0.0.", testCalculator.toString());
    }

    @Test
    public void testGetPaymentAmount() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPaymentAmount(1);
        assertEquals(1.0, testCalculator.getPaymentAmount(), 0);
    }

    @Test
    public void testGetRatePeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setRatePeriod(1);
        assertEquals(0.01, testCalculator.getRatePeriod(), 0);
    }

    @Test
    public void testGetPeriod() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPeriod(1);
        assertEquals(1.0, testCalculator.getPeriod(), 0);
    }

    @Test
    public void testGetPeriodicPayment() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        assertEquals(0.0, testCalculator.getPeriodicPayment(), 0);
    }

    @Test
    public void testGetPeriodicPaymentMultipleValues() {
        InvestmentCalculator testCalculator = new InvestmentCalculator();
        testCalculator.setPaymentAmount(1000);
        testCalculator.setRatePeriod(3);
        testCalculator.setPeriod(10);
        testCalculator.calculateAnnuity();
        assertEquals(11463.88, testCalculator.getPeriodicPayment(), 0);
    }
}