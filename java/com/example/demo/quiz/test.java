package com.example.demo.quiz;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;
import com.example.demo.quiz.service.Feb10Service;
import com.example.demo.quiz.service.Feb10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : Test
 * author           : Junggyeongjun
 * date               : 2022-02-09
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         Junggyeongjun       최초 생성
 */
public class test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    Feb10Service feb10Service = new Feb10ServiceImpl ();
    feb10Service.triangleStarPrint (scanner);
  }
}