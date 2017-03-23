package com.company;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your customized Card Deck");
        System.out.println("To start off, how many cards of each suit: " );
        int NumSuit = sc.nextInt();

        System.out.println("What is the lowest card value: ");
        int low=sc.nextInt();
        System.out.println("What is the highest card value: ");
        int high=sc.nextInt();
        String [] cards=new String[high-low+1];
        for (int j=0;j<high-low+1;j++)
            for(int i=low;i<=high;i++)
                cards[j] = ""+i;
        System.out.println("Do you want the standard face card");
        String s=sc.nextLine();

        if (s.trim().equalsIgnoreCase("yes")){
            String [] i=new String [high-low+5];
            int j=high-low+1;
            System.arraycopy(cards,0,i,0,j);
            i[j]="Jack";
            i[j+1]="Queen";
            i[j+2]="King";
            i[j+3]="Ace";
            cards=new String[i.length];
            System.arraycopy(cards,0,i,0,i.length);
        }
        int values[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String[] suits=new String [NumSuit];
        for(int i=1;i<=NumSuit;i++) {
            System.out.println("Name suit"+i+": ");
            suits[i-1]=sc.nextLine();
        }
// create the deck here
        Deck d = new Deck(cards,suits, values);

        System.out.println("How many jokers do you like");
        int joker=sc.nextInt();
        for(int i=0;i<joker;i++)
            System.out.println("Joker");
    }

}