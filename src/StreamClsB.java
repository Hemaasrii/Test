import java.util.*;
import java.util.stream.collector;

public class StreamClsA {
int id;int mark;String name; int rollNo; String str;

public StreamClsA(int id,int mark,String name) {
	this.id=id;
	this.mark=mark;
	this.name=name;	
}

public StreamClsA(String str,int rollNo) {
	this.str=str;
	this.rollNo=rollNo;
	
}
}


public class StreamClsB {
	public static void main(String[] args) {
		StreamClsA ref1=new StreamClsA(10, 35, "Hema");
		StreamClsA ref2=new StreamClsA(11, 30, "Sri");
		StreamClsA ref3=new StreamClsA(12, 65, "Latha");
		StreamClsA ref4=new StreamClsA(13, 90, "Mathu");
		
		StreamClsA sref1=new StreamClsA("Hema", 05);
		StreamClsA sref2=new StreamClsA("Kavitha", 15);
		StreamClsA sref3=new StreamClsA("Kayal", 30);
	
		
		List<StreamClsA> ref=new ArrayList<>();
		ref.add(ref1);
		ref.add(ref2);
		ref.add(ref3);
		ref.add(ref4);
		List<StreamClsA> newListRef=new ArrayList<>();
		newListRef.add(sref1);
		newListRef.add(sref2);
		newListRef.add(sref3);
		
		//ref.stream().filter(s->s.mark >=40).map(m->m.name.concat("  Pass")).forEach(c->System.out.println(c));
		newListRef.stream().filter(n->n.rollNo>10).map(l->l.str.concat("  Allowed")).forEach(p->System.out.println(p));
		
	}

}
