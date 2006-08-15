package com.mycompany.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.mapitz.gwt.googleMaps.client.GClientGeocoder;
import com.mapitz.gwt.googleMaps.client.GControl;
import com.mapitz.gwt.googleMaps.client.GControlAnchor;
import com.mapitz.gwt.googleMaps.client.GControlPosition;
import com.mapitz.gwt.googleMaps.client.GFactualGeocodeCache;
import com.mapitz.gwt.googleMaps.client.GGeocodeAdvancedResultListener;
import com.mapitz.gwt.googleMaps.client.GGeocodeResult;
import com.mapitz.gwt.googleMaps.client.GGeocodeResultListener;
import com.mapitz.gwt.googleMaps.client.GInfoWindowTab;
import com.mapitz.gwt.googleMaps.client.GLatLng;
import com.mapitz.gwt.googleMaps.client.GMap2;
import com.mapitz.gwt.googleMaps.client.GMap2EventListener;
import com.mapitz.gwt.googleMaps.client.GMap2EventManager;
import com.mapitz.gwt.googleMaps.client.GMap2Widget;
import com.mapitz.gwt.googleMaps.client.GMapOptions;
import com.mapitz.gwt.googleMaps.client.GMapType;
import com.mapitz.gwt.googleMaps.client.GMarker;
import com.mapitz.gwt.googleMaps.client.GMarkerEventListener;
import com.mapitz.gwt.googleMaps.client.GMarkerEventManager;
import com.mapitz.gwt.googleMaps.client.GMarkerOptions;
import com.mapitz.gwt.googleMaps.client.GOverlay;
import com.mapitz.gwt.googleMaps.client.GSize;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyApplication implements EntryPoint {

    final Label searchStatusText = new Label("");
    
    
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

    RootPanel.get("slot2").add(searchStatusText);
    //Element e = RootPanel.get("map").getElement();
    
    //GMap2Widget mapWidget = new GMap2Widget(e);
    GMap2Widget mapWidget = new GMap2Widget("300", "300");
    RootPanel.get("slot4").add(mapWidget);
    final GMap2 gmaps = mapWidget.getGmap();
    GLatLng pos = GLatLng.create(37.4419, -122.1419);  
    gmaps.setCenter(pos, 13);
    //gmaps.openInfoWindowHtml(pos, "Hello yellow");
    
    
    GMap2EventManager eventManager = new GMap2EventManager();
    
    GMap2EventListener listener = 
		new GMap2EventListener()
		{
			public void onMouseOver(GMap2 map, GLatLng latlng) 
			{
				searchStatusText.setText(latlng.toString());
			}

			public void onMoveEnd(GMap2 map)
			{
				searchStatusText.setText("Move End");
			}

			public void onAddMapType(GMap2 map, GMapType type)
			{
				searchStatusText.setText("MapType added");
			}

			public void onRemoveMapType(GMap2 map, GMapType type)
			{
				searchStatusText.setText("MapType removed");
			}

			public void onClick(GMap2 map, GOverlay overlay, GLatLng point)
			{
				searchStatusText.setText("Clicked on " + point.toString());	
			}

			public void onMoveStart(GMap2 map)
			{
				searchStatusText.setText("Move Started");
			}

			public void onMove(GMap2 map)
			{
				searchStatusText.setText("Moving");
			}

			public void onZoomEnd(GMap2 map, int oldLevel, int newLevel)
			{
				searchStatusText.setText("Changed from zoome level " + oldLevel + " to " + newLevel);
			}

			public void onMapTypeChanged(GMap2 map)
			{
				searchStatusText.setText("Changed the maptype");
				
			}

			public void onInfoWindowOpen(GMap2 map)
			{
				searchStatusText.setText("Info Window Open");
			}

			public void onInfoWindowClose(GMap2 map)
			{
				searchStatusText.setText("Info Window Close");					
			}

			public void onAddOverlay(GMap2 map, GOverlay overlay)
			{
				searchStatusText.setText("Overlay added");
				//map.removeOverlay(overlay);
			}

			public void onRemoveOverlay(GMap2 map, GOverlay overlay)
			{
				searchStatusText.setText("Overlay removed");
			}

			public void onClearOverlays(GMap2 map)
			{
				searchStatusText.setText("Cleared Overlays");					
			}

			public void onMouseOut(GMap2 map, GLatLng latlng)
			{					
				searchStatusText.setText("On Mouse Out");
			}

			public void onMouseMove(GMap2 map, GLatLng latlng)
			{
				searchStatusText.setText("On Mouse Move");
			}

			public void onDragStart(GMap2 map)
			{
				searchStatusText.setText("Drag Start");
			}

			public void onDrag(GMap2 map)
			{
				searchStatusText.setText("Drag");
			}

			public void onDragEnd(GMap2 map)
			{
				searchStatusText.setText("Drag End");
			}

			public void onLoad(GMap2 map)
			{
				searchStatusText.setText("Loaded");
			}
			
		};
    
//    eventManager.addOnClickListener(gmaps, listener);
    eventManager.addOnZoomEndListener(gmaps, listener);
    GMapOptions opts = GMapOptions.create();
    
    GSize size = GSize.create(20, 50);
    
    GControlPosition position = GControlPosition.create(GControlAnchor.G_ANCHOR_TOP_LEFT(), size);
    
    gmaps.addControl(GControl.GSmallMapControl());
    gmaps.addControl(GControl.GScaleControl());
    
//    GInfoWindowTab[] tabs = new GInfoWindowTab[3];
//    tabs[0] = GInfoWindowTab.create("Tab 1", new Label("Contents of 1").getElement());
//    tabs[1] = GInfoWindowTab.create("Tab 2", new Label("Contents of 2").getElement());
//    tabs[2] = GInfoWindowTab.create("Tab 3", new Label("Contents of 3").getElement());
    
    //gmaps.openInfoWindowTabs(pos, tabs);
    
    eventManager.addOnZoomEndListener(gmaps, listener);
    
    GMarkerEventListener ml = new GMarkerEventListener()
    {
		public void onClick(GMarker marker)
		{
			searchStatusText.setText("Clicked on the marker");
		}

		public void onDblClick(GMarker marker)
		{
			searchStatusText.setText("Double Clicked on the marker");
		}

		public void onMouseDown(GMarker marker)
		{
			searchStatusText.setText("Mouse down");			
		}

		public void onMouseUp(GMarker marker)
		{
			searchStatusText.setText("Mouse up");
		}

		public void onMouseOver(GMarker marker)
		{
			searchStatusText.setText("Mouse over");			
		}

		public void onMouseOut(GMarker marker)
		{
			searchStatusText.setText("Mouse out");			
		}

		public void onInfoWindowOpen(GMarker marker)
		{
			searchStatusText.setText("Info window open");
		}

		public void onInfoWindowClose(GMarker marker)
		{
			searchStatusText.setText("Info window close");
		}

		public void onRemove(GMarker marker)
		{
			searchStatusText.setText("Removed marker");
		}

		public void onDragEnd(GMarker marker)
		{
			searchStatusText.setText("On drag end");
		}

		public void onDragStart(GMarker marker)
		{
			// TODO Auto-generated method stub
			
		}
    	
    };
    
    GMarkerOptions opt = GMarkerOptions.create();
    opt.setDraggable(true);
    GMarker gmarker = GMarker.create(pos, opt);
    gmarker.showMapBlowup();
    GLatLng point = gmarker.getPoint();
    //GInfoWindowTab tabs[] = new GInfoWindowTab[1];
    //tabs[0] = GInfoWindowTab.create("Test", "test");
    
    GInfoWindowTab[] tabs = new GInfoWindowTab[3];
    tabs[0] = GInfoWindowTab.create("Tab 1", new Label("Contents of 1").getElement());
    tabs[1] = GInfoWindowTab.create("Tab 2", new Label("Contents of 2").getElement());
    tabs[2] = GInfoWindowTab.create("Tab 3", new Label("Contents of 3").getElement());
    gmaps.addOverlay(gmarker);
    gmarker.openInfoWindowTabsHtml(tabs);
//    //boolean draggable = gmarker.draggingEnabled();
    gmarker.enableDragging();
//    //draggable = gmarker.draggingEnabled();
    GMarkerEventManager markerEventManager = new GMarkerEventManager();
    //markerEventManager.addOnClickListener(gmarker, ml);
//    markerEventManager.addOnDblClickListener(gmarker, ml);
//    markerEventManager.addOnInfoWindowCloseListener(gmarker, ml);
//    markerEventManager.addOnInfoWindowOpenListener(gmarker, ml);
//    markerEventManager.addOnMouseDownListener(gmarker, ml);
//    markerEventManager.addOnMouseOutListener(gmarker, ml);
//    markerEventManager.addOnMouseOverListener(gmarker, ml);
//    markerEventManager.addOnMouseUpListener(gmarker, ml);
//    markerEventManager.addOnRemoveListener(gmarker, ml);
    //
    
//    gmarker.openInfoWindowHtml("Hello dick head");
    
//    gmaps.checkResize();
    
    //windowsizehack();
    
    GGeocodeResultListener gResult = new GGeocodeResultListener()
    {
		public void onSuccess(GLatLng latlng)
		{
//			gmaps.setCenter(latlng);
			searchStatusText.setText("Geocode success");
			gmaps.addOverlay(GMarker.create(latlng));
			gmaps.panTo(latlng);
		}

		public void onFail(String address)
		{
			searchStatusText.setText("Failed to locate: " + address);			
		}
    	
    };

    GGeocodeAdvancedResultListener gAResult = new GGeocodeAdvancedResultListener()
    {
		public void onSuccess(GGeocodeResult result)
		{
			searchStatusText.setText("Geocode success");
		}

		public void onFail(int statusCode, String address)
		{
				searchStatusText.setText("Error code: "+ statusCode + "Failed to geocode: " + address);	
		}

    };
    
    GFactualGeocodeCache cache = GFactualGeocodeCache.create();
    GClientGeocoder geocoder = GClientGeocoder.create(cache);
    geocoder.getLocations("4807 Nava Reidoalnas, Austin, TX, 78731", gAResult);
    geocoder.getLatLng("4807 Nava Reidoalnas, Austin, TX, 78731", gResult);
   
    
    GMapType gmaptype = GMapType.G_HYBRID_MAP();
    int i = gmaptype.getMaximumResolution();
    gmaps.getCurrentMapType();
    //gmaps.addMapType(gmaptype);
    gmaps.setMapType(gmaptype);
    //gmaps.removeMapType(gmaptype);
    //gmaps.addMapType(gmaptype);
    String color = gmaptype.getLinkColor();
    
    //RootPanel.get("slot4").add(mapWidget);
  }
  
  
  public native void windowsizehack()/*-{ $wnd.resizeBy(1,0); }-*/;
}
