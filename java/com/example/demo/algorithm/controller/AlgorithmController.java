package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.service.SoftServiceImpl;
import com.example.demo.algorithm.service.SortService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName        : DemoController2
 * author           : Junggyeongjun
 * date               : 2022-01-27
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         Junggyeongjun       최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner) {
        SortService sortService = new SoftServiceImpl ();
        while (true){
            System.out.println("[Menu] 0.Exit\n"+
                            "[홍정명]1. Stack\t" +
                            "2. .Queue\t" +
                            "3. Dfs\t"   +
                            "4. .Bfs\n"  +
                            "[노홍주]5. Sort \t"  +
                            "6. Heap\n"+
                            "[전종현]7. Hash \t"   +
                            "8. Greedy\n"   +
                            "[정경준]9. BruteForce \t"    +
                            "10. DP\n" +
                            "[양정오]11. BinarySearch \t" +
                            "12. Graph\n");
            switch (scanner.next()){
                case "0":
                    System.out.println ("Exit"); return;
                case "1":
                    System.out.println ("0. Exit ");
                default:
                    System.out.println("Wrong Number");
            }
        }
    }
}
