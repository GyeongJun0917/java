package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb08ServiceImpl
 * author           : Junggyeongjun
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         Junggyeongjun       최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {
  @Override
  public void lotto(Scanner scanner) {

  }


  @Override
  public void baseball(Scanner scanner) {

  }

  @Override
  public void booking(Scanner scanner) {

  }

  @Override
  public void bank(Scanner scanner) {

  }

  @Override
  public void gugudan(Scanner scanner) {
    System.out.println ("구구단\n" +
            "2단                 3단             4단             5단");
    for (int j = 1; j < 10; j++) {
      System.out.println ();
      for (int i = 2; i < 6; i++) {
        System.out.format ("%d X %d = %2d   \t  ", i, j, i * j);
      }
    }
    System.out.println ("\n\n6단                7단              8단             9단");
    for (int j = 1; j < 10; j++) {
      System.out.println ();
      for (int i = 6; i < 10; i++) {
        System.out.format ("%d X %d = %2d   \t  ", i, j, i * j);
      }
    }
  }
}