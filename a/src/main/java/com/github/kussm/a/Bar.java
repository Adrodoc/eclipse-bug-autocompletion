package com.github.kussm.a;

import com.github.kussm.annotation.MyAnnotation;

public class Bar {
  @MyAnnotation
  public Bar withValue(String value) {
    return this;
  }
}
