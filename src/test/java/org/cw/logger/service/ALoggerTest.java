package org.cw.logger.service;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import org.cw.logger.module.LoggerModule;
import org.junit.Test;

/**
 * Created by chenwen on 16/5/21.
 */
public class ALoggerTest {

    @Test
    public void testShow() throws Exception {
        Injector injector = Guice.createInjector(new LoggerModule());

        IService service = injector.getInstance(Key.get(IService.class, Names.named(ALogger.class.getName())));

        service.show();
    }
}