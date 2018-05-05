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
public class AppointmentSearchDTO extends SuperDTO{
   
   private String apID;
   private String apNo;
   private String apDate;
   private String scID;
   private String timeSlot;
   private String pID;
   private String pName;
   private String spType;
   private String drName;
   private String drID;
   private String hName;
   
   public AppointmentSearchDTO(){
       
   }
   public AppointmentSearchDTO(String apID, String apNo, String apDate, String scID, String timeSlot, String pID, String pName, String spType, String drName, String drID, String hName){
       this.apID=apID;
       this.apNo=apNo;
       this.apDate=apDate;
       this.scID=scID;
       this.timeSlot=timeSlot;
       this.pID=pID;
       this.pName=pName;
       this.spType=spType;
       this.drName=drName;
       this.drID=drID;
       this.hName=hName;
   }
   public AppointmentSearchDTO(String apNo, String apDate, String pID, String pName, String drID, String drName, String spType, String timeSlot){
       this.apNo=apNo;
       this.apDate=apDate;
       this.pID=pID;
       this.pName=pName;
       this.drID=drID;
       this.drName=drName;
       this.spType=spType;
       this.timeSlot=timeSlot;
   }
   public AppointmentSearchDTO(String apID, String apNo, String apdate, String timeSlot, String pID, String pName, String drID, String drName, String spType, String hName){
       this.apID=apID;
       this.apNo=apNo;
       this.apDate=apdate;
       this.timeSlot=timeSlot;
       this.pID=pID;
       this.pName=pName;
       this.drID=drID;
       this.drName=drName;
       this.spType=spType;
       this.hName=hName;
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
     * @return the apNo
     */
    public String getApNo() {
        return apNo;
    }

    /**
     * @param apNo the apNo to set
     */
    public void setApNo(String apNo) {
        this.apNo = apNo;
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
     * @return the scID
     */
    public String getScID() {
        return scID;
    }

    /**
     * @param scID the scID to set
     */
    public void setScID(String scID) {
        this.scID = scID;
    }

    /**
     * @return the timeSlot
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * @param timeSlot the timeSlot to set
     */
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
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
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the spType
     */
    public String getSpType() {
        return spType;
    }

    /**
     * @param spType the spType to set
     */
    public void setSpType(String spType) {
        this.spType = spType;
    }

    /**
     * @return the drName
     */
    public String getDrName() {
        return drName;
    }

    /**
     * @param drName the drName to set
     */
    public void setDrName(String drName) {
        this.drName = drName;
    }

    /**
     * @return the drID
     */
    public String getDrID() {
        return drID;
    }

    /**
     * @param drID the drID to set
     */
    public void setDrID(String drID) {
        this.drID = drID;
    }

    /**
     * @return the hName
     */
    public String gethName() {
        return hName;
    }

    /**
     * @param hName the hName to set
     */
    public void sethName(String hName) {
        this.hName = hName;
    }
   
   
   
   
    
}
