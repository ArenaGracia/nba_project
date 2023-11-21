package com.stat.nba.model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.stat.nba.connection.Connect;

public class Tire3points {
    JoueurMatch jm;


    public JoueurMatch getJm() {
        return jm;
    }
    public void setJm(JoueurMatch jm) {
        this.jm = jm;
    }

    public Tire3points(){}
    public Tire3points(JoueurMatch jm){
        setJm(jm);
    }


    public void insertTire(Connection con,String idAction)throws Exception{
        boolean estValid=false;
        Statement stmt=null;
        JoueurMatch jm1=JoueurMatch.getJoueurMatch(jm.getJoueur().getIdJoueur(), jm.getMatch().getIdMatch(), null);
        this.setJm(jm1);
        try {
            if(con==null){
                estValid=true;
                con=Connect.getConnect();
            }
            String sql="INSERT INTO Joueur_action VALUES (default,'"+this.getJm().getIdJoueurMatch()+"','"+idAction+"')";
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            if(estValid) con.close();
            if(stmt!=null) stmt.close();
        }
    }
    
}
