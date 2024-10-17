class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] sentz = quiz[i].split(" ");
            int a = Integer.parseInt(sentz[0]);
            int b = Integer.parseInt(sentz[2]);
            int result = 0;
            if(sentz[1].equals("+")){
                result=a+b;
            }else{
                result=a-b;
            }
            if(result == Integer.parseInt(sentz[4])){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
            
        }
        return answer;
    }
}