/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-15 02:36:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class bbs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.io.PrintWriter");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\", initial-scale=\"1\" >  <!-- 반응형 웹에 사용하는 메타태그 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"> <!-- 참조  -->\n");
      out.write("<title>JSP 게시판 웹 사이트</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
 
    String userID = null;
    if (session.getAttribute("userID") != null){
        userID = (String) session.getAttribute("userID");
    }
    
      out.write("\n");
      out.write("    <nav class =\"navbar navbar-default\">\n");
      out.write("        <div class=\"navbar-header\"> <!-- 홈페이지의 로고 -->\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("                data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\n");
      out.write("                aria-expand=\"false\">\n");
      out.write("                <span class =\"icon-bar\"></span> <!-- 줄였을때 옆에 짝대기 -->\n");
      out.write("                <span class =\"icon-bar\"></span>\n");
      out.write("                <span class =\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class =\"navbar-brand\" href=\"main.jsp\">JSP 게시판 웹 사이트</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"main.jsp\">메인</a></li> <!-- 메인 페이지 -->\n");
      out.write("                <li class=\"active\"><a href=\"bbs.jsp\">게시판</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");

            	if (userID == null){
            
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class = \"dropdown-toggle\"\n");
      out.write("                    data-toggle=\"dropdown\" role =\"button\" \n");
      out.write("                    aria-haspopup=\"true\"\n");
      out.write("                    aria-expanded=\"false\">접속하기<span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"login.jsp\">로그인</a></li>\n");
      out.write("                        <li><a href=\"join.jsp\">회원가입</a></li>                    \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            ");

            	}else{
            
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class = \"dropdown-toggle\"\n");
      out.write("                    data-toggle=\"dropdown\" role =\"button\" \n");
      out.write("                    aria-haspopup=\"true\"\n");
      out.write("                    aria-expanded=\"false\">회원관리<span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"logoutAction.jsp\">로그아웃</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            ");
 
            	}
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class= \"container\">\n");
      out.write("    	<div= \"row\">\n");
      out.write("    	    <table class= \"table table-stripped\" style= \"text-align: center; boarder: 1px solid #dddddd\">\n");
      out.write("    	    	<thead>\n");
      out.write("    	    	<tr>\n");
      out.write("    	    		<th style= \"background-color: #eeeeee; text-align: center;\">번호</th>\n");
      out.write("    	    		<th style= \"background-color: #eeeeee; text-align: center;\">제목</th>\n");
      out.write("    	    		<th style= \"background-color: #eeeeee; text-align: center;\">작성자</th>\n");
      out.write("    	    		<th style= \"background-color: #eeeeee; text-align: center;\">작성일</th>\n");
      out.write("    	    	</tr>\n");
      out.write("    	    	</thead>\n");
      out.write("    	    	<tbody>\n");
      out.write("    	    		<tr>\n");
      out.write("    	    			<td>1</td>\n");
      out.write("    	    			<td>안녕하3</td>\n");
      out.write("    	    			<td>이재원</td>\n");
      out.write("    	    			<td>1111-11-11</td>\n");
      out.write("    	    		</tr>\n");
      out.write("    	    	</tbody>\n");
      out.write("    	    </table>\n");
      out.write("    	    <a href= \"write.jsp\" class= \"btn btn-primary pull-right\">게시글 작성</a>\n");
      out.write("    	</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
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
