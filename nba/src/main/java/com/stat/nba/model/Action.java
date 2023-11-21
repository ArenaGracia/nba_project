package com.stat.nba.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import com.stat.nba.connection.Connect;

public class Action {
    String idAction;
    String intitule;
    int point;

    public String getIdAction() {
        return this.idAction;
    }
    public String getIntitule() {
        return this.intitule;
    }
    public int getPoint() {
        return point;
    }
    public void setIdAction(String id) throws Exception{
        if(id.length()>7){
            throw new Exception("idJoueur trop long");
        }
        this.idAction=id;
    }
    public void setNom(String nom) throws Exception{
        if(nom.length()==0 || nom==null){
            throw new Exception("intitule Action nulle");
        }
        this.intitule=nom;
    }
    public void setPoint(int nombre)throws Exception{
        if(nombre<0){
            throw new Exception("point invalide: negatif");
        }
        this.point=nombre;
    }
    public void setPoint(String nombre)throws Exception{
        int a =Integer.valueOf(nombre);
        if(nombre.length()==0){
            throw new Exception("point invalide: null");
        }
        this.setPoint(a);
    }
    public Action()throws Exception{}
    public Action(String id, String nom, String point)throws Exception{
        this.setIdAction(id);
        this.setNom(nom);
        this.setPoint(point);
    }
    public Action(String id, String nom, int point)throws Exception{
        this.setIdAction(id);
        this.setNom(nom);
        this.setPoint(point);
    }

    public static Action[] getActions(Connection con) throws Exception{
        Statement stmt=null;
        ResultSet res=null;
        Vector<Action> liste=new Vector<Action>();
        try {
            con=Connect.getConnect();
            stmt=con.createStatement();
            String sql="SELECT * FROM Action";
            res=stmt.executeQuery(sql);
            while(res.next()){
                Action action=new Action();
                action.setIdAction(res.getString(1));
                action.setNom(res.getString(2));
                action.setPoint(3);;
                liste.add(action);
            }
        } catch (Exception e) {
            throw e;
        } finally{
            if(con!=null) con.close();
            if(stmt!=null) stmt.close();
            if(res!=null) res.close();
        }
        return liste.toArray(new Action[liste.size()]);
    }
}
