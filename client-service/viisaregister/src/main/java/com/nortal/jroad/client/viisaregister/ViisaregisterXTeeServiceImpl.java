package com.nortal.jroad.client.viisaregister;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.springframework.stereotype.Service;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.service.XRoadDatabaseService;
import com.nortal.jroad.client.viisaregister.database.ViisaregisterXRoadDatabase;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.StruktIsikSuguMK;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseAndmedIsikReisidokSisend;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseAndmedNrLiikSisend;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseAndmedVastus;
import com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotlusteNimistuVastus;

@Service("viisaregisterXTeeService")
public class ViisaregisterXTeeServiceImpl extends XRoadDatabaseService implements ViisaregisterXTeeService {

  @Resource
  private ViisaregisterXRoadDatabase viisaregisterXRoadDatabase;

	public TaotlusteNimistuVastus taotluseAndmedIsikReisidokumentParing(String eesnimi, String perenimi, Calendar synniaeg, String sugu, String reisiDokLiik, String reisiDokNr, Calendar reisiDokValjastamisKuup, String toimik) throws XRoadServiceConsumptionException {
		TaotluseAndmedIsikReisidokSisend paring = TaotluseAndmedIsikReisidokSisend.Factory.newInstance();
		if (eesnimi != null || perenimi != null || synniaeg != null || sugu != null) {
			StruktIsikSuguMK isik = paring.addNewIsik();
			isik.setEesnimi(eesnimi);
			isik.setPerenimi(perenimi);
			isik.setSynniaeg(synniaeg);
			com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.Sugu.Enum suguEnum = com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.Sugu.Enum.forString(sugu);
			isik.setSugu(suguEnum);
		}

		com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.ReisiDokLiik.Enum reisiDokLiikEnum = com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.ReisiDokLiik.Enum.forString(reisiDokLiik);
		paring.setReisiDokLiik(reisiDokLiikEnum);
		paring.setReisiDokNr(reisiDokNr);
		paring.setReisiDokValjastamisKuup(reisiDokValjastamisKuup);

		//Kuna viisaregister tahab kindlasti oma xsi:type atribuute näha, siis paneme need käsitsi külge
		XmlCursor cursor = paring.newCursor();
		while (!cursor.isEnddoc()) {
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("isik")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "ns5:struktIsikSuguMK");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("eesnimi")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:string");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("perenimi")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:string");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("synniaeg")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:date");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("sugu")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "ns5:sugu");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("reisiDokLiik")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "ns5:reisiDokLiik");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("reisiDokNr")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:string");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("reisiDokValjastamisKuup")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:date");
			}
			cursor.toNextToken();
		}

		return viisaregisterXRoadDatabase.taotlAndmedIsikReisidokParingV1(paring);
	}

	public TaotluseAndmedVastus taotluseAndmedNrLiikParing(String taotluseLiik, String taotluseNr) throws XRoadServiceConsumptionException {
		TaotluseAndmedNrLiikSisend paring = TaotluseAndmedNrLiikSisend.Factory.newInstance();
		paring.setTaotluseLiik(com.nortal.jroad.client.viisaregister.types.ee.riik.xtee.viisaregister.producers.producer.viisaregister.TaotluseLiik.Enum.forString(taotluseLiik));
		paring.setTaotluseNr(taotluseNr);

		//Kuna viisaregister tahab kindlasti oma xsi:type atribuute näha, siis paneme need käsitsi külge
		XmlCursor cursor = paring.newCursor();
		while (!cursor.isEnddoc()) {
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("taotluseLiik")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "ns5:taotluseLiik");
			}
			if (cursor.isStart() && cursor.getName().getLocalPart().equals("taotluseNr")) {
				cursor.toNextToken();
				cursor.insertAttributeWithValue(new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi"), "xsd:string");
			}
			cursor.toNextToken();
		}

		return viisaregisterXRoadDatabase.taotlAndmedNrLiikParingV1(paring);
	}


  public void setViisaregisterXRoadDatabase(ViisaregisterXRoadDatabase viisaregisterXRoadDatabase) {
    this.viisaregisterXRoadDatabase = viisaregisterXRoadDatabase;
  }

}
