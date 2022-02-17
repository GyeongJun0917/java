package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.grade
 * fileName        : GradeApp
 * author           : Junggyeongjun
 * date               : 2022-01-26
 * desc               :
 * <p>
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         Junggyeongjun       최초 생성
 */
public class GradeDTO {
  public static String GRADE = "성적표";
  private final static GradeDTO gradeDTO = new  GradeDTO();
  public GradeDTO(){}
  public static GradeDTO getInstance(){return gradeDTO;}
  private String name;
  private int kor;
  private int eng;
  private int math;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }


}






