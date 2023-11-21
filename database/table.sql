CREATE DATABASE stat_nba;
\c stat_nba;

CREATE TABLE Equipe(
    id_equipe VARCHAR(10) DEFAULT ('EQP' || LPAD(nextval('equipe_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    nom VARCHAR(40)
);

CREATE TABLE Joueur(
    id_joueur VARCHAR(10) DEFAULT ('JOU' || LPAD(nextval('joueur_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    nom VARCHAR(40),
    id_equipe VARCHAR(10),
    FOREIGN KEY (id_equipe) REFERENCES Equipe(id_equipe)
);

CREATE TABLE Match(
    id_match VARCHAR(10) DEFAULT ('MTC' || LPAD(nextval('match_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    date_debut TIMESTAMP,
    date_fin TIMESTAMP,
    lieu VARCHAR(40)
);

CREATE TABLE Joueur_match(
    id_joueur_match VARCHAR(10) DEFAULT ('JMH' || LPAD(nextval('joueur_match_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    id_joueur VARCHAR(10),
    id_match VARCHAR(10),
    FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur),
    FOREIGN KEY (id_match) REFERENCES Match(id_match)
);

CREATE TABLE Action(
    id_action VARCHAR(10) DEFAULT ('ACT' || LPAD(nextval('action_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    nom VARCHAR(20),
    point INTEGER
);

CREATE TABLE Possession(
    id_possession VARCHAR(10) DEFAULT ('POS' || LPAD(nextval('possession_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    id_joueur_match VARCHAR(10),
    debut TIMESTAMP,
    fin TIMESTAMP
);

CREATE TABLE Joueur_action(
    id_joueur_action VARCHAR(10) DEFAULT ('JAT' || LPAD(nextval('joueur_action_sequence')::TEXT, 4, '0')) PRIMARY KEY,
    id_joueur_match VARCHAR(10),
    id_action VARCHAR(10),
    FOREIGN KEY (id_joueur_match) REFERENCES Joueur_match(id_joueur_match),
    FOREIGN KEY (id_action) REFERENCES Action(id_action)
);