package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName        : HashService
 * author           : Junggyeongjun
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         Junggyeongjun       최초 생성
 */
public interface HashService {
  String failedPlayer(String [] praticpant, String [] completion);
  boolean phoneBok(String [] phoneBook);
  int spy(String [][] clothes);
  int bestAlbum(String [] genres, int[] player);
}
