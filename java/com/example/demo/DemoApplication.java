package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.oop.controller.Oopcontroller;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.member.controller.MemberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run (DemoApplication.class, args);
    Scanner scanner = new Scanner (System.in);
    Oopcontroller oopcontroller = new Oopcontroller ();
    QuizController quizController = new QuizController ();
    MemberController studentController = new MemberController ();
    AlgorithmController algorithmController = new AlgorithmController ();

    while (true) {
      System.out.println ("0. EXIT 1.Oop 2.Quiz 3.Member 4.Algorithm");
      switch (scanner.next ()) {
        case "0":
          System.out.println ("EXIT");
          return;
        case "1":
          System.out.println ("Oop");
          oopcontroller.execute (scanner);
          break;
        case "2":
          System.out.println ("Quiz");
          quizController.execute (scanner);
          break;
        case "3":
          System.out.println ("Member");
          studentController.execute (scanner);
          break;
        case "4":
          System.out.println ("Algorithm");
          algorithmController.execute (scanner);
          break;
        default:
          System.out.println ("0~4 중 선택하세요");
          break;
      }
    }
  }
}
