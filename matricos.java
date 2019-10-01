package lt.vtmc.javabasics;

public class pratybos {

	public static void main(String[] args) {
//		matricaFirst();
//		System.out.println();
//		matricaSecond();
//		System.out.println();
//		matricaThird();
//		System.out.println();
//		matricaFourth();
//		System.out.println();
//		matricaFifth();
//		System.out.println();
		matricaSixth();
//		System.out.println();
//		matricaSeventh();
//		System.out.println();
//		matricaEighth();
		

	}

	private static void matricaEighth() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			int a = i;
			for (int j = 1; j < 10; j++) {
				System.out.print(a + 1 + " ");
				a++;
			}
		}			
	}

	private static void matricaSeventh() {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " ");
			}
		}
	}

	private static void matricaSixth() {
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				if (i == 0 | j == 0 | j == 9) {
					System.out.print(1 + " ");				
				}else 
					System.out.print(0 + " ");
			}
			System.out.println();
	}				
}

	private static void matricaFifth() {
		for (int i = 0; i < 10; i++) {
							
				for (int j = 0; j < 10; j++) {
					if (i == 0) {
						System.out.print(1 + " ");				
					
					}else if (j%2 == 0) {
						System.out.print(1 + " ");
					}else 
						System.out.print(0 + " ");
				}
				System.out.println();
		}				
	}

	

	private static void matricaFourth() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			if (i%2 == 0) {
				for (int j = 0; j < 10; j++) {
					System.out.print(1 + " ");
				}
			}else {
				for (int j = 0; j < 10; j++) {
					System.out.print(0 + " ");
			}
		  }
		}
		System.out.println();
	}

	private static void matricaThird() {
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				if (i==j) {
					System.out.print(1 + " ");
				}else if (11-i == j){
					System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}					
			}	
		}
		
	}

	private static void matricaSecond() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (i==j) {
					System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}					
			}	
		}
			
	}

	private static void matricaFirst() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(0 + " ");
				}
		}
		
	}

}
