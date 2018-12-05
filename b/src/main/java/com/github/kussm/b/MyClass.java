package com.github.kussm.b;

public class MyClass implements MyInterface {
  public void consumeObject(Object o) {}

  /**
   * Here we have no Autocompletion for the result of bar().<br>
   * This only happens:
   * <ul>
   * <li>inside the brackets of consumeObject().</li>
   * <li>when project b has annotation processing enabled.</li>
   * <li><code>MyAnnotation</code> is visible in project a, but not in project b.</li>
   * <li><code>MyAnnotation</code> doesn't have source retention.</li>
   * <li><code>LibObject</code> is imported via a jar file, not a project dependency.</li>
   * <li><code>LibObject</code> and <code>Bar</code> both contain a method that is annotated with the
   * same annotation (<code>MyAnnotation</code>).</li>
   * <li><code>MyInterface</code> contains at least 3 default methods, one returning <code>Bar</code>,
   * one returning <code>LibObject</code> and one returning some other custom object (not a standard
   * object like <code>String</code>).</li>
   * </ul>
   * <br>
   */
  public void method() {
    consumeObject(bar());
  }
}
