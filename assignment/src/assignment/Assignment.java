package assignment;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        int code;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the code of the operation\n" +
"Areas:\n" +
"1-circle\n" +
"2-rectangle\n" +
"3-cube\n" +
"**********************\n" +
"Matrix:\n" +
"4-addition\n" +
"5-subtraction\n" +
"6-multiplication (not available now)\n" +
"**********************\n" +
"Converting:\n" +
"7-octal to decimal\n" +
"8-decimal to octal\n input: ");
        code = input.nextInt();
        switch(code){
            case 1:
                System.out.println("enter the radius of the circle");
                double r = input.nextDouble();
                System.out.println("area = " + circleArea(r));
                break;
            case 2:
                System.out.println("enter length: ");
                double l = input.nextDouble();
                System.out.println("enter width: ");
                double w = input.nextDouble();
                System.out.println("area = " + rectangleArea(l,w));
                break;
            case 3:
                System.out.println("enter the length");
                double cubeL = input.nextDouble();
                System.out.println("area = " + circleArea(cubeL));
                break;
            case 4:
                System.out.println("rows of matrix 1 = ");
                int r1 = input.nextInt();
                System.out.println("cols of matrix 1");
                int c1 = input.nextInt();
                System.out.println("rows of matrix 2");
                int r2 = input.nextInt();
                System.out.println("cols of matrix 2");
                int c2 = input.nextInt();
                double  m1[][] = creatMatrix(r1,c1);
                double  m2[][] = creatMatrix(r2,c2);
                double sum[][] = addition(m1,m2);
                printMatrix(sum);
                break;
            case 5:
                System.out.println("rows of matrix 1 = ");
                r1 = input.nextInt();
                System.out.println("cols of matrix 1");
                c1 = input.nextInt();
                System.out.println("rows of matrix 2");
                r2 = input.nextInt();
                System.out.println("cols of matrix 2");
                c2 = input.nextInt();
                double mm1[][] = creatMatrix(r1,c1);
                double mm2[][] = creatMatrix(r2,c2);
                double sub[][] = subtraction(mm1,mm2);
                printMatrix(sub);
                break;
            case 7:
                System.out.println("enter an octal: ");
                int o = input.nextInt();
                int result = octalToDecimal(o);
                System.out.println("decimal val : "+result);
                break;
            case 8:
                System.out.println("enter a decimal: ");
                o = input.nextInt();
                result = decimalToOctal(o);
                System.out.println("octal val: "+result); 
                break;
        }
       
        
        
        
        
        
        
        
        
        
    }
    //calc area of different shapes
    public static double circleArea(double r){
        return Math.PI*Math.pow(r, 2);
    }
    public static double rectangleArea(double l, double w){
        return l*w;
    }
    public static double cubeArea(double a){
        return 6*Math.pow(a, 2);
    }
    
    //calc matrix (multiplication is not implemented)
    public static double[][] addition(double x[][], double y[][]){
        double rslt[][] = new double[x.length][x[0].length];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                rslt[i][j] = x[i][j]+y[i][j];
            }
        }
        return rslt;
    }
    public static double[][] subtraction(double x[][], double y[][]){
        double rslt[][] = new double[x.length][x[0].length];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                rslt[i][j] = x[i][j]-y[i][j];
            }
        }
        return rslt;
    }
    
    //convert octal to decimal and vice versa 
    public static int decimalToOctal(int num){
        int rslt = 0,rem = 0, i = 0;
        while(num>0){
            rem = rslt%10;
            rslt+= rem*Math.pow(8, i);
            i++;
            num = num/10;
        }
        return rslt;
    }
    public static int octalToDecimal(int num){
        String temp = "";
        int rslt = 0;
        while(num>0){
            temp = num%8 + temp;
            num /=8;
        }
        rslt = Integer.parseInt(temp);
        return rslt;
    }
    
    //helpers
    public static double[][] creatMatrix(int r, int c){
        Scanner input = new Scanner(System.in);
        double m[][] =  new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;    
    }
    public static void printMatrix(double m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
        }
        System.out.println();
    }
    
    //count vowel characters in a string
    public static int vowelCntr(String str){
        int cntr = 0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                cntr++;
            }    
        }
        return cntr;
    }   
}

