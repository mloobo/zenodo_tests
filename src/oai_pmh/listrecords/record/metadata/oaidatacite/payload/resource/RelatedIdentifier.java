package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class RelatedIdentifier {

	@Attribute
	private String relationType = "";
	
	@Attribute
	private String relatedIdentifierType = "";
	
	@Text
	private String value = "";

	/**
	 * @return the relationType
	 */
	public String getRelationType() {
		return relationType;
	}

	/**
	 * @param relationType the relationType to set
	 */
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	/**
	 * @return the relatedIdentifierType
	 */
	public String getRelatedIdentifierType() {
		return relatedIdentifierType;
	}

	/**
	 * @param relatedIdentifierType the relatedIdentifierType to set
	 */
	public void setRelatedIdentifierType(String relatedIdentifierType) {
		this.relatedIdentifierType = relatedIdentifierType;
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
