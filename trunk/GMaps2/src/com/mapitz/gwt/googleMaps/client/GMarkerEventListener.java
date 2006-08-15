package com.mapitz.gwt.googleMaps.client;

/**
 * 	Defines the interface for all standard GMarker event listeners
 * @author aglaforge
 *
 */
public interface GMarkerEventListener
{
	/**
	 * click none  This event is fired when the marker icon was clicked. Notice that this event will also fire for the map, with the marker passed as the first argument to the event handler there.
	 */ 
	public void onClick(GMarker marker);

	/**
	 * Undocumented DragStart listener
	 */ 
	public void onDragStart(GMarker marker);

	/**
	 * Undocumented DragEnd listener
	 */ 
	public void onDragEnd(GMarker marker);
	
	/**
	 * dblclick none  This event is fired when the marker icon was double-clicked. Notice that this event will not fire for the map, because the map centers on double-click as a hardwired behavior.
	 */ 
	public void onDblClick(GMarker marker);
	
	/**
	 *mousedown none  This event is fired when the DOM mousedown event is fired on the marker icon. Notice that the marker will stop the mousedown DOM event, so that it doesn't cause the map to start dragging. 
	 */
	public void onMouseDown(GMarker marker);
	
	/**
	 *mouseup none  This event is fired for the DOM mouseup on the marker. Notice that the marker will not stop the mousedown DOM event, because it will not confuse the drag handler of the map. 
	 */
	public void onMouseUp(GMarker marker);
	
	/**
	 * mouseover none  This event is fired when the mouse enters the area of the marker icon.
	 */ 
	public void onMouseOver(GMarker marker);
	
	/**
	 * mouseout none  This event is fired when the mouse leaves the area of the marker icon. 
	 */
	public void onMouseOut(GMarker marker);
	
	/**
	 * infowindowopen none  This event is fired when the info window of the map was opened through this marker.
	 */
	public void onInfoWindowOpen(GMarker marker);
	
	/**
	 * infowindowclose none  This event is fired when the info window of the map that was opened through this marker is closed again. This happens when either the info window was closed, or when it was opened on another marker, or on the map.
	 */ 
	public void onInfoWindowClose(GMarker marker);

	/**
	 * remove none  This event is fired when the marker is removed from the map, using GMap2.removeOverlay() or GMap2.clearOverlays(). 
	 */
	public void onRemove(GMarker marker);
}
