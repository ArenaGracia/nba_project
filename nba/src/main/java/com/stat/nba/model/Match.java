package com.stat.nba.model;


import java.sql.Timestamp;
public class Match {
    String idMatch;
    Timestamp dateDebut;
    Timestamp dateFin;
    String lieu;

    public String getIdMatch() {
        return idMatch;
    }
    public Timestamp getDateDebut() {
        return dateDebut;
    }
    public Timestamp getDateFin() {
        return dateFin;
    }
    public String getLieu() {
        return lieu;
    }
    public void setIdMatch(String id) throws Exception{
        if(id.length()>7){
            throw new Exception("idMatch trop long");
        }
        this.idMatch=id;
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
    public void setLieu(String lieu) throws Exception{
        if(lieu.length()==0 || lieu==null){
            throw new Exception("lieu match nulle");
        }
        this.lieu=lieu;
    }
    public Match()throws Exception{}
    public Match(String id, String dateDebut, String dateFin, String lieu)throws Exception{
        this.setIdMatch(id);
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
        this.setLieu(lieu);
    }
    public Match(String id, Timestamp dateDebut, Timestamp dateFin, String lieu)throws Exception{
        this.setIdMatch(id);
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
        this.setLieu(lieu);
    }
}
