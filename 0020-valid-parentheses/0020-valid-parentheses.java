class Solution {
    public boolean isValid(String s) {
        // 괄호의 짝은 항상 짝수
        if(s.length()%2!=0) return false;

        //여는 괄호를 담을 stack을 생성 후 
        // 문자열을 순회하며 괄호쌍이 맞지 않으면 false 를 출력
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("{[(".contains(String.valueOf(c))) {
                stack.push(c);
            }else {
                //여는괄호 없이 닫는 괄호만 나올때
                if(stack.isEmpty()) return false;
                if (Math.abs((int) stack.pop() - c) > 2) {
                    return false;
                }
            }
        }
        //여는 괄호쌍이 남아있는 경우 확인
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}