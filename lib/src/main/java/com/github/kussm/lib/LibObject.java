package com.github.kussm.lib;

import com.github.kussm.annotation.MyAnnotation;

public class LibObject {
  @MyAnnotation
  public LibObject withValue(String value) {
    return this;
  }
}
