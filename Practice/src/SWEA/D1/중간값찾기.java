package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 중간값찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[N];
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            number[i] = n;
        }
        for(int i = N - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(number[j] > number[j + 1]){
                    int temp = number[j + 1];
                    number[j + 1] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(number[N / 2]);
    }// main

}
