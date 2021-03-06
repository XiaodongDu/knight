package com.shildon.knight.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标识依赖注入
 * @author shildon<shildondu@gmail.com>
 * @date Jan 12, 2016 8:50:29 PM
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {

}
