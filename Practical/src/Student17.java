class StudentException extends Exception {
    public StudentException(String message) {
        super(message);
    }
}

class Student17 {
    private String name;
    private int rollNo;
    private int[] marks;
    private int total;

    public Student17(String name, int rollNo, int[] marks) throws StudentException {
        if (marks.length != 5) {
            throw new StudentException("Invalid number of subjects. A student should have 5 subjects");
        }
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    public void displayResult() {
        calculateTotal();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total: " + total);
        if (total >= 400) {
            System.out.println("Distinction");
        } else if (total >= 350) {
            System.out.println("First Class");
        } else if (total >= 250) {
            System.out.println("Second Class");
        } else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
    	int[] marks = {78, 87, 68, 76, 57};
		try {
			Student17 s = new Student17("Prasad", 239, marks);
			s.displayResult();
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

