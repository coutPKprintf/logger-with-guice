package org.cw.logger;

import com.google.inject.MembersInjector;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;

/**
 * Created by chenwen on 16/5/21.
 */
public class Log4JMembersInjector <T> implements MembersInjector<T> {
    private final Field field;
    private final Logger logger;

    Log4JMembersInjector(Field field) {
        this.field = field;
        this.logger = Logger.getLogger(field.getDeclaringClass());
        field.setAccessible(true);
    }

    public void injectMembers(T t) {
        try {
            field.set(t, logger);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
