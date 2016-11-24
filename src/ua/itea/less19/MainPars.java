package ua.itea.less19;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Администратор on 07.11.2016.
 */
public class MainPars {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SaxParcer mp=new SaxParcer();
        SAXParserFactory sf=SAXParserFactory.newInstance();
        SAXParser parser=sf.newSAXParser();
        parser.parse(new File("C:/dog.xml"), mp);
    }


}
