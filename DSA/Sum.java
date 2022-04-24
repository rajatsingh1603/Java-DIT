public class Sum {

    static void approach1(){
        int n = 5;
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    static void approach2(){
        int n = 5;
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }

    static void approach3(){ 
        int n = 5;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        approach1(); //O(N)
        approach2(); //CONSTANT
        approach3(); //O(N^2)
    }
}
