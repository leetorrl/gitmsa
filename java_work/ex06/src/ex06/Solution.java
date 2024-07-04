package ex06;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in); //입력받기 위해서 적는것
	        int year = sc.nextInt(); //int를 입력받는것 첫번째 입력을 기다림
	        
	        
	        String age_type = sc.next(); // string을 문자열을 입력받는것 두번째 입력을 기다림
	        int answer = 0;

	        if (age_type.equals("KOREA")) {
	        	//equals는 문자열 버전 ==과 같은 명령어) {
	            answer =  2030 - year;
	        }
	        else if (age_type.equals("Year")) {
	            
	                 answer = 2030 - year +1  ;
	        }

        
	        System.out.println("age_type="+age_type);
	        
	        System.out.println("answer="+answer);
	        
	        System.out.println("year="+year);
	    }
}
