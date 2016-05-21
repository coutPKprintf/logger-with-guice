package org.cw.logger.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.*;

/**
 * Created by chenwen on 16/5/21.
 */
@BindingAnnotation
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR,ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InjectLogger {
}
