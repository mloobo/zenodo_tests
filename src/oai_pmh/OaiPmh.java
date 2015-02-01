package oai_pmh;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class OaiPmh {
	@Element
	private String xmlns = "";
	
	@Element(name="xmlns:xsi")
	private String xmlns_xsi = "";
	
	@Element(name="xsi:schemaLocation")
	private String xsi_schemaLocation = "";

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
	public String getXmlns_xsi() {
		return xmlns_xsi;
	}

	/**
	 * @param xmlns_xsi the xmlns_xsi to set
	 */
	public void setXmlns_xsi(String xmlns_xsi) {
		this.xmlns_xsi = xmlns_xsi;
	}

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
}
