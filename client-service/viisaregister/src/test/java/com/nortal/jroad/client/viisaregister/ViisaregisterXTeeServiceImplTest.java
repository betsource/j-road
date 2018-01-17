package com.nortal.jroad.client.viisaregister;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.test.BaseXTeeServiceImplTest;
import com.nortal.jroad.client.viisaregister.ViisaregisterXTeeServiceImpl;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.StruktIsikSuguMK;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseAndmedIsikReisidokSisend;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseAndmedVastus;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotlusteNimistuVastus;

public class ViisaregisterXTeeServiceImplTest extends BaseXTeeServiceImplTest {

	@Resource
	private ViisaregisterXTeeServiceImpl viisaregisterXTeeServiceImpl;
	
	@Test
	public void taotluseAndmedIsikReisidokumentParing() throws XRoadServiceConsumptionException {
		TaotlusteNimistuVastus result = viisaregisterXTeeServiceImpl.taotluseAndmedIsikReisidokumentParing("FANNY", "JALKA", null, null, null, null, null, null);
		Assert.assertNotNull(result);
		Assert.assertNotNull(result.getTaotluseAndmed());
		Assert.assertNotNull(result.getTaotluseAndmed().getItemList());
		Assert.assertNotNull(result.getTaotluseAndmed().getItemList().get(0));
	}
	
	@Test
	public void taotluseAndmedNrLiikParing() throws XRoadServiceConsumptionException {
		TaotluseAndmedVastus result = viisaregisterXTeeServiceImpl.taotluseAndmedNrLiikParing("viisataotlus", "2010/700/15");
		Assert.assertNotNull(result);
		Assert.assertNotNull(result.getTaotlAndmed());
		Assert.assertNotNull(result.getTaotlAndmed().getViisaTaotlus());
		Assert.assertNotNull(result.getTaotlAndmed().getViisaTaotlus().getViisaTaotleja());
		Assert.assertEquals(result.getTaotlAndmed().getViisaTaotlus().getViisaTaotleja().getPerekonnanimi(), "JALKA");
	}
}
