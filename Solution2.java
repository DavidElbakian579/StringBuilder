/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l7;

/**
 *
 * @author David-pc
 */
public class Solution2 {
    /*
    Разворот строки
    Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
    */
    
    public static void start() {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }
    
    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
