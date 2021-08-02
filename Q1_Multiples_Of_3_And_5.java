// QUESTION : If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.


class Multiples_Of_3_And_5 {
    static int get_sum_naive(int max, int div1,int div2){
        int sum = 0;
        for(int i = 2;i<max; i++){
            if(i%div1 == 0 || i%div2 == 0)
                sum += i;
        }
        return sum;
    }

    static int get_sum_fast(int max, int div){
        int cnt = max / div;
        int sum = div * cnt * (cnt + 1) / 2;
        return sum;
    }


    
    public static void main(String[] args) {
        int sum_naive = get_sum_naive(1000, 3, 5);
        System.out.println(sum_naive);   

        int sum_fast = get_sum_fast(999, 3) + get_sum_fast(999, 5) - get_sum_fast(999, 15);
        System.out.println(sum_fast);   
    }

}

//ANSWER = 233168