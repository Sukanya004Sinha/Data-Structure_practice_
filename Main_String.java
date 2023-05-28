import java.util.*;
public class Main_String {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//String s1 = "hello";
//System.out.println(s1);
// String s1 = sc.nextLine();
// String s2 = sc.nextLine();
// System.out.println(s1);
// System.out.println(s2);
String s = sc .nextLine();
// System.out.println(s);
// System.out.println(s.length());
// char ch = s.charAt(15);
// System.out.println(ch);
for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    System.out.println(i);
}
/*******************************************************/
//substring 
String s2 = "sparm";
System.out.println(s2. substring(1,3));
System.out.println(s2.substring(1));
/**********************************************************/

String t1 = "sparm";
String t2 = "boy";
String t3 = t1+ " " +t2;
System.out.println(t3);

String k1 = "sparm";
k1 += ' ';
k1 += 's';
k1 += 'p';
k1 += 'e';
k1 += 10;
System.out.println(k1);
System.out.println("hello" +10+20); // its evaluating left to right 
System.out.println(10+20 +"hello");
System.out.println(10 +"hello" +20);
/*****
 * 
 * Split
*/
String ss = "spencer  sparm boy sukanya sinha";
String s6 = "spencer,sparmboy,sukanya,sinha";
String [] parts = ss.split (" ");
for(int i =0;i<parts.length;i++){
    System.out.println(parts[i]);
}
String [] part = s6.split (" ");
for(int i =0;i<part.length;i++){
    System.out.println(part[i]);
}

}
}
