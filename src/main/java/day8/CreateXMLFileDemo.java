package day8;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateXMLFileDemo {
    public static void main(String[] args) {
        Food f = new Food("Belgian Waffles", "$5.95", "Belgian Waffles", "650");
        try {
            Element root = new Element("root");
            Document document = new Document(root);
            Element image = new Element("food");
            image.addContent(new Element("name").setText(f.getName()));
            image.addContent(new Element("price").setText(f.getPrice()));
            image.addContent(new Element("description").setText(f.getDescription()));
            image.addContent(new Element("Calories").setText(f.getCalories()));
            root.addContent(image);
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, new FileOutputStream(new File("read.xml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
