package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 9]>         <html class=\"ie9 no-focus\"> <![endif]-->\n");
      out.write("<!--[if gt IE 9]><!--> <html class=\"no-focus\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Timetable Generator</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"OneUI - Admin Dashboard Template & UI Framework created by pixelcave and published on Themeforest\">\n");
      out.write("    <a href=\"login.jsp\"></a>\n");
      out.write("    <meta name=\"author\" content=\"pixelcave\">\n");
      out.write("    <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1.0\">\n");
      out.write("\n");
      out.write("    <!-- Icons -->\n");
      out.write("    <!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicons/favicon.png\">\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-160x160.png\" sizes=\"160x160\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicons/favicon-192x192.png\" sizes=\"192x192\">\n");
      out.write("\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"assets/img/favicons/apple-touch-icon-57x57.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"assets/img/favicons/apple-touch-icon-60x60.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"assets/img/favicons/apple-touch-icon-72x72.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/favicons/apple-touch-icon-76x76.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"assets/img/favicons/apple-touch-icon-114x114.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"assets/img/favicons/apple-touch-icon-120x120.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"assets/img/favicons/apple-touch-icon-144x144.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"assets/img/favicons/apple-touch-icon-152x152.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/img/favicons/apple-touch-icon-180x180.png\">\n");
      out.write("    <!-- END Icons -->\n");
      out.write("\n");
      out.write("    <!-- Stylesheets -->\n");
      out.write("    <!-- Web fonts -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400italic,600,700%7COpen+Sans:300,400,400italic,600,700\">\n");
      out.write("\n");
      out.write("    <!-- OneUI CSS framework -->\n");
      out.write("    <link rel=\"stylesheet\" id=\"css-main\" href=\"assets/css/oneui.css\">\n");
      out.write("\n");
      out.write("    <!-- You can include a specific file from css/themes/ folder to alter the default color theme of the template. eg: -->\n");
      out.write("    <!-- <link rel=\"stylesheet\" id=\"css-theme\" href=\"assets/css/themes/flat.min.css\"> -->\n");
      out.write("    <!-- END Stylesheets -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Login Content -->\n");
      out.write("    <div class=\"content overflow-hidden\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4\">\n");
      out.write("                <!-- Login Block -->\n");
      out.write("                <div class=\"block block-themed animated fadeIn\">\n");
      out.write("                    <div class=\"block-header bg-primary\">\n");
      out.write("                        <ul class=\"block-options\">\n");
      out.write("                            <li>\n");
      out.write("                               <!-- <a href=\"ForgotPassword.jsp\">Forgot Password</a>-->\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h3 class=\"block-title\">Login</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"block-content block-content-full block-content-narrow\">\n");
      out.write("                        <!-- Login Title -->\n");
      out.write("                        <h1 class=\"h2 font-w600 push-30-t push-5\">Timetable Generator</h1>\n");
      out.write("                        <p>Welcome, please login.</p>\n");
      out.write("                        ");

                            if (request.getParameter("error") != null) {
                                if (request.getParameter("error").equals("0")) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissable\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>\n");
      out.write("                            <p>Opps! Invalid Login Details. Try Again.</p>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- END Login Title -->\n");
      out.write("\n");
      out.write("                        <!-- Login Form -->\n");
      out.write("                        <!-- jQuery Validation (.js-validation-login class is initialized in js/pages/base_pages_login.js) -->\n");
      out.write("                        <!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->\n");
      out.write("                        <form class=\"js-validation-login form-horizontal push-30-t push-50\" action=\"checkLogin.jsp\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-xs-12\">\n");
      out.write("                                    <div class=\"form-material form-material-primary floating\">\n");
      out.write("                                        <input class=\"form-control\" type=\"email\" required=\"\" id=\"login-username\" name=\"username\">\n");
      out.write("                                        <label for=\"login-username\">Email</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-xs-12\">\n");
      out.write("                                    <div class=\"form-material form-material-primary floating\">\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" id=\"login-password\" name=\"password\">\n");
      out.write("                                        <label for=\"login-password\">Password</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-xs-12\">\n");
      out.write("                                    <label class=\"css-input switch switch-sm switch-primary\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"login-remember-me\" name=\"login-remember-me\"><span></span> Remember Me?\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-xs-12 col-sm-6 col-md-4\">\n");
      out.write("                                    <button class=\"btn btn-block btn-primary\" type=\"submit\"><i class=\"si si-login pull-right\"></i> Log in</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!-- END Login Form -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- END Login Block -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- END Login Content -->\n");
      out.write("\n");
      out.write("    <!-- Login Footer -->\n");
      out.write("    <div class=\"push-10-t text-center animated fadeInUp\">\n");
      out.write("        <small class=\"text-muted font-w600\">&copy; Timetable</small>\n");
      out.write("    </div>\n");
      out.write("    <!-- END Login Footer -->\n");
      out.write("\n");
      out.write("    <!-- OneUI Core JS: jQuery, Bootstrap, slimScroll, scrollLock, Appear, CountTo, Placeholder, Cookie and App.js -->\n");
      out.write("    <script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/jquery.scrollLock.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/jquery.appear.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/jquery.countTo.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/jquery.placeholder.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/core/js.cookie.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page JS Plugins -->\n");
      out.write("    <script src=\"assets/js/plugins/jquery-validation/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page JS Code -->\n");
      out.write("    <script src=\"assets/js/pages/base_pages_login.js\"></script>\n");
      out.write("</body>\n");
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
