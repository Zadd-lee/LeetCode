class Solution {
    public int evalRPN(String[] tokens) {
                Stack<String> tokenBox = new Stack<>();

        //숫자이면 stack에 push
        //만약 사칙연산이 나올 경우 정수 2개를 뽑아 계산 해 준 뒤 다시 넣는다
        for (String token :tokens) {
            if ("+-*/".contains(token)) {
                int b = Integer.parseInt(tokenBox.pop());
                int a = Integer.parseInt(tokenBox.pop());
                switch (token) {
                    case "+":
                        tokenBox.push(String.valueOf(a + b));
                        break;
                    case "-":
                        tokenBox.push(String.valueOf(a - b));
                        break;
                    case "*":
                        tokenBox.push(String.valueOf(a * b));
                        break;
                    case "/":
                        tokenBox.push(String.valueOf(a / b));
                        break;
                }
            } else {
                tokenBox.push(token);
            }

        }
        return Integer.parseInt(tokenBox.pop());
    }
}