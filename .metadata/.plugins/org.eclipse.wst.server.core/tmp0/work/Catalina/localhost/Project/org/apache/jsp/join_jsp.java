/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-13 04:49:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<!--부트스트랩은 어떤device로 접속하더라도 해상도에 맞게 알아서 설정되는 탬플릿이다. -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\" , initial-scale=\"1\">\n");
      out.write("<!--스타일시트를 참조, 주소는 css안에 부트스트랩.css-->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<title>회원가입</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- 네비게이션 구현 네비게이션이라는 것은 하나의 웹사이트의 전반적인 구성을 보여주는 역할 -->\n");
      out.write("	<nav class=\"navbar navbar-default\">\n");
      out.write("		<!-- header부분을 먼저 구현해 주는데 홈페이지의 로고같은것을 담는 영역이라고 할 수 있다. -->\n");
      out.write("		<div class=\"navbar-header\">\n");
      out.write("			<!-- <1>웹사이트 외형 상의 제일 좌측 버튼을 생성해준다. data-target= 타겟명을 지정해주고-->\n");
      out.write("			<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\n");
      out.write("				aria-exmaple=\"false\">\n");
      out.write("				<span class=\"icon-bar\"></span>\n");
      out.write("				<span class=\"icon-bar\"></span>\n");
      out.write("				<span class=\"icon-bar\"></span>\n");
      out.write("			</button>\n");
      out.write("			<!-- 여긴 웹페이지의 로고 글자를 지정해준다. 클릭 시 main.jsp로 이동하게 해주는게 국룰 -->\n");
      out.write("			<a class=\"navbar-brand\" href=\"main.jsp\">JSP 게시판 웹 사이트</a>\n");
      out.write("		</div>\n");
      out.write("		<!-- 여기서 <1>에만든 버튼 내부의 데이터 타겟과 div id가 일치해야한다. -->\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("			<!-- div 내부에 ul은 하나의 어떠한 리스트를 보여줄때 사용 -->\n");
      out.write("			<ul class=\"nav navbar-nav\">\n");
      out.write("			<!-- 리스트 내부에 li로 원소를 구현 메인으로 이동하게만들고-->\n");
      out.write("				<li><a href=\"main.jsp\">메인</a></li>\n");
      out.write("			<!-- 게시판으로 이동하게 만든다. -->	\n");
      out.write("				<li><a href=\"bbs.jsp\">게시판</a></li>\n");
      out.write("			</ul>\n");
      out.write("			<!-- 리스트 하나 더 생성 웹페이지 화면에서 우측 부분-->\n");
      out.write("			<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("			<!-- 원소를 하나 구현해 준다. 네비게이션 우측 슬라이드메뉴 구현  -->\n");
      out.write("				<li class=\"dropdown\">\n");
      out.write("					<!-- 안에 a태그를 하나 삽입한다. href=\"#\"은 링크없음을 표시한다. -->\n");
      out.write("					<a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("						data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("						aria-expanded=\"false\">접속하기<span class=\"caret\"></span></a>\n");
      out.write("					<!--접속하기 아래에 드랍다운메뉴 생성  -->\n");
      out.write("					<ul class=\"dropdown-menu\">\n");
      out.write("						<!-- li class=\"active\" 현재 선택된 홈페이지를 의미 -->\n");
      out.write("						<li><a href=\"login.jsp\">로그인</a></li>\n");
      out.write("						<li class=\"active\"><a href=\"join.jsp\">회원가입</a></li>\n");
      out.write("					</ul>\n");
      out.write("				</li>\n");
      out.write("			</ul>	\n");
      out.write("		</div>\n");
      out.write("		<!-- 네비게이션 바 구성 끝 -->\n");
      out.write("	</nav>\n");
      out.write("	<!-- 하나의 컨테이너처럼 감싸주는 역할 -->\n");
      out.write("	<div class=\"container\"> \n");
      out.write("		<div class=\"col-lg-4\"></div>\n");
      out.write("		<!-- 회원가입 폼은 위의 양식은 일치하며, 이제 내부 폼만 바꿔준다. -->\n");
      out.write("		<div class=\"col-lg-4\">\n");
      out.write("			<div class=\"jumbotron\" style=\"padding-top: 20px;\">\n");
      out.write("				<!-- 양식 삽입 post는 회원가입이나 로그인같이 어떠한 정보값을 숨기면서 보내는 메소드/ 로그인 Action페이지로 정보를보내겠다-->\n");
      out.write("				<form method=\"post\" action=\"joinAction.jsp\">\n");
      out.write("					<!-- 회원 가입에 맞게 위에 액션은 joinAction페이지로 밑에 제목은 회원가입 화면으로 변경 -->\n");
      out.write("					<h3 style=\"text-align: center;\">회원가입 화면</h3>\n");
      out.write("					<div class=\"form-group\">\n");
      out.write("						<!-- 회원 가입에서도 userID or userPassword는 동일하게 가져가고, 회원가입에 필요한 나머지 속성추가 -->\n");
      out.write("						<input type=\"text\" class=\"form-control\" placeholder=\"아이디\" name=\"userID\" maxlength=\"20\">\n");
      out.write("					</div>\n");
      out.write("					<div class=\"form-group\">\n");
      out.write("						<input type=\"password\" class=\"form-control\" placeholder=\"비밀번호\" name=\"userPassword\" maxlength=\"20\">\n");
      out.write("					</div>\n");
      out.write("					<!-- userName 추가 -->\n");
      out.write("					<div class=\"form-group\">\n");
      out.write("						<input type=\"text\" class=\"form-control\" placeholder=\"이름\" name=\"userName\" maxlength=\"20\">\n");
      out.write("					</div>\n");
      out.write("					<!-- 성별 선택 추가 -->\n");
      out.write("					<div class=\"form-group\" style=\"text-align: center;\">\n");
      out.write("						<!-- 버튼 공간을 따로 마련해준다.(남,녀) -->\n");
      out.write("						<div class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("							<!-- 선택이 된곳에 표시를 하는 active를 설정해준다. -->\n");
      out.write("							<label class=\"btn btn-primary active\">\n");
      out.write("								<input type=\"radio\" name=\"userGender\" autocomplete=\"off\" value=\"남자\" checked>남자 \n");
      out.write("							</label>\n");
      out.write("							<label class=\"btn btn-primary\">\n");
      out.write("								<input type=\"radio\" name=\"userGender\" autocomplete=\"off\" value=\"여자\" checked>여자 \n");
      out.write("							</label>\n");
      out.write("							</div>\n");
      out.write("							<!-- 성별 선택부분 완료 -->\n");
      out.write("							</div>\n");
      out.write("							<!-- email 작성부분 구현 -->\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("						<!-- placeholder는 아무런 입력이 없을때 띄워주는 값 -->\n");
      out.write("						<input type=\"email\" class=\"form-control\" placeholder=\"이메일\" name=\"userEmail\" maxlength=\"20\">\n");
      out.write("						</div>\n");
      out.write("						<!-- 버튼 또한 회원가입으로 value변경 -->	\n");
      out.write("						<input type=\"submit\" class=\"btn btn-primary form-control\" value=\"회원가입\">\n");
      out.write("					</form>	\n");
      out.write("				</div>\n");
      out.write("			</div>	\n");
      out.write("			<div class=\"col-lg-4\"></div>\n");
      out.write("		</div>\n");
      out.write("	<!-- 애니메이션을 담당하게 될 자바스크립트 참조 -->\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("	<!-- 특정홈페이지에서 제이쿼리 호출 -->\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\n");
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
