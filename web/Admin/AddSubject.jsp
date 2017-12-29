
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
                                Subject
                            </h1>
                        </div>
                    </div>
                </div>
                <!-- END Page Header -->

                <!-- Page Content -->
                <div class="content content-narrow">
                    <!-- Forms Row -->
                    <div class="row">
                        <div class="col-lg-12">
                            <!-- Bootstrap Forms Validation -->
                            <h2 class="content-heading">Subject Forms</h2>
                            <div class="block">
                                <div class="block-header">
                                    <ul class="block-options">
                                        <li>
                                            <button type="button"><i class="si si-settings"></i></button>
                                        </li>
                                    </ul>

                                </div>
                                <div class="block-content block-content-narrow">
                                    <!-- jQuery Validation (.js-validation-bootstrap class is initialized in js/pages/base_forms_validation.js) -->
                                    <!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->
                                    <%                                        if (request.getParameter("did") == null) {%>
                                    <form class="js-validation-bootstrap form-horizontal" action="../InsertSubject" method="post">

                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Subject_id:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" name="txtsid" placeholder="Enter Subject_id" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Subject Name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" name="txtsname" placeholder="Enter Subject Name" required="">
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Course name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" name="txtcname" placeholder="Enter Course " required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Faculty name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" name="txtfname" placeholder="Enter faculty name" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Subject Credit:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" name="txtcredit" placeholder="Enter credit" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-8 col-md-offset-4">
                                                <button class="btn btn-sm btn-primary" type="submit">Submit</button>
                                            </div>
                                        </div>
                                    </form>
                                    <%   } else {
                                        DataManager dm = new DataManager();
                                        ResultSet rs = DataManager.getdata("Select * from subject where subject_id=" + request.getParameter("did"));
                                        rs.next();
                                    %>
                                    <form class="js-validation-bootstrap form-horizontal" action="../InsertSubject" method="post">
                                        <input type="hidden" name="did" value="<%= rs.getString(1)%>" />
                                        
                                         <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Subject Name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" value="<%= rs.getString(2)%>" name="txtsname" placeholder="Enter Subject Name" required="">
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Course name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" value="<%= rs.getString(3)%>" name="txtcname" placeholder="Enter total Subjects" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="val-username">Faculty name:<span class="text-danger">*</span></label>
                                            <div class="col-md-7">
                                                <input class="form-control" type="text" id="val-username" value="<%= rs.getString(4)%>" name="txtfname" placeholder="Enter total Subjects" required="">
                                            </div>
                                        </div> <div class="form-group">
                                            <div class="col-md-8 col-md-offset-4">
                                                <button class="btn btn-sm btn-primary" type="submit">Submit</button>
                                            </div>
                                        </div>
                                    </form>
                                    <%  }
                                    %>

                                </div>
                            </div>
                            <!-- Bootstrap Forms Validation -->
                        </div>
                    </div>
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