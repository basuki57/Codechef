import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc = new Scanner(System.in);
    int x = 1;
    x = sc.nextInt();
    while(x-- > 0) { 
        solve();
    }
  }
  public static void solve(){
  	int n = sc.nextInt(), k = 0;
  	string s[] = new string[8];
  	for(int i = 0; i < 8; i++) for (int j = 0; j < 8; j++) s[i]+='.';
  	for(int i = 0; i < 8; i++) for (int j = 0; j < 8; j++) {
  		if(k < n) ++k;
  		else s[i][j] = 'X';
  	}
  	s[0][0] = 'O';
  	for(int i = 0; i < 8; i++) System.out.println(s[i]);
  }
}
