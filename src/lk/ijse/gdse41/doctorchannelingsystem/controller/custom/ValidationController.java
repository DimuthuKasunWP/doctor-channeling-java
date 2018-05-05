/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom;

import lk.ijse.gdse41.doctorchannelingsystem.controller.SuperController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SuperDTO;

/**
 *
 * @author Binura Salindra
 */
public interface ValidationController extends SuperController<SuperDTO> {
    
    public boolean phoneNumberValidation(String phone) throws Exception;
    
    public boolean timeSlotValidation(String time) throws Exception;
}
