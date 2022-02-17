package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.calc
 * fileName        : LoginApp.Java
 * author           : Junggyeongjun
 * date               : 2022-01-24
 * desc               : 아이디,비밀번호,닉네임을 받아 로그인 결과를 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         Junggyeongjun       최초 생성
 * 2022-01-26 if절 추가 로그인 성공과 실패 값 추가, switch 추가
 */
//constant=변하지않는 주소이다.(전프로그램에서)
//variable=주소가 변하는것
//immutable=주소값이 변하지않는것
//mutable=주소값이 변하는것
public class UserDTO {
  public static String Login = "로그인 앱";
  private final static UserDTO userDTO = new UserDTO ();
  private UserDTO(){}
  public static UserDTO getInstance() {return userDTO;}

  public static String PASSWORD = "abc";
  private String id;
  private String pw;
  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



   /* switch (pw){
        case "abc" : res = String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",name,pw); break;
        default: res = String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",id,pw);
    }*/



    /*
    if (pw.equals("abc")){
        res = String.format(" %s 님의 비밀번호 %s 가 맞습니다. 로그인 성공 ",name,pw);}
    else{
       res = String.format(" %s 님의 ID 는 맞고, 비밀번호 %s 가 틀립니다. 로그인 실패 ",id,pw);}
   }*/


}


