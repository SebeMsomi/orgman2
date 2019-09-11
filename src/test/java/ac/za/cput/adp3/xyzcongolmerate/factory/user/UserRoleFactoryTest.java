package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole( UUID.randomUUID().toString(),
                "sebe@gmail.com", "1");
        Assert.assertNotNull(userRole);


    }
}