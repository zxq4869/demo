package cn.com.java.experiment;
class Employee{

	String number,name,department;
	float salary;
	public Employee() {    }
	public Employee(String number,String name, float salary,String department) {
	        this.number = number;
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	    }
	public String getNumber() {return number;}
	public void setNumber(String number){this.number = number;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public float getSalary() {return salary;}
	public void setSalary(float salary) {this.salary = salary;}
    public String getDepartment() { return department;}
	public void setDepartment(String department) { this.department = department;}
	public boolean equals(Employee other) {return  this.number.equals(other.getNumber());}
	public String toString() {String s=new String();
	s="���ţ�"+getNumber()+"   ������"+getName()+"   нˮ��"+getSalary()+"   ���ţ�"+getDepartment();
	return s.toString();
					
	}
}
public class MainClass {
 public static boolean isRepeat(int i,Employee []e) {
	 Employee temp=e[i];
	 for(int j=0;j<e.length;j++) {
		 if(temp.equals(e[j])&&j!=i) return true;	
		 }
	 return false;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e=new Employee[3];
e[0]=new Employee("10001","С��",5000.0f,"���۲�");
e[1]=new Employee("10002","С��",6500.0f,"���۲�");
e[2]=new Employee("10001","Alan",15000.0f,"�з���");
for(int i=0;i<e.length;i++) {
	if(isRepeat(i,e)==false) {
		 System.out.println(e[i].toString());
	}
}

	}

}
