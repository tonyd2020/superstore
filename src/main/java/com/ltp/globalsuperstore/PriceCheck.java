package com.ltp.globalsuperstore;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PriceValidator.class)
public @interface PriceCheck {
    String message() default "PRICE must not be less than Discount";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
