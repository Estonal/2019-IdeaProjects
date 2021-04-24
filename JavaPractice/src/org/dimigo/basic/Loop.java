package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=9; i++)
        {
            for (j=1; j<=9; j++)
            {
                System.out.printf("%d * %d = %d\t", i,j,i*j);
            }
            System.out.println();
        }

        //for-each문
        String[] BTS = {"슈가", "제이홉", "남준"};
        for(String name : BTS) {
            System.out.println(name);
        }

        // 3. while, do~while
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데yee");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();
            switch(menu) {
                case 1:
                    System.out.println("ITZY를 선택");
                    break;
                case 2:
                    System.out.println("빅뱅를 선택");
                    break;
                case 3:
                    System.out.println("YEE를 선택");
                    break;
                case 9:
                    System.out.println("Bye!");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴를 선택");
                    break;


            }
        } while(menu != 9);
    }


}
