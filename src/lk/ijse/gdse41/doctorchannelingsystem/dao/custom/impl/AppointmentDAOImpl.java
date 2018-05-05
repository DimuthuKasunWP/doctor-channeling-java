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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AppointmentDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;

/**
 *
 * @author Binura Salindra
 */
public class AppointmentDAOImpl implements AppointmentDAO{
    
    private Connection connection;
    
    public AppointmentDAOImpl(){
    
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AppointmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(AppointmentDTO dto) throws Exception {
        String SQL="INSERT INTO Appointment VALUES(?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getApID());
        stm.setObject(2, dto.getpID());
        stm.setObject(3, dto.getScID());
        stm.setObject(4, dto.getApNo());
        stm.setObject(5, dto.getApDate());
        int res=stm.executeUpdate();
        return (res>0);
       
    }

    @Override
    public boolean update(AppointmentDTO dto) throws Exception {
        String SQL="UPDATE Appointment SET pID=?, scID=?, apNo=?, apDate=? WHERE apID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(5, dto.getApID());
        stm.setObject(1, dto.getpID());
        stm.setObject(2, dto.getScID());
        stm.setObject(3, dto.getApNo());
        stm.setObject(4, dto.getApDate());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Appointment where apID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public AppointmentDTO get(String key) throws Exception {
        String SQL="Select * From Appointment where apID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            AppointmentDTO ap1=new AppointmentDTO(rst.getString("apID"),rst.getString("pID"),rst.getString("scID"),rst.getInt("apNo"),rst.getString("apDate"));
            return ap1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<AppointmentDTO> getAll() throws Exception {
        String SQL="Select * From Appointment";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<AppointmentDTO> appoinmentList=new ArrayList<>();
        while (rst.next()) {
            AppointmentDTO ap1=new AppointmentDTO(rst.getString("apID"),rst.getString("pID"),rst.getString("scID"),rst.getInt("apNo"),rst.getString("apDate"));
            appoinmentList.add(ap1);
        }
        return appoinmentList;
    }
}
