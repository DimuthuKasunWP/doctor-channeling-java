/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.SuperController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;

/**
 *
 * @author Binura Salindra
 */
public interface PatientController extends SuperController<PatientDTO>{
    public boolean adWithTrance(PatientDTO p, AppointmentDTO a) throws Exception;  
}
