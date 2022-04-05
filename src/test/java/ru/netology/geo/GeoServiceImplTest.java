package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    @Test
    public void byIp_Moscow() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country preferences = geoService.byIp("172.02.1.1").getCountry();
        Assertions.assertEquals(Country.RUSSIA, preferences);
    }

    @Test
    public void byIp_Null() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location preferences = geoService.byIp("67.55.45.1");
        Assertions.assertNull(preferences);
    }

}