package myFileWorker;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by Администратор on 09.11.2016.
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
       MyFileWriter fr = new MyFileWriter();
       //fr.fileWriter("<player>\n<name>ggggg</name>\n<decks>7</decks>\n<minBet>10</minBet>\n<maxBet>100</maxBet>\n<money>200</money>\n</player>\n");
        /*MySettings s;
        MyFileSaxParser mp = new MyFileSaxParser("katya");
        SAXParserFactory sp = SAXParserFactory.newInstance();
        SAXParser parser = sp.newSAXParser();
        parser.parse(new File("settings.xml"), mp);
        s = mp.getSettings();

        System.out.println("Name: "+s.getName()+"\nDecks: "+s.getDecks()+"\nMinBet: "+s.getMinBet()+"\nMaxBet: "+s.getMaxBet()+
        "\nMoney: "+s.getMoney());*/

        FileRead fread = new FileRead();
        String str = fread.fileReader("settings.xml");
        String addStr = "<player>\n<name>vova</name>\n<decks>40</decks>\n<minBet>1</minBet>\n<maxBet>150</maxBet>\n<money>200</money>\n</player>\n";
        StringBuffer sb = new StringBuffer(str);
        String newStr = sb.insert(str.indexOf("<players>")+9,"\n"+ addStr).toString();
        System.out.println(newStr);
        fr.fileWriter(newStr);



    }
}
