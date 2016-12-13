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
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="dist/css/bootstrap-submenu.min.css">
    <script src="https://code.jquery.com/jquery-3.1.0.min.js" defer></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" defer></script>
    <script src="dist/js/bootstrap-submenu.min.js" defer></script>
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
    
<div class="col-md-3" >
            <div class="panel panel-success">
                <form class="navbar-form" action="http://localhost:8080/WebApplication1/searchServlet?"method="get">
                   <div class="input-group">
                        <input type="hidden"  name="search" value="basic">
                        <input type="text" class="form-control"  name="SearchParameter" id="SearchParameter">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i>Search</button>
                            </div>
                    </div>

                </form>
                
                <h3 align="center" style="color:#FF0000;">${errorMessage}</h3> 
                <div class="panel-body">
                    <form action="http://localhost:8080/WebApplication1/searchServlet" method="get">
                       <input type="hidden"  name="search" value="advanced">
                       
                        <label for="type">Select Type:</label>
                        <select class="form-control" name="type">
                            <option selected="selected" value="${sType}">${sType}</option>
                            <c:forEach items="${p.types}" var="type">
                                <option value="${type}">${type}</option>
                            </c:forEach>
                        </select>
                            <br>    
                        <input type="checkbox" name="currentOpen" value="open">Currently open<br>
                            <br>
                        <input type="submit" class="btn btn-info"/>
                    </form>
                        
                    <form action="http://www.google.com/"> 
                        <input type="image" src="http://previews.123rf.com/images/faysalfarhan/faysalfarhan1405/faysalfarhan140500060/28774232-Events-icon-glossy-green-round-button-Stock-Photo.jpg" alt="Submit" width="80" height="80">
                    </form>
                        
                        <div style="overflow-y: scroll; height:400px">  
                        <c:forEach items="${returnList}" var="item">
                            <div class="row">
                                <div class="panel panel-primary" style="width: 85%;">
                                    <div class="panel-body" style="margin:auto" >
                                        <font size="2">${item.name}</font>   
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        </div>   

                </div>
            </div>
        </div>
  
 
    
    
    
 <div id="map" class="col-md-9"></div>
    <script type="text/javascript">
    map = new OpenLayers.Map("map");
    map.addLayer(new OpenLayers.Layer.OSM());
    
    epsg4326 =  new OpenLayers.Projection("EPSG:4326"); //WGS 1984 projection
    epsg3857 = new OpenLayers.Projection("EPSG:3857");
    epsg900913=new OpenLayers.Projection("EPSG:900913");
    projectTo = map.getProjectionObject(); //The map projection (Spherical Mercator)
    var lat=33.7756;
    var lon=-84.3963;
   // var lat = 399896208;
   // var lon = -939488028;
    var lonLat = new OpenLayers.LonLat(lon,lat).transform(epsg4326, projectTo);
    var zoom=15;
    map.setCenter (lonLat, zoom);

    var vectorLayer = new OpenLayers.Layer.Vector("Overlay");
    
    
   
    

    var list = [
        { lon: lon, lat: lat},
        { lon: lon+0.001, lat: lat+0.001},
        { lon: lon-0.001,  lat: lat-0.001  }
    ];
    
    
   
    var list= <%=request.getAttribute("position")%>;
   
   
    for (var i = 0; i <list.length; i++) {
      var feature = new OpenLayers.Feature.Vector(
            new OpenLayers.Geometry.Point( list[i].lon,list[i].lat ).transform(epsg3857, projectTo),
            {description:list[i].name} ,
            {externalGraphic: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/256/Map-Marker-Ball-Pink-icon.png', graphicHeight: 25, graphicWidth: 21, graphicXOffset:-12, graphicYOffset:-25  }
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

    


 


  
  
  
  
    
       
      

</body>
</html>
    