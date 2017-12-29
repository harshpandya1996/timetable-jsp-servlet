<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<%
    DataManager dm = new DataManager();
    String email = request.getParameter("username");
    String password = request.getParameter("password");
    ResultSet rs = DataManager.getdata("Select * from admin where email_id='" + email + "' and password='" + password + "'");
    
    
    if (rs.next()) {
        session.setAttribute("uid", rs.getString(1));
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("login.jsp?error=0");
    }
%>
