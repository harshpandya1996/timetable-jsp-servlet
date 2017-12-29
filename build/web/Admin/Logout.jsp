<%
    session.removeAttribute("uid");
    session.invalidate();
    response.sendRedirect("login.jsp");
%>