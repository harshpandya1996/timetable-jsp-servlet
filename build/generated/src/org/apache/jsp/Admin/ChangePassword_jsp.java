package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Source.DataManager;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/Admin/headerScript.jsp");
    _jspx_dependants.add("/Admin/menuSiderbar.jsp");
    _jspx_dependants.add("/Admin/headerNavigation.jsp");
    _jspx_dependants.add("/Admin/footer.jsp");
    _jspx_dependants.add("/Admin/scripts.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");



    if (session.getAttribute("uid") == null) {
        response.sendRedirect("login.jsp");
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 9]>         <html class=\"ie9 no-focus\"> <![endif]-->\n");
      out.write("<!--[if gt IE 9]><!--> <html class=\"no-focus\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Timetable </title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"OneUI - Admin Dashboard Template & UI Framework created by pixelcave and published on Themeforest\">\n");
      out.write("        <meta name=\"author\" content=\"pixelcave\">\n");
      out.write("        <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- Icons -->\n");
      out.write("        <!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicons/favicon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-160x160.png\" sizes=\"160x160\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-192x192.png\" sizes=\"192x192\">\n");
      out.write("\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"assets/img/favicons/apple-touch-icon-57x57.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"assets/img/favicons/apple-touch-icon-60x60.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"assets/img/favicons/apple-touch-icon-72x72.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/favicons/apple-touch-icon-76x76.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"assets/img/favicons/apple-touch-icon-114x114.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"assets/img/favicons/apple-touch-icon-120x120.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"assets/img/favicons/apple-touch-icon-144x144.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"assets/img/favicons/apple-touch-icon-152x152.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/img/favicons/apple-touch-icon-180x180.png\">\n");
      out.write("        <!-- END Icons -->\n");
      out.write("\n");
      out.write("        <!-- Stylesheets -->\n");
      out.write("        <!-- Web fonts -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400italic,600,700%7COpen+Sans:300,400,400italic,600,700\">\n");
      out.write("\n");
      out.write("        <!-- Page JS Plugins CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/plugins/datatables/jquery.dataTables.min.css\">\n");
      out.write("\n");
      out.write("        <!-- OneUI CSS framework -->\n");
      out.write("        <link rel=\"stylesheet\" id=\"css-main\" href=\"assets/css/oneui.css\">\n");
      out.write("\n");
      out.write("        <!-- You can include a specific file from css/themes/ folder to alter the default color theme of the template. eg: -->\n");
      out.write("        <!-- <link rel=\"stylesheet\" id=\"css-theme\" href=\"assets/css/themes/flat.min.css\"> -->\n");
      out.write("        <!-- END Stylesheets -->");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"page-container\" class=\"sidebar-l sidebar-o side-scroll header-navbar-fixed\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            ");
      out.write("<nav id=\"sidebar\">\n");
      out.write("    <!-- Sidebar Scroll Container -->\n");
      out.write("    <div id=\"sidebar-scroll\">\n");
      out.write("        <!-- Sidebar Content -->\n");
      out.write("        <!-- Adding .sidebar-mini-hide to an element will hide it when the sidebar is in mini mode -->\n");
      out.write("        <div class=\"sidebar-content\">\n");
      out.write("            <!-- Side Header -->\n");
      out.write("            <div class=\"side-header side-content bg-white-op\">\n");
      out.write("                <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->\n");
      out.write("                <button class=\"btn btn-link text-gray pull-right hidden-md hidden-lg\" type=\"button\" data-toggle=\"layout\" data-action=\"sidebar_close\">\n");
      out.write("                    <i class=\"fa fa-times\"></i>\n");
      out.write("                </button>\n");
      out.write("                <!-- Themes functionality initialized in App() -> uiHandleTheme() -->\n");
      out.write("\n");
      out.write("                <a class=\"h5 text-white\" href=\"index.jsp\">\n");
      out.write("                    <i class=\"fa fa-circle-o-notch text-primary\"></i> <span class=\"h4 font-w600 sidebar-mini-hide\">Timetable</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- END Side Header -->\n");
      out.write("\n");
      out.write("            <!-- Side Content -->\n");
      out.write("            <div class=\"side-content\">\n");
      out.write("                <ul class=\"nav-main\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index.jsp\"><i class=\"si si-speedometer\"></i><span class=\"sidebar-mini-hide\">Timetable</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-main-heading\"><span class=\"sidebar-mini-hide\">Timetable Generate</span></li>\n");
      out.write("                  \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-submenu\" data-toggle=\"nav-submenu\" href=\"#\"><i class=\"si si-grid\"></i><span class=\"sidebar-mini-hide\">Tables</span></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"ViewCourse.jsp\">Course</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"ViewSubject.jsp\">Subject</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"ViewFaculty.jsp\">Faculty</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"ViewClassroom.jsp\">Classroom</a>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-submenu\" data-toggle=\"nav-submenu\" href=\"#\"><i class=\"si si-note\"></i><span class=\"sidebar-mini-hide\">Add Forms</span></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Addcourse.jsp\">Course</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"AddSubject.jsp\">Subject</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"AddFaculty.jsp\">Faculty</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"AddClassroom.jsp\">Classroom</a>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                  \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- END Side Content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- Sidebar Content -->\n");
      out.write("    </div>\n");
      out.write("    <!-- END Sidebar Scroll Container -->\n");
      out.write("</nav>");
      out.write("\n");
      out.write("            <!-- END Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Header -->\n");
      out.write("            ");
      out.write("<header id=\"header-navbar\" class=\"content-mini content-mini-full\">\n");
      out.write("    <!-- Header Navigation Right -->\n");
      out.write("    <ul class=\"nav-header pull-right\">\n");
      out.write("        <li>\n");
      out.write("            <div class=\"btn-group\">\n");
      out.write("                <button class=\"btn btn-default btn-image dropdown-toggle\" data-toggle=\"dropdown\" type=\"button\">\n");
      out.write("                    <img src=\"administrator.png\" alt=\"Avatar\">\n");
      out.write("                    <span class=\"caret\"></span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                    <li class=\"dropdown-header\">Profile</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a tabindex=\"-1\" href=\"ChangePassword.jsp\">\n");
      out.write("                            <i class=\"si si-settings pull-right\"></i>Change Password\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a tabindex=\"-1\" href=\"Logout.jsp\">\n");
      out.write("                            <i class=\"si si-logout pull-right\"></i>Log out\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- END Header Navigation Right -->\n");
      out.write("\n");
      out.write("    <!-- Header Navigation Left -->\n");
      out.write("    <ul class=\"nav-header pull-left\">\n");
      out.write("        <li class=\"hidden-md hidden-lg\">\n");
      out.write("            <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->\n");
      out.write("            <button class=\"btn btn-default\" data-toggle=\"layout\" data-action=\"sidebar_toggle\" type=\"button\">\n");
      out.write("                <i class=\"fa fa-navicon\"></i>\n");
      out.write("            </button>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"hidden-xs hidden-sm\">\n");
      out.write("            <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->\n");
      out.write("            <h3> Timetable</h3>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("    <!-- END Header Navigation Left -->\n");
      out.write("</header>");
      out.write("\n");
      out.write("            <!-- END Header -->\n");
      out.write("            <!-- Main Container -->\n");
      out.write("            <main id=\"main-container\">\n");
      out.write("                <!-- Page Header -->\n");
      out.write("                <div class=\"content bg-gray-lighter\">\n");
      out.write("                    <div class=\"row items-push\">\n");
      out.write("                        <div class=\"col-sm-7\">\n");
      out.write("                            <h1 class=\"page-heading\">\n");
      out.write("                                Password\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- END Page Header -->\n");
      out.write("\n");
      out.write("                <!-- Page Content -->\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <!-- Dynamic Table Full -->\n");
      out.write("                    <div class=\"block\">\n");
      out.write("                        <div class=\"block-header\">\n");
      out.write("                            <h3 class=\"block-title\">Change Password Details</h3>\n");
      out.write("                            ");
                                         if (request.getParameter("error") != null) {
                                    if (request.getParameter("error").equals("0")) {
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger alert-dismissable\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>\n");
      out.write("                                <p>Opps! Invalid Login Details. Try Again.</p>\n");
      out.write("                            </div>\n");
      out.write("                            ");
 } else if (request.getParameter("error").equals("1")) {
      out.write("\n");
      out.write("                            <div class=\"alert alert-success alert-dismissable\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>\n");
      out.write("                                <p>Password Changed Successfully.</p>\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"block-content\">\n");
      out.write("                            <!-- DataTables init on table by adding .js-dataTable-full class, functionality initialized in js/pages/base_tables_datatables.js -->\n");
      out.write("                            <form class=\"js-validation-bootstrap form-horizontal\" Action=\"CheckPassword.jsp?uid\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"val-username\">Old Password:<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <div class=\"col-md-7\">\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" id=\"val-username\" name=\"txtoldpwd\" placeholder=\"Enter Password\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"val-username\">New Password:<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <div class=\"col-md-7\">\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" id=\"val-username\" name=\"txtnewpwd\" placeholder=\"Enter New Password\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"val-username\">Retype Password:<span class=\"text-danger\">*</span></label>\n");
      out.write("                                    <div class=\"col-md-7\">\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" id=\"val-username\" name=\"txtretypepwd\" placeholder=\"Retype New Password\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-8 col-md-offset-4\">\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary\" type=\"submit\">Submit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END Dynamic Table Full -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END Page Content -->\n");
      out.write("            </main>\n");
      out.write("            <!-- END Main Container -->\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            ");
      out.write("<footer id=\"page-footer\" class=\"content-mini content-mini-full font-s12 bg-gray-lighter clearfix\">\n");
      out.write("\n");
      out.write("    <div class=\"pull-left\">\n");
      out.write("        <a class=\"font-w600\" href=\"javascript:void(0)\" target=\"_blank\">Timetable</a> &copy; \n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("            <!-- END Footer -->\n");
      out.write("            ");
      out.write("<script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.scrollLock.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.appear.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.countTo.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.placeholder.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/js.cookie.min.js\"></script>\n");
      out.write("<script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page JS Plugins -->\n");
      out.write("<script src=\"assets/js/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page JS Code -->\n");
      out.write("<script src=\"assets/js/pages/base_tables_datatables.js\"></script>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- END Page Container -->\n");
      out.write("\n");
      out.write("        <!-- Apps Modal -->\n");
      out.write("        <!-- Opens from the button in the header -->\n");
      out.write("\n");
      out.write("        <!-- END Apps Modal -->\n");
      out.write("\n");
      out.write("        <!-- ");
      out.write("<script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.scrollLock.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.appear.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.countTo.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/jquery.placeholder.min.js\"></script>\n");
      out.write("<script src=\"assets/js/core/js.cookie.min.js\"></script>\n");
      out.write("<script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page JS Plugins -->\n");
      out.write("<script src=\"assets/js/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page JS Code -->\n");
      out.write("<script src=\"assets/js/pages/base_tables_datatables.js\"></script>");
      out.write(" -->\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
