package ee.webmedia.xtee.client.aar;

import javax.annotation.Resource;

import ee.webmedia.xtee.client.exception.XTeeServiceConsumptionException;
import ee.webmedia.xtee.client.test.BaseXTeeServiceImplTest;

import junit.framework.Assert;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

/**
 * Aar andmekogu xtee teenuste testid
 * 
 * @author Lauri Lättemäe (lauri.lattemaw@webmedia.ee)
 * @date 08.10.2010
 */
public class AarXTeeServiceImplTest extends BaseXTeeServiceImplTest {
	@Resource
	private AarXTeeServiceImpl aarXTeeServiceImpl;

	@Test
	public void dummyTest() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void asutusedParing() throws XTeeServiceConsumptionException {
		Assert.assertNotNull(aarXTeeServiceImpl.asutusedParingRegistriKoodiJargi("123", "10391131"));
	}

	@Test
	public void oigusedParing() throws XTeeServiceConsumptionException {
		// Pane siia õige isikukood
		//Assert.assertNotNull(aarXTeeServiceImpl.isikuRollidAsutuses(21134L, "123", RollEnum.ESFOS_TATOTLUSE_ESITAJA, RollEnum.GENERAL_ASUTUS_ESINDAJA));
		Assert.assertTrue(true);
	}
}
