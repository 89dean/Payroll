package com.dean.factory.demography;

import com.dean.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Coloured");
        Assert.assertEquals("Coloured", race.getDescription());
        Assert.assertNotNull(race.getId());
        System.out.println(race.getId());
        Assert.assertNotNull(race);
    }
}