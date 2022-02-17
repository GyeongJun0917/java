package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Feb06ServiceImpl
 * author           : Junggyeongjun
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         Junggyeongjun       최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
  @Override
  public void quiz1(String[] arr) {
    System.out.println ("Q1. 팀별 과제를 출력하세요");
    String s = "";
    for (int i = 0; i < arr.length; i++) {
      if (i % 5 == 0) {
        s += "\n";
      }
      s += i + "." + arr[i] + "\t";
      if (i == 17) {
        break;
      }
    }
    System.out.println (s);

  }

  @Override
  public void quiz2(String[] arr) {
    System.out.println (" Q2. 팀장이 맡은 과제만 출력하세요");
    String zzang = "";
    String l = "홍정명";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals ("홍정명")) {
        for (int j = 0; j < 3; j++) {
          zzang += arr[i + j * 5] + ",";
        }
        if (i == 17) {
          break;

        }
        System.out.println (zzang);
        String s;
      }
    }
  }

  @Override
  public void quiz3(String[] arr) {
    String s;
    System.out.println (" Q3 . DP를 담당한 사람을 출력하세요");
    s = arr[10] + "를 담당한 사람 : " + arr[0];


    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals ("DP")) {
        //System.out.println ("DP의 인덱스 : "+i);
        System.out.println (arr[i] + "의 담당자는 " + arr[i % 5]);

      }
    }
  }


  @Override
  public void quiz4(String[] arr) {
    System.out.println ("Q4 . 팀원별 과제 수를 출력하세요");
    String s = "";
    int[] intArr = new int[5];
    int[] resArr = new int[5];
    for (int i = 5; i < arr.length; i++) {
      int a = i % 5;
      for (int j = 0; j < 5; j++) {
        if (a == j) {
          intArr[j]++;
        }
        resArr = intArr;
      }

    }
    for (int i = 0; i < 5; i++) {
      System.out.println (arr[i] + "(" + resArr[i] + ")");
    }

  }
}


