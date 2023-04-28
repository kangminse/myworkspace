package variable;

import java.util.Scanner;

public class TestClass08 {
	private String name, grade;
	private int kor, eng, math, sum;
	private double avg;
	
	public void myInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("국어 점수 : ");
		kor = input.nextInt();
		System.out.print("영어 점수 : ");
		eng = input.nextInt();
		System.out.print("수학 점수 : ");
		math = input.nextInt();
		
	}
	
	public void cal() {
		sum = kor + eng + math;
		avg = sum/3;
		
	}
	
	public void grade() {
		if(avg >= 90) {
			grade = "A";
		}
		else if(avg >= 80 && avg < 90) {
			grade = "B";
		}
		else {
			grade = "C";
		}
	}
	
	public void display() {
		System.out.println("이름 : "+name);
		System.out.println("국어:"+kor+" 영어:"+eng+" 수학:"+math+" 합:"+sum+" 평균:"+avg+ " 등급:"+grade);
	}

}
