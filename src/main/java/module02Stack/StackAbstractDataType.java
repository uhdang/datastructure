package module02Stack;

import java.util.Stack;

/**
 * 2.1 Stack abstract data type (ADT)
 */
public class StackAbstractDataType {

    public static void stackADT() {
        Stack route = new Stack();
        route.push("Tokyo");
        route.push("Osaka");
        route.push("Nara");
        System.out.println(route);
        System.out.println(route.peek());
        System.out.println(route.pop());
        System.out.println(route.pop());
        System.out.println(route);
    }


    public static void main(String[] args) {
        stackADT();
    }
}
