package com.epam.vaigandt.runner;

import com.epam.vaigandt.parser.DOMParser;
import com.epam.vaigandt.parser.ParserFactory;
import com.epam.vaigandt.parser.STAXParser;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {


        System.out.println("---STAX---");
        ParserFactory staxParser = new STAXParser();
        staxParser.getDatas();

        System.out.println("---DOM---");
        ParserFactory domParser = new DOMParser();
        domParser.getDatas();





    }
}
