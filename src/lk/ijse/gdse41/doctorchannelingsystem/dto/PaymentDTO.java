/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dto;

/**
 *
 * @author Binura Salindra
 */
public class PaymentDTO extends SuperDTO{
    private String paymentID;
    private String apID;
    private String apDate; 
    private String pID;
    private String paymentDate;
    private double cost;
    
    public PaymentDTO(){
        
    }
    public PaymentDTO(String paymentID, String apID, String apDate, String pID, String paymentDate, double cost){
        this.paymentID=paymentID;
        this.apID=apID;
        this.apDate=apDate;
        this.pID=pID;
        this.paymentDate=paymentDate;
        this.cost=cost;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the apID
     */
    public String getApID() {
        return apID;
    }

    /**
     * @param apID the apID to set
     */
    public void setApID(String apID) {
        this.apID = apID;
    }

    /**
     * @return the apDate
     */
    public String getApDate() {
        return apDate;
    }

    /**
     * @param apDate the apDate to set
     */
    public void setApDate(String apDate) {
        this.apDate = apDate;
    }

    /**
     * @return the pID
     */
    public String getpID() {
        return pID;
    }

    /**
     * @param pID the pID to set
     */
    public void setpID(String pID) {
        this.pID = pID;
    }

    /**
     * @return the paymentDate
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    
    
}
