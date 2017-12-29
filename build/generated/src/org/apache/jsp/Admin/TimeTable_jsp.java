package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.sql.ResultSet;
import Source.DataManager;

public final class TimeTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    ArrayList<Integer> arrayListTotalSubLec = new ArrayList<Integer>();
    ArrayList<HashMap<String, Integer>> arrayList1 = new ArrayList<HashMap<String, Integer>>();
    String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int nooflectures[] = {3, 3, 3, 4, 3, 3};

    boolean checkLectureInDay(int subid, HashMap<String, Integer> hashMap) {
        if (hashMap.containsValue(subid)) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkLectureCountInWeek(int subid, int total) {
        int count = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            for (int j = 0; j < nooflectures[i]; i++) {
                if (hashMap.get("" + i).equals(subid)) {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');


    ResultSet rsSubject = DataManager.getdata("Select * from subject");

    while (rsSubject.next()) {
        arrayList.add(rsSubject.getInt(1));
        arrayListTotalSubLec.add(rsSubject.getInt(5));
    }
    int subjectid = 0;
    for (int i = 0; i < 6; i++) {
        HashMap<String, Integer> timeTable = new HashMap<String, Integer>();
        for (int j = 0; j < nooflectures[i]; j++) {
            Random r1 = new Random();
            do {
                subjectid = r1.nextInt(8);
                out.println(subjectid);
                out.println(checkLectureInDay(subjectid, timeTable));
            } while (!checkLectureInDay(subjectid, timeTable) && !checkLectureCountInWeek(subjectid, arrayListTotalSubLec.get(i)));
            timeTable.put("" + i, subjectid);
        }
        arrayList1.add(timeTable);
    }
    out.println(arrayList1.toString());

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
