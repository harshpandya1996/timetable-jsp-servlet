<%

    if (session.getAttribute("uid") == null) {
        response.sendRedirect("login.jsp");
    }

%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>


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
                                Password
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
                            <h3 class="block-title">Change Password Details</h3>
                            <%                                         if (request.getParameter("error") != null) {
                                    if (request.getParameter("error").equals("0")) {%>
                            <div class="alert alert-danger alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                <p>Opps! Invalid Login Details. Try Again.</p>
                            </div>
                            <% } else if (request.getParameter("error").equals("1")) {%>
                            <div class="alert alert-success alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                <p>Password Changed Successfully.</p>
                            </div>
                            <%}
                                }
                            %>

                        </div>

                        <div class="block-content">
                            <!-- DataTables init on table by adding .js-dataTable-full class, functionality initialized in js/pages/base_tables_datatables.js -->
                            <form class="js-validation-bootstrap form-horizontal" Action="CheckPassword.jsp" method="post">
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="val-username">Old Password:<span class="text-danger">*</span></label>
                                    <div class="col-md-7">
                                        <input class="form-control" type="password" id="val-username" name="txtoldpwd" placeholder="Enter Password" required="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="val-username">New Password:<span class="text-danger">*</span></label>
                                    <div class="col-md-7">
                                        <input class="form-control" type="password" id="val-username" name="txtnewpwd" placeholder="Enter New Password" required="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="val-username">Retype Password:<span class="text-danger">*</span></label>
                                    <div class="col-md-7">
                                        <input class="form-control" type="password" id="val-username" name="txtretypepwd" placeholder="Retype New Password" required="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-8 col-md-offset-4">
                                        <button class="btn btn-sm btn-primary" type="submit">Submit</button>
                                    </div>
                                </div>

                            </form>
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
            <%@include file="scripts.jsp" %>
        </div>
        <!-- END Page Container -->

        <!-- Apps Modal -->
        <!-- Opens from the button in the header -->

        <!-- END Apps Modal -->

        <!-- <%@include file="scripts.jsp" %> -->
    </body>
</html>