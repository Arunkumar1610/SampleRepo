public class neonNumber {
    public static void main(String[] args) {
        neonNumber neon = new neonNumber();

        int base=9;
        int power=2;

        int square=neon.power(base,power);
        int digit=neon.sum_of_digit(square);

        if (base==digit)
        {
            System.out.println(base+" is neon number");

        }
        else
        {
            System.out.println(base+" is not neon number");
        }
    }

    int power(int base,int power)
    {
        int box=1;

        while (power>0)
        {
            box=box*base;
            power--;
        }
        return box;
    }

    int sum_of_digit(int num)
    {
        int sum=0;
        int rem;
         while (num>0)
         {
             rem=num%10;
             sum=sum+rem;
             num=num/10;
         }
        return sum;
    }


}

