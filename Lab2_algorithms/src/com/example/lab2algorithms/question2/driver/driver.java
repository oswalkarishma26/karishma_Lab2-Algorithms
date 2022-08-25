package com.example.lab2algorithms.question2.driver;

import java.util.Scanner;

import com.example.lab2algorithms.question2.service.MergeSortImplementation;
import com.example.lab2algorithms.question2.service.NotesCount;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);

	}

}
