package ru.letnes.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ru.letnes.core.FGService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class MainTest {
    private static final String VALUE = "HelloTst";
    private Main main;
    @Mock
    private FGService fgService;

    @BeforeEach
    void setUp() {
        initMocks(this);
        main = new Main();
    }

    @Test
    void getGetMeSomething() {
        when(fgService.getMeSomething()).thenReturn(VALUE);
        String getMeSomething = main.getGetMeSomething(fgService);
        assertEquals(getMeSomething, VALUE);
    }
}