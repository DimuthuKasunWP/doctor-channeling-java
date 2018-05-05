/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.SpecialityController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.SpecialityDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SpecialityDTO;

/**
 *
 * @author Binura Salindra
 */
public class SpecialityControllerImpl implements SpecialityController{
    private SpecialityDAO specialityDao;
    
    public SpecialityControllerImpl(){
        specialityDao=(SpecialityDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SPECIALITY);
    }

    @Override
    public boolean add(SpecialityDTO dto) throws Exception {
        return specialityDao.add(dto);
    }

    @Override
    public boolean update(SpecialityDTO dto) throws Exception {
        return specialityDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return specialityDao.delete(id);
    }

    @Override
    public SpecialityDTO search(String id) throws Exception {
        return specialityDao.get(id);
    }

    @Override
    public ArrayList<SpecialityDTO> getAll() throws Exception {
        return specialityDao.getAll();
    }
    
}
