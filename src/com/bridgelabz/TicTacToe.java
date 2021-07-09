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
	        userOption();
	 }
	 private static void displayBoard()
	    {
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
	    private static void userOption()
	    {
	        System.out.println("Choose between x or o : ");
	        Scanner scanner = new Scanner(System.in);
	        char userTurn=scanner.next().charAt(0);
	        char computerTurn;
	        if (userTurn == 'X' || userTurn == '0')
	        {
	            if (userTurn == userTurn) {
	            	computerTurn = 'o';
	                System.out.println("Player has chosen " + userTurn + " and computer is  "+computerTurn);
	            } else {
	            	computerTurn = 'x';
	                System.out.println("Player has chosen " + userTurn + " and computer is "+computerTurn);
	            }
	        }
	        else
	        {
	            System.out.println("Enter only X or O"+ "");
	            userOption();
	        }
	    }
	}
