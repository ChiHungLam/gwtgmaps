package com.mapitz.gwt.googleMaps.client;

import java.util.HashSet;
import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

/**
 * Event Manager which manages GMarker events
 * @author aglaforge
 *
 */
public class GMarkerEventManager
{
	private HashSet eventListeners = new HashSet();
	
	/**
	 * click none  This event is fired when the marker icon was clicked. Notice that this event will also fire for the map, with the marker passed as the first argument to the event handler there.
	 */
	public void addOnClickListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnClickListener(this, marker);
	}
	
	public void onClick(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnClickAndCatch(marker, handler);
	    else
	    	fireOnClickImpl(marker);		
	}
	
	private void fireOnClickAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnClickImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnClickImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onClick(marker);
		    }
	}
	
	
	/**
	 * dblclick none  This event is fired when the marker icon was double-clicked. Notice that this event will not fire for the map, because the map centers on double-click as a hardwired behavior.
	 */
	public void addOnDblClickListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnDblClickListener(this, marker);
	}	
	 
	public void onDblClick(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnDblClickAndCatch(marker, handler);
	    else
	    	fireOnDblClickImpl(marker);		
	}

	private void fireOnDblClickAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
	    try {
	      fireOnDblClickImpl(marker);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnDblClickImpl(GMarker marker) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
	      GMarkerEventListener listener = (GMarkerEventListener) it.next();
	      listener.onDblClick(marker);
	    }
	}
	
	public void addOnDragEndListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnDragEndListener(this, marker);
	}	

	public void onDragEnd(GMarker marker)
	{
		    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
		    if (handler != null)
		    	fireOnDragEndAndCatch(marker, handler);
		    else
		    	fireOnDragEndImpl(marker);	
	}
	
	private void fireOnDragEndAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
	    try {
	      fireOnDragEndImpl(marker);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnDragEndImpl(GMarker marker) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onDragEnd(marker);
		    }
	}

	public void addOnDragStartListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnDragStartListener(this, marker);
	}	

	public void onDragStart(GMarker marker)
	{
		    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
		    if (handler != null)
		    	fireOnDragStartAndCatch(marker, handler);
		    else
		    	fireOnDragStartImpl(marker);	
	}
	
	private void fireOnDragStartAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
	    try {
	      fireOnDragStartImpl(marker);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnDragStartImpl(GMarker marker) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onDragStart(marker);
		    }
	}
	
	/**
	 * mousedown none  This event is fired when the DOM mousedown event is fired on the marker icon. Notice that the marker will stop the mousedown DOM event, so that it doesn't cause the map to start dragging.
	 */ 
	public void addOnMouseDownListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnMouseDownListener(this, marker);
	}
	
	public void onMouseDown(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseDownAndCatch(marker, handler);
	    else
	    	fireOnMouseDownImpl(marker);		
	}
	
	private void fireOnMouseDownAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseDownImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseDownImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onMouseDown(marker);
		    }
	}
	
	/**
	 * mouseup none  This event is fired for the DOM mouseup on the marker. Notice that the marker will not stop the mousedown DOM event, because it will not confuse the drag handler of the map.
	 */ 
	public void addOnMouseUpListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnMouseUpListener(this, marker);
	}
	
	public void onMouseUp(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseUpAndCatch(marker, handler);
	    else
	    	fireOnMouseUpImpl(marker);		
	}
	
	private void fireOnMouseUpAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseUpImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseUpImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onMouseUp(marker);
		    }
	}
	
	/**
	 * mouseover none  This event is fired when the mouse enters the area of the marker icon.
	 */
	public void addOnMouseOverListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnMouseOverListener(this, marker);
	}

	public void onMouseOver(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseOverAndCatch(marker, handler);
	    else
	    	fireOnMouseOverImpl(marker);		
	}
	
	private void fireOnMouseOverAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseOverImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseOverImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onMouseOver(marker);
		    }
	}
	
	/**
	 * mouseout none  This event is fired when the mouse leaves the area of the marker icon.
	 */
	public void addOnMouseOutListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnMouseOutListener(this, marker);
	}

	public void onMouseOut(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseOutAndCatch(marker, handler);
	    else
	    	fireOnMouseOutImpl(marker);		
	}
	
	private void fireOnMouseOutAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseOutImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseOutImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onMouseOut(marker);
		    }
	}
	
	/**
	 * infowindowopen none  This event is fired when the info window of the map was opened through this marker.
	 */
	public void addOnInfoWindowOpenListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnInfoWindowOpenListener(this, marker);
	}

	public void onInfoWindowOpen(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnInfoWindowOpenAndCatch(marker, handler);
	    else
	    	fireOnInfoWindowOpenImpl(marker);		
	}
	
	private void fireOnInfoWindowOpenAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnInfoWindowOpenImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnInfoWindowOpenImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onInfoWindowOpen(marker);
		    }
	}
	
	/**
	 * infowindowclose none  This event is fired when the info window of the map that was opened through this marker is closed again. This happens when either the info window was closed, or when it was opened on another marker, or on the map.
	 */ 
	public void addOnInfoWindowCloseListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnInfoWindowCloseListener(this, marker);
	}

	public void onInfoWindowClose(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnInfoWindowCloseAndCatch(marker, handler);
	    else
	    	fireOnInfoWindowCloseImpl(marker);		
	}
	
	private void fireOnInfoWindowCloseAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnInfoWindowCloseImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnInfoWindowCloseImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onInfoWindowClose(marker);
		    }
	}
	
	/**
	 * remove none  This event is fired when the marker is removed from the map, using GMap2.removeOverlay() or GMap2.clearOverlays().
	 */
	public void addOnRemoveListener(GMarker marker, GMarkerEventListener listener)
	{
		addListener(listener);
		GMarkerEventManagerImpl.addOnRemoveListener(this, marker);
	}
	
	public void onRemove(GMarker marker)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnRemoveAndCatch(marker, handler);
	    else
	    	fireOnRemoveImpl(marker);		
	}
	
	private void fireOnRemoveAndCatch(GMarker marker, UncaughtExceptionHandler handler) {
		    try {
		      fireOnRemoveImpl(marker);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnRemoveImpl(GMarker marker) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMarkerEventListener listener = (GMarkerEventListener) it.next();
		      listener.onRemove(marker);
		    }
	}
	
	protected void addListener(GMarkerEventListener listener)
	{
		eventListeners.add(listener);
	}
	
	public static void clearInstanceListeners(GMarker source)
	{
		GMarkerEventManagerImpl.clearInstanceListeners(source);
	}
}
