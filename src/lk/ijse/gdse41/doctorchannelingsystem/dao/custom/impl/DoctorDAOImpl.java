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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.DoctorDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.DoctorDTO;

/**
 *
 * @author Binura Salindra
 */
public class DoctorDAOImpl implements DoctorDAO{
    
    private Connection connection;
    
    public DoctorDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public boolean add(DoctorDTO dto) throws Exception {
        String SQL="INSERT INTO Doctor VALUES(?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getDrID());
        stm.setObject(2, dto.getSpID());
        stm.setObject(3, dto.gethID());
        stm.setObject(4, dto.getDrName());
        stm.setObject(5, dto.getDrTelno());
        int res=stm.executeUpdate();
        return (res>0);
       
    }

    @Override
    public boolean update(DoctorDTO dto) throws Exception {
        String SQL="UPDATE Doctor SET spID=?, hID=?, drName=?, drTelno=? WHERE drID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSpID());
        stm.setObject(2, dto.gethID());
        stm.setObject(3, dto.getDrName());
        stm.setObject(4, dto.getDrTelno());
        stm.setObject(5, dto.getDrID());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Doctor where drID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public DoctorDTO get(String key) throws Exception {
        String SQL="Select * From Doctor where drName='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            DoctorDTO d1=new DoctorDTO(rst.getString("drID"),rst.getString("spID"),rst.getString("hID"),rst.getString("drName"),rst.getString("drTelno"));
            return d1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<DoctorDTO> getAll() throws Exception {
        String SQL="Select * From Doctor";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<DoctorDTO> doctorList=new ArrayList<>();
        while (rst.next()) {
            DoctorDTO d1=new DoctorDTO(rst.getString("drID"),rst.getString("spID"),rst.getString("hID"),rst.getString("drName"),rst.getString("drTelno"));
            doctorList.add(d1);
        }
        return doctorList;
    }
    
}
