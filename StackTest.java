/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generics;

import generics.EmptyStackException;
import generics.FullStackException;
import generics.Stack;

/**
 *
 * @author dzeuf
 */
public class StackTest {
    private double[] doubleElements = {1.1,2.2,3.3,4.4,5.5,6.6};
    private int[] integerElements = {1,2,3,4,5,6,7,8,9,10,11};
    private Stack <Double> doubleStack; //stack stores Double objects
    private Stack <Integer> integerStack;//stack stores Integer objects
// test Stack objects
    public void testStacks() {
        doubleStack = new Stack <Double> (5); //Stack of Doubles
        integerStack = new Stack <Integer>(10); //Stack of Integers
        testPushDouble(); // push double onto doubleStack
        testPopDouble(); // pop from doubleStack
        testPushInteger(); // push int onto intStack
        testPopInteger(); // pop from intStack
}

// test push method with double stack
    public void testPushDouble() {
    try {
        System.out.println("\nPushing elements onto doubleStack");
        for (double element : doubleElements) {
            System.out.printf("%.1f ", element);
            doubleStack.push(element); // push onto doubleStack
}
}
    catch (FullStackException fullStackException) {
        System.err.println();
        fullStackException.printStackTrace();
}
}
// test pop method with double stack
    public void testPopDouble() {
    try {
        System.out.println("\nPopping elements from doubleStack");
        double popValue;
// remove all elements from Stack
        while (true) {
            popValue = doubleStack.pop(); // pop from doubleStack
            System.out.printf("%.1f ", popValue);
}
}
    catch(EmptyStackException emptyStackException) {
        System.err.println();
        emptyStackException.printStackTrace();
}
}
// test push method with integer stack
    public void testPushInteger() {
    try {
        System.out.println("\nPushing elements onto integerStack");
        for (int element : integerElements) {
            System.out.printf("%d ", element);
            integerStack.push(element); // push onto integerStack
}
}
    catch (FullStackException fullStackException) {
        System.err.println();
        fullStackException.printStackTrace();
}
}
// test pop method with integer stack
    public void testPopInteger() {
// pop elements from stack
    try {
        System.out.println("\nPopping elements from integerStack");
        int popValue;
// remove all elements from Stack
        while (true) {
            popValue = integerStack.pop();
            System.out.printf("%d ", popValue);
        }
    }
    catch(EmptyStackException emptyStackException) {
        System.err.println();
        emptyStackException.printStackTrace();
    }
    }
    public static void main(String args[]) {
        StackTest application = new StackTest();
        application.testStacks();
    }
}