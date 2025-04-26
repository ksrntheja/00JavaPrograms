class D {

    public static void main(String[] args) {

        O o = new O();
        o.m();
        System.out.println("class D");

    }

}

/*
00JavaPrograms\development>javac D.java
	D.java:5: error: cannot find symbol
					O o = new O();
					^
	  symbol:   class O
	  location: class D
	D.java:5: error: cannot find symbol
					O o = new O();
							  ^
	  symbol:   class O
	  location: class D
	2 errors

javac -cp \00JavaPrograms;. D.java
OR
javac -cp \00JavaPrograms D.java

java D
	Exception in thread "main" java.lang.NoClassDefFoundError: O
			at D.main(D.java:5)
	Caused by: java.lang.ClassNotFoundException: O
			at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
			at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
			at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:528)
			... 1 more

java -cp E:\Learn\Java\IDEAProjectsE\00JavaPrograms D
    Error: Could not find or load main class D
    Caused by: java.lang.ClassNotFoundException: D

java -cp \00JavaPrograms;. D
	From O
	class D

 */
