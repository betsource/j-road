/*
 * XML Type:  esindus_paring
 * Namespace: http://x-tee.riik.ee/xsd/xtee.xsd
 * Java type: ee.webmedia.xtee.client.rmviki.types.ee.riik.x_tee.xsd.xtee.EsindusParing
 *
 * Automatically generated - do not modify.
 */
package ee.webmedia.xtee.client.rmviki.types.ee.riik.x_tee.xsd.xtee.impl;
/**
 * An XML esindus_paring(@http://x-tee.riik.ee/xsd/xtee.xsd).
 *
 * This is a complex type.
 */
public class EsindusParingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ee.webmedia.xtee.client.rmviki.types.ee.riik.x_tee.xsd.xtee.EsindusParing
{
    private static final long serialVersionUID = 1L;
    
    public EsindusParingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISIKUKOOD$0 = 
        new javax.xml.namespace.QName("", "isikukood");
    
    
    /**
     * Gets the "isikukood" element
     */
    public java.lang.String getIsikukood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISIKUKOOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isikukood" element
     */
    public org.apache.xmlbeans.XmlString xgetIsikukood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISIKUKOOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isikukood" element
     */
    public void setIsikukood(java.lang.String isikukood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISIKUKOOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISIKUKOOD$0);
            }
            target.setStringValue(isikukood);
        }
    }
    
    /**
     * Sets (as xml) the "isikukood" element
     */
    public void xsetIsikukood(org.apache.xmlbeans.XmlString isikukood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISIKUKOOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISIKUKOOD$0);
            }
            target.set(isikukood);
        }
    }
}
