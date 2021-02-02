package main;

import java.util.Scanner;

import business.Business;

public class Main {
	
public static void main(String[] args) {
	try{
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número inteiro positivo");
		String n = sc.next();
		sc.close();
		if(Business.validador(n)){
			System.out.println("favor digitar um número inteiro positivo");
		}else{	
			//Integer num = Integer.parseInt(new String(n));
			System.out.println("valor final: " + Business.ordenador(n));
		
			}
		
	}catch (Exception e) {
		System.out.println("-1");
	}
	}
}

