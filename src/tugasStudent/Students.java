package tugasStudent;

public class Students extends Person implements StudentDetails{
//	Initialitaion Faculty Code
	private static int id = 525160000;
	
// 	Initialitation Studets Variables
	private int studentSemester, sks, index=1, studentId;
	
// 	Array Description
	private String [] description = {"Course Name\t: ", "SKS\t\t: ", "Room\t\t: ", "LectureName\t: "};
	
// 	Constructor
	public Students(String fname, String lname, String domicile, int studentSemester) {
		super(fname, lname, domicile);
		this.studentSemester = studentSemester;
		this.studentId=id+=1;
	}

// 	Method for Sum SKS
	public void countSks() {
	//Looping for Multidimentional Array	
		
		for(int a = 0 ; a<this.studentSemester ; a++ ) { 
		//Read arrays[StudentSemester]	
			for (int b = 0 ; b < StudentDetails.allCourse[a].length ; b++) { 
			//Read arrays[StudentSemester][Course]				
				for (int i = 0 ; i < StudentDetails.allCourse[a][b].length ; i++) {
				//Read arrays[StudentSemester][Course][CourseDetails]
					if(i==1) { //[CoureseDetails] = SKS
						// Convert Array of String SKS to Int and Save at Variable nilaiSKS					
						int nilaiSks = Integer.parseInt(StudentDetails.allCourse[a][b][1]);
						//	Sum of sks(Student Variable) and Variable nilaiSKS	 					
						this.sks += nilaiSks;
					  }
				}
			}
		}	
	}
	
// 	Implement studentRegistration Method
	@Override
	public void studentRegistration(String fullName, int id) {
		// Check SKS Amount	
		if(this.sks >= 144) {
			System.out.println("Student Name\t: " + fullName + ", S.T."); // Print Full Name from Parameter	
		}else {
			System.out.println("Student Name\t: " + fullName); //Print Full Name from Parameter	
		}
		
		// Print Card Id from Parameter		
		System.out.println("Card Id\t\t: " + id);
	}
	
// 	Implement learningPlan Method
	@Override
	public void learningPlan(int semester) {
	//Looping for Multidimentional Array
		
		for(int a = 0 ; a<semester ; a++ ) {
		//Read arrays[StudentSemester from parameter]	
			for (int b = 0 ; b < StudentDetails.allCourse[a].length ; b++) {
			//Read arrays[StudentSemester][Course]	
				System.out.print(this.index + "."); //Print Index
				this.index++; //Increment Index
				
				for (int i = 0 ; i < StudentDetails.allCourse[a][b].length ; i++) {
				//Read arrays[StudentSemester][Course][CourseDetails]
					  System.out.print("\t" + this.description[i]); //Print Description from Array
					  System.out.println(StudentDetails.allCourse[a][b][i]); //Print Course Details
				}
				// For Spacing			
				System.out.println();
			}
		}	
	}
	
//	Show
	public void show() {
		//Sum SKS		
		this.countSks();
		
		//Print Display
		System.out.println("==================================================================");
		System.out.println("\t\t\t  Student Details");
		System.out.println("==================================================================");
		
		//Print Full Name, Card ID, Domicile
		this.studentRegistration(this.getFullName(), this.studentId);
		this.getDomisili();
		
		//Print SKS
		System.out.println("SKS\t\t: " + this.sks);
		
		//Print Display
		System.out.println("==================================================================");
		System.out.println("\t\t\t  Learning Plan");
		System.out.println("==================================================================");
		
		//Print Learning Plan		
		this.learningPlan(this.studentSemester);
	}
}
