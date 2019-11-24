import java.util.Scanner;

public class Sort{
    public static int[] sortMassive(int[] m){
        for(int i = 1; i < m.length; i++){
            for(int j = 0; j < i; j++){
                if(m[j] >= m[i]) {
                    m = replaceInt(m, i, j);
                    break;
                }
            }
        }
        return m;
    }

    private static int[] replaceInt(int[] m, int n, int k){
        int a = m[n];
        int[] newM = new int[m.length];
        for(int i = 0; i < newM.length; i++){
            if((i < k) || (i > n)){
                newM[i] = m[i];
            }
            else if(i != k){
                newM[i] = m[i - 1];
            }

        }
        newM[k] = a;
        return newM;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for(int i = 0; i < n; i++){
            m[i] = sc.nextInt();
        }
        m = sortMassive(m);
        for (int i: m) {
            System.out.println(i);
        }
    }
}