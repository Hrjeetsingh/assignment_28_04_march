import java.util.Scanner;

/*1. Take as input a fraction in the form a/b. Convert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).
*/

class fraction{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int den;
        System.out.println("Enter numerator");
        num = input.nextInt();
        System.out.println("Enter denominator");
        den = input.nextInt();

        //calculating HCF
        int a,b,gcd,t;
        if(num>den){
          a = num;
          b = den;
        }
        else{
          b = num;
          a = den;
        }
        while (b != 0){
          t = b;
          b = a % b;
          a = t;
        }
        gcd = a;

        System.out.println("In lowest form = "+num/gcd+"/"+den/gcd);
    }
}

//2.Calculate the sum of digits of a number given by use
class sumOFdegit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int sum=0;
        while(number!=0){
            sum=sum+number%10;
            number=number/10;   
        }
        System.out.println(sum);
        s.close();
    }
}

//3.A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
//E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
//Write all Armstrong numbers between 100 to 500.

class armostongnumber100_500{
    public static void main(String[] args) {
        int sum;
        int i=100;
        while(i<500){
            int n=i;
            sum=0;
            while(n>0){
                int degit=n%10;
                sum=sum+(degit*degit*degit);
                n=n/10;
            }
            if(sum==i){System.out.println(i);}
            i++;
        }
      
    }
}

//  4.Write a program to print all prime number in between 1 to 100.

class primenumber1_100{
    public static void main(String[] args) {
    
        int temp=0;
        for(int n=2;n<=100;n++){
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    temp++;
                }
            }
            if(temp==2){
                System.out.println(" "+n);
            }
            temp=0;
        }
    }
}

// 5.Write a program to find prime factor of a number.

class prime_factor{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=2;i<=num;i++){
            if(num%i==0){
                int p=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        p++;
                        break;
                    }
                }
                if(p==0){
                    System.out.println(i);
                }
            }
        }
        s.close();
    }
}

// 6.Write a program in java to find the sum of the even and odd digits of the number which is given as input.

class sumoddeven{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number");
        int number=s.nextInt();
        int oddsum=0,evensum=0;
        while(number!=0){
            int rem=number%10;
            if(rem%2==0){
                evensum+=rem;
            }
            else{
                oddsum+=rem;
            }
            number=number/10;
        }
        System.out.println("evensum : "+evensum);
        System.out.println("oddsum : "+oddsum);
        s.close();
    }
}