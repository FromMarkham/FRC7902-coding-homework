/*
By: Bob Wang
Date: July 29,2025 
Description: This program contains all the original code for the person class from lesson 2, 
plus 3 new classes: student, teacher and parent that inherit from the original person class. 

The student class is intended to represent a student, the parent class the student's parent, 
and the teacher class which represent's the student's teacher.

*/

public class Person {

    // Class variables
    String name;
    int age;
    double netIncome;
    double monthlySpending;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.netIncome = 0.0;
        this.monthlySpending = 0.0;
    }

    // Set financial info
    public void setFinancialInfo(double netIncome, double monthlySpending) {
        this.netIncome = netIncome;
        this.monthlySpending = monthlySpending;
    }

    // Introduce method
    public void introduce() {
        System.out.println("What's up my name is " + name + ". I am " + age + " years old.");
    }

    // Calculates tax
    public void calculateTax() {
        double taxRate = 0.25;
        double estimatedTax = netIncome * taxRate;
        System.out.println(name + "'s estimated tax is $" + estimatedTax);
    }

    // Spend money
    public void spendMoney() {
        double amountSpent = 500.0;
        netIncome -= amountSpent;
        System.out.println(name + " spent $" + amountSpent + ". Remaining net income: $" + netIncome);
    }

    // Calculates net worth
    public void calculateNetWorth(double annualSalary) {
        double yearlyExpenses = monthlySpending * 12;
        double yearlySavings = annualSalary - yearlyExpenses;
        double totalNetWorth = netIncome + yearlySavings;
        System.out.println(name + "'s estimated net worth (after one year) is $" + totalNetWorth);
    }

    // Static method for relationship
    public static void relationshipStatus(Person p1, Person p2) {
        String[] relationships = {"friends", "colleagues", "enemies", "siblings", "neighbors", "strangers"};
        int index = (int)(Math.random() * relationships.length);
        String relationship = relationships[index];
        System.out.println(p1.name + " and " + p2.name + " are " + relationship + ".");
    }

    //Walking method
    public void walk() {
        System.out.println(name + " is walking.");
    }

    //Eating method
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    // Main method
    public static void main(String[] args) {
        Teacher mrChan=new Teacher("Mr. Chan",39,"Math","friendly");
        Student alice=new Student("Alice",14,8,"average");
        Parent aliceMom=new Parent("Isabel",46);
        
        aliceMom.PTconference(alice,mrChan);

    }
}

//Teacher class which inherits from the original person class 
public class Teacher extends Person {
    
    String subject;
    String amiability;

    //Constructor
    public Teacher(String name, int age, String subject, String amiability) {
        super(name, age);
        this.subject = subject;
        this.amiability=amiability;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + "right now.");
    }
    
    //Override the introduce method inherited from the original person class 
    @Override
    public void introduce() {
        System.out.println("Hello, my name is Mr. Chan and I am Alice's teacher");
    }
    
}

//Student class which inherits from the original person class
public class Student extends Person {

    int grade;
    String performance;
 
    //Constructor 
    public Student(String name, int age, int grade, String performance) {
        super(name, age);
        this.grade = grade;
        this.performance=performance;
    }

    public void study() {
        System.out.println(name + " is studying for grade " + grade + ".");
    }
    
    //Override the introduce method inherited from the original person class
    @Override
    public void introduce() {
        System.out.println("Hello, my name is Alice and I am a student in grade 8");
    }
    
}

//Parent class which inherits from the original person class
public class Parent extends Person {

    //Constructor 
    public Parent(String name, int age) {
        super(name, age);
    }

    public void takeCareOfChildren() {
        System.out.println(name + " is taking care of their children.");
    }
    
    //Override the introduce method inherited from the original person class
    @Override
    public void introduce() {
        System.out.println("Hello, my name is Isabel and I am Alice's parent");
    }
    
        public void PTconference(Student student, Teacher teacher) {
        System.out.println("\n[Parent-Teacher Conference]");
        System.out.println("Parent: " + this.name);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Student: " + student.name);

        String performance = student.performance.toLowerCase();
        String amiability = teacher.amiability.toLowerCase();

        if (performance.equals("excellent")) {
            if (amiability.equals("friendly")) {
                System.out.println("The teacher says that " + student.name + " is doing great in school.");
            } else if (amiability.equals("neutral")) {
                System.out.println("The teacher says that" + student.name + " is doing great in school and encourages the student to sustain it.");
            } else {
                System.out.println("The teacher's impressed by the student's performance, but still talks about the importance of discipline.");
            }
        } else if (performance.equals("average")) {
            if (amiability.equals("friendly")) {
                System.out.println("The teacher encourages " + student.name + " to not give up and would offer extra help.");
            } else if (amiability.equals("neutral")) {
                System.out.println("The teacher says that " + student.name + " needs more focus and preparation.");
            } else {
                System.out.println("The teacher's somewhat concerned and suggests more improvement.");
            }
        } else if (performance.equals("poor")) {
            if (amiability.equals("friendly")) {
                System.out.println("The teacher kindly talks about room for improvement and offers to help " + student.name + " outside of class.");
            } else if (amiability.equals("neutral")) {
                System.out.println("The teacher's disappointed and suggests tutoring or getting extra help.");
            } else {
                System.out.println("The teacher's frustrated and says that " + student.name + " is falling behind badly.");
            }
        } else {
            System.out.println("Not enough student performance data.");
        }
    }
    
}
