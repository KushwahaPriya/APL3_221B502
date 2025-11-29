package com.jiet;  // Different package

import com.juet.Pack1;  // Importing Pack1

// Pack2 extends Pack1 to access protected method
public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        Pack2 obj = new Pack2();  // Creating object of Pack2
        obj.display();  // Accessing protected method via inheritance
    }
}

