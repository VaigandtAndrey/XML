package com.epam.vaigandt.parser;

import com.epam.vaigandt.entity.Gem;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DOMParser implements ParserFactory  {


    @Override
    public void getDatas() {
        try
        {
            File xmlFile = new File("src/main/resources/Gems.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
            NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
            System.out.println("--------------------");
            for(int tmp = 0; tmp < nodeList.getLength(); tmp++)
            {
                Node node = nodeList.item(tmp);
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element)node;
                    System.out.println("Gem #" + tmp + ":");
//                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Preciousness: " + element.getElementsByTagName("preciousness").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Origin: " + element.getElementsByTagName("origin").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Visual Parameters: " + element.getElementsByTagName("visualParameters").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Color: " + element.getElementsByTagName("color").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Transparency: " + element.getElementsByTagName("transparency").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Edge Number: " + element.getElementsByTagName("edgeNumber").item(0).getChildNodes().item(0).getNodeValue());
//                    System.out.println("Value: " + element.getElementsByTagName("value").item(0).getChildNodes().item(0).getNodeValue());
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }


}
}
