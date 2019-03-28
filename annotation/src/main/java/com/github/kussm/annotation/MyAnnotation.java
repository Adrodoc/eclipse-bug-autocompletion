package com.github.kussm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) // Retention has to be CLASS or RUNTIME, but not SOURCE
public @interface MyAnnotation {
}
