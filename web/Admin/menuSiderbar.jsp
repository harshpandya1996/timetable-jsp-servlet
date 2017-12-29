<nav id="sidebar">
    <!-- Sidebar Scroll Container -->
    <div id="sidebar-scroll">
        <!-- Sidebar Content -->
        <!-- Adding .sidebar-mini-hide to an element will hide it when the sidebar is in mini mode -->
        <div class="sidebar-content">
            <!-- Side Header -->
            <div class="side-header side-content bg-white-op">
                <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->
                <button class="btn btn-link text-gray pull-right hidden-md hidden-lg" type="button" data-toggle="layout" data-action="sidebar_close">
                    <i class="fa fa-times"></i>
                </button>
                <!-- Themes functionality initialized in App() -> uiHandleTheme() -->

                <a class="h5 text-white" href="index.jsp">
                    <i class="fa fa-circle-o-notch text-primary"></i> <span class="h4 font-w600 sidebar-mini-hide">Timetable</span>
                </a>
            </div>
            <!-- END Side Header -->

            <!-- Side Content -->
            <div class="side-content">
                <ul class="nav-main">
                    <li>
                        <a href="index.jsp"><i class="si si-speedometer"></i><span class="sidebar-mini-hide">Timetable</span></a>
                    </li>
                    <li class="nav-main-heading"><span class="sidebar-mini-hide">Timetable Generate</span></li>
                  
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-grid"></i><span class="sidebar-mini-hide">Tables</span></a>
                        <ul>
                            <li>
                                <a href="ViewCourse.jsp">Course</a>
                            </li>
                            <li>
                                <a href="ViewSubject.jsp">Subject</a>
                            </li>
                            <li>
                                <a href="ViewFaculty.jsp">Faculty</a>
                            </li>
                            <li>
                                <a href="ViewClassroom.jsp">Classroom</a>
                            </li>
                            
                        </ul>
                    </li>
                    <li>
                        <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-note"></i><span class="sidebar-mini-hide">Add Forms</span></a>
                        <ul>
                            <li>
                                <a href="Addcourse.jsp">Course</a>
                            </li>
                            <li>
                                <a href="AddSubject.jsp">Subject</a>
                            </li>
                            <li>
                                <a href="AddFaculty.jsp">Faculty</a>
                            </li>
                            <li>
                                <a href="AddClassroom.jsp">Classroom</a>
                            </li>
                           
                        </ul>
                    </li>
                  
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- END Side Content -->
        </div>
        <!-- Sidebar Content -->
    </div>
    <!-- END Sidebar Scroll Container -->
</nav>