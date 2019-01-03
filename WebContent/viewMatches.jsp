<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<form method="post">

<table border="1">
<tr>
<td>User Name</td>
<td>Opposition Name</td>
<td>Tournament Name</td>
<td>Score</td>
</tr>
<%
try
{
	String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "";
    String password = "";
    Connection con = null;
    
    try {
        Class.forName(driver);
        con = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException ex1) {
        System.out.println("Failed to find driver class " + ex1.getMessage());
        System.exit(1);
    }
	
String query="SELECT * FROM MATCH1";
Statement s=con.createStatement();
ResultSet rs=s.executeQuery(query);
while(rs.next())
{

%>
<tr><td><%=rs.getString("user_name") %></td>
<td><%=rs.getString("opponent_name") %></td>
<td><%=rs.getString("tournament") %></td>
<td><%=rs.getString("score") %></td></tr>
 <%

}
%>
</table>
<%
rs.close();
s.close();
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
%>
</form>