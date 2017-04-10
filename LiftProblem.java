import java.util.*;

class LiftProblem
{
	public int solution(int[] A, int[] B, int M, int X, int Y)
	{
		int takenWeight = 0;
		int takenNumber = 0;
		HashSet<Integer> floors = new HashSet<Integer>();
		int stops = 0;
		for(int i = 0; i < A.length; i++)
		{
			if((takenWeight+A[i] <= Y) && takenNumber < X)
			{
				takenWeight += A[i];
				takenNumber++;
				floors.add(B[i]);
			}
			boolean isLaunch = false;
			if(i == A.length - 1)
			{
				isLaunch = true;
			}
			else if(takenWeight+A[i+1] > Y)
			{
				isLaunch = true;
			}
			if(isLaunch || (takenNumber == X))
			{
				stops += (floors.size() + 1);
				takenWeight = 0;
				takenNumber = 0;
				floors.clear();
			}
		}
		return stops;
	}
	
	public static void main(String args[])
	{
		LiftProblem lift = new LiftProblem();
		int[] weights = {60, 80};
		int[] dests = {2, 3};
		int stops = lift.solution(weights, dests, 5, 2, 200);
		System.out.println(stops);
	}
}