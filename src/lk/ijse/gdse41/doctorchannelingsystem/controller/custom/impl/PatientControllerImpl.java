/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PatientController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AppointmentDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.PatientDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;

/**
 *
 * @author Binura Salindra
 */
public class PatientControllerImpl implements PatientController {

    private PatientDAO patientDao;
    private AppointmentDAO appointmentDAO;

    public PatientControllerImpl() {
        patientDao = (PatientDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PATIENT);
        appointmentDAO = (AppointmentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.APPOINTMENT);
    }

    @Override
    public boolean add(PatientDTO dto) throws Exception {
        return patientDao.add(dto);
    }

    @Override
    public boolean update(PatientDTO dto) throws Exception {
        return patientDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return patientDao.delete(id);
    }

    @Override
    public PatientDTO search(String id) throws Exception {
        return patientDao.get(id);
    }

    @Override
    public ArrayList<PatientDTO> getAll() throws Exception {
        return patientDao.getAll();
    }

    @Override
    public boolean adWithTrance(PatientDTO p, AppointmentDTO a) throws Exception {
        Connection con = ConnectionFactory.getInstance().getConnection();
        con.setAutoCommit(false);
        try {
            boolean add = patientDao.add(p);
            if (add) {
                boolean add1 = appointmentDAO.add(a);
                if (add1) {
                    con.commit();
                    return true;
                } else {
                    con.rollback();
                    return false;
                }
            } else {
                con.rollback();
                return false;
            }
        } finally {
            con.setAutoCommit(true);
        }

    }

}
