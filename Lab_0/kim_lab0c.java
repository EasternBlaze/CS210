public class kim_lab0c {
	public static void main(String[] args) {
		System.out.println("hey, I'm here!");
		for(int i = 0; i < args.length; i++) {
			System.out.println("\t arg[" + i + "] = " + args[i]);
		}
		for(int i = 0; i < args.length; i++) {
			try {
				int intVal = Integer.parseInt(args[i]);
				System.out.println("\t arg[" + i + "] as an int = " + intVal);
			}
			catch(NumberFormatException e){
				System.out.println("\t arg[" + i + "] = " + args[i] + " is not a valid integer.");
			}
		}
	}
}
