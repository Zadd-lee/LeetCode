import java.util.stream.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cntW=0;
        int cntZ=0;
        for(int lo:lottos){
            //일치 번호 확인
            
            if(IntStream.of(win_nums).anyMatch(x->x==lo)){
                
                cntW++;
            }else if(lo==0){ //빈 번호 확인
                cntZ++;
            }
        }
        answer[1]=7-cntW;
        answer[0]=answer[1]-cntZ;
        
        if (answer[1]>=7){
            answer[1]=6;
        }
        if (answer[0]>=7){
            answer[0]=6;
        }

        return answer;
    }
}