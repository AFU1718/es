package com.yfgz.es.annotation;

import java.lang.annotation.*;

/**
 * Created by lin on 2017/8/15.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthTokenRequired {
}
