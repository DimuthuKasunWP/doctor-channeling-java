/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao.custom;

import java.nio.channels.UnsupportedAddressTypeException;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.dao.SuperDAO;
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
public interface QueryDAO extends SuperDAO<SuperDTO>{

    @Override
    public default boolean add(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default SuperDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public default boolean update(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<String>getAllHospitalNames() throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<String>getAllDoctorNames()throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<String>getAllSpecialityTypes()throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<String>getAllPatientId()throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<ScheduleQueryDTO>getAllScheduleIndex()throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default HospitalDTO setHospitalName(String hName)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default SpecialityDTO setSpecialityTypes(String spType)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public default ArrayList<SearchQueryDTO> getAllSearchIndex(String key)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<String>getAllAppointmentId()throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<ScheduleQueryDTO>searchByDoctor(String key)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<ScheduleQueryDTO>searchByHospital(String hName)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<ScheduleQueryDTO>searchBySpeciality(String spType)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public default ArrayList<ScheduleQueryDTO>searchByDate(String date)throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int  getMaxPatientCount(String scheduleId) throws  Exception;
    
    public int countable(String schduleId) throws  Exception;
    
    public int countAppointmentNo(String apDate, String scheduleId) throws Exception;
    
    public default SearchQueryDTO getAllDoctorDetails(String drID) throws Exception{
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }
    public default ArrayList<String>getAllDoctorId()throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<String>getAllScheduleId()throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default SearchQueryDTO getScheduleDetails(String scID) throws Exception{
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }
    public default ArrayList<String>getAppointmentId()throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default AppointmentSearchDTO getAppointmentDetails(String apID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default SpecialityDTO getSpecialityDetails(String spID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<String>getAllSpecialityId()throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<String>getAllHospitalId()throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default HospitalDTO getHospitalDetails(String hID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<AppointmentSearchDTO>viewAllAppointmentDetails() throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByApId(String apID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByDate(String date) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByPid(String pID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<AppointmentSearchDTO>viewAppointmentDetailsByDrId(String drID) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public default ArrayList<String>getAppointmentIdsByDate(String apDate) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
