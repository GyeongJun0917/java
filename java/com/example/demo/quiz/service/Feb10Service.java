package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb10Service
 * author           : Junggyeongjun
 * date               : 2022-02-10
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         Junggyeongjun       최초 생성
 */
public interface Feb10Service {
  // 1번
  void bubbleSort(Scanner scanner);
  void insertionSort(Scanner scanner);
  void selectionSort(Scanner scanner);
// 2번
  void quickSort(Scanner scanner);
  void mergeSort(Scanner scanner);
 // 3번
  void magicSquare(Scanner scanner);
  // 4번
  void zigzag(Scanner scanner);
  //5번
  //좌측 90도 직각삼각형 별찍기
  void rectangleStarPrint(Scanner scanner);
  //정삼각형 별찌지
  void triangleStarPrint(Scanner scanner);
}
