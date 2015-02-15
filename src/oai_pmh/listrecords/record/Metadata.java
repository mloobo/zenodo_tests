package oai_pmh.listrecords.record;

import oai_pmh.listrecords.record.metadata.OaiDatacite;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Metadata {

	@Element
	private OaiDatacite oai_datacite;

	/**
	 * @return the oai_datacite
	 */
	public OaiDatacite getOai_datacite() {
		return oai_datacite;
	}

	/**
	 * @param oai_datacite the oai_datacite to set
	 */
	public void setOai_datacite(OaiDatacite oai_datacite) {
		this.oai_datacite = oai_datacite;
	}
}
