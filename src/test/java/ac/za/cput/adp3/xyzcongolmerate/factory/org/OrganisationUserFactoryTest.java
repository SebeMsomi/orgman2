package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisationUser() {
        User user = UserFactory.buildUser("sebe@gmail.com", "Sebe", "Msomi");
        OrganisationUser orgUser = new OrganisationUser( UUID.randomUUID().toString(), user.getUserEmail());
        Assert.assertNotNull(orgUser);
        Assert.assertNotNull(orgUser.getOrgCode());

    }
}