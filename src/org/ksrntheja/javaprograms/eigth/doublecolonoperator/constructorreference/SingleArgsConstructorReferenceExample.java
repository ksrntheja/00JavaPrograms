package org.ksrntheja.javaprograms.eigth.doublecolonoperator.constructorreference;

class Name {

    private String name;

    Name() {
        System.out.println("No Args Constructor Executed");
    }


    Name(String s) {
        this.name = s;
        System.out.println("Constructor Executed:" + name);
    }

}


interface GetName {

    Name getName(String name);

}

public class SingleArgsConstructorReferenceExample {

    public static void main(String[] args) {

        GetName getNameLambda = s -> new Name(s);
        getNameLambda.getName("From Lambda Expression");


        GetName getNameMethodReference = Name::new;
        getNameMethodReference.getName("From Constructor Reference");

        // GetName getNameMethodReference = s -> new Name(s);

        /*
        GetName getNameMethodReference = s -> {
            return new Name(s);
        };
        */

        /*
        GetName getNameMethodReference = s -> {
            final Name name = new Name(s);
            return name;
        };
         */

        /*
        GetName getNameMethodReference = s -> {
             final Name name = new Name(s);
             return name;
        };
         */

        /*
        GetName getNameMethodReference = (String s) -> {
             Name name = new Name(s);
             return name;
        };
         */

        /*
        GetName getNameMethodReference = new GetName() {
            @Override
            public Name getName(String s) {
                Name name = new Name(s);
                return name;
            }
        };
         */

    }

}

/*
Constructor Executed:From Lambda Expression
Constructor Executed:From Constructor Reference
 */