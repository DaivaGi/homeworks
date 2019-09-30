package lt.vtmc.javabasics;

public class matricos {
	
		public static void main(String[] args) {
			//matricaFirst();
			//matricaSecond();
			//matricaThird();
			//matricaFourth();
			//matricaFifth();
			//matricaSixth();
			matricaSeventh();
			

		}

		private static void matricaSeventh() {
			for (int i = 0; i < 10; i++) {
				System.out.println();
				int a = i;
				for (int j = 1; j < 10; j++) {
					System.out.print(a + 1 + " ");
					a++;
				}
			}
			
		}

		private static void matricaSixth() {
			for (int i = 1; i < 10; i++) {
				System.out.println();
				for (int j = 1; j < 10; j++) {
					System.out.print(i + " ");
				}
			}
			
		}

		private static void matricaFifth() {
			for (int i = 0; i < 10; i++) {
								
					for (int j = 0; j < 10; j++) {
						if (i == 0) {
							System.out.print(1 + " ");				
						
						}else if (j == 0) {
							System.out.print(1 + " ");
						}else if (j == 9) {
							System.out.print(1 + " ");
						}else {
							System.out.print(0 + " ");
						}
					}
					System.out.println();
			}				
		}

		

		private static void matricaFourth() {
			for (int i = 0; i <= 10; i++) {
				System.out.println();
				if (i%2 == 0) {
					for (int j = 0; j <= 10; j++) {
						System.out.print(1 + " ");
					}
				}else {
					for (int j = 0; j <= 10; j++) {
						System.out.print(0 + " ");
				}
			  }
			}	
		}

		private static void matricaThird() {
			for (int i = 0; i <= 10; i++) {
				System.out.println();
				for (int j = 0; j <= 10; j++) {
					if (i==j) {
						System.out.print(1 + " ");
					}else if (10-i == j){
						System.out.print(1 + " ");
					}else {
						System.out.print(0 + " ");
					}					
				}	
			}
			
		}

		private static void matricaSecond() {
			for (int i = 0; i <= 10; i++) {
				System.out.println();
				for (int j = 0; j <= 10; j++) {
					if (i==j) {
						System.out.print(1 + " ");
					}else {
						System.out.print(0 + " ");
					}					
				}	
			}
				
		}

		private static void matricaFirst() {
			for (int i = 0; i <= 10; i++) {
				System.out.println();
				for (int j = 0; j <= 10; j++) {
					System.out.print(0 + " ");
					}
			}
			
		}

	}


