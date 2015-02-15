package oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource;

import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.contributor.NameIdentifier;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Contributor {

	@Attribute
	private String contributorType = "";
	
	@Element
	private String contributorName = "";
	
	@Element
	private NameIdentifier nameIdentifier;

	/**
	 * @return the contributorType
	 */
	public String getContributorType() {
		return contributorType;
	}

	/**
	 * @param contributorType the contributorType to set
	 */
	public void setContributorType(String contributorType) {
		this.contributorType = contributorType;
	}

	/**
	 * @return the contributorName
	 */
	public String getContributorName() {
		return contributorName;
	}

	/**
	 * @param contributorName the contributorName to set
	 */
	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}

	/**
	 * @return the nameIdentifier
	 */
	public NameIdentifier getNameIdentifier() {
		return nameIdentifier;
	}

	/**
	 * @param nameIdentifier the nameIdentifier to set
	 */
	public void setNameIdentifier(NameIdentifier nameIdentifier) {
		this.nameIdentifier = nameIdentifier;
	}
}
