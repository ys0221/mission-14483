package com.back;

public class Calc {
    public static int run(String math) {
        int result = 0;
        String[] split = math.split(" "); // 띄어쓰기 기준으로 분할
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                if(result == 0 && i == 1) { // 초기화 방지
                    result = Integer.parseInt(split[0]);
                }
                result += Integer.parseInt(split[i + 1]);
            } else if (split[i].equals("-")) {
                if(result == 0 && i == 1) {
                    result = Integer.parseInt(split[0]);
                }
                result -= Integer.parseInt(split[i + 1]);
            } else if (split[i].equals("*")) {
                if(result == 0 && i == 1) {
                    result = Integer.parseInt(split[0]);
                }
                result *= Integer.parseInt(split[i + 1]);
            }
        }
        return result;
    }
}