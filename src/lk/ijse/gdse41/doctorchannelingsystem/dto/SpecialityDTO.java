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
public class SpecialityDTO extends SuperDTO{
    private String spID;
    private String spType;
    
    public SpecialityDTO(){
        
    }
    public SpecialityDTO(String spID,String spType){
        this.spID=spID;
        this.spType=spType;
    }

    /**
     * @return the spID
     */
    public String getSpID() {
        return spID;
    }

    /**
     * @param spID the spID to set
     */
    public void setSpID(String spID) {
        this.spID = spID;
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
    
}
