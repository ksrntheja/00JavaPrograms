/*
 * (20) JVM architecture
 * How does class loader works?
 */

package org.ksrntheja.javaprograms.old.jvm.architecture;

public class MyExtensionClassDemo {

    public static void main(String[] args) {

        MyExtensionClass.hello();

        System.out.println("ClassLoader: " + MyExtensionClass.class.getClassLoader());

    }

}

/*
/*
Compile with
// package org.ksrntheja.javaprograms.old.jvm.architecture;

- javac MyExtensionClassDemo.java
- java MyExtensionClass
    Hello from EXT version!
    ClassLoader: sun.misc.Launcher$ExtClassLoader@ba8a1dc

- Remove MyExtensionClass.java in CWD.
- javac -extdirs %JAVA_HOME%\jre\lib\ext MyExtensionClassDemo.java
or javac -cp %JAVA_HOME%\jre\lib\ext MyExtensionClassDemo.java
- java
    Hello from EXT version!
    ClassLoader: sun.misc.Launcher$ExtClassLoader@ba8a1dc
 */
