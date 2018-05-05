/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller;

import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.AppointmentControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.AttendanceControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.AvailableDaysControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.DayControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.DoctorControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.HospitalControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.PatientControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.PaymentControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.QueryControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.ScheduleControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.SpecialityControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.UserControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.ValidationControllerImpl;

/**
 *
 * @author Binura Salindra
 */
public class ControllerFactory {
    
    public enum ControllerTypes{
        APPOINTMENT,AVAILABLEDAYS,DAY,DOCTOR,HOSPITAL,PATIENT,PAYMENT,SCHEDULE,SPECIALITY,QUERY,VALIDATION,USER,ATTENDANCE;
    }
    private static ControllerFactory controllerFactory;
    private ControllerFactory(){
        
    }
     public static ControllerFactory getInstance(){
        if (controllerFactory == null){
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }
   public SuperController getController(ControllerTypes controller) {
        switch (controller){
            case APPOINTMENT:
                return new AppointmentControllerImpl();
            case AVAILABLEDAYS:
                return new AvailableDaysControllerImpl();
            case DAY:
                return new DayControllerImpl();
            case DOCTOR:
                return new DoctorControllerImpl();
            case HOSPITAL:
                return new HospitalControllerImpl();
            case PATIENT:
                return new PatientControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();
            case SCHEDULE:
                return new ScheduleControllerImpl();
            case SPECIALITY:
                return new SpecialityControllerImpl();
            case QUERY:
                return new QueryControllerImpl();
            case VALIDATION:
                return new ValidationControllerImpl();
            case USER:
                return new UserControllerImpl();
            case ATTENDANCE:
                return new AttendanceControllerImpl();
            default:
                return null;
        }
    }
    
    
}
