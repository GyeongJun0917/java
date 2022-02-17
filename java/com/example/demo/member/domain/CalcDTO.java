package com.example.demo.member.domain;

import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.calc
 * fileName        : CalcApp.Java
 * author           : Junggyeongjun
 * date               : 2022-01-24
 * desc               : 숫자 두개와 연산자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         Junggyeongjun       최초 생성
 * 2022-01-26   if 절 추가 4칙연산 추가 , switch 추가
 */
public class  CalcDTO {
  public final static String CALC = "계산기";
  private final static CalcDTO calcDTO = new CalcDTO ();
  public CalcDTO(){}
  public static CalcDTO getInstance (){return calcDTO;}
  private int num1;
  private int num2;
  private String opcode;

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public String getOpcode() {
    return opcode;
  }

  public void setOpcode(String opcode) {
    this.opcode = opcode;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }
}




        /*
        if(opcode.equals("+")){res = this.num1 + this.num2;
        }else
        if(opcode.equals("-")){res = this.num1 - this.num2;
        }else
        if(opcode.equals("*")){res = this.num1 * this.num2;
        }else
        if(opcode.equals("/")){res = this.num1 / this.num2;
        }else{
            res = 0;
        }*/









