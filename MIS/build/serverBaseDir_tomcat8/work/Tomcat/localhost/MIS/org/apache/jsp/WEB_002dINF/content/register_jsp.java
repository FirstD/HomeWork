/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-05 15:06:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; utf-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>注册</title>\r\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/normalize.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/public.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/validator.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/completer.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"jedate/skin/jedate.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/date.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/magic-check.css\" rel=\"stylesheet\" >\r\n");
      out.write("  <link href=\"css/jquery-ui.css\" rel=\"stylesheet\">  \r\n");
      out.write("  <link href=\"css/index.css\" rel=\"stylesheet\">  \r\n");
      out.write("  <script src=\"http://www.jq22.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/public.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"jedate/jedate.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/date.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery-validate.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/validator.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"http://www.jq22.com/jquery/jquery-ui-1.10.2.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://cdn.static.runoob.com/libs/html5shiv/3.7/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>  \r\n");
      out.write("  <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"form-box row\">\r\n");
      out.write("    <form action=\"VipSRO!register\" class=\"form-horizontal\" role=\"form\" id=\"register-form\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label for=\"username\" class=\"col-sm-2  control-label\">帐 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 号 :</label>\r\n");
      out.write("        <div class=\"col-sm-10  input-parent\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control vinput\" id=\"username\" name=\"vip.name\" placeholder=\"请输入帐户\" >\r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label for=\"phone\" class=\"col-sm-2  control-label\">手 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 机 :</label>\r\n");
      out.write("        <div class=\"col-sm-10  input-parent\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control vinput\" id=\"phone\" name=\"vip.phone\" placeholder=\"请输入手机号\">    \r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group \">\r\n");
      out.write("        <label for=\"email\" class=\"col-sm-2  control-label\">邮 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 箱 :</label>\r\n");
      out.write("        <div class=\"col-sm-10 input-parent\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control vinput\" id=\"email\" name=\"vip.email\" placeholder=\"请输入邮箱\"/>       \r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--       <div class=\"form-group\">\r\n");
      out.write("        <label for=\"birthday\" class=\"col-sm-2  control-label\">生 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 日 :</label>\r\n");
      out.write("        <div class=\"col-sm-10  input-parent\">\r\n");
      out.write("          <input type=\"text\" class=\"form-control vinput\" id=\"birthday\" name=\"birthday\" placeholder=\"请选择生日\" readonly>\r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div> -->\r\n");
      out.write("      <div class=\"form-group \">\r\n");
      out.write("        <label for=\"password\" class=\"col-sm-2  control-label\">密 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 码 :</label>\r\n");
      out.write("        <div class=\"col-sm-10  input-parent\">\r\n");
      out.write("          <input type=\"password\" class=\"form-control vinput\" id=\"password\" name=\"vip.password\" placeholder=\"请输入密码\"/>\r\n");
      out.write("          <i class=\"glyphicon glyphicon-eye-close form-control-feedback\" id=\"toogle-password\"></i>\r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label for=\"notpass\" class=\"col-sm-2  control-label\">确认密码 :</label>\r\n");
      out.write("        <div class=\"col-sm-10  input-parent\">\r\n");
      out.write("          <input type=\"password\" class=\"form-control vinput\" id=\"notpass\" name=\"notpass\" placeholder=\"请再次输入密码\"/>\r\n");
      out.write("          <i class=\"glyphicon glyphicon-eye-close form-control-feedback\" id=\"toggle-notpass\"></i>\r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-sm-12\">\r\n");
      out.write("          <input type=\"checkbox\" class=\"magic-checkbox\" id=\"accept\" name=\"accept\" />\r\n");
      out.write("          <label for=\"accept\" class=\"accept\"><span>我已阅读并接受</span> <a href=\"javascript:;\">《版权声明》</a> <span>和</span> <a href=\"javascript:;\">《隐私保护》</a></label>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-sm-12\">\r\n");
      out.write("          <input type=\"submit\" class=\"btn btn-primary form-control\" id=\"submit\" value=\"注册\"/> \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("</footer>\r\n");
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
