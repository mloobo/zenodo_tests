package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Creator {

	@Element
	private String creatorName = "";
	
	@Element(required=false)
	private String affiliation = "";

	/**
	 * @return the creatorName
	 */
	public String getCreatorName() {
		return creatorName;
	}

	/**
	 * @param creatorName the creatorName to set
	 */
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	/**
	 * @return the affiliation
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * @param affiliation the affiliation to set
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
}
