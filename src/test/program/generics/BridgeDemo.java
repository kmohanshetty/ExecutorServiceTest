package test.program.generics;

// A situation that creates a bridge method.
class Generic<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Generic(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen.
class Generic2 extends Generic<String> {

	Generic2(String o) {
        super(o);
    }

    // A String-specific override of getOb().
    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}

// Demonstrate a situation that requires a bridge method. 
class BridgeDemo {
    public static void main(String[] args) {

        // Create a Gen2 object for Strings.
    	Generic2 strOb2 = new Generic2("Generics Test");

        System.out.println(strOb2.getOb());
    }
}