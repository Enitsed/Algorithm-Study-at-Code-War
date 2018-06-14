package test11;

public class Persist {

	public static int persistence(long n) {
		long m = 1, r = n;

		// 계속 곱하다가 0을 리턴하기 시작하면서 스택에 쌓여있는 것들 하나씩 반환하면서 돌아온다.
		if (r / 10 == 0)
			return 0;
		// 999
		for (r = n; r != 0; r /= 10)
			m *= r % 10;
		// 9*9*9

		// 재귀함수 한번씩 실행할때마다 카운트
		return persistence(m) + 1;
	}

}
