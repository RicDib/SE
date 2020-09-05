/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esame_luglio_20_client;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author riccardodiberardino
 */
public class Client {
    private static final String BASE_URL = "http://localhost:8080/movieInfo/movies";
    private static CloseableHttpClient client;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        client = HttpClients.createDefault();

        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL(BASE_URL);

        InputStream input = url.openStream();

        List<MovieInfo> movies = (ArrayList<MovieInfo>) mapper.readValue(input, ArrayList.class);
        System.out.println(movies);
    }
    
}
