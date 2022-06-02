package org.apache.jsp.dynamic_005finclude;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.document.library.analytics.internal.constants.DocumentLibraryAnalyticsConstants;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.WebKeys;

public final class top_005fhead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/dynamic_include/init.jsp");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
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
      out.write("<script data-senna-track=\"temporary\" type=\"text/javascript\">\n");
      out.write("\tif (window.Analytics) {\n");
      out.write("\t\twindow.");
      out.print( DocumentLibraryAnalyticsConstants.JS_PREFIX );
      out.write("isViewFileEntry = false;\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar pathnameRegexp = /\\/documents\\/(\\d+)\\/(\\d+)\\/(.+?)\\/([^&]+)/;\n");
          out.write("\n");
          out.write("\tfunction sendAnalyticsEvent(anchor) {\n");
          out.write("\t\tvar fileEntryId =\n");
          out.write("\t\t\tanchor.dataset.analyticsFileEntryId ||\n");
          out.write("\t\t\t(anchor.parentElement &&\n");
          out.write("\t\t\t\tanchor.parentElement.dataset.analyticsFileEntryId);\n");
          out.write("\n");
          out.write("\t\tvar title =\n");
          out.write("\t\t\tanchor.dataset.analyticsFileEntryTitle ||\n");
          out.write("\t\t\t(anchor.parentElement &&\n");
          out.write("\t\t\t\tanchor.parentElement.dataset.analyticsFileEntryTitle);\n");
          out.write("\n");
          out.write("\t\tvar getParameterValue = (parameterName) => {\n");
          out.write("\t\t\tvar result = null;\n");
          out.write("\n");
          out.write("\t\t\tanchor.search\n");
          out.write("\t\t\t\t.substr(1)\n");
          out.write("\t\t\t\t.split('&')\n");
          out.write("\t\t\t\t.forEach((item) => {\n");
          out.write("\t\t\t\t\tvar tmp = item.split('=');\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (tmp[0] === parameterName) {\n");
          out.write("\t\t\t\t\t\tresult = decodeURIComponent(tmp[1]);\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\treturn result;\n");
          out.write("\t\t};\n");
          out.write("\n");
          out.write("\t\tvar match = pathnameRegexp.exec(anchor.pathname);\n");
          out.write("\n");
          out.write("\t\tif (fileEntryId && match) {\n");
          out.write("\t\t\tAnalytics.send('documentDownloaded', 'Document', {\n");
          out.write("\t\t\t\tgroupId: match[1],\n");
          out.write("\t\t\t\tfileEntryId,\n");
          out.write("\t\t\t\tpreview: !!window.");
          out.print( DocumentLibraryAnalyticsConstants.JS_PREFIX );
          out.write("isViewFileEntry,\n");
          out.write("\t\t\t\ttitle: title || decodeURIComponent(match[3].replace(/\\+/gi, ' ')),\n");
          out.write("\t\t\t\tversion: getParameterValue('version'),\n");
          out.write("\t\t\t});\n");
          out.write("\t\t}\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tfunction handleDownloadClick(event) {\n");
          out.write("\t\tif (window.Analytics) {\n");
          out.write("\t\t\tif (event.target.nodeName.toLowerCase() === 'a') {\n");
          out.write("\t\t\t\tsendAnalyticsEvent(event.target);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse if (\n");
          out.write("\t\t\t\tevent.target.parentNode &&\n");
          out.write("\t\t\t\tevent.target.parentNode.nodeName.toLowerCase() === 'a'\n");
          out.write("\t\t\t) {\n");
          out.write("\t\t\t\tsendAnalyticsEvent(event.target.parentNode);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse if (\n");
          out.write("\t\t\t\tevent.target.dataset.action === 'download' ||\n");
          out.write("\t\t\t\tevent.target.querySelector('.lexicon-icon-download') ||\n");
          out.write("\t\t\t\tevent.target.classList.contains('lexicon-icon-download') ||\n");
          out.write("\t\t\t\t(event.target.parentNode &&\n");
          out.write("\t\t\t\t\tevent.target.parentNode.classList.contains(\n");
          out.write("\t\t\t\t\t\t'lexicon-icon-download'\n");
          out.write("\t\t\t\t\t))\n");
          out.write("\t\t\t) {\n");
          out.write("\t\t\t\tvar selectedFiles = document.querySelectorAll(\n");
          out.write("\t\t\t\t\t'.portlet-document-library .entry-selector:checked'\n");
          out.write("\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\tselectedFiles.forEach(({value}) => {\n");
          out.write("\t\t\t\t\tvar selectedFile = document.querySelector(\n");
          out.write("\t\t\t\t\t\t'[data-analytics-file-entry-id=\"' + value + '\"]'\n");
          out.write("\t\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\t\tsendAnalyticsEvent(selectedFile);\n");
          out.write("\t\t\t\t});\n");
          out.write("\t\t\t}\n");
          out.write("\t\t}\n");
          out.write("\t}\n");
          out.write("\n");
          out.write("\tLiferay.once('destroyPortlet', () => {\n");
          out.write("\t\tdocument.body.removeEventListener('click', handleDownloadClick);\n");
          out.write("\t});\n");
          out.write("\n");
          out.write("\tLiferay.once('portletReady', () => {\n");
          out.write("\t\tdocument.body.addEventListener('click', handleDownloadClick);\n");
          out.write("\t});\n");
          int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
        _jspx_th_aui_script_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
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
