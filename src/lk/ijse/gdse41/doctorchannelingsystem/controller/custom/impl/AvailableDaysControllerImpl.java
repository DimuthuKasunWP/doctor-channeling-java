/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AvailableDaysController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AvailableDaysDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AvailableDaysDTO;

/**
 *
 * @author Binura Salindra
 */
public class AvailableDaysControllerImpl implements AvailableDaysController{
    private AvailableDaysDAO availableDaysDao;
    
    public AvailableDaysControllerImpl(){
        availableDaysDao=(AvailableDaysDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.AVAILABLEDAYS);
    }

    @Override
    public boolean add(AvailableDaysDTO dto) throws Exception {
        return availableDaysDao.add(dto);
    }

    @Override
    public boolean update(AvailableDaysDTO dto) throws Exception {
        return availableDaysDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return availableDaysDao.delete(id);
    }

    @Override
    public AvailableDaysDTO search(String id) throws Exception {
        return availableDaysDao.get(id);
    }

    @Override
    public ArrayList<AvailableDaysDTO> getAll() throws Exception {
        return availableDaysDao.getAll();
    }
    
}
