package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Shay"));

        employee.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employee);

        System.out.println("--------------------");

        String []names = {"Mary","Monica","Mehray","Sumeyra","Hasan","Beril"};

        ArrayList<String>list = new ArrayList<>(Arrays.asList(names)); // convert array to arraylist

        list.removeIf(p->p.charAt(0)=='M');

        System.out.println(list);

        //convert arrayList to array

       names =list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
}
