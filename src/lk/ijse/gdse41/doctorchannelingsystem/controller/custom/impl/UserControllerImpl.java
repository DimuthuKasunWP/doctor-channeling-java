/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.UserController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.UserDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.UserDTO;

/**
 *
 * @author Binura Salindra
 */
public class UserControllerImpl implements UserController{
    private UserDAO userDao;
    
    public UserControllerImpl(){
        userDao=(UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    }

    @Override
    public boolean add(UserDTO dto) throws Exception {
        return userDao.add(dto);
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        return userDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return userDao.delete(id);
    }

    @Override
    public UserDTO search(String id) throws Exception {
        return userDao.get(id);
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        return userDao.getAll();
    }

    @Override
    public boolean login(UserDTO dto) throws Exception {
        return userDao.login(dto);
    }
    
}
