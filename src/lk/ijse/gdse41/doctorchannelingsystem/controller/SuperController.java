/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.controller;

import java.util.ArrayList;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SuperDTO;

/**
 *
 * @author Binura Salindra
 */
public interface SuperController<T extends SuperDTO> {
    public boolean add(T dto) throws Exception;
    
    public boolean update(T dto) throws Exception;
    
    public boolean delete(String id) throws Exception;
    
    public T search(String id) throws Exception;
    
    public ArrayList<T> getAll() throws Exception;

}
