package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class Rights {

	@Attribute
	private String rightsURI = "";
	
	@Text
	private String value = "";

	/**
	 * @return the rightsURI
	 */
	public String getRightsURI() {
		return rightsURI;
	}

	/**
	 * @param rightsURI the rightsURI to set
	 */
	public void setRightsURI(String rightsURI) {
		this.rightsURI = rightsURI;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
