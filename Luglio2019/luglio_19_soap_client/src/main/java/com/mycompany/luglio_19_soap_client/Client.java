/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luglio_19_soap_client;

import java.util.List;

/**
 *
 * @author studente
 */
public class Client {

    public static void main(String[] args) throws SQLException_Exception {

        ServiceImplService service = new ServiceImplService();
        Service port = service.getServiceImplPort();
        List<MovieDetail> list = port.getMoiviesList();

        MovieDetail item = new MovieDetail();

        for (int i = 0; i < list.size(); i++) {
            item = list.get(i);
            System.out.println("Movie " + item.getTitle() + " was shoot in " + item.getYear() + ", by " + item.getDirectorName() + " born in " + item.getDirectorYearOfBirth());
        };
    }
}


