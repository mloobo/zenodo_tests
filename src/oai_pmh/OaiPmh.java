package oai_pmh;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class OaiPmh {
	@Element(required=false)
	private String xmlns = "";
	
	/*@Element(name="xmlns:xsi")
	private String xmlns_xsi = "";*/
	
	@Attribute(name="schemaLocation")
	private String xsi_schemaLocation = "";

	@Element
	private String responseDate = "";
	
	@Element
	private Request request;
	
	@Element
	private ListRecords ListRecords;
	
	/**
	 * @return the xmlns
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * @param xmlns the xmlns to set
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * @return the xmlns_xsi
	 */
	/*public String getXmlns_xsi() {
		return xmlns_xsi;
	}

	*//**
	 * @param xmlns_xsi the xmlns_xsi to set
	 *//*
	public void setXmlns_xsi(String xmlns_xsi) {
		this.xmlns_xsi = xmlns_xsi;
	}*/

	/**
	 * @return the xsi_schemaLocation
	 */
	public String getXsi_schemaLocation() {
		return xsi_schemaLocation;
	}

	/**
	 * @param xsi_schemaLocation the xsi_schemaLocation to set
	 */
	public void setXsi_schemaLocation(String xsi_schemaLocation) {
		this.xsi_schemaLocation = xsi_schemaLocation;
	}

	/**
	 * @return the responseDate
	 */
	public String getResponseDate() {
		return responseDate;
	}

	/**
	 * @param responseDate the responseDate to set
	 */
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
	}

	/**
	 * @return the listRecords
	 */
	public ListRecords getListRecords() {
		return ListRecords;
	}

	/**
	 * @param listRecords the listRecords to set
	 */
	public void setListRecords(ListRecords listRecords) {
		ListRecords = listRecords;
	}
}
