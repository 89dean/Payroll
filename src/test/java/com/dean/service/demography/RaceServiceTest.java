package com.dean.service.demography;

import com.dean.domain.demography.Race;
import com.dean.factory.demography.RaceFactory;
import com.dean.repository.demography.RaceRepository;
import com.dean.repository.demography.impl.RaceRepositoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceTest {

        private RaceRepository repository;
        private Race race;

        @Before
        public void setUp() throws Exception {
            this.repository = RaceRepositoryImpl.getRepository();
            this.race = RaceFactory.buildRace("Coloured");
        }


        @Test
        public void getAll(){
            Set<Race> race = this.repository.getAll();
            System.out.println("In getall, all = " + race);
        }
}