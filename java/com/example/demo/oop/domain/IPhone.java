package com.example.demo.oop.domain;

import com.example.demo.member.domain.CalcDTO;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : IPhone
 * author           : Junggyeongjun
 * date               : 2022-02-09
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         Junggyeongjun       최초 생성
 */
public class IPhone extends CelPhone {
  public final static String KIND = "아이폰";
  protected String search;

  public IPhone(String company){
   super(KIND, company,"이동중");
  }
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  @Override
  public String toString() {
    return String.format ("[애플]에서 만든 %s을 사용해서 %s중에 [뉴스]를 검색한다",
            super.getCompany (),KIND, super.getMove (),search);
  }
}


