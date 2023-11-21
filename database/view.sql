
SELECT jm.*,j.nom
    FROM Joueur_match jm
    JOIN Joueur j ON jm.id_joueur=j.id_joueur;

CREATE OR REPLACE VIEW v_action1 AS(
    SELECT ja.*,jm.id_joueur,jm.id_match
        FROM Joueur_action ja
        LEFT JOIN Joueur_match jm ON ja.id_joueur_match=jm.id_joueur_match
);

CREATE OR REPLACE VIEW v_action2 AS(
    SELECT a.id_action,va1.id_joueur,va1.id_match,a.nom,
        (CASE WHEN sum(a.point) IS NULL THEN 0 ELSE sum(a.point) END) point,
        COUNT(a.point) nb
        FROM v_action1 va1 
        LEFT JOIN Action a ON a.id_action=va1.id_action 
    GROUP BY a.id_action,va1.id_match,va1.id_joueur,a.nom
);

CREATE OR REPLACE VIEW v_rebond AS(
    SELECT va2.id_joueur,j.id_equipe,va2.id_match,va2.nb total_rebond
        FROM v_action2 va2
        LEFT JOIN Joueur j ON j.id_joueur=va2.id_joueur
    WHERE va2.id_action='ACT0004'
GROUP BY va2.id_joueur,j.id_equipe,va2.id_match,va2.nb
);

CREATE OR REPLACE VIEW v_pd AS(
    SELECT va2.id_joueur,j.id_equipe,va2.id_match,va2.nb total_pd
        FROM v_action2 va2
        LEFT JOIN Joueur j ON j.id_joueur=va2.id_joueur
    WHERE va2.id_action='ACT0003'
GROUP BY va2.id_joueur,j.id_equipe,va2.id_match,va2.nb
);

CREATE OR REPLACE VIEW v_3points AS(
    SELECT va2.id_joueur,j.id_equipe,va2.id_match,va2.nb total_point
        FROM v_action2 va2
        LEFT JOIN Joueur j ON j.id_joueur=va2.id_joueur
    WHERE va2.id_action='ACT0002'
GROUP BY va2.id_joueur,j.id_equipe,va2.id_match,va2.nb
);

CREATE OR REPLACE VIEW v_statistique AS(
    SELECT j.id_joueur,
        CASE WHEN (v3.total_point) IS NULL THEN 0 ELSE v3.total_point END points3,
        CASE WHEN (vp.total_pd) IS NULL THEN 0 ELSE vp.total_pd END pd,
        CASE WHEN (v.total_rebond) IS NULL THEN 0 ELSE v.total_rebond END rebond
        FROM Joueur j
        LEFT JOIN v_rebond v ON j.id_joueur=v.id_joueur
        LEFT JOIN v_pd vp ON j.id_joueur=vp.id_joueur
        LEFT JOIN v_3points v3 ON j.id_joueur=v3.id_joueur
); 