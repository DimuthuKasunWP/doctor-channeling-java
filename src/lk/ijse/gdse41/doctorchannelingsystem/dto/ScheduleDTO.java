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
public class ScheduleDTO extends SuperDTO{
    private String scID;
    private String drID;
    private String dayName;
    private String timeSlot;
    private int maxPatientCount;
    
    public ScheduleDTO(){
        
    }
    public ScheduleDTO(String scID, String drID, String dayName, String timeSlot, int maxPatientCount){
        this.scID=scID;
        this.drID=drID;
        this.dayName=dayName;
        this.timeSlot=timeSlot;
        this.maxPatientCount=maxPatientCount;
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
    public int getMaxPatientCount() {
        return maxPatientCount;
    }

    /**
     * @param maxPatientCount the maxPatientCount to set
     */
    public void setMaxPatientCount(int maxPatientCount) {
        this.maxPatientCount = maxPatientCount;
    }
    
}
