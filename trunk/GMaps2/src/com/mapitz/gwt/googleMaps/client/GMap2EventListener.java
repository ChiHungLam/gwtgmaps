package com.mapitz.gwt.googleMaps.client;

/**
 * Defines the interface for all standard GMap2 event listeners
 * @author aglaforge
 *
 */
public interface GMap2EventListener 
{	
	/**
	 * addmaptype type  This event is fired when a map type is added to the map.
	 */
	public void onAddMapType(GMap2 map, GMapType type);
	
	/**
	 * removemaptype type  This event is fired when a map type is removed from the map.
	 */
	public void onRemoveMapType(GMap2 map, GMapType type);
	
	/**
	 * click overlay, point This event is fired when the map is clicked with the mouse. If the click was on a marker, then the marker is passed to the event handler in the overlay argument, and a click event is also fired on the marker. Otherwise, the geographical coordinates of the point that was clicked are passed in the point argument.
	 */
	public void onClick(GMap2 map, GOverlay overlay, GLatLng point); 
	
	/**
	 * movestart none  This event is fired when the map view starts changing. This can be caused by dragging, in which case a dragstart event is also fired, or by invocation of a method that changes the map view.
	 */
	public void onMoveStart(GMap2 map);
	
	/**
	 * move none  This event is fired, possibly repeatedly, while the map view is changing.
	 */
	public void onMove(GMap2 map);
	 
	/**
	 * moveend none  This event is fired when the change of the map view ends.
	 */
	public void onMoveEnd(GMap2 map);
	
	/**
	 * zoomend oldLevel, newLevel This event is fired when the map reaches a new zoom level. The event handler receives the previous and the new zoom level as arguments.
	 */
	public void onZoomEnd(GMap2 map, int oldLevel, int newLevel);
	 
	/**
	 * maptypechanged none  This event is fired when another map type is selected.
	 */
	public void onMapTypeChanged(GMap2 map);
	
	/**
	 * infowindowopen none  This event is fired when the info window opens.
	 */
	public void onInfoWindowOpen(GMap2 map);
	
	/**
	 * infowindowclose none  This event is fired when the info window closes. If a currently open info window is reopened at a different point using another call to openInfoWindow*(), then infowindowclose will fire first.
	 */
	public void onInfoWindowClose(GMap2 map);
	 
	/**
	 * addoverlay overlay  This event is fired when a single overlay is added to the map by the method addOverlay(). The new overlay is passed as an argument overlay to the event handler.
	 */
	public void onAddOverlay(GMap2 map, GOverlay overlay);
	 
	/**
	 * removeoverlay overlay  This event is fired when a single overlay is removed by the method removeOverlay(). The overlay that was removed is passed as an argument overlay to the event handler. 
	 */
	public void onRemoveOverlay(GMap2 map, GOverlay overlay); 
	
	/**
	 * clearoverlays none  This event is fired when all overlays are removed at once by the method clearOverlays().
	 */
	public void onClearOverlays(GMap2 map);

	
	/**
	 * mouseover latlng  This event is fired when the user moves the mouse over the map from outside the map.
	 */
	public void onMouseOver(GMap2 map, GLatLng latlng);
	
	/**
	 * mouseout latlng  This event is fired when the user moves the mouse off the map.
	 */
	public void onMouseOut(GMap2 map, GLatLng latlng);
	
	/**
	 * mousemove latlng  This event is fired when the user moves the mouse inside the map.
	 */
	public void onMouseMove(GMap2 map, GLatLng latlng); 
	
	/**
	 * dragstart none  This event is fired when the user starts dragging the map. 
	 */
	public void onDragStart(GMap2 map);
	
	/**
	 * drag none  This event is repeatedly fired while the user drags the map.
	 */
	public void onDrag(GMap2 map);
	 
	/**
	 * dragend none  This event is fired when the user stops dragging the map. 
	 */
	public void onDragEnd(GMap2 map);
	
	/**
	 * load none  This event is fired when the map setup is complete, and isLoaded() would return true. This means position, zoom, and map type are all initialized, but tile images may still be loading. (Since 2.52)
	 */
	public void onLoad(GMap2 map); 

}
