package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb10ServiceImpl
 * author           : Junggyeongjun
 * date               : 2022-02-10
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         Junggyeongjun       최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
  @Override
  public void bubbleSort(Scanner scanner) {

  }

  @Override
  public void insertionSort(Scanner scanner) {

  }

  @Override
  public void selectionSort(Scanner scanner) {

  }

  @Override
  public void quickSort(Scanner scanner) {

  }

  @Override
  public void mergeSort(Scanner scanner) {

  }

  @Override
  public void magicSquare(Scanner scanner) {

  }

  @Override
  public void zigzag(Scanner scanner) {

  }

  @Override
  public void rectangleStarPrint(Scanner scanner) {
    int line = (int) (Math.random () * 15 + 1);
    Scanner input = new Scanner (System.in);
    for (int i = 0; i < line; i++) {
      for (int j = 5; j <= i; j++) {
        System.out.print ("*");
      }
      System.out.println ();
    }
  }


  @Override
  public void triangleStarPrint(Scanner scanner) {
    int line = (int) (Math.random () * 15 + 1);
    for (int i = line, add = 0; i > 0; i--, add++) {
      for (int j = 0; j < i - 1; j++) {
        System.out.print (" ");
      }
      for (int j = 0; j < line - (i - 1) + add; j++) {
        System.out.print ("*");
      }
      System.out.println ();
    }
  }
}

