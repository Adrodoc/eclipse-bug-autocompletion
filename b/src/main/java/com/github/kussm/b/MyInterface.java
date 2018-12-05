package com.github.kussm.b;

import com.github.kussm.a.Bar;
import com.github.kussm.lib.LibObject;

public interface MyInterface {
  default Bar bar() {
    return null;
  }

  default Foo foo() {
    return null;
  }

  default LibObject libObject() {
    return null;
  }
}
