/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author ardap
 */
public class CollectionsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-------------------------ArrayList------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(2,4);
        list.add(2,69);
        
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);
        //-------------------------HashSet--------------------------------------
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(4);
        
        System.out.println(numbers);
        
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) System.out.println("Numbers contains " + i);
            else System.out.println("Numbers does not contain " + i);
        }
        
        if(!numbers.isEmpty()) numbers.clear();
        
        System.out.println(numbers);
        
        //-------------------------HashMap--------------------------------------
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("Red", 10);
        map.put("Green", 27);
        map.put("Blue", 7);
        
        for(HashMap.Entry<String,Integer> pair : map.entrySet()) {
            System.out.println("Key : " + pair.getKey() +
                               " Value : " + pair.getValue());
        }
        
        for(String key : map.keySet()) {
            System.out.println("Value of key " + key + " is " + map.get(key));
        }
        
        //-------------------------LinkedList-----------------------------------
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Queue");
        while(!queue.isEmpty()) {
            System.out.println(queue.removeFirst());
        }
        System.out.println("Stack");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        //-------------------------CompareTo-----------------------------------
        String name1 = "Alex";
        String name2 = "Richard";
        
        System.out.println(name1.compareTo(name2));
        
    }
    
}
