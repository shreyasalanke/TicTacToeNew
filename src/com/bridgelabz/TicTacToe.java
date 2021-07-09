package com.bridgelabz;
import java.util.Scanner;

public class TicTacToe
{	
	 public static char[] board=new char[10];
	 public static void main(String[] args)
	 {
	        System.out.println("Welcome to tic tac toe game");
	        createBoard();
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
