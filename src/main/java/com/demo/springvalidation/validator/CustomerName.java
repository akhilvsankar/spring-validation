/**
 *
 */
package com.demo.springvalidation.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * The Interface CustomerName.
 */
@Documented
@Retention(RUNTIME)
@Constraint(validatedBy = CustomerNameValidator.class)
@Target({ FIELD, METHOD })
/**
 * @author U76172
 *
 */
public @interface CustomerName {

    /**
     * Groups.
     *
     * @return the class[]
     */
    Class<?>[] groups() default {};

    /**
     * Message.
     *
     * @return the string
     */
    String message() default "Customer Name already exists";

    /**
     * Payload.
     *
     * @return the class<? extends payload>[]
     */
    Class<? extends Payload>[] payload() default {};

}
