<%-- 
    Document   : homepage
    Created on : Dec 7, 2016, 4:46:38 PM
    Author     : yixxie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <jsp:useBean id="p" class="location.locationManager" scope="session" />
   
  <head>
    <link rel="stylesheet" href="https://openlayers.org/en/v3.19.1/css/ol.css" type="text/css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
      .map {
        height: 400px;
        width:  800px;
        text-align:center
    }
    </style>
    <script src="https://openlayers.org/en/v3.19.1/build/ol.js" type="text/javascript"></script>
    <title>OpenLayers 3 example</title>
    <script src="http://www.openlayers.org/api/OpenLayers.js"></script>
 </head>
<body>
    
<div class="col-md-3">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h4 class="text-center">Advanced Search</h4>
                </div>
                <div class="panel-body">
                    <form action="http://localhost:8080/WebApplication1/testServlet" method="get">
                        
                       <label for="type">Select Type:</label>
                        <select class="form-control" name="type">
                            <option selected="selected" value="${sType}">${sType}</option>
                            <c:forEach items="${p.types}" var="type">
                              
                                <option value="${type}">${type}</option>
                            </c:forEach>
                        </select>
                            <br>
                        
                        
                       

                       

                        <input type="submit" class="btn btn-info"/>
                    </form>
                </div>
            </div>
        </div>
  
    
    
    
    
 <div id="map" class="col-md-5"></div>
    <script type="text/javascript">
    map = new OpenLayers.Map("map");
    map.addLayer(new OpenLayers.Layer.OSM());
    
    epsg4326 =  new OpenLayers.Projection("EPSG:4326"); //WGS 1984 projection
    projectTo = map.getProjectionObject(); //The map projection (Spherical Mercator)
    var lat=33.7756;
    var lon=-84.3963;
    var lonLat = new OpenLayers.LonLat( lon,lat).transform(epsg4326, projectTo);
          
    
    var zoom=17;
    map.setCenter (lonLat, zoom);

    var vectorLayer = new OpenLayers.Layer.Vector("Overlay");

    var list = [
        { lon: lon, lat: lat},
        { lon: lon+0.001, lat: lat+0.001},
        { lon: lon-0.001,  lat: lat-0.001  }
    ];

    for (var i = 0; i < 3; i++) {
      var feature = new OpenLayers.Feature.Vector(
            new OpenLayers.Geometry.Point( list[i].lon,list[i].lat ).transform(epsg4326, projectTo),
            {description:'This is the value of<br>the description attribute'} ,
            {externalGraphic: 'http://dev.openlayers.org/icons/image2.gif', graphicHeight: 25, graphicWidth: 21, graphicXOffset:-12, graphicYOffset:-25  }
        );    
    vectorLayer.addFeatures(feature);
   
    }
    
    // Define markers as "features" of the vector layer:
    
    
   



   
    map.addLayer(vectorLayer);
 
    
    //Add a selector control to the vectorLayer with popup functions
    var controls = {
      selector: new OpenLayers.Control.SelectFeature(vectorLayer, { onSelect: createPopup, onUnselect: destroyPopup })
    };

    function createPopup(feature) {
      feature.popup = new OpenLayers.Popup.FramedCloud("pop",
          feature.geometry.getBounds().getCenterLonLat(),
          null,
          '<div class="markerContent">'+feature.attributes.description+'</div>',
          null,
          true,
          function() { controls['selector'].unselectAll(); }
      );
      //feature.popup.closeOnMove = true;
      map.addPopup(feature.popup);
    }

    function destroyPopup(feature) {
      feature.popup.destroy();
      feature.popup = null;
    }
    
    map.addControl(controls['selector']);
    controls['selector'].activate();
      
  </script>   

    


 


  
  
  
  
    
        <div class="pull-right">  
                <c:forEach items="${returnList}" var="item">
                    <div class="row">
                        <div class="panel panel-primary" style="width: 50%;">
                            <div class="panel-body">
                                <font size="2">${item.name}</font>   
                            </div>
                        </div>
                    </div>
                </c:forEach>
        </div>
      

</body>
</html>
    