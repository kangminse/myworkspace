package test.care;

import java.util.*;

import test.date.Date;
import test.java.*; // 같은 형식으로 된 모든것들을 임포트함


public class Main01 {
	public static void main(String[] args) {
		
		Test01 t = new Test01();
		t.test();
		TestClass01 t01 = new TestClass01();
		t01.test();
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		Date dd = new Date();
		dd.date();
		
		test.java.Date d01 = new test.java.Date();
		d01.date();
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
	}

}
