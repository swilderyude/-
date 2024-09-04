package com.yyds.unit2.demo;
import java.util.Scanner; 
public class Wake_up_the_formula_of_your_life {
    public static void main(String[] args) {
       //分别计算1.01、1.02、0.99和0.98的365次方的值
       double big = 1.01;
       double bigger = 1.02;
       double small = 0.99;
       double smaller = 0.98;
       double increase = 1;
       double increase2 = 1;
       double decrease = 1;
       double decrease2 = 1;
       //***要求学生补充下述循环，可以用while、do…while或者for语句去实现***//
	    int i=1;
		while(i<=365) {//while循环
			increase = increase * big;
			increase2 *=  bigger;
			decrease *= small;
			decrease2*= smaller;
			i++;
		}
		/*
	   int i=1;
	   do{//do……while循环
			increase = increase * big;
			increase2 *=  bigger;
			decrease *= small;
			decrease2*= smaller;
			i++;
	   }while(i<=365);
	   */
       /*
      for(int i=1;i<=365;i++) {//for循环
           increase = increase * big;
           increase2 *=  bigger;
           decrease *= small;
           decrease2*= smaller;
      }
      */
      //*********输出结果进行对比*************//
      System.out.println("1.01的值经过365天的迭代进化，变成了"+increase);
      System.out.println("1.02的值经过365天的迭代进化，变成了"+increase2);
      System.out.println("而0.99的值经过365天的迭代进化，变成了"+decrease);
      System.out.println("而0.98的值经过365天的迭代进化，变成了"+decrease2);
      System.out.println("通过这个例子告诫了我们什么道理呢？请大家讨论！");
    }
}