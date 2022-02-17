package com.example.demo.oop.repository;

/**
 * packageName: com.example.demo.phone.repository
 * fileName        : Test
 * author           : Junggyeongjun
 * date               : 2022-02-09
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         Junggyeongjun       최초 생성
 */
public class Test {
  String model;
  String color;

  public static void main(String[] args) {
    System.out.println ("테스트");
  }

  void powerOn() {
    System.out.println ("전원을 켭니다.");
  }

  void powerOff() {
    System.out.println ("전원을 끕니다.");
  }

  void bell() {
    System.out.println ("벨이 울립니다.");
  }

  void sendVoice(String message) {
    System.out.println ("자기 : " + message);
  }

  void receiveVoice(String message) {
    System.out.println ("상대방 : " + message);
  }

  void hangUp() {
    System.out.println ("전화를 끊습니다.");

  }
}
