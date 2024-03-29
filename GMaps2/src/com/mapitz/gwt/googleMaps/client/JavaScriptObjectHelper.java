package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

class JavaScriptObjectHelper
{

	private JavaScriptObjectHelper()
	{
		
	}
	
	public static native String getAttribute(JavaScriptObject elem, String attr) /*-{
	    var ret = elem[attr];
	    return (ret === undefined) ? null : String(ret);
	}-*/;
	
	public static native void setAttribute(JavaScriptObject elem, String attr, String value) /*-{
	    elem[attr] = value;
	}-*/;
	
	public static native JavaScriptObject getAttributeAsJavaScriptObject(JavaScriptObject elem, String attr) /*-{
    var ret = elem[attr];
    return (ret === undefined) ? null : ret;
    }-*/;

	public static native JavaScriptObject[] getAttributeAsJavaScriptObjectArray(JavaScriptObject elem, String attr) /*-{
    	var ret = elem[attr];
    	return (ret === undefined) ? null : ret;
    }-*/;
	
	public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject[] value) /*-{
		elem[attr] = value;
	}-*/;
	
	public static native void setAttribute(JavaScriptObject elem, String attr, JavaScriptObject value) /*-{
    	elem[attr] = value;
    }-*/;
	
	public static native void setAttribute(JavaScriptObject elem, String attr, int value) /*-{
    	elem[attr] = value;
    }-*/;

	public static native void setAttribute(JavaScriptObject elem, String attr, boolean value) /*-{
		elem[attr] = value;
	}-*/;

	public static native int getAttributeAsInt(JavaScriptObject elem, String attr) /*-{
    	var ret = elem[attr];
    	return (ret === undefined) ? null : ret;
    }-*/;
	
	public static native int[] getAttributeAsIntArray(JavaScriptObject elem, String attr) /*-{
    	var ret = elem[attr];
    	return (ret === undefined) ? null : ret;
    }-*/;
	
	public static native void setAttributeAsIntArray(JavaScriptObject elem, String attr, int[] value) /*-{
    	elem[attr] = value;
    }-*/;
	
	public static native boolean getAttributeAsBoolean(JavaScriptObject elem, String attr) /*-{
    	var ret = elem[attr];
    	return (ret === undefined) ? null : ret;
    }-*/;
	
	
	public static JavaScriptObject arrayConvert(Object[] array) 
	{ 
	        JavaScriptObject result = newJSArray(array.length); 
	        for (int i = 0; i < array.length; i++) 
	        { 
	                arraySet(result, i, array[i]); 
	        } 
	        return result; 
	} 

	
	public static JavaScriptObject arrayConvert(JavaScriptObject[] array) 
	{ 
	        JavaScriptObject result = newJSArray(array.length); 
	        for (int i = 0; i < array.length; i++) 
	        { 
	                arraySet(result, i, array[i]); 
	        } 
	        return result; 
	} 
		
	private static native JavaScriptObject newJSArray(int length) /*-{ 
	    if (length < 0) 
	    { 
	            return new Array(); 
	    } 
	    else 
	    { 
	            return new Array(length); 
	    } 
	}-*/;

	public static native int arrayLength(JavaScriptObject array) /*-{ 
	        return array.length;
	}-*/; 


	public static native Object arrayGetObject(JavaScriptObject array, int index) /*-{ 
	        return array[index]; 
	}-*/; 

	public static native void arraySet(JavaScriptObject array, int index, Object value) /*-{ 
    	array[index] = value; 
    
	}-*/; 

	public static native void arraySet(JavaScriptObject array, int index, JavaScriptObject value) /*-{ 
	        array[index] = value; 

	}-*/; 
}
