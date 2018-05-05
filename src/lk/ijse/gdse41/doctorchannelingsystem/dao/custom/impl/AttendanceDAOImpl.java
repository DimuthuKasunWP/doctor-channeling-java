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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.AttendanceDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AttendanceDTO;

/**
 *
 * @author Binura Salindra
 */
public class AttendanceDAOImpl implements AttendanceDAO{
    private Connection connection;

    public AttendanceDAOImpl() {
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendanceDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AttendanceDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(AttendanceDTO dto) throws Exception {
        String SQL="INSERT INTO Attendance VALUES(?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getApID());
        stm.setObject(2, dto.getApNo());
        stm.setObject(3, dto.getApDate());
        stm.setObject(4, dto.getStatus());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean update(AttendanceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
        String SQL="Select * From Attendance";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<AttendanceDTO> attendanceList=new ArrayList<>();
        while (rst.next()) {
            AttendanceDTO ap1=new AttendanceDTO(rst.getString("apID"),rst.getString("apNo"),rst.getString("apDate"),rst.getString("status"));
            attendanceList.add(ap1);
        }
        return attendanceList;
    
    }
    
}
