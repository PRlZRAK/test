package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int h;
	int m;
	int s;
	m=n/60;
	s=n%60;
    h=m/60;
    m=m%60;
    String m1;
    String s1;
    if(m<10)
    m1  =  "0"+m;
    else  m1  =  ""+m;
    if(s<10)
    s1  =  "0"+s;
    else  s1  =  ""+s;
    h=h%24;
    System.out.print(h+":"+m1+":"+s1);
	}

}
