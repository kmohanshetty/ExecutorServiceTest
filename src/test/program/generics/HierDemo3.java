package test.program.generics;

// Use the instanceof operator with a generic class hierarchy.
class Geng<T> {
    T ob;

    Geng(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen.
class Geng2<T> extends Geng<T> {
    Geng2(T o) {
        super(o);
    }
}

// Demonstrate run-time type ID implications of generic 
// class hierarchy. 
class HierDemo3 {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Geng<Integer> iOb = new Geng<Integer>(88);

        // Create a Gen2 object for Integers.
        Geng2<Integer> iOb2 = new Geng2<Integer>(99);

        // Create a Gen2 object for Strings.
        Geng2<String> strOb2 = new Geng2<String>("Generics Test");

        // See if iOb2 is some form of Gen2.
        if (iOb2 instanceof Geng2<?>)
            System.out.println("iOb2 is instance of Gen2");

        // See if iOb2 is some form of Gen.
        if (iOb2 instanceof Geng<?>)
            System.out.println("iOb2 is instance of Gen");

        System.out.println();

        // See if strOb2 is a Gen2.
        if (strOb2 instanceof Geng2<?>)
            System.out.println("strOb is instance of Gen2");

        // See if strOb2 is a Gen.
        if (strOb2 instanceof Geng<?>)
            System.out.println("strOb is instance of Gen");

        System.out.println();

        // See if iOb is an instance of Gen2, which it is not.
        if (iOb instanceof Geng2<?>)
            System.out.println("iOb is instance of Gen2");

        // See if iOb is an instance of Gen, which it is.
        if (iOb instanceof Geng<?>)
            System.out.println("iOb is instance of Gen");
    }
}
