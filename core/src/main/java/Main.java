

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by c-ionnbote on 11/7/2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String schema = "S:\\Edifecs\\TM\\sdk\\tm-components-xes\\tm\\resources\\gbd-search\\template\\schema\\ops-repository-v1.0.xsd";
        String xml =    "S:\\Edifecs\\TM\\sdk\\tm-components-xes\\tm\\resources\\gbd-search\\template\\search_sample.xml";
        InputStream xsdStream = new FileInputStream(new File(schema));
        InputStream xmlStream = new FileInputStream(new File(xml));


        System.out.println(validateAgainstXSD(xmlStream, xsdStream));
        //validateAgainstXSD(xmlStream, xsdStream);
    }

    static boolean validateAgainstXSD(InputStream xml, InputStream xsd)
    {
        try
        {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        }
        catch(Exception ex)
        {
           /* System.out.println(ex.getMessage());
            System.out.println();
            System.out.println(ex.toString());
*/
            ex.printStackTrace();
            return false;
        }
    }
}
