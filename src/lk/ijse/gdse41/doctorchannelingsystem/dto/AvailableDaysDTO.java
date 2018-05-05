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
public class AvailableDaysDTO extends SuperDTO{
    private String drID;
    private String avaDayName;
    
    public AvailableDaysDTO(){
        
    }
    public AvailableDaysDTO(String drID, String avaDayName){
        this.drID=drID;
        this.avaDayName=avaDayName;
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
     * @return the avaDayName
     */
    public String getAvaDayName() {
        return avaDayName;
    }

    /**
     * @param avaDayName the avaDayName to set
     */
    public void setAvaDayName(String avaDayName) {
        this.avaDayName = avaDayName;
    }
    
}
