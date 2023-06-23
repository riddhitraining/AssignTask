package ObjectOriented;

public class First {

	public static void main(String[] args) {
		
		Student s1= new Student("John", 11, 90, 80, 85);
		Student s2= new Student("John", 11, 90, 80, 85);
		//Student s3= new Student("Monica", 13, 96, 90, 91);
		
		Student students[]= new Student[] {s1,s2};
		
		System.out.println(s2.toString());
		
		if(s1.equals(s2))
		{
			System.out.println("Both equals");
		}else
		{
			System.out.println("Not equal");
		}
		
		/*for(Student student: students)
		{
			System.out.println("name of student: "+ student.getName());
			System.out.println("Roll no. of student: "+ student.getRollno());
			System.out.println("Maths mark: "+ student.getMaths());
			System.out.println("English marks: "+ student.getEnglish());
			System.out.println("Science marks: "+ student.getScience());
			
		}*/
		
	   

	}}
