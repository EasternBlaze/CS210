public class kim_lab0b {
	public static void main(String[] args) {
		System.out.println("hey, I'm here!");
		for(int i = 0; i < args.length; i++) {
			System.out.println("\t arg[" + i + "] = " + args[i]);
		}
		for(int i = 0; i < args.length; i++) {
			int intVal = Integer.parseInt(args[i]);
			System.out.println("\t arg[" + i + "] as an int = " + intVal);
		}
	}
}
