package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertEquals("Male", gender.getGenderDescription());
        
    }
}