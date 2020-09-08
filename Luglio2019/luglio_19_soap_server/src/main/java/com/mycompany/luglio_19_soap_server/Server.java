/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luglio_19_soap_server;

import java.sql.SQLException;
import javax.xml.ws.Endpoint;

/**
 *
 * @author studente
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ServiceImpl implementor = new ServiceImpl();
        String address = "http://localhost:8080/Service?wsdl";
        Endpoint.publish(address, implementor);
        System.out.println("Server on...");
    }
    
}
