package oai_pmh.listrecords;

import oai_pmh.listrecords.record.Header;
import oai_pmh.listrecords.record.Metadata;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Record {

	@Element
	private Header header;
	
	@Element
	private Metadata metadata;

	/**
	 * @return the header
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(Header header) {
		this.header = header;
	}

	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	
}
