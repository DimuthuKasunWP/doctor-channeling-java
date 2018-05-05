/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.DayController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.DayDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.DayDTO;

/**
 *
 * @author Binura Salindra
 */
public class DayControllerImpl implements DayController{
    private DayDAO dayDao;
    
    public DayControllerImpl(){
        dayDao=(DayDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DAY);
    }

    @Override
    public boolean add(DayDTO dto) throws Exception {
        return dayDao.add(dto);
    }

    @Override
    public boolean update(DayDTO dto) throws Exception {
        return dayDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return dayDao.delete(id);
    }

    @Override
    public DayDTO search(String id) throws Exception {
        return dayDao.get(id);
    }

    @Override
    public ArrayList<DayDTO> getAll() throws Exception {
        return dayDao.getAll();
    }
    
}
