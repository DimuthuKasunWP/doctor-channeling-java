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
public class HospitalDTO extends SuperDTO{
    private String hID;
    private String hName;
    
    public HospitalDTO(){
        
    }
    public HospitalDTO(String hID, String hName){
        this.hID=hID;
        this.hName=hName;
    }

    /**
     * @return the hID
     */
    public String gethID() {
        return hID;
    }

    /**
     * @param hID the hID to set
     */
    public void sethID(String hID) {
        this.hID = hID;
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
