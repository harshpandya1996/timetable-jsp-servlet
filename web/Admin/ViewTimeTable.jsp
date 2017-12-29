<%@page import="java.sql.SQLException"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    ArrayList<String> subList = new ArrayList<String>();
    ArrayList<Integer> arrayListTotalSubLec = new ArrayList<Integer>();
    ArrayList<HashMap<String, String>> arrayList1 = new ArrayList<HashMap<String, String>>();

    String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "", ""};
    int nooflectures[] = {3, 3, 3, 4, 3, 3};

    boolean checkLectureInDay(int subid, HashMap<String, String> hashMap) {
        if (hashMap.containsValue(subid)) {
            return true;
        } else {
            return false;
        }
    }

    private int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long) aEnd - (long) aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return randomNumber;
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
    arrayList.clear();
    arrayList1.clear();
    subList.clear();
    ResultSet rsSubject = DataManager.getdata("Select * from subject WHERE course_id=" + request.getParameter("txtcname"));
    int startid = 0;
    int endid = 0;
    int i = 0;
    while (rsSubject.next()) {
        arrayList.add(rsSubject.getInt(1));
        arrayListTotalSubLec.add(rsSubject.getInt(5));
        if (i == 0) {
            startid = rsSubject.getInt(1);
        }
        endid = rsSubject.getInt(1);
        i++;
    }
    int subjectid = 0;
    ResultSet rsSubjectName;
    for (i = 0; i < 6; i++) {
        HashMap<String, String> timeTable = new HashMap<String, String>();
        for (int j = 0; j < nooflectures[i]; j++) {
            Random r1 = new Random();
            do {
                subjectid = showRandomInteger(startid, endid, r1);
                rsSubjectName = DataManager.getdata("Select * from subject where sub_id=" + subjectid + " and course_id=" + request.getParameter("txtcname"));
            } while (rsSubjectName.next() == false && checkLectureInDay(subjectid, timeTable) == true && checkLectureCountInWeek(subjectid) == false);
            //          out.println(arrayList1.size());
            timeTable.put("" + j, "" + subjectid);
        }
        arrayList1.add(timeTable);
    }
//    out.println(arrayList1.toString());
%>



<!DOCTYPE html>
<!--[if IE 9]>         <html class="ie9 no-focus"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="no-focus"> <!--<![endif]-->
    <head>
        <%@include file="headerScript.jsp" %>
    </head>
    <body>

        <div id="page-container" class="sidebar-l sidebar-o side-scroll header-navbar-fixed">

            <!-- Sidebar -->
            <%@include file="menuSiderbar.jsp" %>
            <!-- END Sidebar -->

            <!-- Header -->
            <%@include file="headerNavigation.jsp" %>
            <!-- END Header -->
            <!-- Main Container -->
            <main id="main-container">
                <!-- Page Header -->
                <div class="content bg-gray-lighter">
                    <div class="row items-push">
                        <div class="col-sm-7">
                            <h1 class="page-heading">
                                TimeTable
                            </h1>
                        </div>

                    </div>
                </div>
                <!-- END Page Header -->

                <!-- Page Content -->
                <div class="content">
                    <!-- Dynamic Table Full -->
                    <div class="block">
                        <div class="block-header">
                            <h3 class="block-title">Time Table</h3>
                        </div>
                        <div class="block-content">
                            <!-- DataTables init on table by adding .js-dataTable-full class, functionality initialized in js/pages/base_tables_datatables.js -->
                            <table class="table table-bordered table-striped">
                                <thead>
                                    <tr>
                                        <td align="center">
                                        <td>1 ->12:00
                                        <td>2 ->01:00
                                        <td>3 ->02:00
                                        <td>4 ->02:30
                                        <td>5 ->03:30
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        for (i = 0; i < arrayList1.size(); i++) {%>
                                    <tr>
                                        <td align="center"><%= days[i]%>
                                            <%
                                                ResultSet rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("0"));
                                                rs.next();
                                            %>
                                        <td align="center"><%= rs.getString(2)%><br>
                                            <%
                                                rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("1"));
                                                rs.next();
                                            %>
                                        <td align="center"><%= rs.getString(2)%><br>
                                            <%
                                                if (i == 0) {%>
                                        <td rowspan="6"align="center">L<br>U<br>N<br>C<br>H
                                            <%}
                                            %>
                                            <%
                                                rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("2"));
                                                rs.next();
                                            %>
                                        <td align="center"><%= rs.getString(2)%><br>
                                            <%
                                                rs = DataManager.getdata("Select * from Subject where sub_id=" + arrayList1.get(i).get("3"));
                                                if (rs.next()) {%>
                                        <td align="center"><%= rs.getString(2)%><br>
                                            <%} else {%>
                                        <td align="center"><font color="maroon">---<br>
                                            <%}
                                            %>
                                    </tr>
                                    <%}
                                    %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- END Dynamic Table Full -->
                </div>
                <!-- END Page Content -->
            </main>
            <!-- END Main Container -->

            <!-- Footer -->
            <%@include file="footer.jsp" %>
            <!-- END Footer -->
        </div>
        <!-- END Page Container -->

        <!-- Apps Modal -->
        <!-- Opens from the button in the header -->

        <!-- END Apps Modal -->

        <%@include file="scripts.jsp" %>
    </body>
</html>