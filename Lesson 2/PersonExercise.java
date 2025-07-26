/*
By: Bob Wang
Date: July 26,2025 
Description: this class is a class intended for objects representing people. 
It has attributes like name, age, monthly spending and net income, as well as methods 
like one that makes the person introduce themselves, another that makes the person eat, and walk. 

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
        
        //New person objects 
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Charlie", 40);
        Person p4 = new Person("Diana", 22);
        Person p5 = new Person("Ethan", 35);

        //Set the financial info for all the person objects 
        p1.setFinancialInfo(5000, 1200);
        p2.setFinancialInfo(3000, 1000);
        p3.setFinancialInfo(8000, 2000);
        p4.setFinancialInfo(2000, 500);
        p5.setFinancialInfo(10000, 2500);

        //Make person 1(Alice) do a bunch of actions 
        p1.introduce();
        p1.walk();
        p1.eat("pizza");
        p1.calculateTax();
        p1.spendMoney();
        p1.calculateNetWorth(45000);

        //Adds a space
        System.out.println();

        // Relationship examples
        relationshipStatus(p1, p2);
        relationshipStatus(p3, p5);
    }
}
