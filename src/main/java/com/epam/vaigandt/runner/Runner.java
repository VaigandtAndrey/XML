package com.epam.vaigandt.runner;

import com.epam.vaigandt.parser.ParserFactory;
import com.epam.vaigandt.parser.SAXParser;
import com.epam.vaigandt.parser.STAXParser;
import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{

//        System.out.println("---SAX---");
//       ParserFactory saxParser = new SAXParser();
//        saxParser.getDatas();

        System.out.println("---STAX---");
        ParserFactory staxParser = new STAXParser();
        staxParser.getDatas();

    }
}
