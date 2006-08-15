package com.mapitz.gwt.googleMaps.client;

class GIconImpl
{
	/*
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out, and a zoom slider.
	 */
	public static native GIcon create(GIcon other)/*-{
		return new $wnd.GIcon(other);
	}-*/;
		
	public static native GIcon create(GIcon other, String url)/*-{
		return new $wnd.GIcon(other, url);
	}-*/;

	public static native GIcon create()/*-{
		return new $wnd.GIcon();
	}-*/;
	
	public static native GIcon G_DEFAULT_ICON()/*-{
		return $wnd.G_DEFAULT_ICON;
	}-*/;
}
