public class Assignment {
    public static void main(String[] args) {
        // Assignment 1: Compound Assignment Operators
        int a = 10;
        a += 5;
        System.out.println("After +=: " + a);
        a -= 3;
        System.out.println("After -=: " + a);
        a *= 2;
        System.out.println("After *=: " + a);
        a /= 4;
        System.out.println("After /=: " + a);
        a %= 3;
        System.out.println("After %=: " + a);

        // // Assignment 2: Increment & Decrement Operators
        // int b = 5;
        // System.out.println("Initial b: " + b);
        // b++;
        // System.out.println("After b++: " + b);
        // ++b;
        // System.out.println("After ++b: " + b);
        // b--;
        // System.out.println("After b--: " + b);
        // --b;
        // System.out.println("After --b: " + b);

        // Assignment 3: Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}