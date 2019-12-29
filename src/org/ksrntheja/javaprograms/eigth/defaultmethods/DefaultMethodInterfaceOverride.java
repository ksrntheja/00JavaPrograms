package org.ksrntheja.javaprograms.eigth.defaultmethods;

interface DefaultMethodOverride {

    default void m1() {
        System.out.println("In DefaultMethodOverride Interface :: default void m1()");
    }

}


public class DefaultMethodInterfaceOverride implements DefaultMethodOverride {

    // @Override
    // void m1() {

    // }
    // 'm1()' in 'org.ksrntheja.javaprograms.eigth.defaultmethods.DefaultMethodInterfaceOverride'
    // clashes with 'm1()' in 'org.ksrntheja.javaprograms.eigth.defaultmethods.DefaultMethodOverride';
    // attempting to assign weaker access privileges ('package-private'); was 'public

    @Override
    public void m1() {
        System.out.println("In DefaultMethodInterfaceOverride Class :: public void m1()");
    }

    public static void main(String args[]) {

        DefaultMethodInterfaceOverride defaultMethodInterfaceOverride = new DefaultMethodInterfaceOverride();
        defaultMethodInterfaceOverride.m1();

    }

}
