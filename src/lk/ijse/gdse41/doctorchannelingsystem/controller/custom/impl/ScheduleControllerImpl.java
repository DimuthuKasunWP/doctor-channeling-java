/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.ScheduleController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.ScheduleDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleDTO;

/**
 *
 * @author Binura Salindra
 */
public class ScheduleControllerImpl implements ScheduleController{
    private ScheduleDAO scheduleDao;
    
    public ScheduleControllerImpl(){
        scheduleDao=(ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);
    }

    @Override
    public boolean add(ScheduleDTO dto) throws Exception {
        return scheduleDao.add(dto);
    }

    @Override
    public boolean update(ScheduleDTO dto) throws Exception {
        return scheduleDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return scheduleDao.delete(id);
    }

    @Override
    public ScheduleDTO search(String id) throws Exception {
        return scheduleDao.get(id);
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        return scheduleDao.getAll();
    }
    
}
