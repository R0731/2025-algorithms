package BACKJOON.GOLD2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class No_1655_가운데를말해요 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        String answer = "";

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < list.size(); j++){
                list.add(n, j);
            }
            if(i % 2 != 0){
                answer += list.get(i / 2) + "\n";
            }else{
                answer += list.get((i / 2) - 1) + "\n";
            }
        }

        System.out.println(answer.toString());
    }// main
}
