package org.apache.jsp.breadcrumb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.servlet.taglib.ui.BreadcrumbEntry;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.List;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

List<BreadcrumbEntry> breadcrumbEntries = (List<BreadcrumbEntry>)request.getAttribute("liferay-site-navigation:breadcrumb:breadcrumbEntries");

      out.write("\n");
      out.write("\n");
      out.write("<ol class=\"breadcrumb\">\n");
      out.write("\n");
      out.write("\t");

	for (int i = 0; i < breadcrumbEntries.size(); i++) {
		BreadcrumbEntry breadcrumbEntry = breadcrumbEntries.get(i);
	
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 (i < (breadcrumbEntries.size() - 1)) && Validator.isNotNull(breadcrumbEntry.getURL()) ) {
      out.write("\n");
      out.write("\t\t\t\t<li class=\"breadcrumb-item\">\n");
      out.write("\t\t\t\t\t<a class=\"breadcrumb-link\" href=\"");
      out.print( breadcrumbEntry.getURL() );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<span class=\"breadcrumb-text-truncate\">");
      out.print( HtmlUtil.escape(breadcrumbEntry.getTitle()) );
      out.write("</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<li class=\"active breadcrumb-item\">\n");
      out.write("\t\t\t\t\t<span class=\"breadcrumb-text-truncate\">");
      out.print( HtmlUtil.escape(breadcrumbEntry.getTitle()) );
      out.write("</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\n");
      out.write("</ol>");
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
