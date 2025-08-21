package Final_Keyword;

public class Example2 {
	    final int i=2;
	    static int j=10;
	    public static void main(String[] args)
	    {
	        final StringBuilder sb = new StringBuilder("Geeks");
	        System.out.println(sb);
	        sb.append("ForGeeks");
	        System.out.println(sb);
	        Example2 e= new Example2();
	        System.out.println();
	        int f= e.i+j;
	        System.out.println(f);
	    }
	}


