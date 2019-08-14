package com.dean.service.demography;

import com.dean.domain.demography.Gender;
import com.dean.factory.demography.GenderFactory;
import com.dean.repository.demography.GenderRepository;
import com.dean.repository.demography.impl.GenderRepositoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }


    @Test
    public void getAll(){
        Set<Gender> gender = this.repository.getAll();
        System.out.println("In getall, all = " + gender);
    }
}