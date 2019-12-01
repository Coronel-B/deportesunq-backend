INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (1, 'Liguilla', 2019, 'UTN','Quilmes','/api/competitions/1')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (2, 'Copa', 2019, 'UNDAV','La Plata','/api/competitions/2')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (3, 'Playoffs', 2019, 'UNQ','Caba','/api/competitions/3')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (4, 'Liguilla', 2018, 'UNQ','Vicente Lopez','/api/competitions/4')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (5, 'Copa', 2018, 'UNLP','Alte.Brown','/api/competitions/5')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (6, 'Playoffs', 2018, 'UBA','Berazategui','/api/competitions/6')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (7, 'Liguilla', 2017, 'UNAJ','Lanus','/api/competitions/7')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (8, 'Copa', 2017, 'UNQ','Lomas','/api/competitions/8')
INSERT INTO Competition(ID, Name, Year, Champion,Sede,Url) VALUES (9, 'Playoffs', 2017, 'UCALP','Moron','/api/competitions/9')


INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(1, 'UTN', 6 , 'Jorge Maldano','2002','/api/teams/1')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(2, 'UNQ', 9 , 'Federico Ribonneto','1998','/api/teams/2')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(3, 'UNDAV', 2 , 'Cesar Mandarino','2015','/api/teams/3')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(4, 'UNAJ', 4 , 'Franco Ricol','2014','/api/teams/4')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(5, 'UCALP', 4 , 'Cecilio Malte','2014','/api/teams/5')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(6, 'UNLP', 9 , 'Damian Formosa','1997','/api/teams/6')
INSERT INTO Team(ID, Name, Campeonatos, Entrenador, Fundacion, Url) VALUES(7, 'UBA', 14 , 'Leonardo Tini','1994','/api/teams/7')


INSERT INTO COMPETITION_POSITION VALUES (1, 1, 1)
INSERT INTO COMPETITION_POSITION VALUES (1, 2, 2)
INSERT INTO COMPETITION_POSITION VALUES (1, 3, 3)

INSERT INTO COMPETITION_POSITION VALUES (2, 1, 3)
INSERT INTO COMPETITION_POSITION VALUES (2, 2, 2)
INSERT INTO COMPETITION_POSITION VALUES (2, 3, 1)

INSERT INTO COMPETITION_POSITION VALUES (3, 1, 2)
INSERT INTO COMPETITION_POSITION VALUES (3, 2, 1)
INSERT INTO COMPETITION_POSITION VALUES (3, 3, 3)