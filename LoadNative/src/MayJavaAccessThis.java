
public class MayJavaAccessThis {
	static {
		try {
			System.load(System.getProperty("user.dir") + "/mylib.so");

		} catch (UnsatisfiedLinkError e) {
			System.err.println("Native code library failed to load.\n" + e);
			System.exit(1);
		}
	}

	public native int myFunction2(int a, int b);
}
