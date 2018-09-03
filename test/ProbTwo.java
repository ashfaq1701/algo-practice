class ProbTwo {
	boolean isSpike(int[] arr, int i) {
		int a = 0, b = 0;
		if (arr[i] - arr[i - 1] != 0) {
			a = (arr[i] - arr[i - 1]) / Math.abs(arr[i] - arr[i - 1]);
		}
		if (arr[i] - arr[i + 1] != 0) {
			b = (arr[i] - arr[i + 1]) / Math.abs(arr[i] - arr[i + 1]);
		}
		if (a * b == 1) {
			return true;
		}
		return false;
	}

	boolean isLinearSlope(int[] arr) {
		int prim = (arr[1] - arr[0]) / Math.abs(arr[1] - arr[0]);
		boolean result = true;
		for (int i = 2; i < arr.length; i++) {
			int diff = (arr[i] - arr[i - 1]) / Math.abs(arr[i] - arr[i - 1]);
			result = result && (diff == prim);
		}
		return (result && (prim != 0));
	}

	public int solution(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		if (arr.length == 1) {
			return 1;
		}
		boolean isTurbulence = false;
		int start = 0;
		int end = 0;
		int longestTurbulence = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (this.isSpike(arr, i)) {
				if (isTurbulence == false) {
					start = i - 1;
					isTurbulence = true;
				}
				else if(i == arr.length - 2) {
					end = i + 1;
					longestTurbulence = Math.max((end - start + 1), longestTurbulence);
				}
			} else {
				if (isTurbulence == true) {
					end = i;
					isTurbulence = false;
					longestTurbulence = Math.max((end - start + 1), longestTurbulence);
					start = 0;
					end = 0;
				}
			}
		}
		if ((longestTurbulence == 0) && isLinearSlope(arr)) {
			return 2;
		}
		return longestTurbulence;
	}

	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i += 2) {
			arr[i] = 50;
			arr[i + 1] = 150;
		}
		ProbTwo probTwo = new ProbTwo();
		int result = probTwo.solution(arr);
		System.out.println(result);
	}
}
