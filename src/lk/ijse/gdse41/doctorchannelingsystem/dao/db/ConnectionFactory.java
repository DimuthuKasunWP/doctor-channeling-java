/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.dao.db;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Binura Salindra
 */
public class ConnectionFactory {
    
	private Connection conn;
	private static ConnectionFactory dbConnection;
	private ConnectionFactory()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
	
                     Properties dbProperties = new Properties();
                      File dbFile = new File("Settings/dbSetting.properties");
                      try {
                          FileReader dbFileReader = new FileReader(dbFile);
                          dbProperties.load(dbFileReader);
                      }catch(Exception ex){
                          ex.printStackTrace();
                      }
        String url = "jdbc:mysql://"
                    + dbProperties.getProperty("ip")
                    +":"
                    +dbProperties.getProperty("port")
                    + "/" + dbProperties.getProperty("database");
         String username = dbProperties.getProperty("username");
         String password = dbProperties.getProperty("password");
                            
             conn=DriverManager.getConnection(url,username,password);
        }
       
	public Connection getConnection(){
		return conn;
	}
	public static ConnectionFactory getInstance()throws ClassNotFoundException,SQLException{
		if(dbConnection==null){
			dbConnection=new ConnectionFactory();
		}
		return dbConnection;
	}
}


