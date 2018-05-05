/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom;

import lk.ijse.gdse41.doctorchannelingsystem.controller.SuperController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.DoctorDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleDTO;

/**
 *
 * @author Binura Salindra
 */
public interface DoctorController extends SuperController<DoctorDTO>{
    
    public boolean addWithTrance(DoctorDTO d, ScheduleDTO s)throws Exception;
    
}
