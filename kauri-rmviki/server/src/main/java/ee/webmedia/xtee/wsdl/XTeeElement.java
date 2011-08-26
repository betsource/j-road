package ee.webmedia.xtee.wsdl;

import java.io.PrintWriter;

import javax.wsdl.Definition;
import javax.wsdl.WSDLException;
import javax.wsdl.extensions.ExtensibilityElement;
import javax.wsdl.extensions.ExtensionRegistry;
import javax.wsdl.extensions.ExtensionSerializer;
import javax.xml.namespace.QName;

/**
 * Element implementation for WSDL generator
 * 
 * @author Dmitri Danilkin
 */
public class XTeeElement implements ExtensibilityElement {
  public static final QName VERSION_TYPE =
      new QName(XTeeWsdlDefinition.XTEE_NAMESPACE, "version", XTeeWsdlDefinition.XTEE_PREFIX);
  private QName elementType;
  private Boolean required = null;
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String version) {
    this.value = version;
  }

  public QName getElementType() {
    return elementType;
  }

  public Boolean getRequired() {
    return required;
  }

  public void setElementType(QName elementType) {
    this.elementType = elementType;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public static class XteeElementSerializer implements ExtensionSerializer {
    @SuppressWarnings("unchecked")
    public void marshall(Class parentType,
                         QName elementType,
                         ExtensibilityElement extension,
                         PrintWriter pw,
                         Definition def,
                         ExtensionRegistry extReg) throws WSDLException {
      pw.append("        <xtee:" + elementType.getLocalPart() + ">");
      pw.append(((XTeeElement) extension).getValue());
      pw.append("</xtee:" + elementType.getLocalPart() + ">\n");
    }
  }
}
