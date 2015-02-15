package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class ResourceType {

	@Attribute
	private String resourceTypeGeneral = "";

	/**
	 * @return the resourceTypeGeneral
	 */
	public String getResourceTypeGeneral() {
		return resourceTypeGeneral;
	}

	/**
	 * @param resourceTypeGeneral the resourceTypeGeneral to set
	 */
	public void setResourceTypeGeneral(String resourceTypeGeneral) {
		this.resourceTypeGeneral = resourceTypeGeneral;
	}
	
	
}
