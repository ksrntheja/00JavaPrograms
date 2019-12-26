package org.ksrntheja.javaprograms.eigth.functionalinterfaces;

@FunctionalInterface
public interface ExampleObjectClassPublicMethodsFunctionalInterface03 {


    void m1();


    @Override
    boolean equals(Object o);
    //     public boolean equals(Object obj) {
    //        return this == obj;
    //    }


    @Override
    int hashCode();
    //public native int hashCode();



    /*
    @Override
    default String toString() {

    }
    // Default method 'toString' overrides a member of 'java.lang.Object'
    public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }
    */

    @Override
    String toString();


    // @Override
    // final native Class<?> getClass();
    // Illegal combination of modifiers: 'final' and 'abstract'
    // Modifier 'native' not allowed here


    // @Override
    // protected native Object clone() throws CloneNotSupportedException;
    // Modifier 'protected' not allowed here
    // @Override
    // native Object clone() throws CloneNotSupportedException;
    // Modifier 'native' not allowed here
    // @Override
    // Method does not override method from its superclass
    // Object clone() throws CloneNotSupportedException;
    // Multiple non-overriding abstract methods found in interface


    // public final native void notify();


    // public final native void notifyAll();


    /*
    public final void wait() throws InterruptedException {
        this.wait(0L);
    */


    // public final native void wait(long var1) throws InterruptedException;


    /*
    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0L) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        } else if (nanos >= 0 && nanos <= 999999) {
            if (nanos > 0) {
                ++timeoutMillis;
            }

            this.wait(timeoutMillis);
        } else {
            throw new IllegalArgumentException("nanosecond timeout value out of range");
        }
    }
    */

    /*
    @Deprecated(
            since = "9"
    )
    protected void finalize() throws Throwable {
    }
    */


    // @Override
    // Method does not override method from its superclass
    // void finalize() throws Throwable;
    // Multiple non-overriding abstract methods found in interface









    /*
    @Override
    void notify();
    'notify()' cannot override 'notify()' in 'java.lang.Object'; overridden method is final
    */

    /*
    @Override
    final void notify();
    Illegal combination of modifiers: 'final' and 'abstract'
    */

    /*
    @Override
    default void notify() {

    }
    'notify()' cannot override 'notify()' in 'java.lang.Object'; overridden method is final
    */

    /*
    @Override
    private void notify() {

    }
    'notify()' in 'org.ksrntheja.javaprograms.eigth.functionalinterfaces.ExampleObjectClassPublicMethodsFunctionalInterface03'
    clashes with 'notify()' in 'java.lang.Object'; attempting to assign weaker access privileges ('private'); was 'public'
    */

    /*
    @Override
    public void notify() {

    }
    Interface abstract methods cannot have body
    */


    default void m2() {
        System.out.println("hello default method");
    }


    static void m3() {
        System.out.println("hello static method");
    }

}
