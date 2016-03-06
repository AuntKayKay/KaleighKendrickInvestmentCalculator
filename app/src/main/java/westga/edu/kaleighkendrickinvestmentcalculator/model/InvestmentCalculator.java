package westga.edu.kaleighkendrickinvestmentcalculator.model;

import java.lang.Math;

/**
 * Created by Kaleigh on 3/6/2016.
 */
public class InvestmentCalculator {
    private double periodicPayment;
    private double paymentAmount;
    private double ratePeriod;
    private double period;

    /**
     *
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
        this.ratePeriod=ratePeriod;
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
     *
     * @return
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
     *
     * @return
     */
    public String toString(){
        return "The Payment Amount is "+this.paymentAmount+", the Rate Period is "
                +this.ratePeriod+", the Period is "+this.period+", and the Periodic Payment "
                + this.periodicPayment+".";
    }
}


