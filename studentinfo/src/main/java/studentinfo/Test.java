package studentinfo;

public class Test {

	public static void main(String args[]){
		Student obj=new Student();
		obj.setStudname("Karthi");
		obj.setRegno(4008);
		obj.setRollno(8);
		StudDAO myDAO=new StudDAO();
		myDAO.add(obj);
		myDAO.update(11);
		
		
	}
}
