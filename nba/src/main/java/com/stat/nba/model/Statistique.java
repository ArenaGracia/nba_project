package com.stat.nba.model;


public class Statistique {
   Joueur[] joueurs;
   Match[] matchs;
   JoueurAction[] actions;

   public Joueur[] getJoueurs() {
       return joueurs;
   }
   public Match[] getMatchs() {
       return matchs;
   }
   public JoueurAction[] getActions() {
       return actions;
   }
   public void setJoueurs(Joueur[] joueurs) throws Exception{
       this.joueurs = joueurs;
   }
   public void setMatchs(Match[] matchs) throws Exception{
       this.matchs = matchs;
   }
   public void setActions(JoueurAction[] actions) throws Exception{
       this.actions = actions;
   }

   public Statistique()throws Exception{}
   public Statistique(Joueur[] joueurs, Match[] matchs, JoueurAction[] actions)throws Exception{
        this.setJoueurs(joueurs);
        this.setMatchs(matchs);
        this.setActions(actions);
   }

   



}
