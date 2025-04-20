/*
 * (20) JVM architecture
 * Class Loader Sub System
 */

package org.ksrntheja.javaprograms.old.jvm.architecture;

import java.lang.reflect.Method;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

import org.ksrntheja.javaprograms.old.utility.classes.Student;


public class ClassLoaderSubSystem {

    public static void main(String[] args) throws ClassNotFoundException {

        separator("Loading");
        Student aStudent = new Student();
        Class<? extends Student> aClass = aStudent.getClass();
        Student bStudent = new Student();
        Class<? extends Student> bClass = bStudent.getClass();
        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.print("Single Class object per class -> ");
        System.out.println(aClass == bClass);

        System.out.print("java.lang.String getCanonicalName() -> ");
        Class cClass = Class.forName("java.lang.String");
        System.out.println(cClass.getCanonicalName());

//        Class dClass = Class.forName("String");
//        Exception in thread "main" java.lang.ClassNotFoundException: String

        System.out.println("Method from new Class object getDeclaredMethods() -> ");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" " + method.getName());
        }

        System.out.println("Method from Class.forName(_) object getDeclaredMethods() -> ");
        Class eClass = Class.forName("org.ksrntheja.javaprograms.old.utility.classes.Student");
        methods = eClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" " + method.getName());
        }

    }

}

/*
====================================================================================
Loading
====================================================================================
1791741888
1791741888
Single Class object per class -> true
java.lang.String getCanonicalName() -> java.lang.String
Method from new Class object getDeclaredMethods() ->
 getName
 toString
 setName
Method from Class.forName(_) object getDeclaredMethods() ->
 getName
 toString
 setName
 */
