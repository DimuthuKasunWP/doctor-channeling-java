/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AppointmentController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AppointmentDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;

/**
 *
 * @author Binura Salindra
 */
public class AppointmentControllerImpl implements AppointmentController{
    private AppointmentDAO appointmentDAO;
    
    public AppointmentControllerImpl(){
        appointmentDAO=(AppointmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINTMENT);
    }

    @Override
    public boolean add(AppointmentDTO dto) throws Exception {
        return appointmentDAO.add(dto);
    }

    @Override
    public boolean update(AppointmentDTO dto) throws Exception {
        return appointmentDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return appointmentDAO.delete(id);
    }

    @Override
    public AppointmentDTO search(String id) throws Exception {
        return appointmentDAO.get(id);
    }

    @Override
    public ArrayList<AppointmentDTO> getAll() throws Exception {
        return appointmentDAO.getAll();
    }
    
}
