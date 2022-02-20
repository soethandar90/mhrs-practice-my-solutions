package mui.entrance.cubepowerful;

public class CubePowerful {

    public static void main(String[] args) {
        //int n = 153; //1
        //int n = 370; //1
       // int n = 371; //1
        //int n = 407; //1
        //int n = 87; //0
        //int n = 0; //0
        int n = -81; //0
        isCubePowerful(n);
    }

    static int isCubePowerful(int n) {
        int rt = 0;
        int cubeResult = 0;
        if (n > 0) {
            int tempN = n;
            do{
                int tempCube = 1;
                for (int i = 1; i <= 3; i++) {
                    tempCube *= (tempN % 10);
                    if(tempCube>n){
                        break;
                    }
                }
                cubeResult += tempCube;
                if(cubeResult>n){
                    break;
                }
                tempN /= 10;
            }while (tempN != 0);
            if (cubeResult == n) {
                rt = 1;
            }
            System.out.println(cubeResult);
        }
        System.out.println(rt);
        return rt;
    }
}

