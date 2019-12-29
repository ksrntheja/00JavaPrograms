package org.ksrntheja.javaprograms.eigth.defaultmethods;

public interface DefaultMethodInterfaceObjectClassMethodOverride {

//     public native int hashCode();

    @Override
    default int hashCode() {
        return 8;
    }

    // Default method 'hashCode' overrides a member of 'java.lang.Object'

}
