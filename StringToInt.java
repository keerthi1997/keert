import java.util.*;
import java.io.*;
public class StringToInt{  
public static void main(String args[]){  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;  
s=br.readLine();
int i=Integer.parseInt(s);  
System.out.println(s+100);//200100 because + is string concatenation operator  
System.out.println(i+100);//300 because + is binary plus operator  
}}  
