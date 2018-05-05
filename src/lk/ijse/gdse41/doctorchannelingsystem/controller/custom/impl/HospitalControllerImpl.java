/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.HospitalController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.HospitalDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.HospitalDTO;

/**
 *
 * @author Binura Salindra
 */
public class HospitalControllerImpl implements HospitalController{
    private HospitalDAO hospitalDAO;
    
    public HospitalControllerImpl(){
        hospitalDAO=(HospitalDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.HOSPITAL);
    }

    @Override
    public boolean add(HospitalDTO dto) throws Exception {
        return hospitalDAO.add(dto);
    }

    @Override
    public boolean update(HospitalDTO dto) throws Exception {
        return hospitalDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return hospitalDAO.delete(id);
    }

    @Override
    public HospitalDTO search(String id) throws Exception {
        return hospitalDAO.get(id);
    }

    @Override
    public ArrayList<HospitalDTO> getAll() throws Exception {
        return hospitalDAO.getAll();
    }
    
}
