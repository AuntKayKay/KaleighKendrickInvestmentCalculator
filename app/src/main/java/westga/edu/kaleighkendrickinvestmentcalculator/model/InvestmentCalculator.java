package westga.edu.kaleighkendrickinvestmentcalculator.model;

import java.lang.Math;
import java.text.DecimalFormat;

public class InvestmentCalculator {
    private double periodicPayment;
    private double paymentAmount;
    private double ratePeriod;
    private double period;

    /**
     * Constructor.
     */
    public InvestmentCalculator(){
        this.paymentAmount=0;
        this.ratePeriod=0;
        this.period=0;
        this.periodicPayment=0;

    }

    /**
     * Calculates the annuity.
     */
    public void calculateAnnuity(){
        this.periodicPayment = 1 + this.ratePeriod;
        this.periodicPayment = Math.pow(this.periodicPayment, this.period);
        this.periodicPayment = this.periodicPayment-1;
        this.periodicPayment = this.periodicPayment/this.ratePeriod;
        this.periodicPayment = this.periodicPayment * this.paymentAmount;
        DecimalFormat df = new DecimalFormat("#.00");
        this.periodicPayment= Double.parseDouble(df.format(this.periodicPayment));
    }

    /**
     *  Sets the payment amount.
     * @param paymentAmount The payment amount.
     */
    public void setPaymentAmount(double paymentAmount){
        this.paymentAmount=paymentAmount;
    }

    /**
     * Sets the rate period.
     * @param ratePeriod The rate period.
     */
    public void setRatePeriod(double ratePeriod){
        this.ratePeriod=ratePeriod*.01;
    }

    /**
     * Sets the period.
     * @param period The period.
     */
    public void setPeriod(double period){
        this.period=period;
    }

    /**
     * Gets the payment amount.
     * @return The payment amount.
     */
    public double getPaymentAmount(){
        return this.paymentAmount;
    }

    /**
     * Gets the rate for the period.
     * @return The rate for the period.
     */
    public double getRatePeriod(){
        return this.ratePeriod;
    }

    /**
     * Gets the period.
     * @return The period.
     */
    public double getPeriod(){
        return this.period;
    }

    /**
     * Gets the period payment.
     * @return The periodic payment.
     */
    public double getPeriodicPayment(){
        return this.periodicPayment;
    }

    /**
     * Creates a string representation of the object.
     * @return A string representation of the object.
     */
    public String toString(){
        return "The Payment Amount is "+this.paymentAmount+", the Rate Period is "
                +this.ratePeriod+", the Period is "+this.period+", and the Periodic Payment "
                + this.periodicPayment+".";
    }
}


