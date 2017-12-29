package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuSiderbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
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
      out.write("            </div></nav>\n");
      out.write("\n");
      out.write("        ");
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
