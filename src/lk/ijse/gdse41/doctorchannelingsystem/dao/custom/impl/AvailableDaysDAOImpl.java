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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AvailableDaysDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AvailableDaysDTO;

/**
 *
 * @author Binura Salindra
 */
public class AvailableDaysDAOImpl implements AvailableDaysDAO{
    
    private Connection connection;
    
    public AvailableDaysDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AvailableDaysDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(AvailableDaysDTO dto) throws Exception {
        String SQL="INSERT INTO AvailableDays VALUES(?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getDrID());
        stm.setObject(2, dto.getAvaDayName());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean update(AvailableDaysDTO dto) throws Exception {
        String SQL="UPDATE AvailableDays SET avaDayName=? WHERE drID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(2, dto.getDrID());
        stm.setObject(1, dto.getAvaDayName());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From AvailableDays where drID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public AvailableDaysDTO get(String key) throws Exception {
        String SQL="Select * From AvailableDays where drID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            AvailableDaysDTO av1=new AvailableDaysDTO(rst.getString("drID"),rst.getString("avaDayName"));
            return av1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<AvailableDaysDTO> getAll() throws Exception {
        String SQL="Select * From AvailableDays";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<AvailableDaysDTO> availableList=new ArrayList<>();
        while (rst.next()) {
            AvailableDaysDTO av1=new AvailableDaysDTO(rst.getString("drID"),rst.getString("avaDayName"));
            availableList.add(av1);
        }
        return availableList;
    }
    
}
