package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class AlternateIdentifier {

	@Attribute
	private String alternateIdentifierType = "";
	
	@Text
	private String value = "";

	/**
	 * @return the alternateIdentifierType
	 */
	public String getAlternateIdentifierType() {
		return alternateIdentifierType;
	}

	/**
	 * @param alternateIdentifierType the alternateIdentifierType to set
	 */
	public void setAlternateIdentifierType(String alternateIdentifierType) {
		this.alternateIdentifierType = alternateIdentifierType;
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
