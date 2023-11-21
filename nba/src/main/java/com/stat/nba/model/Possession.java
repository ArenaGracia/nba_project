package com.stat.nba.model;


import java.sql.Timestamp;

public class Possession {
    String idPossession;
    JoueurMatch joueurMatch;
    Timestamp dateDebut;
    Timestamp dateFin;

    public String getIdPossession() {
        return idPossession;
    }
    public JoueurMatch getJoueurMatch() {
        return joueurMatch;
    }
    public Timestamp getDateDebut() {
        return dateDebut;
    }
    public Timestamp getDateFin() {
        return dateFin;
    }
    public void setIdPossession(String idPossession) {
        this.idPossession = idPossession;
    }
    public void setJoueurMatch(JoueurMatch joueurMatch) {
        this.joueurMatch = joueurMatch;
    }
    public void setDateDebut(String date) throws Exception{
        Timestamp date_value=Timestamp.valueOf(date);
        if(date==null || date.equals(" ") || date.length()==0){
            Timestamp d=new Timestamp(System.currentTimeMillis());
            date_value=d;
        }
        this.setDateDebut(date_value);
    }
    public void setDateDebut(Timestamp t)throws Exception{
        this.dateDebut=t;
    }
    public void setDateFin(String date) throws Exception{
        Timestamp date_value=Timestamp.valueOf(date);
        if(date==null || date.equals(" ") || date.length()==0){
            Timestamp d=new Timestamp(System.currentTimeMillis());
            date_value=d;
        }
        this.setDateFin(date_value);    
    }
    public void setDateFin(Timestamp t)throws Exception{
        this.dateFin=t;
    }
    public Possession()throws Exception{}
    public Possession(String id, JoueurMatch jm, String debut, String fin)throws Exception{
        this.setIdPossession(id);
        this.setJoueurMatch(jm);
        this.setDateDebut(debut);
        this.setDateFin(fin);
    }
    public Possession(String id, JoueurMatch jm, Timestamp debut, Timestamp fin)throws Exception{
        this.setIdPossession(id);
        this.setJoueurMatch(jm);
        this.setDateDebut(debut);
        this.setDateFin(fin);
    }
}

