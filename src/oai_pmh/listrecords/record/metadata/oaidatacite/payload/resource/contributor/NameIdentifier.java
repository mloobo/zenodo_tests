package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.contributor;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class NameIdentifier {

	@Attribute
	private String nameIdentifierScheme = "";
	
	@Text
	private String value = "";

	/**
	 * @return the nameIdentifierScheme
	 */
	public String getNameIdentifierScheme() {
		return nameIdentifierScheme;
	}

	/**
	 * @param nameIdentifierScheme the nameIdentifierScheme to set
	 */
	public void setNameIdentifierScheme(String nameIdentifierScheme) {
		this.nameIdentifierScheme = nameIdentifierScheme;
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
