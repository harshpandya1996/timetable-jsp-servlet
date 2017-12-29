<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        .CSSTableGenerator {
	margin:0px;padding:0px;
	width:100%;
	box-shadow: 10px 10px 5px #888888;
	border:1px solid #000000;
	
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
	
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
	
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
	
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}.CSSTableGenerator table{
    border-collapse: collapse;
        border-spacing: 0;
	width:100%;
	height:100%;
	margin:0px;padding:0px;
}.CSSTableGenerator tr:last-child td:last-child {
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
}
.CSSTableGenerator table tr:first-child td:first-child {
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}
.CSSTableGenerator table tr:first-child td:last-child {
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
}.CSSTableGenerator tr:last-child td:first-child{
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
}.CSSTableGenerator tr:hover td{
	background-color:#ffffff;
		

}
.CSSTableGenerator td{
	vertical-align:middle;
		background:-o-linear-gradient(bottom, #aad4ff 5%, #ffffff 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #aad4ff), color-stop(1, #ffffff) ); 
	background:-moz-linear-gradient( center top, #aad4ff 5%, #ffffff 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#aad4ff", endColorstr="#ffffff");	background: -o-linear-gradient(top,#aad4ff,ffffff);

	background-color:#aad4ff;

	border:1px solid #000000;
	border-width:0px 1px 1px 0px;
	text-align:left;
	padding:7px;
	font-size:13px;
	font-family:Arial;
	font-weight:normal;
	color:#000000;
}.CSSTableGenerator tr:last-child td{
	border-width:0px 1px 0px 0px;
}.CSSTableGenerator tr td:last-child{
	border-width:0px 0px 1px 0px;
}.CSSTableGenerator tr:last-child td:last-child{
	border-width:0px 0px 0px 0px;
}
.CSSTableGenerator tr:first-child td{
		background:-o-linear-gradient(bottom, #cccccc 5%, #cccccc 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #cccccc) );
	background:-moz-linear-gradient( center top, #cccccc 5%, #cccccc 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#cccccc");	background: -o-linear-gradient(top,#cccccc,cccccc);

	background-color:#cccccc;
	border:0px solid #000000;
	text-align:center;
	border-width:0px 0px 1px 1px;
	font-size:19px;
	font-family:Arial;
	font-weight:bold;
	color:#ffffff;
}
.CSSTableGenerator tr:first-child:hover td{
	background:-o-linear-gradient(bottom, #cccccc 5%, #cccccc 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #cccccc) );
	background:-moz-linear-gradient( center top, #cccccc 5%, #cccccc 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#cccccc");	background: -o-linear-gradient(top,#cccccc,cccccc);

	background-color:#cccccc;
}
.CSSTableGenerator tr:first-child td:first-child{
	border-width:0px 0px 1px 0px;
}
.CSSTableGenerator tr:first-child td:last-child{
	border-width:0px 0px 1px 1px;
}
</style>
    </head>
    <body>
    <center><h2>Giver Wise Project</h2><br><br>
        <form>
            <select name="txttechid">
                <option value="-1">--Select Giver--</option>
                <%
                    DataManager dmtech = new DataManager();
                    ResultSet rs1 = dmtech.getData("Select * from project_giver");
                    while (rs1.next()) {%>
                <option value="<%= rs1.getString(1)%>"><%= rs1.getString(2)%></option> 
                <%}
                %>
            </select>
            <input type="submit" value="Show Report"/>
        </form>

    </center><br><br>
    <% if (request.getParameter("txttechid") != null) {%>
    <div class="CSSTableGenerator">
        <table>
            <tr>
                <td>Id</td>
                <td>Title</td>
                <td>Date</td>
                <td>Description</td>
                <td>Amount</td>
                <td>Technology</td>
                <td>Type</td>
                <td>Duration</td>
                <td>Last Bid Date</td>
                <td>Status</td>
            </tr>
            <%
                DataManager dm = new DataManager();
                ResultSet rs = dm.getData("SELECT   `project`.`Project_id`    , `project`.`Project_title`    , `project`.`Project_date`    , `project`.`Project_desc`    , `project`.`Project_amt`    , `technology`.`Technology_name`    , `project_type`.`Type_name`    , `project_giver`.`Giver_name`    , `project`.`Project_duration`    , `project`.`Project_last_bid_date`    , `project`.`Project_status`FROM    `technology`    INNER JOIN `project`         ON (`technology`.`Technology_id` = `project`.`Technology_id`)    INNER JOIN `project_type`         ON (`project_type`.`Type_id` = `project`.`Type_id`)    INNER JOIN `project_giver`         ON (`project_giver`.`Giver_id` = `project`.`Giver_id`) where `project`.`Giver_id`=" + request.getParameter("txttechid")  + ";");
                while (rs.next()) {
                    out.println("<tr>");

                    out.println("<td>");
                    out.println(rs.getString(1));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(2));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(3));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(4));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(5));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(6));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(7));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(9));
                    out.println("</td>");

                    out.println("<td>");
                    out.println(rs.getString(10));
                    out.println("</td>");
                    
                    out.println("<td>");
                    out.println(rs.getString(11));
                    out.println("</td>");

                    out.println("</tr>");
                }
            %>
        </table>
    </div>
   <% }%>

</body>
</html>
