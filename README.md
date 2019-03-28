Steps to reproduce

* Install Eclipse Java 2019-03 <https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-03/R/eclipse-java-2019-03-R-win32-x86_64.zip>
* Clone this repository into the eclipse workspace
* In Eclipse select `Import > General > Existing Projects into Workspace` and import this project and nested projects
* Open the class `com.github.kussm.b.MyClass`
* Try to call a Method like `getClass()`, `hashCode()` or `withValue(String)` on the result of `bar()` within the brackets of `consumeObject(Object)`, there are no code suggestions for any methods
* Try the same outside of `consumeObject(Object)` (or change any other precondition listed in the javadoc of `com.github.kussm.b.MyClass.method()`) and you will get code suggestions from Eclipse
