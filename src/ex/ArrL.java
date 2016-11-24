package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrL {

	public static void main(String[] args) {
		/*ArrayList<String> al=new ArrayList<String>();
		al.add(new String("Java"));
		al.add(15);
		al.add(new Cat());
		
		for(Object obj: al){
			System.out.println(obj);
		}
		
		LinkedList ll=new LinkedList();
		ll.add(new String("111"));
		ll.add(150);
		ll.add(new Cat());
		al.addAll(ll);
		System.out.println("ArrList");
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		ArrayList<Animal2> al=new ArrayList<Animal2>();
		al.add(new Krevedko());
		al.add(new Snake());
		Iterator it=al.iterator();
		while(it.hasNext()){
			Animal2 a=(Animal2) it.next();
			a.getVoice();
		}
	}

}
