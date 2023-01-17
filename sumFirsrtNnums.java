class sumFirsrtNnums{

    public static void main(String[] args) {
        int n=5;
        int msum = 0;
        add(n,0);
        System.out.println(msum);
    }

    private static void add(int n, int sum) {
        if(n<=0){
            return;
        }
        sum=sum+n;
        System.out.println(sum);
        add(n-1,sum);
    }
}