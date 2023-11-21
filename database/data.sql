INSERT INTO Equipe VALUES 
    (default,'EP A'),
    (default,'EP B'),
    (default,'EP C'),
    (default,'EP D');

INSERT INTO Joueur VALUES
    (default,'JA1','EQP0001'),(default,'JA2','EQP0001'),(default,'JA3','EQP0001'),(default,'JA4','EQP0001'),
    (default,'JA5','EQP0001'),(default,'JA6','EQP0001'),(default,'JA7','EQP0001'),(default,'JA8','EQP0001'),
    (default,'JA9','EQP0001'),(default,'JA10','EQP0001'),

    (default,'JB1','EQP0002'),(default,'JB2','EQP0002'),(default,'JB3','EQP0002'),(default,'JB4','EQP0002'),
    (default,'JB5','EQP0002'),(default,'JB6','EQP0002'),(default,'JB7','EQP0002'),(default,'JB8','EQP0002'),
    (default,'JB9','EQP0002'),(default,'JB10','EQP0002'),

    (default,'JC1','EQP0003'),(default,'JC2','EQP0003'),(default,'JC3','EQP0003'),(default,'JC4','EQP0003'),
    (default,'JC5','EQP0003'),(default,'JC6','EQP0003'),(default,'JC7','EQP0003'),(default,'JC8','EQP0003'),
    (default,'JC9','EQP0003'),(default,'JC10','EQP0003'),

    (default,'JD1','EQP0004'),(default,'JD2','EQP0004'),(default,'JD3','EQP0004'),(default,'JD4','EQP0004'),
    (default,'JD5','EQP0004'),(default,'JD6','EQP0004'),(default,'JD7','EQP0004'),(default,'JD8','EQP0004'),
    (default,'JD9','EQP0004'),(default,'JD10','EQP0004');

INSERT INTO Match VALUES
    (default,'2023-10-12 14:00:00.00','2023-10-12 16:30:00.00','Analakely');

INSERT INTO Joueur_match VALUES
    (default,'JOU0001','MTC0001'),(default,'JOU0002','MTC0001'),(default,'JOU0003','MTC0001'),
    (default,'JOU0004','MTC0001'),(default,'JOU0005','MTC0001'),(default,'JOU0006','MTC0001'),
    (default,'JOU0011','MTC0001'),(default,'JOU0012','MTC0001'),(default,'JOU0013','MTC0001'),
    (default,'JOU0014','MTC0001'),(default,'JOU0015','MTC0001'),(default,'JOU0016','MTC0001');

INSERT INTO Action VALUES
    (default,'TIre 3pts',3),
    (default,'TIre 2pts',2),
    (default,'Passe Desicive',0),
    (default,'Rebond',0);
  