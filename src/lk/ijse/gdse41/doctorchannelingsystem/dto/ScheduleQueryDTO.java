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
public class ScheduleQueryDTO extends SuperDTO{
    private String scID;
    private String drName;
    private String dayName;
    private String timeSlot;
    private String maxPatientCount;
    private String spType;
    private String hName;
    
    public ScheduleQueryDTO(){
        
    }
    public ScheduleQueryDTO(String scID, String drName,String dayName,String timeSlot, String maxPatientCount, String spType,String hName ){
        this.scID=scID;
        this.drName=drName;
        this.dayName=dayName;
        this.timeSlot=timeSlot;
        this.maxPatientCount=maxPatientCount;
        this.spType=spType;
        this.hName=hName;
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
     * @return the dayName
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * @param dayName the dayName to set
     */
    public void setDayName(String dayName) {
        this.dayName = dayName;
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
     * @return the maxPatientCount
     */
    public String getMaxPatientCount() {
        return maxPatientCount;
    }

    /**
     * @param maxPatientCount the maxPatientCount to set
     */
    public void setMaxPatientCount(String maxPatientCount) {
        this.maxPatientCount = maxPatientCount;
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
