/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-03-05 17:42:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/상히/Desktop/crudTest/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/crudTest/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1709642320255L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resource/css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/css/mdi-style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/css/tui-grid.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/css/tui-pagination.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/css/sub-style.css\">\r\n");
      out.write("<title>게시판 만들기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <section class=\"sub-page\">\r\n");
      out.write("    <div class=\"s__container\">\r\n");
      out.write("      <div class=\"s__row\">\r\n");
      out.write("        <div class=\"rayout02\">\r\n");
      out.write("          <div class=\"board01\">\r\n");
      out.write("            <form>\r\n");
      out.write("              <div class=\"border-search01\">\r\n");
      out.write("                <select name=\"keyword\">\r\n");
      out.write("                  <option value=\"0\">전체</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <input type=\"text\" name=\"searchKeyword\" />\r\n");
      out.write("                <button class=\"btn-main\">검색</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <!--해당 div에 리스트를 출력해보기-->\r\n");
      out.write("            <div id=\"grid\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <script src=\"/js/jquery-1.9.1.js\"></script>\r\n");
      out.write("  <script src=\"/js/tui-pagination.js\"></script>\r\n");
      out.write("  <script src=\"/js/tui-grid.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    // 도움말\r\n");
      out.write("    //https://github.com/nhn/tui.grid/blob/master/packages/toast-ui.grid/docs/ko/README.md \r\n");
      out.write("\r\n");
      out.write("    // 원래 대로라면 이렇게\r\n");
      out.write("    const dataSource = {\r\n");
      out.write("        api: {\r\n");
      out.write("          readData: { url: '/board/selectBoardList', method: 'GET'}\r\n");
      out.write("        }\r\n");
      out.write("      };\r\n");
      out.write("\r\n");
      out.write("    //로컬이니까 가라데이터 // DB에서 가라 데이터 작성후 받아와서 리스트 뿌려볼것 \r\n");
      out.write("\r\n");
      out.write("    const grid = new tui.Grid({\r\n");
      out.write("      el: document.getElementById(\"grid\"),\r\n");
      out.write("      data: dataSource,\r\n");
      out.write("      scrollX: true,\r\n");
      out.write("      scrollY: false,\r\n");
      out.write("      minBodyHeight: 30,\r\n");
      out.write("      rowHeaders: [{\r\n");
      out.write("        type: 'rowNum',\r\n");
      out.write("        header: \"번호\",\r\n");
      out.write("        width: 80,\r\n");
      out.write("      }],\r\n");
      out.write("      pageOptions: {\r\n");
      out.write("        useClient: true,\r\n");
      out.write("        perPage: 10,\r\n");
      out.write("      },\r\n");
      out.write("      header: {\r\n");
      out.write("        height: 57\r\n");
      out.write("      },\r\n");
      out.write("      minRowHeight: 71,\r\n");
      out.write("      columns: [\r\n");
      out.write("        {\r\n");
      out.write("          header: '제목',\r\n");
      out.write("          name: 'title',\r\n");
      out.write("          align: 'center',\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          header: '작성자',\r\n");
      out.write("          name: 'data2',\r\n");
      out.write("          align: 'center',\r\n");
      out.write("          width: 200,\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          header: '등록일',\r\n");
      out.write("          name: 'data3',\r\n");
      out.write("          align: 'center',\r\n");
      out.write("          width: 200,\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          header: '조회',\r\n");
      out.write("          name: 'data5',\r\n");
      out.write("          align: 'center',\r\n");
      out.write("          width: 200,\r\n");
      out.write("        }\r\n");
      out.write("      ],\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
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
