/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-07 07:28:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.fboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class areaEvent_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/fboard/../include/header.jsp", Long.valueOf(1596767651006L));
    _jspx_dependants.put("/views/fboard/../include/footer.jsp", Long.valueOf(1596688113526L));
    _jspx_dependants.put("/views/fboard/../include/head.jsp", Long.valueOf(1596522788854L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("</script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\"\r\n");
      out.write("\tondragstart=\"return false\">\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<!-- 상단메뉴 -->\r\n");
      out.write("    <dl class=\"gnbWrap clearfix\">\r\n");
      out.write("    \t<dt><h1><a href=\"/anavada/\" title=\"Anavada\">Anavada</a></h1></dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul class=\"gnb clearfix\">\r\n");
      out.write("                <li><a href=\"/anavada/jblist\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/clistview\">커뮤니티</a></li>\r\n");
      out.write("                <li><a href=\"../fboard/areaEvent_list.jsp\">지역축제</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/anavada/nlist\">고객센터</a>\r\n");
      out.write("                    <div class=\"subGnb\">\r\n");
      out.write("                        <a href=\"/anavada/nlist\">공지사항</a>\r\n");
      out.write("                        <a href=\"/anavada/flist\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/views/inquiry/inquiry_list.jsp\">문의하기</a>\r\n");
      out.write("                        <a href=\"../declare/declare_list.jsp\">신고하기</a>\r\n");
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
      out.write("                <li><a class=\"hover_line01\" href=\"../admin/member/memberList.jsp\">관리자페이지</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/MyInfoModify.jsp\">MYPAGE</a></li>\r\n");
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
      out.write("\t\t<!-- 컨텐츠 -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--서브 비주얼/타이틀-->\r\n");
      out.write("\t\t\t<div class=\"visual-sub-vagas areaEvent-vagas\">\r\n");
      out.write("\t\t\t\t<div class=\"vsv-copy sub-title\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#none\">홈</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#none\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">지역축제</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<span>지역축제</span>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<h3>우리의 이웃과 'Anavada'를 통해 소통할 수 있는 공간입니다.</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 리스트 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"areaEvent_list\">\r\n");
      out.write("\t\t\t\t<div class=\"areaEvent_map\">\r\n");
      out.write("\t\t\t\t\t<!-- <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3162.453554125798!2d126.98089706565142!3d37.56793627979763!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca2eee632d73f%3A0x15cc2733ad91fd28!2zS0gg7KCV67O06rWQ7Jyh7JuQ!5e0!3m2!1sko!2skr!4v1595997675697!5m2!1sko!2skr\" width=\"100%\" height=\"300\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe></div> -->\r\n");
      out.write("\t\t\t\t\t<div id=\"map\" style=\"width: 100%; height: 500px;\"></div>\r\n");
      out.write("\t\t\t\t\t<script src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=53d444db7d449eb66c0229426868cf97\"></script>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tvar mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("\t\t\t\t\t\tmapOption = {\r\n");
      out.write("\t\t\t\t\t\t\tcenter : new kakao.maps.LatLng(37.5311008, 126.9810742), // 지도의 중심좌표\r\n");
      out.write("\t\t\t\t\t\t\tlevel : 8, // 지도의 확대 레벨\r\n");
      out.write("\t\t\t\t\t\t\tmapTypeId : kakao.maps.MapTypeId.ROADMAP\r\n");
      out.write("\t\t\t\t\t\t// 지도종류\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// 지도를 생성한다 \r\n");
      out.write("\t\t\t\t\t\tvar map = new kakao.maps.Map(mapContainer, mapOption);\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t<!--종류 리스트-->\r\n");
      out.write("\t\t\t\t\t<div class=\"sort-area\">\r\n");
      out.write("\t\t\t\t\t\t<h4>전체 150개</h4>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"areaEvent_write.jsp\" class=\"write_btn\">글쓰기</a>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"\" method=\"\" id=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t지역 분류 : <select name=\"\" class=\"LocationSelect\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"지역선택\" selected=\"selected\">지역선택</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">강남구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">강동구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">강북구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"4\">강서구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"5\">관악구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"6\">광진구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"7\">구로구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8\">금천구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"9\">노원구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"10\">도봉구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"11\">동대문구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"12\">동작구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"13\">마포구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"14\">서대문구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"15\">서초구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"16\">성동구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"17\">성북구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"18\">송파구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"19\">양천구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"20\">영등포구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"21\">용산구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"22\">은평구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"23\">종로구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"24\">중구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"25\">중랑구</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> <select name=\"\" class=\"ListSelect\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"분류 선택\" selected=\"selected\">분류 선택</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"제목\">제목</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"내용\">내용</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"작성자\">작성자</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"작성자\">조회순</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"작성자\">마감순</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> <input type=\"text\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"top-search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"xi-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table class=\"cmnt_list\">\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>여우樂 페스티벌 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t보여 줄 것이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">9</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 중구</span>서울 물순환 시민문화제 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t대표 축제이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">8</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>비건페스타 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t수 있는 국내 최대 비건 전문 전시회입니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">7</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>여우樂 페스티벌 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t보여 줄 것이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">6</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 중구</span>서울 물순환 시민문화제 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t대표 축제이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>비건페스타 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t수 있는 국내 최대 비건 전문 전시회입니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">4</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>여우樂 페스티벌 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t보여 줄 것이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">3</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 중구</span>서울 물순환 시민문화제 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t대표 축제이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>비건페스타 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t수 있는 국내 최대 비건 전문 전시회입니다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr onclick=\"location.href='areaEvent_view.jsp';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"number\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"sum\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"150px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>서울시 종로구</span>여우樂 페스티벌 2020\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t보여 줄 것이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>작성자 : 홍길동</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>축제기간 : 2020.07.30 ~ 2020.08.30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>조회수 : 30</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"list-no\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/anavada/resources/images/btnIcn/icn_big_listNo.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<h1>목록이 없습니다.</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"write-btn\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"areaEvent_write.jsp\">글쓰기</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 리스트 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 페이지넘버 -->\r\n");
      out.write("\t\t\t\t<dl class=\"list-paging pb80\">\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#none\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#none\" class=\"active\">1</a> <a href=\"#none\">2</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#none\">3</a>\r\n");
      out.write("\t\t\t\t\t\t<!-- 활성화 class=\"active\" -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#none\">4</a> <a href=\"#none\">5</a> <a href=\"#none\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<!-- 페이지넘버 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
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
      out.write("\t\t</div>\r\n");
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
