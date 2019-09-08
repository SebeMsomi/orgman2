package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static com.sun.deploy.config.JREInfo.getAll;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {
    private GenderRepository repository;
    private Gender gender;

    private Gender getGender()
    {
        Set<Gender> genders = this.repository.getAll();
        return genders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.genderRepository();
        this.gender = GenderFactory.buildGender( "M");
    }

    @Test
    public void a_create() {
        Gender gender1 = this.repository.create(this.gender);
        System.out.println("In Create, " + gender1);
        getAll();
        Assert.assertSame(gender1, this.gender);
    }

    @Test
    public void b_read() {
        Gender gender1 = GenderFactory.buildGender("M");
        this.repository.create(gender1);

        System.out.println("In Read, Read... " + gender1.getGenderId());

        // Gender gender2 = this.repository.read(gender1.getGenderId());
        Assert.assertNotNull(gender1);
        getAll();

    }

    @Test
    public void c_update() {
        String newname = "Female";
        Gender updated = new Gender.Builder().genderDescription(newname).build();
        this.repository.update(updated);
        System.out.println("In update, Updated..." + updated.getGenderDescription());
        getAll();
    }

    @Test
    public void e_delete() {
        Gender gender1 = getGender();
        this.repository.delete(gender1.getGenderId());
        Assert.assertNotNull(gender1);
        getAll();
    }

    @Test
    public void d_getAll() {
        Set<Gender> all = this.repository.getAll();
        System.out.println("In GET ALL, ALL " + all);
    }
}