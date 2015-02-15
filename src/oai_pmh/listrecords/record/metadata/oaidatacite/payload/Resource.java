package oai_pmh.listrecords.record.metadata.oaidatacite.payload;

import java.util.List;

import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.AlternateIdentifier;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Contributor;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Creator;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Date;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Description;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Indentifier;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.RelatedIdentifier;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.ResourceType;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.resource.Rights;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Resource {
	
	@Attribute(name="schemaLocation")
	private String schemaLocation = "";
	
	@Element
	private Indentifier identifier;
	
	@ElementList
	private List<Creator> creators;
	
	@ElementList(entry="title")
	private List<String> titles;
	
	@Element
	private String publisher = "";
	
	@Element
	private int publicationYear = 0;
	
	@ElementList(entry="subject", required=false)
	private List<String> subjects;
	
	@ElementList(entry="contributors", required=false)
	private List<Contributor> contributors;
	
	@ElementList
	private List<Date> dates;
	
	@Element(required=false)
	private String language = "";
	
	@Element
	private ResourceType resourceType;
	
	@ElementList
	private List<AlternateIdentifier> alternateIdentifiers;
	
	@ElementList(required=false)
	private List<RelatedIdentifier> relatedIdentifiers;
	
	@ElementList
	private List<Rights> rightsList;
	
	@ElementList
	private List<Description> descriptions;

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
	 * @return the identifier
	 */
	public Indentifier getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(Indentifier identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the creators
	 */
	public List<Creator> getCreators() {
		return creators;
	}

	/**
	 * @param creators the creators to set
	 */
	public void setCreators(List<Creator> creators) {
		this.creators = creators;
	}

	/**
	 * @return the titles
	 */
	public List<String> getTitles() {
		return titles;
	}

	/**
	 * @param titles the titles to set
	 */
	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the publicationYear
	 */
	public int getPublicationYear() {
		return publicationYear;
	}

	/**
	 * @param publicationYear the publicationYear to set
	 */
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	/**
	 * @return the subjects
	 */
	public List<String> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the contributors
	 */
	public List<Contributor> getContributors() {
		return contributors;
	}

	/**
	 * @param contributors the contributors to set
	 */
	public void setContributors(List<Contributor> contributors) {
		this.contributors = contributors;
	}

	/**
	 * @return the dates
	 */
	public List<Date> getDates() {
		return dates;
	}

	/**
	 * @param dates the dates to set
	 */
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the resourceType
	 */
	public ResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * @return the alternateIdentifiers
	 */
	public List<AlternateIdentifier> getAlternateIdentifiers() {
		return alternateIdentifiers;
	}

	/**
	 * @param alternateIdentifiers the alternateIdentifiers to set
	 */
	public void setAlternateIdentifiers(
			List<AlternateIdentifier> alternateIdentifiers) {
		this.alternateIdentifiers = alternateIdentifiers;
	}

	/**
	 * @return the relatedIdentifiers
	 */
	public List<RelatedIdentifier> getRelatedIdentifiers() {
		return relatedIdentifiers;
	}

	/**
	 * @param relatedIdentifiers the relatedIdentifiers to set
	 */
	public void setRelatedIdentifiers(List<RelatedIdentifier> relatedIdentifiers) {
		this.relatedIdentifiers = relatedIdentifiers;
	}

	/**
	 * @return the rightsList
	 */
	public List<Rights> getRightsList() {
		return rightsList;
	}

	/**
	 * @param rightsList the rightsList to set
	 */
	public void setRightsList(List<Rights> rightsList) {
		this.rightsList = rightsList;
	}

	/**
	 * @return the descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}

	/**
	 * @param descriptions the descriptions to set
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
}
