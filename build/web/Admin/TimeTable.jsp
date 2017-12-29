<%@page import="java.sql.SQLException"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    ArrayList<String> subList = new ArrayList<String>();
    ArrayList<Integer> arrayListTotalSubLec = new ArrayList<Integer>();
    ArrayList<HashMap<String, String>> arrayList1 = new ArrayList<HashMap<String, String>>();
    String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "hjj", "df"};
    int nooflectures[] = {3, 3, 3, 4, 3, 3};

    boolean checkLectureInDay(int subid, HashMap<String, String> hashMap) {
        if (hashMap.containsValue(subid)) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkLectureCountInWeek(int subid) throws SQLException {
        ResultSet rs = DataManager.getdata("Select * from subject where sub_id=" + subid);
        rs.next();
        int total = rs.getInt(5);
        int count = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            HashMap<String, String> hashMap = arrayList1.get(i);
            for (int j = 0; j < nooflectures[i]; j++) {
                if (hashMap.get("" + j).equals(subid)) {
                    count++;
                }
            }
        }

        if (count == total) {
            return true;
        } else {
            return false;
        }
    }
%>
<%
    ResultSet rsSubject = DataManager.getdata("Select * from subject WHERE course_id=" + request.getParameter("txtcname"));
    
    while (rsSubject.next()) {
        arrayList.add(rsSubject.getInt(1));
        arrayListTotalSubLec.add(rsSubject.getInt(5));
    }
    int subjectid = 0;
    ResultSet rsSubjectName;
    for (int i = 0; i < 6; i++) {
        HashMap<String, String> timeTable = new HashMap<String, String>();
        for (int j = 0; j < nooflectures[i]; j++) {
            Random r1 = new Random();
            do {
                subjectid = r1.nextInt(7);
                rsSubjectName = DataManager.getdata("Select * from subject where sub_id=" + subjectid);
            } while (rsSubjectName.next() == false && checkLectureInDay(subjectid, timeTable) == true && checkLectureCountInWeek(subjectid) == false);
            //          out.println(arrayList1.size());
            timeTable.put("" + j, "" + subjectid);
        }
        arrayList1.add(timeTable);
    }
//    out.println(arrayList1.toString());
%>
<html>
    <head>
        <title>time table</title>
    </head>
    <body bgcolor="skyblue">
        <H1><FONT COLOR="DARKCYAN"><CENTER>COLLEGE TIME TABLE</FONT></H1>
        <table border="2" cellspacing="3" align="center">
            <tr>
                <td align="center">
                <td>1
                <td>2
                <td>3
                <td>4
                <td>5
            </tr>
            <%                for (int i = 0; i < arrayList1.size(); i++) {%>
            <tr>
                <td align="center"><%= days[i]%>
                    <%
                        ResultSet rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("0"));
                        rs.next();
                    %>
                <td align="center"><font color="blue"><%= rs.getString(2)%><br>
                    <%
                        rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("1"));
                        rs.next();
                    %>
                <td align="center"><font color="pink"><%= rs.getString(2)%><br>
                    <%
                        if (i == 0) {%>
                <td rowspan="6"align="center">L<br>U<br>N<br>C<br>H
                    <%}
                    %>
                    <%
                        rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("2"));
                        rs.next();
                    %>
                <td align="center"><font color="red"><%= rs.getString(2)%><br>
                    <%
                        rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("3"));
                        if (rs.next()) {%>
                <td align="center"><font color="maroon"><%= rs.getString(2)%><br>
                    <%} else {%>
                <td align="center"><font color="maroon">---<br>
                    <%}
                    %>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>