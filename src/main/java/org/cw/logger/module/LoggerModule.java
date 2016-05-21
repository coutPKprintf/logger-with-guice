package org.cw.logger.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import org.cw.logger.Log4JTypeListener;
import org.cw.logger.service.ALogger;
import org.cw.logger.service.BLogger;
import org.cw.logger.service.IService;

/**
 * Created by chenwen on 16/5/21.
 */
public class LoggerModule extends AbstractModule {
    @Override
    protected void configure() {
        bindListener(Matchers.any(), new Log4JTypeListener());
        bind(IService.class).annotatedWith(Names.named(ALogger.class.getName())).to(ALogger.class).in(Scopes.SINGLETON);
        bind(IService.class).annotatedWith(Names.named(BLogger.class.getName())).to(BLogger.class).in(Scopes.SINGLETON);
    }
}
