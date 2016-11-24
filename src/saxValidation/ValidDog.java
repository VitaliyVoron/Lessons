package saxValidation;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidDog {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document=db.parse(new File("C:/1/dog.xml"));
		
		SchemaFactory sf=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Source schemaF=new StreamSource(new File("C:/1/dog_schema.xsd"));
		Schema schema=sf.newSchema(schemaF);
		
		Validator validator=schema.newValidator();
		try{
		validator.validate(new DOMSource(document));
		System.out.println("Valid");
		}catch(SAXParseException e){
			System.out.println("Not Valid");
		}
		
	}

}
