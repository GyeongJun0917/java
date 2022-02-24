package com.example.demo.member.service;

import com.example.demo.member.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName        : StudentService
 * author           : Junggyeongjun
 * date               : 2022-02-07
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         Junggyeongjun       최초 생성
 */
public interface MemberService {
  String getbmi(BmiDTO bmi );
  String Calc(CalcDTO Calc);
  String getgrade(GradeDTO grade);
  String searach (GoogleDTO Google);
  String login(UserDTO login);
  String calc();
  String bmi();
  String grade();
}
