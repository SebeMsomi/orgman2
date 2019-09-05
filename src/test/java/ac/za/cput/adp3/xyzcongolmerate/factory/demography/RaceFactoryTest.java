package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Black-man");
        Assert.assertNotNull(race.getRaceId());
        Assert.assertEquals("Black-man", race.getRaceDescription());

    }
}