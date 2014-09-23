package ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * User: ara
 * Date: 21.09.14
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> map1 ;
        HashMap<Integer,Integer> map2 ;
        HashMap<Integer,Integer> map3 ;
        int n,a,b;
        ArrayList<Integer> array;
        String s,s1;
        String[] in1,in2;
        s = r.readLine();
        s1 = r.readLine();
        in1 = s.split(" ");
        in2 = s1.split(" ");
        n = Integer.parseInt(in1[0]);
        a = Integer.parseInt(in1[1]);
        b = Integer.parseInt(in1[2]);
        array = new ArrayList<Integer>(n);
        for(int i = 0 ; i < n ; i++)
        {
          array.add(Integer.parseInt(in2[i]));
        }
        map1 = force(array,a,b);
        map2 = force(array,a,"0");
        map3 = force(array,b,"1");
        if((map1.size()!=array.size())|(map2.size()!=array.size())|(map3.size()!=array.size())) System.out.println("NO");
        else if (map2.size() == array.size()) {
            System.out.println("YES");
            for (Integer i :array) {
                System.out.print(map2.get(i) + " ");

            }

        } else if (map3.size() == array.size()) {
            System.out.println("YES");
            for (Integer i :array) {
                System.out.print(map3.get(i) + " ");

            }

        } else if (map1.size() == array.size()) {
            System.out.println("YES");
            for (Integer i :array) {
                System.out.print(map1.get(i) + " ");

            }

        }


    }
    public static HashMap<Integer, Integer> force(ArrayList<Integer> array, int a, int b)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < array.size() ; i++)
        {

            if(array.contains(a-array.get(i)))
            {
                map.put(a-array.get(i),0);

                map.put(array.get(i),0);
            }

            else  if((array.contains(b-array.get(i)))){
                map.put(b-array.get(i),1);
                map.put(array.get(i),1);

            }
        }
        return map;
    }
    public static HashMap<Integer, Integer> force(ArrayList<Integer> array, int a,String c)
    {
        int d;
        if (Integer.parseInt(c)==0) d = 0;
        else d = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < array.size() ; i++)
        {

            if(array.contains(a-array.get(i)))
            {
                map.put(a-array.get(i),d);

                map.put(array.get(i),d);
            }

        }
        return map;
    }


}
