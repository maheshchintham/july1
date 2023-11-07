
package arrylistt;

import java.util.ArrayList;

public class empptest {

	public static void main(String[] args) {

		empp e=new empp();
		empp e1=new empp();

      ArrayList a=new ArrayList();

		a.add(e);
		a.add(e1);



		System.out.println(a.size());
		System.out.println(a);

    ArrayList a1=new ArrayList();

		a1.add(e);
		a1.add(e1);
		a1.addAll(a);

		System.out.println(a1.size());
		System.out.println(a1);
		system.out.println(a+a1);


	}

}

