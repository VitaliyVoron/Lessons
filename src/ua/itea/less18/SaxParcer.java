package ua.itea.less18;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParcer extends DefaultHandler {

	private StringBuffer result;

	public SaxParcer() {
		result = new StringBuffer();
	}

	@Override
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes atts) throws SAXException {
	
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {

	}

	@Override
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException {

	}

	public String getResult() {
		return result.toString();
	}
}
