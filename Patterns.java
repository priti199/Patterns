public class Patterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner -columns
            for(int j=1; j<=totCols; j++) {
               //cell-(i,j)
               if(i == 1 || i == totRows || j == 1 || j == totCols) {
                System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
            System.out.println();
           
        }
    }

    public static void inverted_half_pyramid_withNumber (int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


public static void flouds_Triangle(int n){
    int counter=1;
    for(int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}

public static void zero_one_tringle(int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
        if ((i+j) % 2==0 ){
            System.out.print("1");
        } else{
            System.out.print("0");
        }
          }
          System.out.println();
    }
}

public static void solid_rhombus(int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
        System.out.print(" ");
        }
    
    for(int j=1; j<=n; j++){
        System.out.print("*");
    }
    System.out.println();

    }               
}

public static void hollow_rhombus(int n){
    for (int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    for(int j=1; j<=n; j++){
        if(i == 1 || i == n || j == 1 || j == n ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
}

public static void diamond(int n){
   
    for(int i=1; i<=n; i++) {
       
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
       
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--) {
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        hollow_rectangle(4,5);
        inverted_half_pyramid_withNumber(6);
        flouds_Triangle(5);
        zero_one_tringle(10);
       solid_rhombus(9);
       hollow_rhombus(10);
       diamond(10);


    }
}