
<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
 <%   // if (request.getParameter("did") != null) {
      //  DataManager dmdel = new DataManager();
    //    String rows = dmdel.setData("Delete from course where course_id=" + request.getParameter("did"));
        //if (rows.equals("1")) {
      //      response.sendRedirect("ViewCourse.jsp");
    //    }
  //  }
//%>


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
                                Classroom
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
                            <h3 class="block-title">View Classroom Details</h3>
                        </div>
                        <div class="block-content">
                            <!-- DataTables init on table by adding .js-dataTable-full class, functionality initialized in js/pages/base_tables_datatables.js -->
                            <table class="table table-bordered table-striped js-dataTable-full">
                                <thead>
                                    <tr>
                                        <th class="text-center">Classroom no</th>
                                         <th>Action</th>
                                       
                  
                                    </tr>
                                       
                                </thead>
                                <tbody>
                                    <%
                                        //DataManager dm = new DataManager();
                                        ResultSet rs = DataManager.getdata("Select * from class");
                                        while (rs.next()) {
                                            out.println("<tr>");

                                            out.println("<td class='text-center'>");
                                            out.println(rs.getString(1));
                                            out.println("</td>");

                                            

                                            out.println("<td>");
                                            out.println("<a href='#" + rs.getString(1) + "'>Edit</a> | <a href='../DeleteClassroom?did=" + rs.getString(1) + "'>Delete</a>");
                                            out.println("</td>");

                                            out.println("</tr>");
                                        }
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