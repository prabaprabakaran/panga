import java.util.Scanner;

public class pan {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
String str2="";
if(str.length()<26){
	System.out.println("given string is not pangram ");
}
else{
	for(char c='a';c<='z';c++){
		if((str.indexOf(c)<0)&&(str.indexOf((char)c-32)<0)){
			str2="the given string is not pangram";
			break;
		}
	}
	System.out.println(str2);
}
	}

}
