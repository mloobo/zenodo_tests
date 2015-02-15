package oai_pmh.listrecords.record.metadata.oaidatacite;

import oai_pmh.listrecords.record.metadata.oaidatacite.payload.Resource;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Payload {

	@Element
	private Resource resource;

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
}
