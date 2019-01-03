CREATE TABLE `match` (
	`ID` int(11) NOT NULL AUTO_INCREMENT,
	`USER_NAME` varchar(50) NOT NULL,
	`OPPONENT_NAME` varchar(50) NOT NULL,
	`TOURNAMENT` varchar(50) NOT NULL,
	`SCORE` varchar(20) NOT NULL,
	PRIMARY KEY  (`ID`)
  );
  
  
  INSERT INTO match VALUES (null, "Matthew Green", "James Woods", "Rathgar Open", "6-3, 6-0"),
						(null, "Joe Rogan", "Harry Pog", "Rathgar Open", "7-5, 7-6"),
						(null, "Dave Blaine", "Terry Dame", "Santry Senior Open", "6-2, 6-2"),
						(null, "Paddy Lots", "Larry Good", "Rathgar Open", "4-6, 6-1, 6-3");