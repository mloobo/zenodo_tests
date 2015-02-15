package oai_pmh;

import java.util.List;

import oai_pmh.listrecords.Record;
import oai_pmh.listrecords.ResumptionToken;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class ListRecords {

	@ElementList(inline=true)
	private List<Record> list;
	
	@Element
	private ResumptionToken resumptionToken;

	/**
	 * @return the list
	 */
	public List<Record> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Record> list) {
		this.list = list;
	}

	/**
	 * @return the resumptionToken
	 */
	public ResumptionToken getResumptionToken() {
		return resumptionToken;
	}

	/**
	 * @param resumptionToken the resumptionToken to set
	 */
	public void setResumptionToken(ResumptionToken resumptionToken) {
		this.resumptionToken = resumptionToken;
	}
	
	
}
