package org.checkerframework.checker.regex.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.qualframework.poly.qual.DefaultValue;
import org.checkerframework.qualframework.poly.qual.Wildcard;

/**
 * Var is a qualifier parameter use.
 *
 * @see org.checkerframework.checker.tainting.qual.Var
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiVar.class)
public @interface Var {
    /**
     * Which parameter this @Var is a use of.
     */
    String arg() default DefaultValue.PRIMARY_TARGET;

    /**
     * The name of the parameter to set.
     */
    String param() default DefaultValue.PRIMARY_TARGET;

    /**
     * Specify that this use is a wildcard with a bound.
     */
    Wildcard wildcard() default Wildcard.NONE;
}
