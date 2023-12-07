package test.program.generics;

// Demonstrate a raw type.
class Genb<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Genb(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// Demonstrate raw type. 
class RawDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Genb<Integer> iOb = new Genb<Integer>(88);

        // Create a Gen object for Strings.
        Genb<String> strOb = new Genb<String>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
        Genb raw = new Genb(Double.valueOf(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // The use of a raw type can lead to run-time.
        // exceptions.  Here are some examples.

        // The following cast causes a run-time error!
//    int i = (Integer) raw.getOb(); // run-time error 

        // This assigment overrides type safety.
        strOb = raw; // OK, but potentially wrong
//    String str = strOb.getOb(); // run-time error  

        // This assingment also overrides type safety.
        raw = iOb; // OK, but potentially wrong
//    d = (Double) raw.getOb(); // run-time error 
    }
}