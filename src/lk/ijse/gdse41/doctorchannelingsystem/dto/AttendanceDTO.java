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
public class AttendanceDTO extends SuperDTO{
    private String apID;
    private String apNo;
    private String apDate;
    private String status;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String apID, String apNo, String apDate, String status) {
        this.apID = apID;
        this.apNo = apNo;
        this.apDate = apDate;
        this.status = status;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
