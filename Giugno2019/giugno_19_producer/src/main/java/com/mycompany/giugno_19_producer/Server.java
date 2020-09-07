/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.giugno_19_producer;

import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 *
 * @author studente
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException, JMSException {
        // TODO code application logic here
        Producer producer = new Producer();
        producer.start();
    }
    
}
