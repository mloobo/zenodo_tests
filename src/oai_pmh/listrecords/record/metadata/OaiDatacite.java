package oai_pmh.listrecords.record.metadata;

import oai_pmh.listrecords.record.metadata.oaidatacite.Payload;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class OaiDatacite {
	
	/*@Element(name="xmlns:xsi")
	private String xmlns_xsi = "";*/
	
	@Attribute(name="schemaLocation")
	private String schemaLocation = "";
	
	@Element
	private boolean isReferenceQuality = false;
	
	@Element
	private float schemaVersion = 0;
	
	@Element
	private String datacentreSymbol = "";
	
	@Element
	private Payload payload;

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
	 * @return the schemaLocation
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * @param schemaLocation the schemaLocation to set
	 */
	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	/**
	 * @return the isReferenceQuality
	 */
	public boolean isReferenceQuality() {
		return isReferenceQuality;
	}

	/**
	 * @param isReferenceQuality the isReferenceQuality to set
	 */
	public void setReferenceQuality(boolean isReferenceQuality) {
		this.isReferenceQuality = isReferenceQuality;
	}

	/**
	 * @return the schemaVersion
	 */
	public float getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * @param schemaVersion the schemaVersion to set
	 */
	public void setSchemaVersion(float schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	/**
	 * @return the datacentreSymbol
	 */
	public String getDatacentreSymbol() {
		return datacentreSymbol;
	}

	/**
	 * @param datacentreSymbol the datacentreSymbol to set
	 */
	public void setDatacentreSymbol(String datacentreSymbol) {
		this.datacentreSymbol = datacentreSymbol;
	}

	/**
	 * @return the payload
	 */
	public Payload getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Payload payload) {
		this.payload = payload;
	}

}
