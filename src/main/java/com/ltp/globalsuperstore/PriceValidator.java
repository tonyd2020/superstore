package com.ltp.globalsuperstore;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<PriceCheck, Item> {
    @Override
    public boolean isValid(Item item, ConstraintValidatorContext constraintValidatorContext) {
        return (item.getPrice() >= item.getDiscount());
    }
}
