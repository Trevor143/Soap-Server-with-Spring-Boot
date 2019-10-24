package com.soap.project.soap;

import localhost._7000.university.Type;
import localhost._7000.university.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class UniversityRepository {

    private Map<String, University> universities = new HashMap<>();

    @PostConstruct
    private void loadData(){
        University strath = new University();

        strath.setName("Strathmore");
        strath.setLocation("Ole Sangale");
        strath.setType(Type.PRIVATE);
        strath.setYearFounded(1960);

        universities.put(strath.getName(), strath);

        University jkuat = new University();

        jkuat.setName("JKUAT");
        jkuat.setLocation("Juja");
        jkuat.setType(Type.PUBLIC);
        jkuat.setYearFounded(1920);

        universities.put(jkuat.getName(), jkuat);

        University muk = new University();

        muk.setName("Makerere");
        muk.setLocation("Kampala");
        muk.setType(Type.PUBLIC);
        muk.setYearFounded(1985);
        universities.put(muk.getName(), muk);

        University ucu = new University();

        jkuat.setName("UCU");
        jkuat.setLocation("Kampala");
        jkuat.setType(Type.PRIVATE);
        jkuat.setYearFounded(1920);

        universities.put(ucu.getName(), ucu);

        University maseno = new University();

        muk.setName("Maseno");
        muk.setLocation("Kenya");
        muk.setType(Type.PUBLIC);
        muk.setYearFounded(1985);
        universities.put(maseno.getName(), maseno);
    }

    public University getUniversityByName(String name){
        return universities.get(name);
    }
}
