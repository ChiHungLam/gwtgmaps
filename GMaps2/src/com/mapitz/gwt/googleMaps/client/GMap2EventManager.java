package com.mapitz.gwt.googleMaps.client;

import java.util.HashSet;
import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

/**
 * Event manager for GMap2, see GMap2EventListner for a description of the handlers
 * @author aglaforge
 *
 */
public class GMap2EventManager
{
	private HashSet eventListeners = new HashSet();
	
	public void addOnMouseOverListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMouseOverListener(this, map);
	}
	
	public void addOnMoveEndListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMoveEndListener(this, map);
	}
	public void addOnAddMapTypeListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnAddMapTypeListener(this, map);
	}
	
	public void addOnRemoveMapTypeListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnRemoveMapTypeListener(this, map);
	}
	
	public void addOnMoveStartListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMoveStartListener(this, map);
	}
	
	public void addOnMapTypeChangedListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMapTypeChangedListener(this, map);
	}
	
	public void addOnMoveListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMoveListener(this, map);
	}
	
	public void addOnClickListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);	
		GMap2EventManagerImpl.addOnClickListener(this, map);
	}
	
	public void addOnZoomEndListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnZoomEndListener(this, map);
	}
	
	public void addOnDragEndListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnDragEndListener(this, map);
	}
	
	public void addOnDragListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnDragListener(this, map);
	}
	
	public void addOnDragStartListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnDragStartListener(this, map);
	}
	
	public void addOnLoadListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnLoadListener(this, map);
	}
	
	public void addOnInfoWindowCloseListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnInfoWindowCloseListener(this, map);
	}
	
	public void addOnInfoWindowOpenListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnInfoWindowOpenListener(this, map);
	}
	
	public void addOnMouseOutListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMouseOutListener(this, map);
	}
	
	public void addOnMouseMoveListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnMouseMoveListener(this, map);
	}
	
	public void addOnAddOverlayListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnAddOverlayListener(this, map);
	}
	
	public void addOnRemoveOverlayListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnRemoveOverlayListener(this, map);
	}
	
	public void addOnClearOverlaysListener(GMap2 map, GMap2EventListener listener)
	{
		addListener(listener);
		GMap2EventManagerImpl.addOnClearOverlaysListener(this, map);
	}
	
	protected void addListener(GMap2EventListener listener)
	{
		this.eventListeners.add(listener);
	}
	
