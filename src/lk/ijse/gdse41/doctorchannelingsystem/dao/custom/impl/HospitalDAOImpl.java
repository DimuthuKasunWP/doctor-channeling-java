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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.HospitalDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.HospitalDTO;

/**
 *
 * @author Binura Salindra
 */
public class HospitalDAOImpl implements HospitalDAO{
    private Connection connection;
    
    public HospitalDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HospitalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(HospitalDTO dto) throws Exception {
        String SQL="INSERT INTO Hospital VALUES(?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.gethID());
        stm.setObject(2, dto.gethName());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean update(HospitalDTO dto) throws Exception {
        String SQL="UPDATE Hospital SET hName=? WHERE hID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(2, dto.gethID());
        stm.setObject(1, dto.gethName());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Hospital where hName='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public HospitalDTO get(String key) throws Exception {
        String SQL="Select * From Hospital where hName='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            HospitalDTO h1=new HospitalDTO(rst.getString("hID"),rst.getString("hName"));
            return h1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<HospitalDTO> getAll() throws Exception {
        String SQL="Select * From Hospital";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<HospitalDTO> hospitalList=new ArrayList<>();
        while (rst.next()) {
            HospitalDTO h1=new HospitalDTO(rst.getString("hID"),rst.getString("hName"));
            hospitalList.add(h1);
        }
        return hospitalList;
    
    }
    
}
