package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.Bmi
 * fileName        : BmiApp
 * author           : Junggyeongjun
 * date               : 2022-01-25
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         Junggyeongjun       최초 생성
 */
public class BmiDTO extends Object{
   public static String Bmi = "BMI구하기";
   private final static BmiDTO bmiDTO = new BmiDTO ();
   private BmiDTO(){}
  public static BmiDTO getInstance(){return bmiDTO;}
   private String name;
   private double tall;
   private double weight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTall() {
    return tall;
  }

  public void setTall(double tall) {
    this.tall = tall;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}



