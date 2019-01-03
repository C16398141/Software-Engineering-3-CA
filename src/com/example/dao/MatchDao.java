package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.business.Match;
import com.example.exceptions.DaoException;


public class MatchDao extends Dao {

    public Match insertNewMatch(String username, String oppname, String tname, String score) throws DaoException {

        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;
        Match m = null;
        try {
            con = this.getConnection();
            
            String query = "INSERT INTO MATCH1 VALUES (null, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
           // ps.setNull(0, java.sql.Types.INTEGER);
            ps.setString(1, username);
            ps.setString(2, oppname);
            ps.setString(3, tname);
            ps.setString(4, score);
            m = new Match(username, oppname, tname, score);
            ps.executeUpdate();
            
            
            String query2 = "SELECT * FROM MATCH1";
            ps2 = con.prepareStatement(query2);
            
            rs = ps2.executeQuery();
            if (rs!=null) {
            	while(rs.next()) {
            		System.out.println("User Name: " + rs.getString(2) + " Opponent Name: " + rs.getString(3) + " Tournament Name: "+ rs.getString(4) + " Score: " + rs.getString(5));
            	}
            }

        } catch (SQLException e) {
            throw new DaoException("add&viewMatches " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (ps2 != null) {
                    ps2.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("add&viewMatches" + e.getMessage());
            }
        }
        return m;
    }
   
}