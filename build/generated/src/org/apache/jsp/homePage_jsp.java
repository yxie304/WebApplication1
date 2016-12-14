package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    ");
      location.locationManager p = null;
      synchronized (session) {
        p = (location.locationManager) _jspx_page_context.getAttribute("p", PageContext.SESSION_SCOPE);
        if (p == null){
          p = new location.locationManager();
          _jspx_page_context.setAttribute("p", p, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("   \n");
      out.write("  <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://openlayers.org/en/v3.19.1/css/ol.css\" type=\"text/css\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/bootstrap-submenu.min.css\">\n");
      out.write("   \n");
      out.write("    <style>\n");
      out.write("      .map {\n");
      out.write("        height: 400px;\n");
      out.write("        width:  800px;\n");
      out.write("        text-align:center\n");
      out.write("      }\n");
      out.write("      .modal-dialog{\n");
      out.write("        position: absolute;\n");
      out.write("        margin-left: 10px;\n");
      out.write("        margin-top: 100px;\n");
      out.write("        width:20%;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <script src=\"https://openlayers.org/en/v3.19.1/build/ol.js\" type=\"text/javascript\"></script>\n");
      out.write("    <title>OpenLayers 3 example</title>\n");
      out.write("    <script src=\"http://www.openlayers.org/api/OpenLayers.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        var list= ");
      out.print(request.getAttribute("eventList"));
      out.write(";\n");
      out.write("        if (list==null){\n");
      out.write("            $(\"#theButton\").hide();\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("   \n");
      out.write("    $(function () {\n");
      out.write("    $('#myModal').on('shown.bs.modal', function () {\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        var currentEvent= ");
      out.print(request.getAttribute("eventList1"));
      out.write(";\n");
      out.write("        var ll=p.findbyID();\n");
      out.write("         \n");
      out.write("         // \n");
      out.write("    })\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write(" </head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div class=\"col-md-3\" >\n");
      out.write("            <div class=\"panel panel-success\">\n");
      out.write("                <form class=\"navbar-form\" action=\"http://localhost:8080/WebApplication1/searchServlet?\"method=\"get\">\n");
      out.write("                   <div class=\"input-group\">\n");
      out.write("                        <input type=\"hidden\"  name=\"search\" value=\"basic\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"SearchParameter\" id=\"SearchParameter\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i>Search</button>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <h3 align=\"center\" style=\"color:#FF0000;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3> \n");
      out.write("                \n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"http://localhost:8080/WebApplication1/searchServlet\" method=\"get\">\n");
      out.write("                       <input type=\"hidden\"  name=\"search\" value=\"advanced\">\n");
      out.write("                       \n");
      out.write("                        <label for=\"type\">Select Type:</label>\n");
      out.write("                        <select class=\"form-control\" name=\"type\">\n");
      out.write("                            <option selected=\"selected\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                            <br>    \n");
      out.write("                        <input type=\"checkbox\" name=\"currentOpen\" value=\"open\">Currently open<br>\n");
      out.write("                            <br>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-info\"/>\n");
      out.write("                    </form>\n");
      out.write("                        \n");
      out.write("                    <form action=\"http://localhost:8080/WebApplication1/searchServlet\"> \n");
      out.write("                        <input type=\"image\" name=\"search\" value=\"event\" src=\"http://previews.123rf.com/images/faysalfarhan/faysalfarhan1405/faysalfarhan140500060/28774232-Events-icon-glossy-green-round-button-Stock-Photo.jpg\" alt=\"Submit\" width=\"100\" height=\"120\">\n");
      out.write("                    </form>                        \n");
      out.write("                       \n");
      out.write("                        <button type=\"button\" style=\"width: 250px;\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModal\" id=\"theButton\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventList.topic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</button>\n");
      out.write("\n");
      out.write("                        <!-- Modal -->\n");
      out.write("                        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                            <div class=\"modal-dialog\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                        <h4 class=\"modal-title\">Details</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <div>Topic:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventList.topic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        <p>&nbsp;</p>\n");
      out.write("                                        <div>Time:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventList.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        <p>&nbsp;</p>\n");
      out.write("                                        <div>Description:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventList.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        <p>&nbsp;</p>\n");
      out.write("                                        <div>Place:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventList.placeId.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"overflow-y: scroll; height:400px\">  \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write(" <div id=\"map\" class=\"col-md-9\"></div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    map = new OpenLayers.Map(\"map\");\n");
      out.write("    map.addLayer(new OpenLayers.Layer.OSM());\n");
      out.write("    epsg4326 =  new OpenLayers.Projection(\"EPSG:4326\"); //WGS 1984 projection\n");
      out.write("    epsg3857 = new OpenLayers.Projection(\"EPSG:3857\");\n");
      out.write("    epsg900913=new OpenLayers.Projection(\"EPSG:900913\");\n");
      out.write("    projectTo = map.getProjectionObject(); //The map projection (Spherical Mercator)\n");
      out.write("    var lat=33.7756;\n");
      out.write("    var lon=-84.3963;\n");
      out.write("    var lonLat = new OpenLayers.LonLat(lon,lat).transform(epsg4326, projectTo);\n");
      out.write("    var zoom=15;\n");
      out.write("    map.setCenter (lonLat, zoom);\n");
      out.write("    var vectorLayer = new OpenLayers.Layer.Vector(\"Overlay\");\n");
      out.write("    var list = [\n");
      out.write("        { lon: lon, lat: lat},\n");
      out.write("        { lon: lon+0.001, lat: lat+0.001},\n");
      out.write("        { lon: lon-0.001,  lat: lat-0.001  }\n");
      out.write("    ]; \n");
      out.write("    var list= ");
      out.print(request.getAttribute("position"));
      out.write(";\n");
      out.write("    var showEvent=");
      out.print(request.getAttribute("showEvent"));
      out.write(";\n");
      out.write("    for (var i = 0; i <list.length; i++) {\n");
      out.write("       var feature = new OpenLayers.Feature.Vector(\n");
      out.write("            new OpenLayers.Geometry.Point( list[i].lon,list[i].lat ).transform(epsg3857, projectTo),\n");
      out.write("            {hh:\"sss\"},\n");
      out.write("            {externalGraphic: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/256/Map-Marker-Ball-Pink-icon.png', graphicHeight: 25, graphicWidth: 21, graphicXOffset:-12, graphicYOffset:-25  }\n");
      out.write("        );    \n");
      out.write("        if (showEvent==1){\n");
      out.write("            feature.attributes={\n");
      out.write("                description:\"Description: \"+list[i].description,\n");
      out.write("                name:\"Place: \"+list[i].name,\n");
      out.write("                time:\"Time: \"+list[i].time,\n");
      out.write("                topic:\"Topic: \"+list[i].topic\n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("        else if(showEvent==0){\n");
      out.write("            feature.attributes={\n");
      out.write("                name:\"Place: \"+list[i].name,\n");
      out.write("                openTime:\"Open Time: \"+list[i].openTime,\n");
      out.write("                closeTime:\"Close Time: \"+list[i].closeTime\n");
      out.write("            };\n");
      out.write("        }   \n");
      out.write("    vectorLayer.addFeatures(feature);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    // Define markers as \"features\" of the vector layer:\n");
      out.write("    map.addLayer(vectorLayer);\n");
      out.write("    //Add a selector control to the vectorLayer with popup functions\n");
      out.write("    var controls = {\n");
      out.write("      selector: new OpenLayers.Control.SelectFeature(vectorLayer, { onSelect: createPopup, onUnselect: destroyPopup })\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    function createPopup(feature) {\n");
      out.write("      if (showEvent==1){\n");
      out.write("        feature.popup = new OpenLayers.Popup.FramedCloud(\"pop\",\n");
      out.write("          feature.geometry.getBounds().getCenterLonLat(),\n");
      out.write("          null,\n");
      out.write("          '<div class=\"markerContent\">'+feature.attributes.topic+'<br>'+feature.attributes.name+'<br>'+feature.attributes.time+'<br>'+feature.attributes.description+'</div>',\n");
      out.write("          null,\n");
      out.write("          true,\n");
      out.write("          function() { controls['selector'].unselectAll(); }\n");
      out.write("        );\n");
      out.write("      }\n");
      out.write("      else{\n");
      out.write("          feature.popup = new OpenLayers.Popup.FramedCloud(\"pop\",\n");
      out.write("            feature.geometry.getBounds().getCenterLonLat(),\n");
      out.write("            null,\n");
      out.write("            '<div class=\"markerContent\">'+feature.attributes.name+'<br>'+feature.attributes.openTime+'<br>'+feature.attributes.closeTime+'</div>',\n");
      out.write("            null,\n");
      out.write("            true,\n");
      out.write("            function() { controls['selector'].unselectAll(); }\n");
      out.write("            );\n");
      out.write("      }\n");
      out.write("      //feature.popup.closeOnMove = true;\n");
      out.write("      map.addPopup(feature.popup);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function destroyPopup(feature) {\n");
      out.write("      feature.popup.destroy();\n");
      out.write("      feature.popup = null;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    map.addControl(controls['selector']);\n");
      out.write("    controls['selector'].activate();\n");
      out.write("      \n");
      out.write("  </script>   \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
      out.write("       \n");
      out.write("      \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.types}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("type");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${returnList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("item");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"row\" style=\"margin-left:5px; margin-top:5px;\">\n");
          out.write("                                <div style=\"width: 85%;\">\n");
          out.write("                                     <button type=\"button\" style=\"width: 250px;\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.osmId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"showMarker\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</button>\n");
          out.write("\n");
          out.write("                                    <!-- Modal -->\n");
          out.write("                                    <div class=\"modal fade\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.osmId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" role=\"dialog\">\n");
          out.write("                                        <div class=\"modal-dialog\">\n");
          out.write("                                            <div class=\"modal-content\">\n");
          out.write("                                                <div class=\"modal-header\">\n");
          out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
          out.write("                                                    <h4 class=\"modal-title\">Details</h4>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"modal-body\">\n");
          out.write("                                                    <div>Place:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                    <p>&nbsp;</p>\n");
          out.write("                                                    <div>openTime:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.convertDate(item.openTime)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                    <p>&nbsp;</p>\n");
          out.write("                                                    <div>closeTime:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.convertDate(item.closeTime)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div> \n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"modal-footer\">\n");
          out.write("                                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
