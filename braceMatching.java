package acm;

import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class  braceMatching {
	public static  void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.nextLine();
		while((count--)>0){
			Stack kuohao = new Stack();
			String line = in.nextLine();
			char[] listOfItem = line.toCharArray();
			for(int i=0;i<listOfItem.length;i++){
				char item;
				if((item = listOfItem[i])=='['||(item = listOfItem[i])=='(')
					kuohao.push(item);
				else if((item = listOfItem[i])==']'){
					if(kuohao.isEmpty()||(char) kuohao.pop()!='['){
						System.out.println("No");
						System.exit(0);
					}						
				}
				else if((item = listOfItem[i])==')'){
					if(kuohao.isEmpty()||(char) kuohao.pop()!='('){
						System.out.println("No");
						System.exit(0);
					}
				}
			}
			if(kuohao.isEmpty())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
