package com.stat.nba.model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.stat.nba.connection.Connect;

public class JoueurMatch {
    String idJoueurMatch;
    Joueur joueur;
    Match match;

    public String getIdJoueurMatch() {
        return idJoueurMatch;
    }
    public Joueur getJoueur() {
        return joueur;
    }
    public Match getMatch() {
        return match;
    }
    public void setIdJoueurMatch(String id) throws Exception{
        if(id.length()>7){
            throw new Exception("idJoueurMatch trop long");
        }
        this.idJoueurMatch=id;
    }
    public void setJoueur(Joueur joueur) throws Exception{
        if(joueur==null){
            throw new Exception("joueur indefini"+joueur);
        }else if(joueur instanceof Joueur ==false){
            throw new Exception("joueur invalide"+joueur.getClass().getName());
        }
        this.joueur=joueur;
    }
    public void setMatch(Match match) throws Exception{
        if(match==null){
            throw new Exception("match indefini"+match);
        }else if(match instanceof Match ==false){
            throw new Exception("match invalide"+match.getClass().getName());
        }
        this.match=match;
    }

    public JoueurMatch()throws Exception{}
    public JoueurMatch(String id, Joueur j, Match m)throws Exception{
        this.setIdJoueurMatch(id);
        this.setJoueur(j);
        this.setMatch(m);
    }

    public  static JoueurMatch getJoueurMatch(String idJoueur,String idMatch,Connection con) throws Exception{
        boolean estValid=false;
        Statement stmt=null;
        ResultSet res=null;
        JoueurMatch jm=null;
        try {
            if(con==null){
                estValid=true;
                con=Connect.getConnect();
            }
            String sql="SELECT*FROM Joueur_match WHERE id_joueur='"+idJoueur+"' AND id_match='"+idMatch+"'";
            stmt=con.createStatement();
            res=stmt.executeQuery(sql);
            System.out.println(sql);
            while (res.next()) {
                Match match=new Match();
                match.setIdMatch(res.getString(2));
                Joueur joueur=new Joueur();
                joueur.setIdJoueur(res.getString(3));
                jm=new JoueurMatch(res.getString(1),joueur,match);
            }
        } catch (Exception e) {
            throw e;
        }finally{
            if(estValid) con.close();
            if(stmt!=null) stmt.close();
            if(res!=null) res.close();
        }
        return jm;
    }
}
