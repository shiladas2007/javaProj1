import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }

        System.out.println("factorial of "+a+ " is "+fact);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==2) continue;;
                System.out.print(j+",");
                //if(j==2) break;

            }
            System.out.println("\n");
        }
        String s="";

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("You are a new student to Pragra");
                break;
            case 2:
                System.out.println("You are existing student");
                break;
            case 3:
                System.out.println("You are in waiting list");
                break;
            case 4:
                System.out.println("You have graduates the all programs");
                break;
            case 5:
                System.out.println("You are not qualified to enroll");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        int ar[]= {1,8,5,6,9,8,6,8,7,2};
        int sum=0;
        for (int i=0;i<ar.length;i++) {
            sum+=ar[i];
            System.out.println(ar[i]);
        }
        System.out.println("sum of array "+sum);
        char []name={'s','h','i','l','a'};
        for (int i=0;i<name.length;i++) {

            System.out.print(name[i]);
        }
        int aim[][]={{1,2,3},{4,5}};
        for (int i = 0; i < aim.length; i++) {
            for (int j = 0; j < aim[i].length; j++) {
                System.out.print(" "+aim[i][j]);
            }
            System.out.println();
        }
        int avg[]=new int[3];
        int aim[][]={{1,5,3},{1,5,6},{1,6,3},{1,4,6}, {1,5,2}};
        for (int i = 0; i < aim[0].length; i++) { //column
            for (int j = 0; j < aim.length; j++) {//row
                avg[i]+=aim[j][i];
            }
            avg[i]=avg[i]/aim.length;
            System.out.println();
        }
        for (int i = 0; i < avg.length; i++) {
            System.out.print(avg[i]+ " ");
        }
        String s1="asdfg";
        String s2="asdfg";
        System.out.println(s1);
        System.out.println(s2);
        s1="poiuy";
        System.out.println(s1);
        System.out.println(s2);
        char ch[]={'a','w','s'};
        String s1=new String("Hello");
        String s2="Hello";
        String s3="Hello";
        if(s3.equals(s1)) System.out.println("True");
        else System.out.println("False");*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inp=sc.nextLine();
        boolean b=true;
        for (int i = 0; i < inp.length()/2; i++) {
            if(inp.charAt(i)!=inp.charAt(inp.length()-i-1))
            {
                System.out.println("not palindrome");
                b=false;
                break;
            }
        }
        if(b)
        System.out.println("palindrom");
/*        System.out.println("enter another number");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("sum is "+sum);
        int i=5;
        double d=5.5;
        float f=6.6f;
        short s=8;
        long l=85;
        //byte b=Byte.parseByte;
        boolean t=true;
        String ss="sds";

        System.out.println("dslkd"+i+" "+d+" "+f+" "+s+" "+l+" "+t+" "+ss+" ");
        int a=14,b=19,c=28;
        if(a>b)
            if(a>c)
                System.out.println("big "+ a);
            else
                System.out.println("big "+ c);
        else
            if(b>c)
                System.out.println("big "+ b);
            else
                System.out.println("big "+ c);
        if(a>=0) System.out.println("+ve");
        else System.out.println("-ve");
        if(a%2==0) System.out.println("Even");
        else System.out.println("Odd");
        if(a>b && a>c) System.out.println(a);
        else if(b>a &&b>c)System.out.println(b);
        else System.out.println(c);
        int n=0;
        a=3456;
        while (a!=0)
        {
            n++;
            a/=10;
            System.out.println(a);

        }
        System.out.println(n);


* When squirrels get together for a party,
* they like to have cigars. A squirrel party is successful
* when the number of cigars is between 40 and 60, inclusive.
* Unless it is the weekend, in which case there is no upper bound on the number of cigars.
* Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
* */

    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars>=40 && cigars<=60 && !isWeekend)
            return  true;
        else if(isWeekend && cigars>=40)
            return  true;
        else
            return false;
    }
    public int dateFashion(int you, int date) {
        if (you<=2 || date<=2)
            return 0;
        else if(you>=8 || date>=8)
            return 2;
        else return 1;
    }
    public int sortaSum(int a, int b) {
        int sum=a+b;
        if(sum>=10 && sum<=19)
            return 20;
        return sum;
    }
    public String alarmClock(int day, boolean vacation) {
        String output="";
        if(vacation) {
            if(day == 0 || day == 6)
                output= "off";
            else
                output= "10:00";
        }
        else
        {
            if(day == 0 || day == 6)
                output= "10:00";
            else
                output= "7:00";
        }
        return output;
    }

}
