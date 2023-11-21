package com.stat.nba.model;


public class JoueurAction {
    String idJoueurAction;
    JoueurMatch joueurMatch;
    Action action;

    public String getIdJoueurAction() {
        return idJoueurAction;
    }
    public JoueurMatch getJoueurMatch() {
        return joueurMatch;
    }
    public Action getAction() {
        return action;
    }
    public void setIdJoueurAction(String idJoueurAction) {
        this.idJoueurAction = idJoueurAction;
    }
    public void setJoueurMatch(JoueurMatch joueurMatch) {
        this.joueurMatch = joueurMatch;
    }
    public void setAction(Action action) {
        this.action = action;
    }
    public JoueurAction()throws Exception{}
    public JoueurAction(String id, JoueurMatch joueurMatch, Action action)throws Exception{
        this.setIdJoueurAction(id);
        this.setJoueurMatch(joueurMatch);
        this.setAction(action);
    }
}
