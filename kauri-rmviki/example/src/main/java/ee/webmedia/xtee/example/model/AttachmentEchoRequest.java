//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2009.09.23 at 11:57:10 PM EEST
//

package ee.webmedia.xtee.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AttachmentEchoRequest complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;AttachmentEchoRequest&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;Nest&quot; type=&quot;{http://producers.naidis.xtee.riik.ee/producer/naidis}AttachmentEchoNest&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentEchoRequest", propOrder = { "nest" })
public class AttachmentEchoRequest {

  @XmlElement(name = "Nest", required = true)
  protected AttachmentEchoNest nest;

  /**
   * Gets the value of the nest property.
   * 
   * @return possible object is {@link AttachmentEchoNest }
   */
  public AttachmentEchoNest getNest() {
    return nest;
  }

  /**
   * Sets the value of the nest property.
   * 
   * @param value allowed object is {@link AttachmentEchoNest }
   */
  public void setNest(AttachmentEchoNest value) {
    this.nest = value;
  }

}
