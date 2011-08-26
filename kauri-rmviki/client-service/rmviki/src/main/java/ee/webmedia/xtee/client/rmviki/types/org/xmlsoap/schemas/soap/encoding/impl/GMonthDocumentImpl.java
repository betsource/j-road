/*
 * An XML document type.
 * Localname: gMonth
 * Namespace: http://schemas.xmlsoap.org/soap/encoding/
 * Java type: ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonthDocument
 *
 * Automatically generated - do not modify.
 */
package ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.impl;
/**
 * A document containing one gMonth(@http://schemas.xmlsoap.org/soap/encoding/) element.
 *
 * This is a complex type.
 */
public class GMonthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonthDocument
{
    private static final long serialVersionUID = 1L;
    
    public GMonthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMONTH$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "gMonth");
    
    
    /**
     * Gets the "gMonth" element
     */
    public ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth getGMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth)get_store().find_element_user(GMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gMonth" element
     */
    public void setGMonth(ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth gMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth)get_store().find_element_user(GMONTH$0, 0);
            if (target == null)
            {
                target = (ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth)get_store().add_element_user(GMONTH$0);
            }
            target.set(gMonth);
        }
    }
    
    /**
     * Appends and returns a new empty "gMonth" element
     */
    public ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth addNewGMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth target = null;
            target = (ee.webmedia.xtee.client.rmviki.types.org.xmlsoap.schemas.soap.encoding.GMonth)get_store().add_element_user(GMONTH$0);
            return target;
        }
    }
}
