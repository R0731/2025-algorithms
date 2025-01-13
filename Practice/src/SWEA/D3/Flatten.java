package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 1; tc <= 10; tc++){
            int count = Integer.parseInt(br.readLine());
            int[] box = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 숫자 입력받기
            for(int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(br.readLine());
            }

            // 평탄화 작업
            for(int i = 0; i < count; i++){
                // 최대 최소값 구하기
                int maxIdx = 0;
                int minIdx = Integer.MAX_VALUE;

                for(int j = 1; j < box.length; j++){
                    if(box[maxIdx] < )
                }
            }
            for(int i = 0; i < count; i++){
                int maxidx
                if(n > max){
                    max = n;
                }
            }
            System.out.println();
        }// tc

    }// main

}
