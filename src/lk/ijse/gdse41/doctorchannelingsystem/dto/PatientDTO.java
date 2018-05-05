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
public class PatientDTO extends SuperDTO{
    private String pID;
    private String pName;
    private String pAddress;
    private String gender;
    private int pAge;
    private String pTelno;
    
    public PatientDTO(){
        
    }
    public PatientDTO(String pID,String pName, String pAddress,String gender,int pAge,String pTelno){
        this.pID=pID;
        this.pName=pName;
        this.pAddress=pAddress;
        this.gender=gender;
        this.pAge=pAge;
        this.pTelno=pTelno;
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
     * @return the pAddress
     */
    public String getpAddress() {
        return pAddress;
    }

    /**
     * @param pAddress the pAddress to set
     */
    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the pAge
     */
    public int getpAge() {
        return pAge;
    }

    /**
     * @param pAge the pAge to set
     */
    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    /**
     * @return the pTelno
     */
    public String getpTelno() {
        return pTelno;
    }

    /**
     * @param pTelno the pTelno to set
     */
    public void setpTelno(String pTelno) {
        this.pTelno = pTelno;
    }
    
    
    
}
