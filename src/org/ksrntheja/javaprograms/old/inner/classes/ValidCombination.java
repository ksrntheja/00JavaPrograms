package org.ksrntheja.javaprograms.old.inner.classes;

class OuterA {
    class Inner {
    }
}

class OuterB {

    interface Vehicle {
        public int getNoOfWheels();
    }

    class Bus implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 6;
        }
    }

    class Auto implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 3;
        }
    }
}

interface OuterC {

    public void m1();

    interface Inner {
        public void m2();
    }

}

class InnerClassA implements OuterC.Inner {
    @Override
    public void m2() {
        System.out.println("Inner interface method");
    }
}

class OuterCA implements OuterC {
    @Override
    public void m1() {
        System.out.println("Outer interface method");
    }
}

interface EmailService {

    public void sendMail(EmailDetails e);

    class EmailDetails {

    }

}

interface Vehicle {

    public int getNoOfWheels();

    class DefaultVehicle implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 2;
        }
    }

}

class Bus implements Vehicle {
    @Override
    public int getNoOfWheels() {
        return 7;
    }
}

public class ValidCombination {

    public static void main(String[] args) {
        InnerClassA innerClassA = new InnerClassA();
        innerClassA.m2();
        OuterCA outerCA = new OuterCA();
        outerCA.m1();

        Vehicle.DefaultVehicle defaultVehicle = new Vehicle.DefaultVehicle();
        System.out.println(defaultVehicle.getNoOfWheels());
        Bus bus = new Bus();
        System.out.println(bus.getNoOfWheels());

    }

}

/*
Inner interface method
Outer interface method
2
7
 */