//	public void addGMap2EventListener(GMap2 map, GMap2EventListener listener)
//	{
//		GMap2EventManagerImpl.addOnMouseOverListener(this, map);
//		GMap2EventManagerImpl.addOnMoveEndListener(this, map);
//		GMap2EventManagerImpl.addOnAddMapTypeListener(this, map);
//		GMap2EventManagerImpl.addOnRemoveMapTypeListener(this, map);
//		GMap2EventManagerImpl.addOnMoveStartListener(this, map);
//		GMap2EventManagerImpl.addOnMapTypeChangedListener(this, map);
//		GMap2EventManagerImpl.addOnMoveListener(this, map);
//		GMap2EventManagerImpl.addOnClickListener(this, map);
//		GMap2EventManagerImpl.addOnZoomEndListener(this, map);
//		GMap2EventManagerImpl.addOnDragEndListener(this, map);
//		GMap2EventManagerImpl.addOnDragListener(this, map);
//		GMap2EventManagerImpl.addOnDragStartListener(this, map);
//		GMap2EventManagerImpl.addOnLoadListener(this, map);
//		GMap2EventManagerImpl.addOnInfoWindowCloseListener(this, map);
//		GMap2EventManagerImpl.addOnInfoWindowOpenListener(this, map);
//		GMap2EventManagerImpl.addOnMouseOutListener(this, map);
//		GMap2EventManagerImpl.addOnMouseMoveListener(this, map);
//		GMap2EventManagerImpl.addOnAddOverlayListener(this, map);
//		GMap2EventManagerImpl.addOnRemoveOverlayListener(this, map);
//		GMap2EventManagerImpl.addOnClearOverlaysListener(this, map);
//	}
	
	public void onMouseOver(GMap2 map, GLatLng latlng)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseOverAndCatch(map, latlng, handler);
	    else
	    	fireOnMouseOverImpl(map, latlng);		
	}
	
	private void fireOnMouseOverAndCatch(GMap2 map, GLatLng latlng,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseOverImpl(map, latlng);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseOverImpl(GMap2 map, GLatLng latlng) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMouseOver(map, latlng);
		    }
	}

	public void onMouseOut(GMap2 map, GLatLng latlng)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseOutAndCatch(map, latlng, handler);
	    else
	    	fireOnMouseOutImpl(map, latlng);		
	}
	
	private void fireOnMouseOutAndCatch(GMap2 map, GLatLng latlng,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseOutImpl(map, latlng);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseOutImpl(GMap2 map, GLatLng latlng) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMouseOut(map, latlng);
		    }
	}

	public void onMouseMove(GMap2 map, GLatLng latlng)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMouseMoveAndCatch(map, latlng, handler);
	    else
	    	fireOnMouseMoveImpl(map, latlng);		
	}
	
	private void fireOnMouseMoveAndCatch(GMap2 map, GLatLng latlng,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnMouseMoveImpl(map, latlng);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMouseMoveImpl(GMap2 map, GLatLng latlng) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMouseMove(map, latlng);
		    }
	}

	
	public void onClick(GMap2 map, GOverlay overlay, GLatLng point)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnClickAndCatch(map, overlay, point, handler);
	    else
	    	fireOnClickImpl(map, overlay, point);		
	}
	
	private void fireOnClickAndCatch(GMap2 map, GOverlay overlay, GLatLng point,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnClickImpl(map, overlay, point);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnClickImpl(GMap2 map, GOverlay overlay, GLatLng point) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onClick(map, overlay, point);
		    }
	}

	public void onAddOverlay(GMap2 map, GOverlay overlay)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnAddOverlayAndCatch(map, overlay, handler);
	    else
	    	fireOnAddOverlayImpl(map, overlay);		
	}
	
	private void fireOnAddOverlayAndCatch(GMap2 map, GOverlay overlay,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnAddOverlayImpl(map, overlay);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnAddOverlayImpl(GMap2 map, GOverlay overlay) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onAddOverlay(map, overlay);
		    }
	}

	public void onRemoveOverlay(GMap2 map, GOverlay overlay)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnRemoveOverlayAndCatch(map, overlay, handler);
	    else
	    	fireOnRemoveOverlayImpl(map, overlay);		
	}
	
	private void fireOnRemoveOverlayAndCatch(GMap2 map, GOverlay overlay,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnRemoveOverlayImpl(map, overlay);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	public void onClearOverlays(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnClearOverlaysAndCatch(map, handler);
	    else
	    	fireOnClearOverlaysImpl(map);		
	}
	
	private void fireOnClearOverlaysAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnClearOverlaysImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnClearOverlaysImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onClearOverlays(map);
		    }
	}
	
	private void fireOnRemoveOverlayImpl(GMap2 map, GOverlay overlay) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onRemoveOverlay(map, overlay);
		    }
	}
	
	public void onZoomEnd(GMap2 map, int oldLevel, int newLevel)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnZoomEndAndCatch(map, oldLevel, newLevel, handler);
	    else
	    	fireOnZoomEndImpl(map, oldLevel, newLevel);		
	}
	
	private void fireOnZoomEndAndCatch(GMap2 map, int oldLevel, int newLevel,
		      UncaughtExceptionHandler handler) {
		    try {
		      fireOnZoomEndImpl(map, oldLevel, newLevel);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnZoomEndImpl(GMap2 map, int oldLevel, int newLevel) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onZoomEnd(map, oldLevel, newLevel);
		    }
	}
	
	public void onMoveEnd(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMoveEndAndCatch(map, handler);
	    else
	    	fireOnMoveEndImpl(map);		
	}
	
	private void fireOnMoveEndAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMoveEndImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMoveEndImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMoveEnd(map);
		    }
	}

	public void onMoveStart(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMoveStartAndCatch(map, handler);
	    else
	    	fireOnMoveStartImpl(map);		
	}
	
	private void fireOnMoveStartAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMoveStartImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMoveStartImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMoveStart(map);
		    }
	}

	public void onMove(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMoveAndCatch(map, handler);
	    else
	    	fireOnMoveImpl(map);		
	}
	
	private void fireOnMoveAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnMoveImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnMoveImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onMove(map);
		    }
	}

	public void onLoad(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnLoadAndCatch(map, handler);
	    else
	    	fireOnLoadImpl(map);		
	}
	
	private void fireOnLoadAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnLoadImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnLoadImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onLoad(map);
		    }
	}

	public void onInfoWindowClose(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnInfoWindowCloseAndCatch(map, handler);
	    else
	    	fireOnInfoWindowCloseImpl(map);		
	}
	
	private void fireOnInfoWindowCloseAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnInfoWindowCloseImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnInfoWindowCloseImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onInfoWindowClose(map);
		    }
	}
	
	public void onInfoWindowOpen(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnInfoWindowOpenAndCatch(map, handler);
	    else
	    	fireOnInfoWindowOpenImpl(map);		
	}
	
	private void fireOnInfoWindowOpenAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnInfoWindowOpenImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnInfoWindowOpenImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onInfoWindowOpen(map);
		    }
	}
	
	public void onDragStart(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnDragStartAndCatch(map, handler);
	    else
	    	fireOnDragStartImpl(map);		
	}
	
	private void fireOnDragStartAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnDragStartImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnDragStartImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onDragStart(map);
		    }
	}
	
	public void onDrag(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnDragAndCatch(map, handler);
	    else
	    	fireOnDragImpl(map);		
	}
	
	private void fireOnDragAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnDragImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnDragImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onDrag(map);
		    }
	}
	
	public void onDragEnd(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnDragEndAndCatch(map, handler);
	    else
	    	fireOnDragEndImpl(map);		
	}
	
	private void fireOnDragEndAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
		    try {
		      fireOnDragEndImpl(map);
		    } catch (Throwable e) {
		      handler.onUncaughtException(e);
		    }
	}

	private void fireOnDragEndImpl(GMap2 map) {
		    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
		      GMap2EventListener listener = (GMap2EventListener) it.next();
		      listener.onDragEnd(map);
		    }
	}
	
	public void onAddMapType(GMap2 map, GMapType type)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnAddMapTypeAndCatch(map, type, handler);
	    else
	    	fireOnAddMapTypeImpl(map, type);			
	}

	private void fireOnAddMapTypeAndCatch(GMap2 map, GMapType type, UncaughtExceptionHandler handler) {
	    try {
	    	fireOnAddMapTypeImpl(map, type);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnAddMapTypeImpl(GMap2 map, GMapType type) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
	      GMap2EventListener listener = (GMap2EventListener) it.next();
	      listener.onAddMapType(map, type);
	    }
	}
	
	public void onRemoveMapType(GMap2 map, GMapType type)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnRemoveMapTypeAndCatch(map, type, handler);
	    else
	    	fireOnRemoveMapTypeImpl(map, type);			
	}

	private void fireOnRemoveMapTypeAndCatch(GMap2 map, GMapType type, UncaughtExceptionHandler handler) {
	    try {
	    	fireOnRemoveMapTypeImpl(map, type);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnRemoveMapTypeImpl(GMap2 map, GMapType type) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
	      GMap2EventListener listener = (GMap2EventListener) it.next();
	      listener.onRemoveMapType(map, type);
	    }
	}	
	public void onMapTypeChanged(GMap2 map)
	{
	    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
	    if (handler != null)
	    	fireOnMapTypeChangedAndCatch(map, handler);
	    else
	    	fireOnMoveEndImpl(map);			
	}

	private void fireOnMapTypeChangedAndCatch(GMap2 map, UncaughtExceptionHandler handler) {
	    try {
	    	fireOnMapTypeChangedImpl(map);
	    } catch (Throwable e) {
	      handler.onUncaughtException(e);
	    }
	}

	private void fireOnMapTypeChangedImpl(GMap2 map) {
	    for (Iterator it = eventListeners.iterator(); it.hasNext();) {
	      GMap2EventListener listener = (GMap2EventListener) it.next();
	      listener.onMapTypeChanged(map);
	    }
	}
	
}
