package com.mapitz.gwt.googleMaps.client;

/**
 * Represents an address from GClientGeocode, stored in GGeocodeResult
 * @author aglaforge
 *
 */
public class GGeocodeAddress
{
	String addressStr;
	String streetLine;
	String city;
	String state;
	String zip;
	String county;
	String country;
	GLatLng position;
	
	public GGeocodeAddress(String addressStr, String streetLine, String city, String state, String zip, String county, String country, double lat, double lng)
	{
		this.addressStr = addressStr;
		this.streetLine = streetLine;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.county = county;
		this.country = country;
		position = GLatLng.create(lat, lng); 
	}
	
	public static GGeocodeAddress create(String addressStr, String streetLine, String city, String state, String zip, String county, String country, double lat, double lng)
	{
		return new GGeocodeAddress(addressStr, streetLine, city, state, zip, county, country, lat, lng);
	}

	/**
	 * Example: 123 Some Street, City, TX, 12345
	 * @return
	 */
	public String getAddressStr()
	{
		return addressStr;
	}

	/**
	 * Example: Austin
	 * @return
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * Example: US
	 * @return
	 */
	public String getCountry()
	{
		return country;
	}

	/**
	 * Example: Travis
	 * @return
	 */
	public String getCounty()
	{
		return county;
	}

	/**
	 * Example: TX
	 * @return
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * Example: 12345
	 * @return
	 */
	public String getZip()
	{
		return zip;
	}

	/**
	 * Latitude and longitude position of the address
	 * @return
	 */
	public GLatLng getPosition()
	{
		return position;
	}
}
