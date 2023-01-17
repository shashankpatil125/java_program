class printNtimeName{
    
    private static void recursiveCall(int n) {
        if(n<=0){
            return;
        }
        System.out.println("name " + n);
        recursiveCall(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=2;
        recursiveCall(n);        
    }

}