package BACKJOON;

import java.io.BufferedReader;
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
            System.out.println("사이즈" + list.size());
            if(i == 0){
                list.add(n);
            }else{
                for(int j = 0; j < list.size(); j++){
                    System.out.println("작동");
                    if(list.get(j) >= n){
                        list.add(j, n);
                        System.out.println("리스트 조회" + list.toArray().toString());
                        break;
                    }
                }
            }
        }

        System.out.println(answer.toString());
    }// main
}
