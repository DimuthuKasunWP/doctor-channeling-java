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
public class DoctorDTO extends SuperDTO{
   private String drID;
   private String spID;
   private String hID;
   private String drName;
   private String drTelno;
   
   public DoctorDTO(){
       
   }
   public DoctorDTO(String drId, String spID, String hID, String drName, String drTelno){
       this.drID=drId;
       this.spID=spID;
       this.hID=hID;
       this.drName=drName;
       this.drTelno=drTelno;
       
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
     * @return the drTelno
     */
    public String getDrTelno() {
        return drTelno;
    }

    /**
     * @param drTelno the drTelno to set
     */
    public void setDrTelno(String drTelno) {
        this.drTelno = drTelno;
    }
   
}
