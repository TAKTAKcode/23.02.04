package com.tak.study;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //중복이 허용되지 않는 HashSet를 사용하여 값을 담아주기 위하여 선언
        HashSet<Integer> hashS = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {

            //입력받은 값의 나머지 -> add를 통해 HashSet에 저장
            hashS.add(sc.nextInt() % 42);
        }

        //Scanner 메모리 누수 방지
        sc.close();

        //add를 통해 저장된 hashS의 사이즈를 출력
        System.out.print(hashS.size());
    }

}
