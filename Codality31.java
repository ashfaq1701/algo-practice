class Codality31 
{
    public int solution(int[] A) {
        long sum = 0;
        for(int i = 0; i < A.length; i++)
        {
            sum += A[i];
        }
        long totalSum = ((A.length + 1) * (A.length + 2))/2;
        int res = (int) (totalSum - sum);
        return res;
    }
    
    public static void main(String args[])
    {
    	Codality31 cod = new Codality31();
    	int[] data = {1, 2, 3, 4, 6, 7, 8};
    	int res = cod.solution(data);
    	System.out.println(res);
    }
}
