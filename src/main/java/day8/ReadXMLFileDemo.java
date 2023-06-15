package day8;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadXMLFileDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("read.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            Element rootElement = document.getRootElement();
            List<Element> childElements = rootElement.getChildren();
            for (Element child : childElements) {
                String name = child.getName();
                String value = child.getValue();
                System.out.println("Name: " + name + ", Value: " + value);
            }
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
    }
}