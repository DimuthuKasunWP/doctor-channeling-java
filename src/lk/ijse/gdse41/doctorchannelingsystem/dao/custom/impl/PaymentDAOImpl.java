/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.PaymentDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PaymentDTO;

/**
 *
 * @author Binura Salindra
 */
public class PaymentDAOImpl implements PaymentDAO{
    private Connection connection;
    
    public PaymentDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PaymentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        String SQL="INSERT INTO Payment VALUES(?,?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPaymentID());
        stm.setObject(2, dto.getApID());
        stm.setObject(3, dto.getApDate());
        stm.setObject(4, dto.getpID());
        stm.setObject(5, dto.getPaymentDate());
        stm.setObject(6, dto.getCost());
        int res=stm.executeUpdate();
        return (res>0);
       
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        String SQL="UPDATE Payment SET apID=?,apDate=?,pID=?,paymentDate=?,cost=? WHERE paymentID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(6, dto.getPaymentID());
        stm.setObject(1, dto.getApID());
        stm.setObject(2, dto.getApDate());
        stm.setObject(3, dto.getpID());
        stm.setObject(4, dto.getPaymentDate());
        stm.setObject(5, dto.getCost());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Payment where paymentID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public PaymentDTO get(String key) throws Exception {
        String SQL="Select * From Payment where paymentID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            PaymentDTO p1=new PaymentDTO(rst.getString("paymentID"),rst.getString("apID"),rst.getString("apDate"),rst.getString("pID"),rst.getString("paymentDate"),rst.getDouble("cost"));
            return p1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        String SQL="Select * From Payment";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<PaymentDTO> paymentList=new ArrayList<>();
        while (rst.next()) {
            PaymentDTO p1=new PaymentDTO(rst.getString("paymentID"),rst.getString("apID"),rst.getString("apDate"),rst.getString("pID"),rst.getString("paymentDate"),rst.getDouble("cost"));
            paymentList.add(p1);
        }
        return paymentList;
    }
    
    
}
