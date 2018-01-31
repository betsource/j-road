package com.nortal.jroad.client.ariregv6;

import com.nortal.jroad.client.ariregv6.database.AriregXRoadDatabase;
import com.nortal.jroad.client.ariregv6.types.eu.x_road.arireg.producer.*;
import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by raunor
 * on 11.04.2017.
 */
@Service("ariregv6XTeeService")
public class Ariregv6XTeeServiceImpl implements Ariregv6XTeeService {
  @Resource
  private AriregXRoadDatabase ariregXRoadDatabase;

  public List<DetailandmedV5Ettevotja> findDetailandmedV1Step2(final String jurisikArk,
                                                               final String[] jurisikRollJadaArray,
                                                               boolean yldandmed,
                                                               boolean isikuandmed,
                                                               boolean menetlusesAvaldused,
                                                               boolean kommertspandiandmed,
                                                               boolean maarused,
                                                               boolean ainultKehtivad,
                                                               long maksValjundArv) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setJurisikArk(jurisikArk);
    query.setJurisikRollJadaArray(jurisikRollJadaArray);
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1).getKeha().getEttevotjad().getItemList();
  }

  public List<DetailandmedV5Ettevotja> findDetailandmedV1Step2(final String jurisikArk,
                                                               final String[] jurisikRollJadaArray,
                                                               boolean yldandmed,
                                                               boolean isikuandmed,
                                                               boolean menetlusesAvaldused,
                                                               boolean kommertspandiandmed,
                                                               boolean maarused,
                                                               boolean ainultKehtivad,
                                                               long maksValjundArv,
                                                               String userIdCode) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setJurisikArk(jurisikArk);
    query.setJurisikRollJadaArray(jurisikRollJadaArray);
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1, userIdCode).getKeha().getEttevotjad().getItemList();
  }


  public List<DetailandmedV5Ettevotja> findDetailandmedV1(final long ariregistriKood,
                                                          final String[] fyysIsikuRollideJada,
                                                          boolean yldandmed,
                                                          boolean isikuandmed,
                                                          boolean menetlusesAvaldused,
                                                          boolean kommertspandiandmed,
                                                          boolean maarused,
                                                          boolean ainultKehtivad,
                                                          long maksValjundArv) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setAriregistriKood(BigInteger.valueOf(ariregistriKood));
    if (fyysIsikuRollideJada != null) {
      query.setFyysiliseIsikuRollJadaArray(fyysIsikuRollideJada);
    }
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1).getKeha().getEttevotjad().getItemList();
  }

  public List<DetailandmedV5Ettevotja> findDetailandmedV1(final long ariregistriKood,
                                                          final String[] fyysIsikuRollideJada,
                                                          boolean yldandmed,
                                                          boolean isikuandmed,
                                                          boolean menetlusesAvaldused,
                                                          boolean kommertspandiandmed,
                                                          boolean maarused,
                                                          boolean ainultKehtivad,
                                                          long maksValjundArv,
                                                          String userIdCode) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setAriregistriKood(BigInteger.valueOf(ariregistriKood));
    if (fyysIsikuRollideJada != null) {
      query.setFyysiliseIsikuRollJadaArray(fyysIsikuRollideJada);
    }
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1, userIdCode).getKeha().getEttevotjad().getItemList();
  }

  public List<DetailandmedV5Ettevotja> findDetailandmedV5(final String fyysiliseIsikuKood,
                                                          final String[] fyysIsikuRollideJada,
                                                          boolean yldandmed,
                                                          boolean isikuandmed,
                                                          boolean menetlusesAvaldused,
                                                          boolean kommertspandiandmed,
                                                          boolean maarused,
                                                          boolean ainultKehtivad,
                                                          long maksValjundArv) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setFyysiliseIsikuKood(fyysiliseIsikuKood);
    if (fyysIsikuRollideJada != null) {
      query.setFyysiliseIsikuRollJadaArray(fyysIsikuRollideJada);
    }
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1).getKeha().getEttevotjad().getItemList();
  }

  @Override
  public List<DetailandmedV5Ettevotja> findDetailandmedV5(Integer ariregistriKood, boolean yldandmed, boolean isikuandmed, boolean menetlusesAvaldused, boolean kommertspandiandmed, boolean maarused, boolean ainultKehtivad, long maksValjundArv) throws XRoadServiceConsumptionException {
    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setAriregistriKood(BigInteger.valueOf(ariregistriKood));
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1).getKeha().getEttevotjad().getItemList();
  }

  public List<DetailandmedV5Ettevotja> findDetailandmedV5(final String fyysiliseIsikuKood,
                                                          final String[] fyysIsikuRollideJada,
                                                          boolean yldandmed,
                                                          boolean isikuandmed,
                                                          boolean menetlusesAvaldused,
                                                          boolean kommertspandiandmed,
                                                          boolean maarused,
                                                          boolean ainultKehtivad,
                                                          long maksValjundArv,
                                                          String userIdCode) throws XRoadServiceConsumptionException {

    DetailandmedV1 detailandmedV1 = DetailandmedV1.Factory.newInstance();
    DetailandmedV5Query query = DetailandmedV5Query.Factory.newInstance();
    query.setFyysiliseIsikuKood(fyysiliseIsikuKood);
    if (fyysIsikuRollideJada != null) {
      query.setFyysiliseIsikuRollJadaArray(fyysIsikuRollideJada);
    }
    query.setYandmed(yldandmed);
    query.setIandmed(isikuandmed);
    query.setDandmed(menetlusesAvaldused);
    query.setKandmed(kommertspandiandmed);
    query.setMaarused(maarused);
    query.setAinultKehtivad(ainultKehtivad);
    query.setEvarv(BigInteger.valueOf(maksValjundArv));
    detailandmedV1.setKeha(query);

    return ariregXRoadDatabase.detailandmedV1V1(detailandmedV1, userIdCode).getKeha().getEttevotjad().getItemList();
  }

  @Override
  public EttevotjaMuudatusedTasutaVastus findEttevotjaMuudatusedTasutaV1(Date date, String[] muudatused, String[] kandeosad) throws XRoadServiceConsumptionException {
    EttevotjaMuudatusedTasutaParing query = EttevotjaMuudatusedTasutaParing.Factory.newInstance();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    query.setKuupaev(cal);
    query.setMuudatusteValikArray(muudatused);
    query.setKandeKandeosadArray(kandeosad);
    EttevotjaMuudatusedTasutaV1 ettevotjaMuudatusedTasutaV1 = EttevotjaMuudatusedTasutaV1.Factory.newInstance();
    ettevotjaMuudatusedTasutaV1.setKeha(query);

    return ariregXRoadDatabase.ettevotjaMuudatusedTasutaV1V1(ettevotjaMuudatusedTasutaV1).getKeha();
  }

  @Override
  public List<ParingesindusV4Ettevote> findParingesindusV4(Integer ariregistriKood, String fyysiliseIsikuKood, String fyysiliseIsikuEesnimi, String fyysiliseIsikuPerenimi, String ariregisterValjundiFormaat) throws XRoadServiceConsumptionException {

    ParingesindusV4Paring paring = ParingesindusV4Paring.Factory.newInstance();

    if (ariregistriKood != null) {
      paring.setAriregistriKood(ariregistriKood);
    }
    if (fyysiliseIsikuKood != null) {
      paring.setFyysiliseIsikuKood(fyysiliseIsikuKood);
    }
    if (fyysiliseIsikuEesnimi != null) {
      paring.setFyysiliseIsikuEesnimi(fyysiliseIsikuEesnimi);
    }
    if (fyysiliseIsikuPerenimi != null) {
      paring.setFyysiliseIsikuPerenimi(fyysiliseIsikuPerenimi);
    }
    if (ariregisterValjundiFormaat != null) {
      paring.setAriregisterValjundiFormaat(ariregisterValjundiFormaat);
    }
    EsindusV1 esindusV1 = EsindusV1.Factory.newInstance();
    esindusV1.setKeha(paring);
    return ariregXRoadDatabase.esindusV1V1(esindusV1).getKeha().getEttevotjad().getItemList();
  }
}
