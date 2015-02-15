package oai_pmh.listrecords.record;

import oai_pmh.listrecords.record.metadata.OaiDatacite;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Metadata {

	@Element
	private OaiDatacite oai_datacite;
}
