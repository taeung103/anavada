/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-13 00:39:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import member.model.vo.Member;
import member.model.vo.Member;

public final class MyInfoModify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/member/../include/head.jsp", Long.valueOf(1597276855223L));
    _jspx_dependants.put("/views/member/../include/footer.jsp", Long.valueOf(1597276855223L));
    _jspx_dependants.put("/views/member/../include/header.jsp", Long.valueOf(1597279115707L));
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
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
      out.write("                        <a href=\"/anavada/flist\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/ilist\">문의하기</a>\r\n");
      out.write("                      ");
 if(loginMember != null && loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/dbolist\">권한관리</a>\r\n");
      out.write("                     ");
 }else{ 
      out.write(" \r\n");
      out.write("                        ");
 } 
      out.write(" \r\n");
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
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/views/member/join_agree.jsp\">JOIN</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/views/member/login.jsp\">LOGIN</a></li>\r\n");
      out.write("                ");
 } else if(loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/mlist.ad?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("\">관리자페이지</a></li>\r\n");
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
      out.write("        \r\n");
      out.write("        <!-- 컨텐츠 -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas mypage-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li><a href=\"#none\">MYPAGE</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">정보수정</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>MYPAGE</span></h2>\r\n");
      out.write("                    <h3>'Anavada'의 내 정보를 확인할 수 있습니다..</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\t\t\t    \r\n");
      out.write("            <!--서브 카테고리-->\r\n");
      out.write("            <div class=\"MyTap\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"active\"><a href=\"mypage.ss\">정보수정</a></li>\r\n");
      out.write("                    <li><a href=\"MyProduct.jsp\">중고거래조회</a></li>\r\n");
      out.write("                    <li><a href=\"MyCmnt.jsp\">커뮤니티조회</a></li>\r\n");
      out.write("                    <li><a href=\"MyInquiry.jsp\">문의하기조회</a></li>\r\n");
      out.write("                    <li><a href=\"MyDeclare.jsp\">신고하기조회</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 카테고리 끝-->\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <!--마이페이지컨텐츠-->\r\n");
      out.write("            <div class=\"mypage_area\" style=\"margin-bottom: 100px;\">\r\n");
      out.write("               \r\n");
      out.write("                <h2 class=\"mypage_title\">정보수정</h2>\r\n");
      out.write("\r\n");
      out.write("                <!-- 프로필 -->\r\n");
      out.write("\t\t\t\t<dl class=\"profile\">\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<div>");
      out.print( member.getMemberName() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<div><span>이름</span> : ");
      out.print( member.getMemberName() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div><span>아이디</span> : ");
      out.print( member.getMemberId() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div><span>전화번호</span> : ");
      out.print( member.getMemberPhone() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div><span>이메일</span> : ");
      out.print( member.getMemberEmail() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div><span>가입일</span> : ");
      out.print( member.getJoinDate() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<!-- 프로필 끝 -->\r\n");
      out.write("                <!-- form method=\"post\" onsubmit=\"return validate();\" enctype=\"multipart/form-data\"-->\r\n");
      out.write("                <form method=\"post\" onsubmit=\"return validate();\">\r\n");
      out.write("                <table class=\"InfoModify_table\">\r\n");
      out.write("                    <colgroup>\r\n");
      out.write("                        <col width=\"20%\">\r\n");
      out.write("                        <col width=\"80%\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>아이디</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"memberId\" id=\"memberId\" title=\"아이디\" class=\"form-control w100p\" placeholder=\"아이디\" value=\"");
      out.print( member.getMemberId() );
      out.write("\" readonly/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>비밀번호</td>\r\n");
      out.write("                            <td><input type=\"password\" name=\"memberPwd\" id=\"memberPwd\" title=\"비밀번호\" class=\"form-control w100p\" placeholder=\"기존 비밀번호\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>신규 비밀번호</td>\r\n");
      out.write("                            <td class=\"newPwd\">\r\n");
      out.write("                                <input type=\"password\" name=\"newPwd\" id=\"newPwd\" title=\"신규 비밀번호\" class=\"form-control w70p mb5\" placeholder=\"신규 비밀번호 입력\"/><br/>\r\n");
      out.write("                                <input type=\"password\" name=\"newPwdOK\" id=\"newPwdOK\" title=\"신규 비밀번호 재입력\" class=\"form-control w70p\" placeholder=\"신규 비밀번호 재입력\"/>\r\n");
      out.write("                                <a href=\"#none\" class=\"btnS1\" onclick=\"return myInfoPwd();\">변경하기</a><br/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>이름</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"memberName\" title=\"이름\" class=\"form-control w100p\" placeholder=\"이름\" value=\"");
      out.print( member.getMemberName() );
      out.write("\" readonly/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>이메일</td>\r\n");
      out.write("                            <td class=\"emailArea\">\r\n");
      out.write("                                <input type=\"email\" name=\"memberEmail\" id=\"memberEmail\" title=\"이메일\" class=\"form-control w70p mb5\" placeholder=\"@naver.com(필수)\" value=\"");
      out.print( member.getMemberEmail() );
      out.write("\" />\r\n");
      out.write("                                <a href=\"#none\" class=\"btnS1\" onclick=\"return joinEmailCheck();\">인증번호 발송</a>\r\n");
      out.write("                                <p style=\"margin-bottom:5px;\">네이버 이메일만 인증번호 발송이 가능합니다.</p>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name=\"emailAuth\" id=\"emailAuth\" title=\"인증번호\" class=\"form-control w70p\" placeholder=\"인증번호\" value=\"");
      out.print( member.getEmailAuth() );
      out.write("\" />\r\n");
      out.write("                                <a href=\"#none\" class=\"btnS1\" onclick=\"return EmailAuthOK();\">인증확인</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>휴대폰</td>\r\n");
      out.write("                            <td class=\"telArea\"><input type=\"tel\" name=\"memberPhone\" title=\"휴대폰번호\" class=\"form-control w100p\" placeholder=\"'-' 포함 입력\" value=\"");
      out.print( member.getMemberPhone() );
      out.write("\" /></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>회원탈퇴</td>\r\n");
      out.write("                            <td><button type=\"button\" class=\"leaveBtn\" onclick=\"memberDelete();\">회원탈퇴</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"write-btn\">\r\n");
      out.write("                    <a href=\"javascript:history.go(-1);\">이전 페이지</a>\r\n");
      out.write("                    <input class=\"btn btn-list\" type=\"reset\" value=\"수정취소\">\r\n");
      out.write("                    <input class=\"btn btn-success\" type=\"submit\" value=\"수정하기\" onclick=\"action='/anavada/mupdate.cp'\">\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 컨텐츠 끝 -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <a href=\"/anavada/views/etc/terms.jsp\">이용약관</a>\r\n");
      out.write("            <a href=\"/anavada/views/etc/privacy.jsp\">개인정보처리방침</a>\r\n");
      out.write("            <a href=\"/anavada/views/etc/email.jsp\">이메일무단수집거부</a>\r\n");
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