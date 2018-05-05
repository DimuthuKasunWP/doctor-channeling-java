/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao.custom;

import lk.ijse.gdse41.doctorchannelingsystem.dao.SuperDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.UserDTO;

/**
 *
 * @author Binura Salindra
 */
public interface UserDAO extends SuperDAO<UserDTO>{
    public default boolean login(UserDTO dto) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
