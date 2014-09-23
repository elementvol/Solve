package ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class task1 {
    public static void main(String[]args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer>input ;
    int n,a,b;
    String s,s1;
    s= r.readLine();
    String[] split = s.split(" ");
    n = Integer.parseInt(split[0]);
    a=  Integer.parseInt(split[1]);
    b = Integer.parseInt(split[2]);
    input =  new ArrayList<Integer>(n);
    s1 = r.readLine();
    String[] split1 = s1.split(" ");
     for(int i = 0 ; i < n ; i++ )
    {
      input.add(Integer.parseInt(split1[i]));

    }

    for(int i = 0 ; i < n ;i++)
    {
          A.add(a-input.get(i));
          A.add(input.get(i));
          B.add(input.get(i));
          B.add(b-input.get(i));

    }



        ArrayList<Integer> list = new ArrayList<Integer>(A);
        list.addAll(B);
        list.retainAll(input);
     if(list.size()!=input.size()) System.out.println("NO");

    else
        {
          System.out.println("YES");
          for(Integer i : input)
          {
             if(A.contains(i)) System.out.print(0 + " ") ;
             else if(B.contains(i)) System.out.print(1 + " ");
          }

        }


    }
    public static boolean equation (ArrayList<Integer> a , ArrayList<Integer> b)
    {
        boolean flag=false;
        for(int i = 0 ; i < a.size();i++)
       {
         for(int j = 0 ; j < b.size();j++)
         {
             if(a.get(i) == b.get(j))
             {
                 flag = true;
                break;
             }
             else flag = false;
         }
         if(!flag) return flag;
       }
       return flag;
    }


}
