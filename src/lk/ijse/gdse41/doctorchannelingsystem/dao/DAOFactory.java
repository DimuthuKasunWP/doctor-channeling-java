/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.UserDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.AppointmentDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.AvailableDaysDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.DayDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.DoctorDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.HospitalDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.PatientDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.QueryDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.ScheduleDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.SpecialityDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl.UserDAOImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dto.UserDTO;

/**
 *
 * @author Binura Salindra
 */
public class DAOFactory {
    public enum DAOTypes{
        APPOINTMENT,AVAILABLEDAYS,DAY,DOCTOR,HOSPITAL,PATIENT,PAYMENT,SCHEDULE,SPECIALITY,QUERY,USER,ATTENDANCE;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType) {
        switch(daoType){
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            case AVAILABLEDAYS:
                return new AvailableDaysDAOImpl();
            case DAY:
                return new DayDAOImpl();
            case DOCTOR:
                return new DoctorDAOImpl();
            case HOSPITAL:
                return new HospitalDAOImpl();
            case PATIENT:
                return new PatientDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            case SCHEDULE:
                return new ScheduleDAOImpl();
            case SPECIALITY:
                return new SpecialityDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            case USER:
                return new UserDAOImpl();
            case ATTENDANCE:
                return new AttendanceDAOImpl();
            default:
                return null;
        }
    }
    
}
