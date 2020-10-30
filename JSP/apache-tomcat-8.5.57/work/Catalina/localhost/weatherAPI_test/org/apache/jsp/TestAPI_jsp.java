/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-13 10:07:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dto.LeportsDTO;
import java.util.List;

public final class TestAPI_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.dto.LeportsDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <a href=\"#\" value=\"서울\">서울</a>\r\n");
      out.write(" <a href=\"#\" value=\"울산\">울산</a>\r\n");
      out.write(" <table border=\"1\">\r\n");
      out.write(" ");
 
 	List<LeportsDTO> list = (List<LeportsDTO>)request.getAttribute("leportsList");
 	System.out.println("jsp"+list.size());
 	String cityname = null;
 	for(int i=0; i<list.size(); i++) {
 		LeportsDTO dto = list.get(i);
 		cityname = dto.getCityname();
 		String category = dto.getCategory();	
 		String content = dto.getContent();
 		int price = dto.getPrice();
 		String address = dto.getAddress();
 		int leportsnum = dto.getLeportsnum();
 		
 
      out.write("\r\n");
      out.write(" \t\t\t<tr>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(cityname );
      out.write("</td>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(category );
      out.write("</td>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(content );
      out.write("</td>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(price );
      out.write("</td>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(address );
      out.write("</td>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(leportsnum );
      out.write("</td>\r\n");
      out.write(" \t\t\t</tr>\r\n");
      out.write(" \t\t");
 } //end for
 		System.out.println(cityname);
 		String lat = null;
 		String lon = null;
 			if(cityname.equals("서울")) {
 				lat = "37.56826";
 				lon = "126.977829";
 			} else if(cityname.equals("울산")) {
 				lat = "35.53722";
 				lon = "129.31666";
 				
 			}// end if~else if
 			
 			System.out.println(lat+"\t"+lon);
 		
      out.write("\r\n");
      out.write(" \t\t</table>\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t<script type=\"text/javascript\">\r\n");
      out.write(" \t\t$.getJSON('https://api.openweathermap.org/data/2.5/onecall?lat=");
      out.print(lat);
      out.write("&lon=");
      out.print(lon);
      out.write("&units=metric&appid=144272f181757812877b45c51ddea3c4&lang=kr',function(data){\r\n");
      out.write(" \t\t\t//data로 할일\r\n");
      out.write(" \t\t\tconsole.log();\r\n");
      out.write(" \t\t\tvar cTemp=data.current.temp;\r\n");
      out.write(" \t\t\tvar cClouds=data.current.clouds;\r\n");
      out.write(" \t\t\tvar cHumidiy=data.current.humidity;\r\n");
      out.write(" \t\t\tvar cicon=data.current.weather[0].icon;\r\n");
      out.write(" \t\t\tvar cdescription=data.current.weather[0].description;\r\n");
      out.write(" \t\t\t$(\".cTemp\").append(Math.round(cTemp));\r\n");
      out.write(" \t\t\t$(\".cClouds\").append(Math.round(cClouds));\r\n");
      out.write(" \t\t\t$(\".cHumidiy\").append(Math.round(cHumidiy));\r\n");
      out.write(" \t\t\t$(\".cicon\").append(\"<img src='http://openweathermap.org/img/wn/\"+cicon+\".png'>\");\r\n");
      out.write(" \t\t\t$(\".cdescription\").prepend(cdescription);\r\n");
      out.write(" \t\t});\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t</script>\r\n");
      out.write(" \t\t<h1>weather api</h1>\r\n");
      out.write("\t<div class=\"city\">도시이름: ");
      out.print(cityname );
      out.write("</div>\r\n");
      out.write("\t<div class=\"cTemp\">현재 온도: </div>\r\n");
      out.write("\t<div class=\"cClouds\">현재 날씨 : </div>\r\n");
      out.write("\t<div class=\"cHumidiy\">습도 : </div>\r\n");
      out.write("\t<div class=\"cicon\"><span class=\"cdescription\"></span></div>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \t$(\"a\").on(\"click\", function() {\r\n");
      out.write(" \t\tconst cityName = $(this).attr(\"value\");\r\n");
      out.write(" \t\tlocation.href=\"TestMainServlet?cityName=\"+cityName;\r\n");
      out.write(" \t});\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}