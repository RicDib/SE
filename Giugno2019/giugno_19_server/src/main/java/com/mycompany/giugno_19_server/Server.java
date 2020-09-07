/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.giugno_19_server;

import javax.xml.ws.Endpoint;

/**
 *
 * @author studente
 */
public class Server {

    public static void main(String[] args) {
        Professor.insertProfessor(new Professor("Toro", "Cas"));
        Professor.insertProfessor(new Professor("San", "Ba"));
        Professor.insertProfessor(new Professor("Quinto", "Tordi"));
        Professor.insertProfessor(new Professor("Aschifo", "Javaf"));
        Professor.insertProfessor(new Professor("Na", "Bana"));

        ServiceImpl implementor = new ServiceImpl();
        String address = "http://localhost:8080/Service";
        Endpoint.publish(address, implementor);
        System.out.println("Server online...");
    }
}
