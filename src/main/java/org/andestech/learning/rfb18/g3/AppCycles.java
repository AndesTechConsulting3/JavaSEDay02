package org.andestech.learning.rfb18.g3;

public class AppCycles {

    public static void main(String[] args)
    {

       /// while
       int res = 0, k=0;

       int res2 = 2 + res + (++res);
        System.out.println(res2);
        System.out.println(res);


       int j =0, N=6;
       while(j<N){

           System.out.println("j=" + j);
           //j++;
           ++j;
       }

        //j=0;
        while(true){
            if(j<0) break;
            System.out.println("j=" + j);
            //j++;
            --j;
        }

    // for

        {
           int k2 =0;
           k2 = j;


        }


//        {
//            int i = 0;
//            for (; i < N; i++) {
//            }
//        }


        for(int i = 0 ; i<N || k<N+1; i++, k++)
        {
            System.out.println(i+"^2=" + i*i);
        }

        {   int i =0;
            for (;;) {
                if(i>=N) break;
                System.out.println(i + "^2=" + i * i);
                //...
                //...
                i++;
            }
        }

        k=2;
        for (;;) {
            if(k>=N) break;
            System.out.println(k + "^2=" + k * k);
            //...
            //...
            k++;
        }

        //-------------------
        System.out.println("------------------------");
        int n=1;
        do{
            System.out.println("n=" + n);
            n++;
        }
        while (n<6);

//1
        System.out.print("task1,\t");
        System.out.print("task2,\t");
        System.out.print("task3");
//2
        System.out.println();
        System.out.print("\r\n");

        if(7%2==0) System.out.println("чётное");

        // mult table
        N=10;


        System.out.print("\t");
        for(int i=1; i<=N; i++) System.out.print(i + "\t");

        System.out.println();

        for(int i=1; i<=N; i++)
        {
            System.out.print(i + "\t");
            for( j=1; j<=N; j++)
            {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }




//        for(int i = 0; i<N; i++)
//        {
//            System.out.println(i+"^2=" + i*i);
//        }

    }

}
