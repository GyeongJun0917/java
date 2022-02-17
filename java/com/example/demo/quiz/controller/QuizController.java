package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : TempController
 * author           : Junggyeongjun
 * date               : 2022-02-03
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         Junggyeongjun       최초 생성
 */
public class QuizController {
  public void execute(Scanner scanner) {
    Feb06Service feb06Service = new Feb06ServiceImpl ();
    Feb07Service feb07Service = new Feb07ServiceImpl ();
    Feb08Service feb08Service = new Feb08ServiceImpl ();
    Feb10Service feb10Service = new Feb10ServiceImpl ();
    while (true) {
      System.out.println ("0)Exit 1)2월6일 2)2월7일 3)2월8일 3)2월9일");
      switch (scanner.next ()) {
        case "0":
          System.out.println ("### Exit ###");
          return;
        case "1":

          String[] arr = {"정경준", "양정오", "홍정명", "노홍주", "전종현",
                  "완전탐색", "이분탐색", "깊이우선탐색", "정렬", "해시",
                  "DP", "그래프", "너비우선탐색", "힙", "탐욕법"};
          System.out.println ("[소메뉴]\n[MENU]0. EXIT  1. 팀별 과제 출력\n" +
                  " 2. 팀장이 맡은 과제만 출력\n" +
                  " 3. DP를 담당한 사람을 출력 \n" +
                  " 4. 팀원별 과제 수를 출력\n");
          switch (scanner.next ()) {
            case "0":
              System.out.println ("EXIT");
              return;
            case "1":
              feb06Service.quiz1 (arr);
              break;
            case "2":
              feb06Service.quiz2 (arr);
              break;
            case "3":
              feb06Service.quiz3 (arr);
              break;
            case "4":
              feb06Service.quiz4 (arr);
              break;
            default:
              System.out.println ("0~4 중 선택하세요");
          }
          break;
        case "2":
          System.out.println ("[MENU] 0. EXIT 1. Dice 2. Rps 3. getPrime 4. LeapYear 5. numberGolf");
          switch (scanner.next ()) {
            case "0":
              System.out.println ("게임 종료");
              return;
            case "1":
              System.out.println ("Dice");
              feb07Service.dice (scanner);
              break;
            case "2":
              System.out.println ("Rps");
              feb07Service.rps (scanner);
              break;
            case "3":
              System.out.println ("GetPrime");
              feb07Service.getPrime (scanner);
              break;
            case "4":
              System.out.println ("LeapYear");
              feb07Service.leapYear (scanner);
              break;
            case "5":
              System.out.println ("NumberGolf");
              feb07Service.numberGolf (scanner);
              break;
            default:
              System.out.println ("0~5 중 선택하세요");
              break;
          }
        case "3":
          System.out.println ("0.[EXIT] 1. Lotto 2. Baseball 3. Booking 4. Bank 5. Gugudan");
          switch (scanner.next ()) {
            case "0":
              System.out.println ("EXIT");
              return;
            case "1":
              System.out.println ("Lotto");
              feb08Service.lotto (scanner);
            case "2":
              System.out.println ("Baseball");
              feb08Service.baseball (scanner);
            case "3":
              System.out.println ("Booking");
              feb08Service.booking (scanner);
            case "4":
              System.out.println ("Bank");
              feb08Service.bank (scanner);
            case "5":
              System.out.println ("Gugudan");
              feb08Service.gugudan (scanner);
            default:
              System.out.println ("\n0~3중 선택하세요");
          }
          break;
        default:
          System.out.println ("0~5중 선택");
          break;
        case "4" :
          System.out.println ("0.[EXIT] 1. bubbleSort" +
                  " 2. insertionSort 3. selectionSort" +
                  " 4. quickSort 5. mergeSort" +
                  "6. magicSquare 7. zigzag " +
                  "8. rectangleStarPrint 9. triangleStarPrint");
          switch (scanner.next ()) {
            case "0":
              System.out.println ("EXIT");

            case "1":
              System.out.println ("bubbleSort");
              feb10Service.bubbleSort (scanner);
            case "2" :
              System.out.println ("insertionSort");
              feb10Service.insertionSort (scanner);
            case "3" :
              System.out.println ("selectionSort");
              feb10Service.selectionSort (scanner);
            case "4" :
              System.out.println ("quickSort");
              feb10Service.quickSort (scanner);
            case "5" :
              System.out.println ("mergeSort");
              feb10Service.mergeSort (scanner);
            case "6" :
              System.out.println ("magicSquare");
              feb10Service.magicSquare (scanner);
            case "7" :
              System.out.println ("zigzag");
              feb10Service.zigzag (scanner);
            case "8" :
              System.out.println ("rectangleStarPrint");
              feb10Service.rectangleStarPrint (scanner);
            case "9" :
              System.out.println ("triangleStarPrint");
              feb10Service.triangleStarPrint (scanner);
            default:
              System.out.println ("0~9 선택");
          }
          break;
          }
      }


    }

  }



















  /*
  GradeDTO[] grades = new GradeDTO[2];
  for (int i = 0; i < grades.length; i++){
    grades[i] = new GradeDTO ();
    System.out.println ("이름을 입력하세요");
    grades[i].setName (scanner.next ());
    System.out.println ("수학점수를 입력하세요");
    grades[i].setMath (scanner.nextInt ());
    System.out.println ("국어점수를 입력하세요");
    grades[i].setKor (scanner.nextInt ());
    System.out.println ("영어점수를 입력하세요");
    grades[i].setEng (scanner.nextInt ());
    System.out.println ("--------------------");
  }
  for (int i = 0; i < grades.length; i++){
    System.out.println ("이름 : " + grades[i].getName ());
    System.out.println ("수학점수 : "+ grades[i].getMath ());
    System.out.println ("국어점수 : "+ grades[i].getKor ());
    System.out.println ("영어점수 : "+ grades[i].getEng ());
    System.out.println ("--------------------");
  }
  }
}**/
