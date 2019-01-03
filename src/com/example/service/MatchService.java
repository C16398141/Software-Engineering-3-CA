package com.example.service;

import com.example.business.Match;
import com.example.dao.MatchDao;
import com.example.exceptions.DaoException;

public class MatchService {

	MatchDao dao = new MatchDao();
	
	public Match addMatch(String username, String oppname, String tname, String score){
		
		Match m = null;
		try {			
			m = dao.insertNewMatch(username, oppname, tname, score);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return m;
		
	}
	
}
