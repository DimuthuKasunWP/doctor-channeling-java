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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.ScheduleDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleDTO;

/**
 *
 * @author Binura Salindra
 */
public class ScheduleDAOImpl implements ScheduleDAO{
    private Connection connection;
    
    public ScheduleDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ScheduleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(ScheduleDTO dto) throws Exception {
        String SQL="INSERT INTO Schedule VALUES(?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getScID());
        stm.setObject(2, dto.getDrID());
        stm.setObject(3, dto.getDayName());
        stm.setObject(4, dto.getTimeSlot());
        stm.setObject(5, dto.getMaxPatientCount());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean update(ScheduleDTO dto) throws Exception {
        String SQL="UPDATE Schedule SET drID=?, dayName=?, timeSlot=?, maxPatientCount=? WHERE scID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(5, dto.getScID());
        stm.setObject(1, dto.getDrID());
        stm.setObject(2, dto.getDayName());
        stm.setObject(3, dto.getTimeSlot());
        stm.setObject(4, dto.getMaxPatientCount());
        int res=stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Schedule where scID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public ScheduleDTO get(String key) throws Exception {
        String SQL="Select * From Schedule where scID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            ScheduleDTO sc1=new ScheduleDTO(rst.getString("scID"),rst.getString("drID"),rst.getString("dayName"),rst.getString("timeSlot"),rst.getInt("maxPatientCount"));
            return sc1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        String SQL="Select * From Schedule";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<ScheduleDTO> scheduleList=new ArrayList<>();
        while (rst.next()) {
            ScheduleDTO sc1=new ScheduleDTO(rst.getString("scID"),rst.getString("drID"),rst.getString("dayName"),rst.getString("timeSlot"),rst.getInt("maxPatientCount"));
            scheduleList.add(sc1);
        }
        return scheduleList;
    }
    
}
