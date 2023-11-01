import java.util.*;
public class Operator{
	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int output=0;
		String operator=args[2];
		switch(args[2]) {
		case "+" :
			output=n1+n2;
			break;
		case "-" :
			output=Math.abs(n1-n2);
			break;
		case "*" :
			output=n1*n2;
			break;
		case "/" :
			output=n1/n2;
			break;
		}
		System.out.println(output);
	}
}