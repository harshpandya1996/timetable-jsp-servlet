<%@page import="Source.DataManager"%>
<%@page import="java.sql.*"%>
<%

    DataManager dm = new DataManager();
    String opwd = request.getParameter("txtoldpwd");
    String rows = "";
    ResultSet rs = dm.getdata("select * from admin where email_id='" + session.getAttribute("uid") + "'");
    rs.next();
    String dopwd = rs.getString(2);
    if (opwd.equals(dopwd)) {
        String npwd = request.getParameter("txtnewpwd");
        String rnpwd = request.getParameter("txtretypepwd");
        if (npwd.equals(rnpwd)) {
            rows = dm.setdata("Update admin set password='" + npwd + "' where email_id='" + session.getAttribute("uid") + "'");
            response.sendRedirect("ChangePassword.jsp?error=1");
        } else {
            response.sendRedirect("ChangePassword.jsp?error=0");
        }
    } else {
        response.sendRedirect("ChangePassword.jsp?error=0");
    }


%>