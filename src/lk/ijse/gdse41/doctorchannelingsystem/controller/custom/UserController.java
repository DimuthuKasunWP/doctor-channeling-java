/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom;

import lk.ijse.gdse41.doctorchannelingsystem.controller.SuperController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.UserDTO;

/**
 *
 * @author Binura Salindra
 */
public interface UserController extends SuperController<UserDTO>{
    public boolean login(UserDTO dto) throws Exception;
    
}
