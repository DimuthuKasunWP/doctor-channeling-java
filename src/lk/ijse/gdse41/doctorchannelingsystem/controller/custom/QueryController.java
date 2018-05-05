/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.SuperController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentSearchDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.HospitalDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleQueryDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SearchQueryDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SpecialityDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SuperDTO;

/**
 *
 * @author Binura Salindra
 */
public interface QueryController extends SuperController<SuperDTO>{

    public ArrayList<String>getAllHospitalNames() throws Exception;

    public ArrayList<String>getAllDoctorNames()throws Exception;
             
    public ArrayList<String>getAllSpecialityTypes()throws Exception;
        
    public ArrayList<String>getAllPatientId()throws Exception;

    public ArrayList<ScheduleQueryDTO>getAllScheduleIndex()throws Exception;
    
    public HospitalDTO setHospitalName(String hName)throws Exception;
    
    public SpecialityDTO setSpecialityTypes(String spType)throws Exception;
        
    public ArrayList<SearchQueryDTO> getAllSearchIndex(String key)throws Exception;
    
    public ArrayList<String>getAllAppointmentId()throws Exception;
    
    public ArrayList<ScheduleQueryDTO>searchByDoctor(String key) throws Exception;
    
    public ArrayList<ScheduleQueryDTO>searchByHospital(String hName)throws Exception;
    
    public ArrayList<ScheduleQueryDTO>searchBySpeciality(String spType)throws Exception;
    
    public ArrayList<ScheduleQueryDTO>searchByDate(String date) throws Exception;
    
    public int  getMaxPatientCount(String scheduleId) throws  Exception;
   
    public int countable(String schduleId) throws  Exception;
    
    public int countAppointmentNo(String apDate, String scheduleId) throws Exception;
    
    public SearchQueryDTO getAllDoctorDetails(String drID) throws Exception;
    
    public ArrayList<String>getAllDoctorId()throws Exception;
    
    public ArrayList<String>getScheduleId()throws Exception;
    
    public SearchQueryDTO getScheduleDetails(String scID) throws Exception;
    
    public ArrayList<String>getAppointmentId()throws Exception;
    
    public AppointmentSearchDTO getAppointmentDetails(String apID) throws Exception;
    
    public SpecialityDTO getSpecialityDetails(String spID) throws Exception;
    
    public ArrayList<String>getAllSpecialityId()throws Exception;
    
    public ArrayList<String>getAllHospitalId()throws Exception;
    
    public HospitalDTO getHospitalDetails(String hID) throws Exception;
    
    public ArrayList<AppointmentSearchDTO>viewAllAppointmentDetails() throws Exception;
    
    public ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByApId(String apID) throws Exception;
    
    public ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByDate(String date) throws Exception;
    
    public ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByPid(String pID) throws Exception;
    
    public ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByDrId(String drID) throws Exception;
    
    public ArrayList<String>getAppointmentIdsByDate(String apDate) throws Exception;

}
