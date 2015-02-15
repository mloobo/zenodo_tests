package oai_pmh.listrecords.record;

import java.util.Map;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;

@Root
public class Header {

	@Element
	private String identifier = "";
	
	@Element
	private String datestamp = "";
	
	@ElementMap(entry="setSpec", inline=true)
	private Map<String, String> map;


	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the datestamp
	 */
	public String getDatestamp() {
		return datestamp;
	}

	/**
	 * @param datestamp the datestamp to set
	 */
	public void setDatestamp(String datestamp) {
		this.datestamp = datestamp;
	}

}
