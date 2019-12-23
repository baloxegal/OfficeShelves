public class Office {

	final static int TOP = 0;
	final static int MIDDLE = 1;
	final static int BOTTOM = 2;
	
	private static Object [] cabinet = {
			null,
			null,
			null
	};
	
	static void printCabinet() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 40; j++) {
				if(i == 0 || i == 2 || i == 4 || i == 6) {
					System.out.print("#");
				}
				else {
					if(i == 1) {
					System.out.printf("# %-37s#", cabinet[TOP]);
						break;
					}
					else if(i == 3) {
						System.out.printf("# %-37s#", cabinet[MIDDLE]);
						break;
					}
					else {
						System.out.printf("# %-37s#", cabinet[BOTTOM]);
						break;
					}
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	static boolean put (int shelf, Object thing) {
		if(cabinet[shelf] == null || thing == null) {
			cabinet[shelf] = thing;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		printCabinet();
		put(TOP, "Sherlok Holmes");
		put(MIDDLE, "Elizabeth Taylor");
		put(BOTTOM, "Karl Marx");
		
		printCabinet();
		put(TOP, "Dostoyevsky");
		printCabinet();
		put(BOTTOM, null);
		printCabinet();
	}
}
