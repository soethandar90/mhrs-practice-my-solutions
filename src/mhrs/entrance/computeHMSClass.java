package mhrs.entrance;

public class computeHMSClass {
    public static void main(String[] args) {
        //int seconds = 3735;// 1 2 15
        //int seconds = 380;// 0 60 20
        //int seconds = 3650;// 1 0 50
        //int seconds = 55;// 0 0 55
        int seconds = 0;// 0 0 0
        computeHMS(seconds);
    }
    static int[] computeHMS(int seconds){
        System.out.println((seconds/60)/60);
        System.out.println((seconds/60)%60);
        System.out.println(seconds%60);
        return new int[]{(seconds/60)/60,(seconds/60)%60,seconds%60};
    }
}
