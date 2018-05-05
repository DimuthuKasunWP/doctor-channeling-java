/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PaymentController;
import lk.ijse.gdse41.doctorchannelingsystem.dao.DAOFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.PaymentDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PaymentDTO;

/**
 *
 * @author Binura Salindra
 */
public class PaymentControllerImpl implements PaymentController{
    private PaymentDAO paymentDao;
    
    public PaymentControllerImpl(){
        paymentDao=(PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        return paymentDao.add(dto);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        return paymentDao.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return paymentDao.delete(id);
    }

    @Override
    public PaymentDTO search(String id) throws Exception {
        return paymentDao.get(id);
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        return paymentDao.getAll();
    }
    
}
