/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.DoctorController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.DoctorDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.ScheduleDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.DoctorDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleDTO;

/**
 *
 * @author Binura Salindra
 */
public class DoctorControllerImpl implements DoctorController{
    private DoctorDAO doctorDao;
    private ScheduleDAO scheduleDao;
    
    public DoctorControllerImpl(){
        doctorDao=(DoctorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DOCTOR);
        scheduleDao=(ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SCHEDULE);
    }

    @Override
    public boolean add(DoctorDTO dto) throws Exception {
        return doctorDao.add(dto);
    }

    @Override
    public boolean update(DoctorDTO dto) throws Exception {
        return doctorDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return doctorDao.delete(id);
    }

    @Override
    public DoctorDTO search(String id) throws Exception {
        return doctorDao.get(id);
    }

    @Override
    public ArrayList<DoctorDTO> getAll() throws Exception {
        return doctorDao.getAll();
    }

    @Override
    public boolean addWithTrance(DoctorDTO d, ScheduleDTO s) throws Exception {
        Connection conn=ConnectionFactory.getInstance().getConnection();
        conn.setAutoCommit(false);
        boolean add=doctorDao.add(d);
        try{
        
            if(add){
                boolean addp=scheduleDao.add(s);
                if(addp){
                    conn.commit();
                    return true;
                }else{
                    conn.rollback();
                    return false;
                }
            }else{
                conn.rollback();
                return false;
            }
        }finally{
            conn.setAutoCommit(true);
        }
    }
    
}
