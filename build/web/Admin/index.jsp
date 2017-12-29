<%@page import="Source.DataManager"%>
<%@page import="java.sql.*"%>
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
                <div class="content bg-image overflow-hidden" style="background-image: url('1.jpg');">
                    <div class="push-50-t push-15">
                        <h1 class="h2 text-white animated zoomIn">Dashboard</h1>
                        <h2 class="h5 text-white-op animated zoomIn">Welcome Administrator</h2>
                    </div>
                </div>
                <!-- END Page Header -->

                <!-- Page Content -->
                <div class="content">
                    <div class="row">
                       <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="ViewCourse.jsp">
                                <div class="block-content block-content-full bg-primary-dark">
                                    <i class="si si-users fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Course</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="ViewSubject.jsp">
                                <div class="block-content block-content-full bg-primary">
                                    <i class="si si-layers fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Subjects</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="ViewFaculty.jsp">
                                <div class="block-content block-content-full bg-success">
                                    <i class="si si-users fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Faculties</div>
                                </div>
                            </a>
                        </div>
                        
                        <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="ViewClassroom.jsp">
                                <div class="block-content block-content-full bg-modern">
                                    <i class="si si-pointer fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Classroom</div>
                                </div>
                            </a>
                        </div>

                        <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="SelectCourse.jsp">
                                <div class="block-content block-content-full bg-city">
                                    <i class="si si-tag fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Create Timetable</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-xs-6 col-sm-4 col-lg-2">
                            <a class="block block-link-hover2 text-center" href="ChangePassword.jsp">
                                <div class="block-content block-content-full bg-amethyst">
                                    <i class="si si-settings fa-4x text-white"></i>
                                    <div class="font-w600 text-white-op push-15-t">Change Password</div>
                                </div>
                            </a>
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