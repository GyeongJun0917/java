package com.example.demo.member.controller;

import com.example.demo.quiz.controller.QuizController;
import com.example.demo.member.domain.BmiDTO;
import com.example.demo.member.domain.GoogleDTO;
import com.example.demo.member.domain.CalcDTO;
import com.example.demo.member.domain.GradeDTO;
import com.example.demo.member.domain.UserDTO;
import com.example.demo.member.service.MemberServiceImpl;
import com.example.demo.member.service.MemberService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : DemoController
 * author           : Junggyeongjun
 * date               : 2022-01-27
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         Junggyeongjun       최초 생성
 * 2022-02-10 DTO 싱글턴 변경 및 멤버컨트롤러 수정
 */
public class MemberController {
  public void execute(Scanner scanner) {
    QuizController tempController = new QuizController ();
    MemberService service = new MemberServiceImpl ();
    while (true) {
      System.out.println ("메뉴 선택");
      String menu = "1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
      System.out.println (menu);
      String sel = scanner.next ();
      String res = "";
      switch (sel) {
        case "0":
          System.out.println ("Exit");
          return;
        case "1":
          res = "BMI";
          System.out.println (BmiDTO.Bmi + "\n 이름, 키, 몸무게");
          BmiDTO b = BmiDTO.getInstance();
          b.setName (scanner.next ());
          b.setTall (scanner.nextInt ());
          b.setWeight (scanner.nextInt ());
          res = service.getbmi (b);
          break;
          case "2":
          res = "CALC";
          System.out.println (CalcDTO.CALC + "\n 숫자1, 연산자, 숫자2 입력");
          CalcDTO c = CalcDTO.getInstance();
          c.setNum1 (scanner.nextInt ());
          c.setOpcode (scanner.next ());
          c.setNum2 (scanner.nextInt ());
          res = service.Calc (c);
          break;
        case "3":
          res = "GOOGLE";
          System.out.println (GoogleDTO.Google + "\n 검색어 입력");
          GoogleDTO g = GoogleDTO.getInstance();
          g.setSearch ();
          res = service.searach (g);
          break;
        case "4":
          res = "GRADE";
          System.out.println (GradeDTO.GRADE + "\n 이름, 국어, 영어, 수학 ");
          GradeDTO gr = GradeDTO.getInstance ();
          gr.setName (scanner.next ());
          gr.setKor (scanner.nextInt ());
          gr.setEng (scanner.nextInt ());
          gr.setMath (scanner.nextInt ());
          res = service.getgrade (gr);
          break;
        case "5":
          res = "LOGIN";
          System.out.println (UserDTO.Login + "\n 아이디, 비번, 이름 ");
          UserDTO u = UserDTO.getInstance ();
          u.setName (scanner.next ());
          u.setId (scanner.next ());
          u.setPw (scanner.next ());
          res = service.login (u);
          break;
          default:
          res = "1~5 중 선택하세요";
          break;

      }
      System.out.println (res);
    }

      /*  if (select.equals("1")){res = "BMI";}else
        if (select.equals("2")){res = "CALC";}else
        if (select.equals("3")){res = "SEARCH";}else
        if (select.equals("4")){res = "GRADE";}else
        if (select.equals("5")){res = "LOGIN";}
       */

  }
}
