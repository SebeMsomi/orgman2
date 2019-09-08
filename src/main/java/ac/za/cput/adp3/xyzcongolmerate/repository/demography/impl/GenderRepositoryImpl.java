package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    //TODO: Implement body

    @Override
    public Gender create(Gender gender) {
        this.genderDB.add(gender);
        return gender;


    }

    @Override
    public Gender read(final String genderId) {
        return  genderDB.stream()
                .filter(gender -> genderId.equalsIgnoreCase(gender.getGenderId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Gender update(Gender gender) {

        Gender toDelete = read(gender.getGenderId());
        if(toDelete != null)
        {
            genderDB.remove(toDelete);
            return create(gender);
        }
        return null;
        /*Gender genderToDelete = read(gender.getGenderId());
        if(genderToDelete != null) {
            genderDB.remove(genderToDelete);
            return create(gender);
        }
        return null;*/

    }

    @Override
    public void delete(String id) {

        /*Gender genderToDelete = read(id);
        if(genderToDelete != null) {
            genderDB.remove(genderToDelete);
        }*/

        Gender toDelete = read(id);
        if(toDelete != null)
            this.genderDB.remove(toDelete);

    }
    //TODO: Implement body
    @Override
    public Set<Gender> getAll() {
        return this.genderDB;
    }
}
