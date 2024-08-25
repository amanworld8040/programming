public class practice {


    //sum
    public static int sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //average
    public static double avg(int sum,int arr[]){
        int n= arr.length;
        return (double)sum/n;
        }
        //print
        public static void print(int sum, double avg){
            System.out.println("sum of the array"+sum);
            System.out.println("avarage of the array"+avg);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=sum(arr);
        double avg=(double) avg(sum,arr);
        print(sum,avg);
    }
}
