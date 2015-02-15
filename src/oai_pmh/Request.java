package oai_pmh;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class Request {
	
	@Attribute
	private String verb = "";
	
	@Attribute
	private String set = "";
	
	@Attribute
	private String metadataPrefix = "";
	
	@Text
	private String value = "";

	/**
	 * @return the verb
	 */
	public String getVerb() {
		return verb;
	}


	/**
	 * @param verb the verb to set
	 */
	public void setVerb(String verb) {
		this.verb = verb;
	}


	/**
	 * @return the set
	 */
	public String getSet() {
		return set;
	}


	/**
	 * @param set the set to set
	 */
	public void setSet(String set) {
		this.set = set;
	}


	/**
	 * @return the metadataPrefix
	 */
	public String getMetadataPrefix() {
		return metadataPrefix;
	}


	/**
	 * @param metadataPrefix the metadataPrefix to set
	 */
	public void setMetadataPrefix(String metadataPrefix) {
		this.metadataPrefix = metadataPrefix;
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
