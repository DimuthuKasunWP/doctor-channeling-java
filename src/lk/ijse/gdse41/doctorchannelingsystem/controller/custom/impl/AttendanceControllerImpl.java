/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AttendanceController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AttendanceDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AttendanceDTO;

/**
 *
 * @author Binura Salindra
 */
public class AttendanceControllerImpl implements AttendanceController{
   private AttendanceDAO attendanceDao;
   
   public AttendanceControllerImpl(){
       attendanceDao=(AttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ATTENDANCE);
   }

    @Override
    public boolean add(AttendanceDTO dto) throws Exception {
        return attendanceDao.add(dto);
    }

    @Override
    public boolean update(AttendanceDTO dto) throws Exception {
        return attendanceDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
       return attendanceDao.delete(id);
    }

    @Override
    public AttendanceDTO search(String id) throws Exception {
        return attendanceDao.get(id);
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
        return attendanceDao.getAll();
    }
    
}
