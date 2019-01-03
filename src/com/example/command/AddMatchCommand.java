package com.example.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.business.Match;
import com.example.service.MatchService;

public class AddMatchCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
		MatchService matchService = new MatchService();
		String forwardToJsp = "";		

		String username = request.getParameter("username");
		String oppname = request.getParameter("oppname");
		String tname = request.getParameter("tname");
		String score = request.getParameter("score");
		

		//If all fields are filled
		if (username != null && oppname != null && tname != null && score != null){

			Match matchAdding = matchService.addMatch(username, oppname, tname, score);

			if (matchAdding != null){

				forwardToJsp = "/viewMatches.jsp";	
			}
			else{
				forwardToJsp = "/addFailure.jsp";
		}
		}
		else {
			forwardToJsp = "/addFailure.jsp";	
		}
		return forwardToJsp;
	}

}