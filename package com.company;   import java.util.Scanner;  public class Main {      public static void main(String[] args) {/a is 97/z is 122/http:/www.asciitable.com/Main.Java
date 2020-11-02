package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // a is 97
        // z is 122
        // http://www.asciitable.com/
        System.out.print("rotation: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
          while (key < 1 || key > 25)
          {    System.out.println("Input an integer that is higher than 0 and less than 26. ");
          System.out.print("Rotation:");
          key = input.nextInt();
          }
        if (key >= 1 || key <= 25)
             {System.out.println("Success");
             }
        Scanner cm = new Scanner(System.in);
        System.out.print("Plain Text:");
        String text = cm.nextLine();
        text = text.toLowerCase();
        int letnum;
        String newlet ="";



            for (int i = 0; i < text.length(); i++) {

                letnum = text.charAt(i);

                letnum = letnum + key;

                if ( letnum <97 )
                { letnum = letnum - key;
                }

                       if (letnum >= 122)
                {
                    letnum = (letnum - 97) % 26 + 97;
                }
                   newlet += "" + (char) letnum;

            }
        System.out.println(" ");
        System.out.println("Cypher Text:" + newlet);
        }
    }

