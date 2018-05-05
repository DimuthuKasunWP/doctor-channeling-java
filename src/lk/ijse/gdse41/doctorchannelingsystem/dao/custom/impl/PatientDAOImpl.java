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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.PatientDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;

/**
 *
 * @author Binura Salindra
 */
public class PatientDAOImpl implements PatientDAO{
    private Connection connection;
    
    public PatientDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(PatientDTO dto) throws Exception {
        String SQL="INSERT INTO Patient VALUES(?,?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getpID());
        stm.setObject(2, dto.getpName());
        stm.setObject(3, dto.getpAddress());
        stm.setObject(4, dto.getGender());
        stm.setObject(5, dto.getpAge());
        stm.setObject(6, dto.getpTelno());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean update(PatientDTO dto) throws Exception {
        String SQL="UPDATE Patient SET pName=?, pAddress=?, gender=?, pAge=?, pTelno=? WHERE pID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(6, dto.getpID());
        stm.setObject(1, dto.getpName());
        stm.setObject(2, dto.getpAddress());
        stm.setObject(3, dto.getGender());
        stm.setObject(4, dto.getpAge());
        stm.setObject(5, dto.getpTelno());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Patient where pID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public PatientDTO get(String key) throws Exception {
        String SQL="Select * From Patient where pID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            PatientDTO p1=new PatientDTO(rst.getString("pID"),rst.getString("pName"),rst.getString("pAddress"),rst.getString("gender"),rst.getInt("pAge"), rst.getString("pTelno"));
            return p1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<PatientDTO> getAll() throws Exception {
        String SQL="Select * From Patient";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<PatientDTO> patientList=new ArrayList<>();
        while (rst.next()) {
            PatientDTO p1=new PatientDTO(rst.getString("pID"),rst.getString("pName"),rst.getString("pAddress"),rst.getString("gender"),rst.getInt("pAge"), rst.getString("pTelno"));
            patientList.add(p1);
        }
        return patientList;
    }

    
    
}
