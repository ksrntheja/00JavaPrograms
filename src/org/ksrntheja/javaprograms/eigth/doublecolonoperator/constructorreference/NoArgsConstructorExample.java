package org.ksrntheja.javaprograms.eigth.doublecolonoperator.constructorreference;

class NoArgsClass {

    NoArgsClass() {
        System.out.println("NoArgsClass constructor execution and Object Creation");
    }

}


interface GetNoArgsClassObject {

    NoArgsClass get();

}

public class NoArgsConstructorExample {

    public static void main(String[] args) {

        System.out.println("Via LAMBDA EXPRESSION : ");

        GetNoArgsClassObject getNoArgsClassObjectLambda = () -> {
            NoArgsClass noArgsClass = new NoArgsClass();
            return noArgsClass;
        };
        getNoArgsClassObjectLambda.get();


        System.out.println("Via METHOD REFERENCE : ");

        GetNoArgsClassObject getNoArgsClassObjectMethodReference = NoArgsClass::new;
        getNoArgsClassObjectMethodReference.get();

        // GetNoArgsClassObject getNoArgsClassObjectMethodReference = () -> new NoArgsClass();

        /*
        GetNoArgsClassObject getNoArgsClassObjectMethodReference = () -> {
            return new NoArgsClass();
        };
        */

        /*
        GetNoArgsClassObject getNoArgsClassObjectMethodReference = () -> {
            final NoArgsClass noArgsClass = new NoArgsClass();
            return noArgsClass;
        };
        */

        /*
        GetNoArgsClassObject getNoArgsClassObjectMethodReference = new GetNoArgsClassObject() {
            @Override
            public NoArgsClass get() {
                final NoArgsClass noArgsClass = new NoArgsClass();
                return noArgsClass;
            }
        };
         */

    }

}

/*
Via LAMBDA EXPRESSION :
NoArgsClass constructor execution and Object Creation
Via METHOD REFERENCE :
NoArgsClass constructor execution and Object Creation
 */
