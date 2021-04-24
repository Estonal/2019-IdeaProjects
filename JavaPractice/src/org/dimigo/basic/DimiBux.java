package org.dimigo.basic;

public class DimiBux {
    public static void main(String[] args) {
        int wall = 1700000;
        int person = 3;
        int store = 1500;


        System.out.printf("<< 디미벅스 연간 인건비 >>\n");
        System.out.printf("월 평균 급여 : %,d원\n", wall);
        System.out.printf("점포 내 직원 수 : %,d명\n", person);
        System.out.printf("점포 수 : %,d개\n", store);
        System.out.printf("\n");

        long ingun = (long)wall * 12 * person * store;
        System.out.printf("연간 인건비 : %,d원", ingun);

    }
}
