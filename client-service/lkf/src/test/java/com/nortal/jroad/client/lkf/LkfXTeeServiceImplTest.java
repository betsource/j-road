package com.nortal.jroad.client.lkf;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.lkf.LkfXTeeServiceImpl;
import com.nortal.jroad.client.lkf.types.ee.riik.xtee.lkf.producers.producer.lkf.KindlustuskaitseOtsingParing;
import com.nortal.jroad.client.lkf.types.ee.riik.xtee.lkf.producers.producer.lkf.KindlustuskaitseOtsingVastus;
import com.nortal.jroad.client.lkf.types.ee.riik.xtee.lkf.producers.producer.lkf.RomudeOtsingVastus;
import com.nortal.jroad.client.lkf.types.ee.riik.xtee.lkf.producers.producer.lkf.RomudeOtsingVastus.ClaimBangers.Item.Vehicle;
import com.nortal.jroad.client.test.BaseXRoadServiceImplTest;

/**
 * @author Tatjana Kulikova (tatjana.kulikova@nortal.com)
 * @date 17.02.2011
 */
public class LkfXTeeServiceImplTest extends BaseXRoadServiceImplTest {

  @Resource
  private LkfXTeeServiceImpl lkfXTeeServiceImpl;
  
  private static final Calendar START = Calendar.getInstance();
  private static final Calendar END = Calendar.getInstance();
  
  static {
	  START.set(2010, 10, 1, 0, 0);
	  END.set(2011, 10, 1, 23, 59);
  }

  @Test
  public void romudeOtsing() throws XRoadServiceConsumptionException {

	RomudeOtsingVastus response = lkfXTeeServiceImpl.romudeOtsing(START, END);
    Assert.assertNotNull(response);
    Assert.assertFalse(response.getClaimBangers().getItemList().isEmpty());
    Vehicle vehicle= response.getClaimBangers().getItemList().get(0).getVehicle();
    Assert.assertEquals("280BAF", vehicle.getVehicleRegNo());
    Assert.assertEquals("VSSZZZ5PZ7R039967", vehicle.getVehicleVin());
  }
  
  @Test
  public void kindlustusKaitseOtsing() throws XRoadServiceConsumptionException {
    KindlustuskaitseOtsingParing paring = KindlustuskaitseOtsingParing.Factory.newInstance();
    paring.setVehicleVin("VSSZZZ5PZ7R039967");
    KindlustuskaitseOtsingVastus vastus = lkfXTeeServiceImpl.kindlustusKaitseOtsing(paring);
    Assert.assertEquals(vastus.getInsuranceCovers().getItemArray(0).getInsuranceCover().getVehicleMake(), "SEAT");
  }
}
