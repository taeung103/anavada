/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-12 11:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.jboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jboard.model.vo.Jboard;
import java.util.ArrayList;
import java.sql.Date;
import java.awt.Image;
import java.awt.Image;
import com.sun.jimi.core.Jimi;
import com.sun.jimi.core.JimiException;
import com.sun.jimi.core.JimiUtils;
import member.model.vo.Member;
import member.model.vo.Member;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/jboard/../include/head.jsp", Long.valueOf(1597202946277L));
    _jspx_dependants.put("/views/jboard/../include/footer.jsp", Long.valueOf(1596761427404L));
    _jspx_dependants.put("/views/jboard/../include/header.jsp", Long.valueOf(1597203026787L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.awt.Image");
    _jspx_imports_classes.add("com.sun.jimi.core.JimiException");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("com.sun.jimi.core.Jimi");
    _jspx_imports_classes.add("com.sun.jimi.core.JimiUtils");
    _jspx_imports_classes.add("jboard.model.vo.Jboard");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" ");

 	ArrayList<Jboard> list = (ArrayList<Jboard>) request.getAttribute("list");
   int listCount = ((Integer) request.getAttribute("listCount")).intValue();
   int startPage = ((Integer) request.getAttribute("startPage")).intValue();
   int endPage = ((Integer) request.getAttribute("endPage")).intValue();
   int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
   int currentPage = ((Integer) request.getAttribute("page")).intValue();
   	String titleSearch = request.getParameter("titlesearch");
	String local = request.getParameter("local"); 
    String listSearch = request.getParameter("listsearch");
	String[] localArr = { "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구" };

	
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<meta name=\"title\" content=\"Anavada\" />\r\n");
      out.write("<meta name=\"description\" content=\"Anavada 설명\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Anavada 키워드\" />\r\n");
      out.write("\r\n");
      out.write("<title>Anavada</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"/anavada/resources/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"/anavada/resources/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/common.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/vegas.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/swiper.min.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/mainNotice.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--티스토리 불펌금지-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var omitformtags=[\"input\", \"textarea\", \"select\"]\r\n");
      out.write("    omitformtags=omitformtags.join(\"|\")\r\n");
      out.write("    function disableselect(e){\r\n");
      out.write("    if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)\r\n");
      out.write("        return false\r\n");
      out.write("    }\r\n");
      out.write("    function reEnable(){\r\n");
      out.write("        return true\r\n");
      out.write("    }\r\n");
      out.write("    if (typeof document.onselectstart!=\"undefined\")\r\n");
      out.write("        document.onselectstart=new Function (\"return false\")\r\n");
      out.write("    else{\r\n");
      out.write("        document.onmousedown=disableselect\r\n");
      out.write("        document.onmouseup=reEnable\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write('\r');
      out.write('\n');
 Member member = (Member)request.getAttribute("member"); 
      out.write(" \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("   function showWriteForm() {\r\n");
      out.write("      location.href = \"/anavada/views/jboard/product_write.jsp\";\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<!-- 상단메뉴 -->\r\n");
      out.write("    <dl class=\"gnbWrap clearfix\">\r\n");
      out.write("    \t<dt><h1><a href=\"/anavada/\" title=\"Anavada\">Anavada</a></h1></dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul class=\"gnb clearfix\">\r\n");
      out.write("                <li><a href=\"/anavada/jblist\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/clistview?page=1&local=0\">커뮤니티</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/fbklist\">지역축제</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/anavada/nlist\">고객센터</a>\r\n");
      out.write("                    <div class=\"subGnb\">\r\n");
      out.write("                        <a href=\"/anavada/nlist\">공지사항</a>\r\n");
      out.write("                        <a href=\"/anavada/views/notice/faq_list.jsp\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/ilist\">문의하기</a>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/dbolist\">권한관리</a>\r\n");
      out.write("                       ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <ul class=\"util\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form action=\"\" method=\"\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("                        <button class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/join_agree.jsp\">JOIN</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/login.jsp\">LOGIN</a></li>\r\n");
      out.write("                ");
 } else if(loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/views/admin/member/memberList.jsp\">관리자페이지</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/mypage.cp?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("\">MYPAGE</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                <li><i id=\"favorite\" class=\"xi-star-o\" title=\"즐겨찾기 등록\"></i></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dt>\r\n");
      out.write("    </dl>\r\n");
      out.write("    <!-- //상단메뉴 -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- 컨텐츠 -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas product-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">중고거래</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>중고거래</span></h2>\r\n");
      out.write("                    <h3>우리의 이웃과 중고거래를 통해 변화되는 세상</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("            <!--중고거래-->\r\n");
      out.write("            <div class=\"product_list\">\r\n");
      out.write("\r\n");
      out.write("                <!--종류 리스트-->\r\n");
      out.write("                <div class=\"sort-area\">  \r\n");
      out.write("                    <h4>전체 ");
      out.print(listCount);
      out.write("개</h4>\r\n");
      out.write("                     ");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("                    <button onclick=\"showWriteForm();\" class=\"write_btn\">글쓰기</button>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <form action=\"/anavada/jblist\" method=\"post\" id=\"sel\" name=\"form1\">\r\n");
      out.write("                        \r\n");
      out.write("                            지역선택 : <select name=\"local\" class=\"LocationSelect\"   onchange=this.form.submit()>\r\n");
      out.write("                            \t\r\n");
      out.write("                                    <option value=\"0\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"0\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">전체보기</option>\r\n");
      out.write("                                    <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"1\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">강남구</option>\r\n");
      out.write("                                    <option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"2\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">강동구</option>\r\n");
      out.write("                                    <option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"3\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">강북구</option>\r\n");
      out.write("                                    <option value=\"4\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"4\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">강서구</option>\r\n");
      out.write("                                    <option value=\"5\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"5\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">관악구</option>\r\n");
      out.write("                                    <option value=\"6\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"6\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">광진구</option>\r\n");
      out.write("                                    <option value=\"7\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"7\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">구로구</option>\r\n");
      out.write("                                    <option value=\"8\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"8\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">금천구</option>\r\n");
      out.write("                                    <option value=\"9\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"9\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">노원구</option>\r\n");
      out.write("                                    <option value=\"10\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"10\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">도봉구</option>\r\n");
      out.write("                                    <option value=\"11\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"11\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">동대문구</option>\r\n");
      out.write("                                    <option value=\"12\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"12\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">동작구</option>\r\n");
      out.write("                                    <option value=\"13\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"13\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">마포구</option>\r\n");
      out.write("                                    <option value=\"14\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"14\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">서대문구</option>\r\n");
      out.write("                                    <option value=\"15\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"15\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">서초구</option>\r\n");
      out.write("                                    <option value=\"16\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"16\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">성동구</option>\r\n");
      out.write("                                    <option value=\"17\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"17\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">성북구</option>\r\n");
      out.write("                                    <option value=\"18\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"18\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">송파구</option>\r\n");
      out.write("                                    <option value=\"19\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"19\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">양천구</option>\r\n");
      out.write("                                    <option value=\"20\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"20\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">영등포구</option>\r\n");
      out.write("                                    <option value=\"21\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"21\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">용산구</option>\r\n");
      out.write("                                    <option value=\"22\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"22\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">은평구</option>\r\n");
      out.write("                                    <option value=\"23\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"23\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">종로구</option>\r\n");
      out.write("                                    <option value=\"24\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"24\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">중구</option>\r\n");
      out.write("                                    <option value=\"25\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.local eq\"25\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">중랑구</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            목록 분류 : <select name=\"listsearch\" class=\"ListSelect\" onchange=this.form.submit()>\r\n");
      out.write("                                    <option value=\"latestposts\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.listsearch eq\"latestposts\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">최신등록순</option>\r\n");
      out.write("                                    <option value=\"highprice\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.listsearch eq\"highprice\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">가격높은순</option>\r\n");
      out.write("                                    <option value=\"lowprice\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.listsearch eq\"lowprice\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">가격낮은순</option>\r\n");
      out.write("                                    <option value=\"highlike\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.listsearch eq\"highlike\"?\"selected\" :\"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">좋아요순</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            \r\n");
      out.write("                            <input type=\"text\" name=\"titlesearch\" maxlength=\"16\" minlength=\"2\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("                            <button class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("                            \r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"product\">\r\n");
      out.write("                ");
 for (Jboard jboard : list ){ 
      out.write("\r\n");
      out.write("                    <li onclick=\"location.href='/anavada/jbdetail?jboardno=");
      out.print( jboard.getJboardNo() );
      out.write("&page=");
      out.print(currentPage);
      out.write("'\">\r\n");
      out.write("                    ");
 if (jboard.getJboardRenameFilePath1() !=null){
      out.write("\r\n");
      out.write("                        <div><img src=\"/anavada/resources/jboardfiles/");
      out.print(jboard.getJboardRenameFilePath1());
      out.write("\"/></div>\r\n");
      out.write("                        ");
}else{ 
      out.write("\r\n");
      out.write("                        <div><img src=\"/anavada/resources/jboardfiles/test.jpg\"/></div>\r\n");
      out.write("                        ");
}  
      out.write("\r\n");
      out.write("                        <h2>");
      out.print( jboard.getJboardTitle());
      out.write("</h2>\r\n");
      out.write("                        <h3>");
      out.print(jboard.getJboardPrice() );
      out.write("<span> 원 ");
      out.print(jboard.getLocalNo() );
      out.write("</span></h3>\r\n");
      out.write("                       \r\n");
      out.write("                        <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>");
      out.print(jboard.getJboardLike() );
      out.write("</span></i>\r\n");
      out.write("                        <span>");
      out.print(localArr[Integer.parseInt(jboard.getLocalNo())-1]);
      out.write("</span>\r\n");
      out.write("                        \r\n");
      out.write("                        </p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"list-no\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"write-btn\">\r\n");
      out.write("                ");
 if (loginMember != null){ 
      out.write("\r\n");
      out.write("                    <a><button onclick=\"showWriteForm();\" class=\"write_btn\">글쓰기</button></a>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--  페이징 처리 -->\r\n");
      out.write("            <dl class=\"list-paging pb80\">\r\n");
      out.write("                <dd>\r\n");
      out.write("                \t");
 if (currentPage <= 1){ 
      out.write("\r\n");
      out.write("              \t\t<a><i class= \"glyphicon glyphicon-backward\"></i></a>\r\n");
      out.write("              \t\t");
}else {
      out.write("\r\n");
      out.write("              \t\t<a href=\"/anavada/jblist?page=1&local=");
      out.print(local);
      out.write("&listsearch=");
      out.print(listSearch);
      out.write("&titlesearch=");
      out.print(titleSearch);
      out.write("\"><i class= \"glyphicon glyphicon-backward\"></i></a>\r\n");
      out.write("              \t\t");
} 
      out.write("\r\n");
      out.write("              \t\t");
 if (startPage -1 >=10 ){ 
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/jblist?page=");
      out.print( startPage- 10);
      out.write("&local=");
      out.print(local);
      out.write("&listsearch=");
      out.print(listSearch);
      out.write("&titlesearch=");
      out.print(titleSearch);
      out.write("\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 현재 페이지가 속한 페이지 그룹의 숫자 출력처리 -->\r\n");
      out.write("\t\t\t\t\t");
 for (int p = startPage; p <= endPage; p++){
						if (p == currentPage){
      out.write("\r\n");
      out.write("                    <a href=\"#none\" class=\"active\">");
      out.print(p );
      out.write("</a>\r\n");
      out.write("                    ");
} else {
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/jblist?page=");
      out.print(p);
      out.write("&local=");
      out.print(local);
      out.write("&listsearch=");
      out.print(listSearch);
      out.write("&titlesearch=");
      out.print(titleSearch);
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</a>\r\n");
      out.write("                    ");
}} 
      out.write("\r\n");
      out.write("                    <!--  다음 그룹으로 이동처리 -->\r\n");
      out.write("                    ");
 if (endPage +10 <= maxPage){ 
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/jblist?page=");
      out.print( endPage + 10 );
      out.write("&local=");
      out.print(local);
      out.write("&listsearch=");
      out.print(listSearch);
      out.write("&titlesearch=");
      out.print(titleSearch);
      out.write("\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if (currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("                    <a><i class=\"glyphicon glyphicon-forward\"></i></a>\r\n");
      out.write("                    ");
}else{ 
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/jblist?page=");
      out.print(maxPage);
      out.write("&local=");
      out.print(local);
      out.write("&listsearch=");
      out.print(listSearch);
      out.write("&titlesearch=");
      out.print(titleSearch);
      out.write("\"><i class=\"glyphicon glyphicon-forward\"></i> </a>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("            <!-- 페이지넘버 끝 -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <a href=\"../etc/terms.jsp\">이용약관</a>\r\n");
      out.write("            <a href=\"../etc/privacy.jsp\">개인정보처리방침</a>\r\n");
      out.write("            <a href=\"../etc/email.jsp\">이메일무단수집거부</a>\r\n");
      out.write("        </dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("        \tAnavada | 서울특별시 중구 남대문로 120 대일빌딩 2F, 3F | 대표자 : 공유 | 개인정보 담당자 : 강동원 | 고객센터 : 1577-7777<br/>\r\n");
      out.write("            <span>Copyright 2020. Anavada. All Rights Reserved</span>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </div>\r\n");
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
