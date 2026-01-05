package oops;

//DiamondProblem : Diamond problem is ambiguity caused by multiple inheritance when a class inherits the same method from multiple parents.
       //           A(Show)
         // B(Show)         C (Show)
           //       D(show)

// Base interface
interface DiamondProblem {
    void show();
}

// First parent interface
interface B extends DiamondProblem {
}

// Second parent interface
interface C extends DiamondProblem {
}

// Child class resolving diamond problem
class D implements B, C {

    @Override
    public void show() {
        System.out.println("Diamond resolved in D");
    }
}

// Test class (no public keyword)
class testDiamond {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
