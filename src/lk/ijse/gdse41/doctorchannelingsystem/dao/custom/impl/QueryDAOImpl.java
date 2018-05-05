/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.QueryDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
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
public class QueryDAOImpl implements QueryDAO{
    private static Connection connection;
    
    public QueryDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QueryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<String> getAllHospitalNames() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Hospital");
        ArrayList <String>hospitalNames=new ArrayList<>();
        while(rst.next()){
            hospitalNames.add(rst.getString("hName"));
        }
        return hospitalNames;
    }

    @Override
    public ArrayList<String> getAllDoctorNames() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Doctor");
        ArrayList <String>doctorNames=new ArrayList<>();
        while(rst.next()){
            doctorNames.add(rst.getString("drName"));
        }
        return doctorNames;
    
    }

    @Override
    public ArrayList<String> getAllSpecialityTypes() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Speciality");
        ArrayList <String>specialityTypes=new ArrayList<>();
        while(rst.next()){
            specialityTypes.add(rst.getString("spType"));
        }
        return specialityTypes;
    }

    @Override
    public ArrayList<String> getAllPatientId() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Patient");
        ArrayList <String>patientIds=new ArrayList<>();
        while(rst.next()){
            patientIds.add(rst.getString("pID"));
        }
        return patientIds;
    }

    @Override
    public ArrayList<ScheduleQueryDTO> getAllScheduleIndex() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select scID,drName as doctor, dayName, timeSlot, maxPatientCount, spType as Speciality,hName as Hospital from Schedule s, Doctor d, Hospital h, Speciality sp where d.drID=s.drID && h.hID=d.hID && sp.spID=d.spID");
        ArrayList <ScheduleQueryDTO>allScheduleIndex=new ArrayList<>();
        while(rst.next()){
            ScheduleQueryDTO s1=new ScheduleQueryDTO(rst.getString("scID"), rst.getString("doctor"), rst.getString("dayName"), rst.getString("timeSlot"), rst.getString("maxPatientCount"), rst.getString("speciality"), rst.getString("hospital"));
            allScheduleIndex.add(s1);
        }
        return allScheduleIndex;
    }

    @Override
    public HospitalDTO setHospitalName(String hName) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select hName from Hospital h, Doctor d where h.hID=d.hID && drName='"+hName+"'");
        if(rst.next()){
            HospitalDTO hospital=new HospitalDTO(hName, rst.getString("hName"));
            return hospital;
        }
        return null;
    }

    @Override
    public SpecialityDTO setSpecialityTypes(String spType) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select spType from Speciality s, Doctor d where s.spID=d.spID && drName='"+spType+"'");
        if(rst.next()){
            SpecialityDTO speciality=new SpecialityDTO(spType, rst.getString("spType"));
            return speciality;
        }
        return null;
    }

    @Override
    public ArrayList<SearchQueryDTO> getAllSearchIndex(String key) throws Exception {
        String SQL="select scID, drName, dayName, timeSlot, maxPatientCount from Doctor d, Schedule s where s.drID=d.drID && drName='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
        ArrayList <SearchQueryDTO>allSearchIndex=new ArrayList<>();
	while(rst.next()){
            SearchQueryDTO s1=new SearchQueryDTO(rst.getString("scID"),rst.getString("drName"),rst.getString("dayName"),rst.getString("timeSlot"),rst.getString("maxPatientCount"));
            allSearchIndex.add(s1);
	}
        return allSearchIndex;
	
    }

    @Override
    public ArrayList<String> getAllAppointmentId() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Appointment");
        ArrayList <String>appoinmentIds=new ArrayList<>();
        while(rst.next()){
            appoinmentIds.add(rst.getString("apID"));
        }
        return appoinmentIds;
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByDoctor(String key) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select scID, drName, dayName, timeSlot, maxPatientCount, spType, hName from Doctor d, Hospital h, Speciality sp, Schedule sc where d.drID=sc.drID && h.hID=d.hID && sp.spID=d.spID && d.drID='"+key+"'");
        ArrayList<ScheduleQueryDTO>allSearchIndexs=new ArrayList<>();
        while(rst.next()){
            ScheduleQueryDTO v1=new ScheduleQueryDTO(rst.getString("scID"), rst.getString("drName"), rst.getString("dayName"), rst.getString("timeSlot"), rst.getString("maxPatientCount"), rst.getString("spType"), rst.getString("hName"));
            allSearchIndexs.add(v1);
        }
        return allSearchIndexs;
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByHospital(String hName) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select scID, drName, dayName, timeSlot, maxPatientCount, spType, hName from Doctor d, Hospital h, Speciality sp, Schedule sc where d.drID=sc.drID && sp.spID=d.spID && h.hID=d.hID && h.hName='"+hName+"'");
        ArrayList<ScheduleQueryDTO>allSearchIndexs=new ArrayList<>();
        while(rst.next()){
            ScheduleQueryDTO w1=new ScheduleQueryDTO(rst.getString("scID"), rst.getString("drName"), rst.getString("dayName"), rst.getString("timeSlot"), rst.getString("maxPatientCount"), rst.getString("spType"), rst.getString("hName"));
            allSearchIndexs.add(w1);
        }
        return allSearchIndexs;   
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchBySpeciality(String spType) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select scID, drName, dayName, timeSlot, maxPatientCount, spType, hName from Doctor d, Hospital h, Speciality sp, Schedule sc where d.drID=sc.drID && h.hID=d.hID && sp.spID=d.spID && sp.spType='"+spType+"'");
        ArrayList<ScheduleQueryDTO>allSearchIndexs=new ArrayList<>();
        while(rst.next()){
            ScheduleQueryDTO aw=new ScheduleQueryDTO(rst.getString("scID"), rst.getString("drName"), rst.getString("dayName"), rst.getString("timeSlot"), rst.getString("maxPatientCount"), rst.getString("spType"), rst.getString("hName"));
            allSearchIndexs.add(aw);
        }
        return allSearchIndexs;
    }

    @Override
    public ArrayList<ScheduleQueryDTO> searchByDate(String date) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select scID, drName, dayName, timeSlot, maxPatientCount, spType, hName from Doctor d, Hospital h, Speciality sp, Schedule sc where d.drID=sc.drID && h.hID=d.hID && sp.spID=d.spID && dayName='"+date+"'");
        ArrayList<ScheduleQueryDTO>allSearchIndexs=new ArrayList<>();
        while(rst.next()){
            ScheduleQueryDTO re=new ScheduleQueryDTO(rst.getString("scID"), rst.getString("drName"), rst.getString("dayName"), rst.getString("timeSlot"), rst.getString("maxPatientCount"), rst.getString("spType"), rst.getString("hName"));
            allSearchIndexs.add(re);
        }
        return allSearchIndexs;
    }
    @Override
    public int  getMaxPatientCount(String scheduleId) throws  Exception{
        Statement state=connection.createStatement();
        ResultSet rst=state.executeQuery("select maxpatientcount from schedule where scid='"+scheduleId+"'");
        if(rst.next()){
            return rst.getInt("maxpatientcount");
        }else{
            return 0;
        }
    }

    @Override
    public int countable(String scheduleId) throws Exception {
        Statement state=connection.createStatement();
        ResultSet rst=state.executeQuery("select count(apno) from appointment where scid='"+scheduleId+"'");
        if (rst.next()) {
            return rst.getInt("count(apno)");
        } else {
            return 0;
        }
    }

    @Override
    public int countAppointmentNo(String apDate, String scheduleId) throws Exception {
        Statement stam=connection.createStatement();
        ResultSet rst=stam.executeQuery("select count(apID) from appointment where apDate='"+apDate+"' && scID='"+scheduleId+"'");
        if(rst.next()){
            return rst.getInt("count(apID)");
        }else{
            return 0;
        }
    }

    @Override
    public SearchQueryDTO getAllDoctorDetails(String drID) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select s.spID, spType,h.hID,hName,drName,drTelno from doctor d, Speciality s, Hospital h where s.spID=d.spID && h.hID=d.hID && drID='"+drID+"'");
        ArrayList<SearchQueryDTO> allSearchDetails=new ArrayList<>();
        if(rst.next()){
            SearchQueryDTO st=new SearchQueryDTO(rst.getString("spID"),rst.getString("spType"),rst.getString("hID"),rst.getString("hName"),rst.getString("drName"),rst.getString("drTelno"));
            return st;
        }else{
            return null;
        }
      
    }

    @Override
    public ArrayList<String> getAllDoctorId() throws Exception {
        Statement stat=connection.createStatement();
        ResultSet rst=stat.executeQuery("Select * from Doctor");
        ArrayList<String> allDoctorIDs=new ArrayList<>();
        while(rst.next()){
            allDoctorIDs.add(rst.getString("drID"));
        }
        return allDoctorIDs;
    }

    @Override
    public ArrayList<String> getAllScheduleId() throws Exception {
        Statement stam=connection.createStatement();
        ResultSet rst=stam.executeQuery("Select * from Schedule");
        ArrayList<String> allScheduleId=new ArrayList<>();
        while(rst.next()){
            allScheduleId.add(rst.getString("scID"));
        }
        return allScheduleId;
    }

    @Override
    public SearchQueryDTO getScheduleDetails(String scID) throws Exception {
        Statement stat=connection.createStatement();
        ResultSet rst=stat.executeQuery("select s.drID ,drName, dayName, timeSlot, maxPatientCount from Schedule s, doctor d where d.drID=s.drID && s.scID='"+scID+"'");
        if(rst.next()){
            SearchQueryDTO stt=new SearchQueryDTO(rst.getString("drID"),rst.getString("drName"), rst.getString("dayName"),rst.getString("timeSlot"),rst.getString("maxPatientCount"), scID, scID);
            return stt;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<String> getAppointmentId() throws Exception {
        Statement stam=connection.createStatement();
        ResultSet rst=stam.executeQuery("Select * from Appointment");
        ArrayList<String> allAppointmentId=new ArrayList<>();
        while(rst.next()){
            allAppointmentId.add(rst.getString("apID"));
        }
        return allAppointmentId;
    }

    @Override
    public AppointmentSearchDTO getAppointmentDetails(String apID) throws Exception {
        Statement stmt=connection.createStatement();
        ResultSet rst=stmt.executeQuery("select apNO, apDate, a.pID, pName, s.drID, drName, spType, timeSlot from Appointment a, patient p ,Schedule s, Doctor d, Speciality sp where p.pID=a.pID && s.scID=a.scID && s.drID=d.drID && sp.spID=d.spID && apID='"+apID+"'");
        if(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apNO"),rst.getString("apDate"),rst.getString("pID"),rst.getString("pName"),rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("timeSlot"));
            return ap;
        }else{
            return null;
        }
    }

    @Override
    public SpecialityDTO getSpecialityDetails(String spID) throws Exception {
        String SQL="Select * From Speciality where spID='"+spID+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            SpecialityDTO sp1=new SpecialityDTO(rst.getString("spID"),rst.getString("spType"));
            return sp1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<String> getAllSpecialityId() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Speciality");
        ArrayList<String> allSpecialityId=new ArrayList<>();
        while(rst.next()){
            allSpecialityId.add(rst.getString("spID"));
        }
        return allSpecialityId;
 
    }

    @Override
    public HospitalDTO getHospitalDetails(String hID) throws Exception {
        String SQL="Select * From Hospital where hID='"+hID+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            HospitalDTO h1=new HospitalDTO(rst.getString("hID"),rst.getString("hName"));
            return h1;
	}else{
            return null;
	}
    
    }

    @Override
    public ArrayList<String> getAllHospitalId() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select * from Hospital");
        ArrayList<String> allHospitalId=new ArrayList<>();
        while(rst.next()){
            allHospitalId.add(rst.getString("hID"));
        }
        return allHospitalId;
 
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByDrId(String drID) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID, apNo, apDate, timeSlot, a.pID,pName,s.drID, drName, spType, hName from appointment a, patient p, doctor d, schedule s, speciality sp, Hospital h where p.pID=a.pID && a.scID=s.scID && s.drID=d.drID && d.spID=sp.spID && d.hID=h.hID && s.drID='"+drID+"'");
        ArrayList<AppointmentSearchDTO>allAppointmentDetails=new ArrayList<>();
        while(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apID"),rst.getString("apNo"), rst.getString("apDate"), rst.getString("timeSlot"), rst.getString("pID"), rst.getString("pName"), rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("hName"));
            allAppointmentDetails.add(ap);
        }
        return allAppointmentDetails;
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByPid(String pID) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID, apNo, apDate, timeSlot, a.pID,pName,s.drID, drName, spType, hName from appointment a, patient p, doctor d, schedule s, speciality sp, Hospital h where p.pID=a.pID && a.scID=s.scID && s.drID=d.drID && d.spID=sp.spID && d.hID=h.hID && a.pID='"+pID+"'");
        ArrayList<AppointmentSearchDTO>allAppointmentDetails=new ArrayList<>();
        while(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apID"),rst.getString("apNo"), rst.getString("apDate"), rst.getString("timeSlot"), rst.getString("pID"), rst.getString("pName"), rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("hName"));
            allAppointmentDetails.add(ap);
        }
        return allAppointmentDetails;
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByDate(String date) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID, apNo, apDate, timeSlot, a.pID,pName,s.drID, drName, spType, hName from appointment a, patient p, doctor d, schedule s, speciality sp, Hospital h where p.pID=a.pID && a.scID=s.scID && s.drID=d.drID && d.spID=sp.spID && d.hID=h.hID && a.apDate='"+date+"'");
        ArrayList<AppointmentSearchDTO>allAppointmentDetails=new ArrayList<>();
        while(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apID"),rst.getString("apNo"), rst.getString("apDate"), rst.getString("timeSlot"), rst.getString("pID"), rst.getString("pName"), rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("hName"));
            allAppointmentDetails.add(ap);
        }
        return allAppointmentDetails;
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAppointmentDetailsByApId(String apID) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID, apNo, apDate, timeSlot, a.pID,pName,s.drID, drName, spType, hName from appointment a, patient p, doctor d, schedule s, speciality sp, Hospital h where p.pID=a.pID && a.scID=s.scID && s.drID=d.drID && d.spID=sp.spID && d.hID=h.hID && a.apID='"+apID+"'");
        ArrayList<AppointmentSearchDTO>allAppointmentDetails=new ArrayList<>();
        while(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apID"),rst.getString("apNo"), rst.getString("apDate"), rst.getString("timeSlot"), rst.getString("pID"), rst.getString("pName"), rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("hName"));
            allAppointmentDetails.add(ap);
        }
        return allAppointmentDetails;
    }

    @Override
    public ArrayList<AppointmentSearchDTO> viewAllAppointmentDetails() throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID, apNo, apDate, timeSlot, a.pID,pName,s.drID, drName, spType, hName from appointment a, patient p, doctor d, schedule s, speciality sp, Hospital h where p.pID=a.pID && a.scID=s.scID && s.drID=d.drID && d.spID=sp.spID && d.hID=h.hID group by apID");
        ArrayList<AppointmentSearchDTO>allAppointmentDetails=new ArrayList<>();
        while(rst.next()){
            AppointmentSearchDTO ap=new AppointmentSearchDTO(rst.getString("apID"),rst.getString("apNo"), rst.getString("apDate"), rst.getString("timeSlot"), rst.getString("pID"), rst.getString("pName"), rst.getString("drID"),rst.getString("drName"),rst.getString("spType"),rst.getString("hName"));
            allAppointmentDetails.add(ap);
        }
        return allAppointmentDetails;
    }

    @Override
    public ArrayList<String> getAppointmentIdsByDate(String apDate) throws Exception {
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select apID from appointment where apDate='"+apDate+"'");
        ArrayList<String> appointmentID=new ArrayList<>();
        while(rst.next()){
            appointmentID.add(rst.getString("apID"));
        }
        return appointmentID;
  
    }
    
    
    
    
    
    
    
    
    




 
}
