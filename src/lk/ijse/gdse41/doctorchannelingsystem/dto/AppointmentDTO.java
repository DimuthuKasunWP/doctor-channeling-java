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
public class AppointmentDTO extends SuperDTO{
    private String apID;
    private String pID;
    private String scID;
    private int apNo;
    private String apDate;
    
    public AppointmentDTO(){
        
    }
    public AppointmentDTO(String apID, String pId, String scID, int apNo, String apDate){
        this.apID=apID;
        this.pID=pId;
        this.scID=scID;
        this.apNo=apNo;
        this.apDate=apDate;
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
     * @return the apNo
     */
    public int getApNo() {
        return apNo;
    }

    /**
     * @param apNo the apNo to set
     */
    public void setApNo(int apNo) {
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
    
}
