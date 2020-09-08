/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luglio_19_soap_server;

import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author studente
 */
@WebService
public interface Service {

    public List<MovieDetail> getMoiviesList() throws SQLException;

}
