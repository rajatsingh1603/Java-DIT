public class Pattern4 {
    public static void main(String args[]){
        int n = 5;

        for(int i = n; i>0; i--){
            //spaces
            for(int s =1; s<=(n-i); s++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

