package com.stat.nba.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.nba.model.JoueurMatch;
import com.stat.nba.model.PasseDecisive;
import com.stat.nba.model.RebondJoueur;
import com.stat.nba.model.Tire3points;

@RestController
@RequestMapping("/api/nba/action")
public class ActionController{
    @PostMapping("/rebond")
    public RebondJoueur insererRebondJoueur(@RequestBody JoueurMatch joueurMatch) throws Exception {
        RebondJoueur rebondJoueur=null;
        try {
            rebondJoueur=new RebondJoueur(joueurMatch);
            rebondJoueur.insertRebond(null, "ACT0004");
        } catch (Exception e) {
            throw e;
        }
        return rebondJoueur;
    }

    @PostMapping("/passedec")
    public PasseDecisive insererPasseD(@RequestBody JoueurMatch joueurMatch) throws Exception {
        PasseDecisive passeDecisive=null;
        try {
            passeDecisive=new PasseDecisive(joueurMatch);
            passeDecisive.insertPasseDecisive(null, "ACT0003");
        } catch (Exception e) {
            throw e;
        }
        return passeDecisive;
    }

    @PostMapping("/tire3points")
    public Tire3points insererTire3points(@RequestBody JoueurMatch joueurMatch) throws Exception {
        Tire3points tire3points=null;
        try {
            tire3points=new Tire3points(joueurMatch);
            tire3points.insertTire(null, "ACT0001");
        } catch (Exception e) {
            throw e;
        }
        return tire3points;
    }

    @PostMapping("/tire2points")
    public Tire3points insererTire2points(@RequestBody JoueurMatch joueurMatch) throws Exception {
        Tire3points tire3points=null;
        try {
            tire3points=new Tire3points(joueurMatch);
            tire3points.insertTire(null, "ACT0002");
        } catch (Exception e) {
            throw e;
        }
        return tire3points;
    }
}
