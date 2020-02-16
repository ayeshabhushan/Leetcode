package package2;

import package1.Parent;

public class PackageMember extends package1.Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package1.Parent obj = new Parent();
		obj.publicPrint();
		
		PackageMember obj2 = new PackageMember();
		obj2.protectedPrint();
		obj2.publicPrint();
	}
	
	

}
