package com.bridgelabz;
import java.util.Scanner;

public class TicTacToe
{	
	 public static char[] board=new char[10];
	 public static void main(String[] args)
	 {
	        System.out.println("Welcome to Tic Tac Toe Game");
	        createBoard();
	        displayBoard();
	 }
	 private static void displayBoard()
	    {
	        System.out.println("The Current Board is:");
	        System.out.println("| " + board[1] + " | "+ board[2] + " | " + board[3]+ " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[4] + " | "+ board[5] + " | " + board[6]+ " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[7] + " | "+ board[8] + " | " + board[9]+ " |");
	    }
	    private static char[] createBoard()
	    {
	        char[] board=new char[10];
	        for(int i=1;i<board.length;i++)
	        {
	            board[i]='-';
	        }
	        return board;
	    }
	}
