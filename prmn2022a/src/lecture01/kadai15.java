package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};

        for(int i=0;i<score.length;i++){
            if (score[i]<60){
                System.out.println(i+"番　"+score[i] +"点　不可");
            } else if (score[i]<70) {
                System.out.println(i+"番　"+score[i] +"点　可");
            } else if (score[i]<80){
                System.out.println(i+"番　"+score[i] +"点　良");
            } else if (score[i]<90){
                System.out.println(i+"番　"+score[i] +"点　優");
            } else if (score[i]<100){
                System.out.println(i+"番　"+score[i] +"点　秀");
            }
        }

        System.out.println("最高点："+max(score));
        System.out.println("最低点："+min(score));
        System.out.println("平均点："+average(score));
    }

    static int max(int[] score){

        int max = score[0];

        for(int i=0;i<score.length;i++){
            if (max<score[i]){
                max=score[i];
            }
        }
        return max;
    }

    static int min(int[] score){

        int min = score[0];

        for(int i=0;i<score.length;i++){
            if (min>score[i]){
                min=score[i];
            }
        }
        return min;
    }

    static double average(int[] score){

        double average = 0;

        for(int i=0;i<score.length;i++){
            average = average+score[i];
        }
        return average/score.length;
    }
}
