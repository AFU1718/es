package com.yfgz.es.annotation;


import com.yfgz.es.bean.ShopAccount;

import java.lang.annotation.*;

/**
 * Created by lin on 2017/3/23.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginRequired {

//    boolean isPage() default false;
    Class type() default ShopAccount.class;
}
