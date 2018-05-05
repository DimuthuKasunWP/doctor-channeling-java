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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse41.doctorchannelingsystem.dao.SuperDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.custom.UserDAO;
import lk.ijse.gdse41.doctorchannelingsystem.dao.db.ConnectionFactory;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SuperDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.UserDTO;

/**
 *
 * @author Binura Salindra
 */
public class UserDAOImpl implements UserDAO{
    private Connection connection;
    
    public UserDAOImpl(){
        try {
            connection=ConnectionFactory.getInstance().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean add(UserDTO dto) throws Exception {
        String query = "INSERT INTO User VALUES(?, password(?))";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1, dto.getUsername());
        stm.setObject(2, dto.getPassword());
        int res=stm.executeUpdate();
        return(res>0);
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        String SQL = "Update User set password = password(?) WHERE username = ?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPassword());
        stm.setObject(2, dto.getUsername());
        int res = stm.executeUpdate();
        return (res>0);

    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(UserDTO dto) throws Exception {
        String query = "SELECT * FROM User WHERE username = ? AND password = password(?)";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1, dto.getUsername());
        stm.setObject(2, dto.getPassword());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
    
}
