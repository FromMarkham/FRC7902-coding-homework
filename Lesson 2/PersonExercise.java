public class Person {
   
    public static String name;
    public static int age;
    public static double netIncome;
    public static double monthlySpending;

    
    public Person(String name, int age, double netIncome, double monthlySpending) {
        Person.name = name;
        Person.age = age;
        Person.netIncome = netIncome;
        Person.monthlySpending = monthlySpending;
    }

    
    public void introduce() {
        System.out.println("Hi, my name is " + Person.name + ". I am " + Person.age + " years old.");
    }

   
    public void celebrateBirthday() {
        int newAge = Person.age + 1;
        String message = "Happy Birthday, " + Person.name + "! You are now " + newAge + " years old.";
        System.out.println(message);
        Person.age = newAge;
    }

    
    public void receiveBonus(double bonusAmount) {
        double taxRate = 0.2;
        double taxedBonus = bonusAmount * (1 - taxRate);
        Person.netIncome += taxedBonus;
        System.out.printf("%s received a bonus of $%.2f after tax.\n", Person.name, taxedBonus);
    }

   
    public double calculateNetWorth(double annualSalary) {
        double yearlySavings = annualSalary - (Person.monthlySpending * 12);
        double netWorth = Person.netIncome + yearlySavings;
        System.out.printf("%s's estimated net worth is: $%.2f\n", Person.name, netWorth);
        return netWorth;
    }
}
