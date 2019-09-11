package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Facebook");
        Assert.assertNotNull(organisation);


    }
}