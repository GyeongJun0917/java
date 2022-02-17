package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.Google
 * fileName        : GoogleApp
 * author           : Junggyeongjun
 * date               : 2022-01-25
 * desc               : 도메인과 검색결과를 받아서 리턴하는 앱
 * vaiable            : [GoogleApp]  [search]  [search] [res]
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         Junggyeongjun       최초 생성
 */
public class GoogleDTO {
   public static String Google = "Google";
   private final static GoogleDTO googleDTO = new GoogleDTO ();
   public GoogleDTO(){}
public static GoogleDTO getInstance(){return googleDTO;}
    private String search;
public String getSearch(){
 return search;
}
public void setSearch(){
 this.search = search;
}


    }


