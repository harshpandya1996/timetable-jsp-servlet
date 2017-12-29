package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerNavigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
