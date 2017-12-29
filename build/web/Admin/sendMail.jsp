<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<%

    DataManager dm = new DataManager();
    ResultSet rs = dm.getData("Select * from admin where Admin_email='" + request.getParameter("txtemail") + "'");
    if (rs.next()) {
        dm.sendMail(rs.getString(2), "Mail from Freelancer", "The following are the login details :<br> Email:" + request.getParameter("txtemail") + "<br> Password:" + rs.getString(3));
        response.sendRedirect("ForgotPassword.jsp?error=1");
    } else {
        response.sendRedirect("ForgotPassword.jsp?error=0");
    }
%>