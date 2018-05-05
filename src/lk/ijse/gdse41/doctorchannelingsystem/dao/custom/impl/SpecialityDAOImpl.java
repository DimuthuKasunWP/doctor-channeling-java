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
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.SpecialityDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SpecialityDTO;

/**
 *
 * @author Binura Salindra
 */
public class SpecialityDAOImpl implements SpecialityDAO{
    private Connection connection;
    
    public SpecialityDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SpecialityDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(SpecialityDTO dto) throws Exception {
        String SQL="INSERT INTO Speciality VALUES(?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSpID());
        stm.setObject(2, dto.getSpType());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean update(SpecialityDTO dto) throws Exception {
        String SQL="UPDATE Speciality SET spType=? WHERE spID=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(2, dto.getSpID());
        stm.setObject(1, dto.getSpType());
        int res=stm.executeUpdate();
        return (res>0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Speciality where spID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res>0);
    }

    @Override
    public SpecialityDTO get(String key) throws Exception {
        String SQL="Select * From Speciality where spType='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            SpecialityDTO sp1=new SpecialityDTO(rst.getString("spID"),rst.getString("spType"));
            return sp1;
	}else{
            return null;
	}
    }

    @Override
    public ArrayList<SpecialityDTO> getAll() throws Exception {
        String SQL="Select * From Speciality";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<SpecialityDTO> specialityList=new ArrayList<>();
        while (rst.next()) {
            SpecialityDTO sp1=new SpecialityDTO(rst.getString("spID"),rst.getString("spType"));
            specialityList.add(sp1);
        }
        return specialityList;
    
    }
    
}
