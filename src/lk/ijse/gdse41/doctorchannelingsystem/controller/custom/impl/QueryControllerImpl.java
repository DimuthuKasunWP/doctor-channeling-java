/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.QueryDAO;
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
public class QueryControllerImpl implements QueryController{
    private QueryDAO queryDao;
    
    public QueryControllerImpl(){
        queryDao=(QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
    }

    @Override
    public boolean add(SuperDTO dto) throws Exception {
        return queryDao.add(dto);
    }

    @Override
    public boolean update(SuperDTO dto) throws Exception {
        return queryDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return queryDao.delete(id);
    }

    @Override
    public SuperDTO search(String id) throws Exception {
        return queryDao.get(id);
    }

    @Override
    public ArrayList<SuperDTO> getAll() throws Exception {
        return queryDao.getAll();
    }

    @Override
    public ArrayList<String> getAllHospitalNames() throws Exception {
        return queryDao.getAllHospitalNames();
    }

    @Override
    public ArrayList<String> getAllDoctorNames() throws Exception {
        return queryDao.getAllDoctorNames();
    }

    @Override
    public ArrayList<String> getAllSpecialityTypes() throws Exception {
       return queryDao.getAllSpecialityTypes();
    }

    @Override
    public ArrayList<String> getAllPatientId() throws Exception {
        return queryDao.getAllPatientId();
    }

    @Override
    public ArrayList<ScheduleQueryDTO> getAllScheduleIndex() throws Exception {
        return queryDao.getAllScheduleIndex();
    }

    @Override
    public HospitalDTO setHospitalName(String hName) throws Exception {
        return queryDao.setHospitalName(hName);
    }

    @Override
    public SpecialityDTO setSpecialityTypes(String spType) throws Exception {
        return queryDao.setSpecialityTypes(spType);
    }

    @Override
    public ArrayList<SearchQueryDTO> getAllSearchIndex(String key) throws Exception {
        return queryDao.getAllSearchIndex(key);
    }

    @Override
    public ArrayList<String> getAllAppointmentId() throws Exception {
        return queryDao.getAllAppointmentId();
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByDoctor(String key) throws Exception {
        return queryDao.searchByDoctor(key);
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByHospital(String hName) throws Exception {
        return queryDao.searchByHospital(hName);
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchBySpeciality(String spType) throws Exception {
        return queryDao.searchBySpeciality(spType);
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByDate(String date) throws Exception {
        return queryDao.searchByDate(date);
    }

    @Override
    public int getMaxPatientCount(String scheduleId) throws Exception {
        return queryDao.getMaxPatientCount(scheduleId);
    }

    @Override
    public int countable(String schduleId) throws Exception {
        return queryDao.countable(schduleId);
    }

    @Override
    public int countAppointmentNo(String apDate, String scheduleId) throws Exception {
        return queryDao.countAppointmentNo(apDate, scheduleId);
    }

    @Override
    public SearchQueryDTO getAllDoctorDetails(String drID) throws Exception {
        return queryDao.getAllDoctorDetails(drID);
    }

    @Override
    public ArrayList<String> getAllDoctorId() throws Exception {
        return queryDao.getAllDoctorId();
    }

    @Override
    public ArrayList<String> getScheduleId() throws Exception {
        return queryDao.getAllScheduleId();
    }

    @Override
    public SearchQueryDTO getScheduleDetails(String scID) throws Exception {
        return queryDao.getScheduleDetails(scID);
    }

    @Override
    public ArrayList<String> getAppointmentId() throws Exception {
        return queryDao.getAllAppointmentId();
    }

    @Override
    public AppointmentSearchDTO getAppointmentDetails(String apID) throws Exception {
        return queryDao.getAppointmentDetails(apID);
    }

    @Override
    public SpecialityDTO getSpecialityDetails(String spID) throws Exception {
        return queryDao.getSpecialityDetails(spID);
    }

    @Override
    public ArrayList<String> getAllSpecialityId() throws Exception {
        return queryDao.getAllSpecialityId();
    }

    @Override
    public ArrayList<String> getAllHospitalId() throws Exception {
        return queryDao.getAllHospitalId();
    }

    @Override
    public HospitalDTO getHospitalDetails(String hID) throws Exception {
        return queryDao.getHospitalDetails(hID);
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAllAppointmentDetails() throws Exception {
        return queryDao.viewAllAppointmentDetails();
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByApId(String apID) throws Exception {
        return queryDao.viewAppointmentDetailsByApId(apID);
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByDate(String date) throws Exception {
        return queryDao.viewAppointmentDetailsByDate(date);
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByPid(String pID) throws Exception {
        return queryDao.viewAppointmentDetailsByPid(pID);
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByDrId(String drID) throws Exception {
        return queryDao.viewAppointmentDetailsByDrId(drID);
    }

    @Override
    public ArrayList<String> getAppointmentIdsByDate(String apDate) throws Exception {
        return queryDao.getAppointmentIdsByDate(apDate);
    }
    
}
