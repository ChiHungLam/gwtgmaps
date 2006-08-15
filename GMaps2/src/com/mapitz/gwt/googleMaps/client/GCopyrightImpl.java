package com.mapitz.gwt.googleMaps.client;

class GCopyrightImpl
{
	//GCopyright(id, bounds, minZoom, text)
	public static native GCopyright create(int id, GLatLngBounds bounds, int minZoom, String text)/*-{
		return new $wnd.GCopyright(id, bounds, minZoom, text);
	}-*/;
}
