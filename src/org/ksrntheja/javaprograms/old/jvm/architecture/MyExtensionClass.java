package org.ksrntheja.javaprograms.old.jvm.architecture;

public class MyExtensionClass {

    public static void hello() {
        System.out.println("Hello from bootstrap version!");
    }

}

/*
Compile with
// package org.ksrntheja.javaprograms.old.jvm.architecture;

- javac MyExtensionClass.java
- create a jar
    jar -cvf myextension.jar MyExtensionClass.class
- Move myextension.jar to jdk\jre\lib\ext
- Change EXT to CWD in hello(_) method
- javac MyExtensionClass.java
 */
