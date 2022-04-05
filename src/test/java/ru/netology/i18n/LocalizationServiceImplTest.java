package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

public class LocalizationServiceImplTest {

    @Test
    public void locale_RU() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String preferences = localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals("Добро пожаловать", preferences);
    }

    @Test
    public void locale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String preferences = localizationService.locale(Country.BRAZIL);
        Assertions.assertEquals("Welcome", preferences);
    }
}