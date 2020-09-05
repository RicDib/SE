/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esame_luglio_20_server;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;

/**
 *
 * @author riccardodiberardino
 */
@Path("/movieInfo")
public class MovieInfoRepository {
    
    private Connection connection;
    private Statement statement;
    
    public MovieInfoRepository() throws SQLException {
    
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:/Users/riccardodiberardino/NetBeansProjects/esame_luglio_20_database.db");
            statement = connection.createStatement();
            statement.setQueryTimeout(30);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    @GET
    @Path("/movies")
    @Produces("application/json")
    public List<MovieInfo> getMovieDetails() throws SQLException {

        List<MovieInfo> movies = new ArrayList<>();

        ResultSet rs1 = statement.executeQuery("SELECT * FROM MOVIES JOIN DIRECTORS ON MOVIES.directorID == DIRECTORS.ID");

        while (rs1.next()) {
            MovieInfo movie = new MovieInfo();
            movie.setDirectorName(rs1.getString("name"));
            movie.setDirectorYearOfBirth(rs1.getString("yearOfBirth"));
            movie.setMovieTitle(rs1.getString("title"));
            movie.setMovieYear(rs1.getString("year"));

            System.out.println("Movie: "
                    + rs1.getString("title")
                    + " Director "
                    + rs1.getInt("ID")
                    + "is "
                    + rs1.getString("name") 
                    + " and was born in " 
                    + rs1.getString("yearOfBirth"));
            
            movies.add(movie);
        }

        return movies;
    }
}
