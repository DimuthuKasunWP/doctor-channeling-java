/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SuperDTO;

/**
 *
 * @author Binura Salindra
 */
public interface SuperDAO<T extends SuperDTO>{
    
    public boolean add(T dto)throws Exception;
     
    public boolean update(T dto)throws Exception;
    
    public boolean delete(String key)throws Exception;
    
    public T get(String key)throws Exception;
    
    public ArrayList<T> getAll() throws Exception;
}
