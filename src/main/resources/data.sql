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

INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 1, 1)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 2, 2)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 3, 3)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 4, 4)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 5, 5)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 6, 6)
INSERT INTO COMPETITION_POSITION(Competitionid, Position,Team) VALUES (1, 7, 7)

INSERT INTO COMPETITION_POSITION VALUES (2, 1, 3)
INSERT INTO COMPETITION_POSITION VALUES (2, 2, 2)
INSERT INTO COMPETITION_POSITION VALUES (2, 3, 1)

INSERT INTO COMPETITION_POSITION VALUES (3, 1, 2)
INSERT INTO COMPETITION_POSITION VALUES (3, 2, 1)
INSERT INTO COMPETITION_POSITION VALUES (3, 3, 3)

// COMPETITION DETAILS ITEM ----------------------------------------------------




// JUGADORES ----------------------------------------------------

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(1, 'Martin', 'Demonchelos', 5, 7, 1)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(2, 'Nicolas', 'Bertiso', 3, 5, 1)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(3, 'Lucas', 'Birgila', 12, 9, 1)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(4, 'Javier', 'Cheranmas', 2, 2, 1)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(5, 'Juan', 'Roquilmen', 1, 1, 1)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(6, 'Maxi', 'Rodirmez', 2, 2, 2)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(7, 'Hernan', 'Cruspi', 4, 3, 2)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(8, 'Gabriel', 'Tirtutaba', 2, 4, 2)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(9, 'Patricio', 'Zieribon', 8, 6, 2)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(10, 'Leonardo', 'Fronci', 0, 12, 2)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(11, 'Martin', 'Demonchelos', 5, 7, 3)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(12, 'Martin', 'Demonchelos', 5, 7, 3)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(13, 'Martin', 'Demonchelos', 5, 7, 3)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(14, 'Martin', 'Demonchelos', 5, 7, 3)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(15, 'Martin', 'Demonchelos', 5, 7, 3)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(16, 'Martin', 'Demonchelos', 5, 7, 4)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(17, 'Martin', 'Demonchelos', 5, 7, 4)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(18, 'Martin', 'Demonchelos', 5, 7, 4)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(19, 'Martin', 'Demonchelos', 5, 7, 4)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(20, 'Martin', 'Demonchelos', 5, 7, 4)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(21, 'Martin', 'Demonchelos', 5, 7, 5)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(22, 'Martin', 'Demonchelos', 5, 7, 5)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(23, 'Martin', 'Demonchelos', 5, 7, 5)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(24, 'Martin', 'Demonchelos', 5, 7, 5)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(25, 'Martin', 'Demonchelos', 5, 7, 5)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(26, 'Martin', 'Demonchelos', 5, 7, 6)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(27, 'Martin', 'Demonchelos', 5, 7, 6)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(28, 'Martin', 'Demonchelos', 5, 7, 6)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(29, 'Martin', 'Demonchelos', 5, 7, 6)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(30, 'Martin', 'Demonchelos', 5, 7, 6)

INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(31, 'Martin', 'Demonchelos', 5, 7, 7)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(32, 'Martin', 'Demonchelos', 5, 7, 7)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(33, 'Martin', 'Demonchelos', 5, 7, 7)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(34, 'Martin', 'Demonchelos', 5, 7, 7)
INSERT INTO Jugador(ID, Name, Surname, Goals, Shirt, Team) VALUES(35, 'Martin', 'Demonchelos', 5, 7, 7)

// Partidos -------------------------------------------------------------

INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (1,'UNQ','UNDAV',5,1,'11/08/2019','Liguilla 2019', 'Fecha 4')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (2,'UNQ','UTN',4,4,'18/08/2019','Copa 2019', 'Octavos')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (3,'UNQ','UNAJ',2,7,'25/08/2019','Liguilla 2019', 'Fecha 5')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (4,'UNQ','UBA',3,3,'2/09/2019','Copa 2019', 'Cuartos')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (5,'UNQ','UCALP',5,7,'11/09/2019','Liguilla 2019', 'Fecha 6')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (6,'UNQ','UNLP',10,1,'19/09/2019','Liguilla 2019', 'Fecha 7')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (7,'UNQ','UNAJ',7,1,'23/09/2019','Copa 2019', 'Semi')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (8,'UNQ','UBAV',3,6,'12/10/2019','Liguilla 2019', 'Fecha 8')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (9,'UNQ','UNDAV',2,4,'11/11/2019','Liguilla 2019', 'Fecha 9')
INSERT INTO Match(ID, Local, Visitante, Goleslocal, Golesvisitante, Fecha, Competencia, Instancia) VALUES (10,'UNQ','UCALP',3,1,'27/11/2019','Liguilla 2019', 'Fecha 10')
