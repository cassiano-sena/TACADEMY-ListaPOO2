import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("\n\n\n");
        System.out.println("1: ");
        int yearOfBirth = 1990;
        int age = AgeCalculator.calculateAge(yearOfBirth);
        System.out.println("You are " + age + " years old.");

        //2
        System.out.println("\n\n\n");
        System.out.println("2: ");
        WeekdayFinder.weekdayFinderExample();

        //3
        System.out.println("\n\n\n");
        System.out.println("3: ");
        Register register = new Register();
        register.readInput();
        register.displayInfo();

        //4
        System.out.println("\n\n\n");
        System.out.println("4: ");
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        IMC imcCalculator = new IMC(weight, height);
        double bmi = imcCalculator.calculateBMI();
        String condition = imcCalculator.determineCondition();
        System.out.printf("\nBMI: %.2f\n", bmi);
        System.out.println("Condition: " + condition);

        //5
        System.out.println("\n\n\n");
        System.out.println("5: ");
        System.out.print("Enter the edge length of the dodecahedron: ");
        double edgeLength = scanner.nextDouble();
        double volume = DodecahedronVolumeFinder.calculateVolume(edgeLength);
        System.out.println("Volume of the dodecahedron with edge length " + edgeLength + " units is: " + volume);


        //6
        System.out.println("\n\n\n");
        System.out.println("6: ");
        TimeFinder timeFinder = new TimeFinder();
        System.out.print("Enter time in seconds: ");
        timeFinder.readTimeFromUser();
        timeFinder.displayTime();

        //7
        System.out.println("\n\n\n");
        System.out.println("7: ");
        Book book1 = new Book("Java Programming", "John Doe");
        Person person1 = new Person("Alice", 30, "alice@example.com");
        LocalDate loanDate = LocalDate.now();
        LocalDate dueDate = loanDate.plusDays(14);
        Loan loan1 = new Loan(book1, person1, loanDate, dueDate);
        System.out.println("Book loaned to: " + loan1.getPerson().getName());
        System.out.println("Book details: " + loan1.getBook().getTitle() + " by " + loan1.getBook().getAuthor());
        System.out.println("Loan Date: " + loan1.getLoanDate());
        System.out.println("Due Date: " + loan1.getDueDate());
        loan1.setReturned(true);
        System.out.println("Book returned: " + loan1.isReturned());

        //8
        System.out.println("\n\n\n");
        System.out.println("8: ");
        FootballPlayer player1 = new FootballPlayer("Cristiano Ronaldo", "Forward", LocalDate.of(1985, 2, 5), "Portuguese", 187, 83.5);
        player1.printPlayerInfo();

        //9
        System.out.println("\n\n\n");
        System.out.println("9: ");
        Ticket normalTicket = new Ticket(50.0);
        VIPTicket vipTicket = new VIPTicket(50.0, 20.0);
        System.out.println("Normal Ticket:");
        normalTicket.printPrice();
        System.out.println();
        System.out.println("VIP Ticket:");
        vipTicket.printPrice();
        System.out.println();
        double difference = vipTicket.getVIPPrice() - normalTicket.getPrice();
        System.out.println("Difference in prices: R$" + difference);

        //10 - Bhaskara's Formula Example
        System.out.println("\n\n\n");
        System.out.println("10: Bhaskara's Formula Example");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        Bhaskara equation = new Bhaskara();
        equation.setCoefficients(a, b, c);
        equation.calculateRoots();

        //11
        System.out.println("\n\n\n");
        System.out.println("11: ");
        Student student1 = new Student(1, "John Doe", 8.5, 7.0, 9.0);
        Student.displayStudentDetails(student1);

        //12
        System.out.println("\n\n\n");
        System.out.println("12: ");
        System.out.println("Initializing elevator with capacity 10 and 5 floors...");
        Elevator elevator = new Elevator(10, 5);
        System.out.println("\nMoving elevator and managing passengers:");
        elevator.enter();
        elevator.enter();
        elevator.up();
        elevator.enter();
        elevator.exit();
        elevator.down();
        elevator.enter();
        elevator.enter();
        System.out.println("\nCurrent status:");
        System.out.println("Current floor: " + elevator.getCurrentFloor());
        System.out.println("Current number of people: " + elevator.getCurrentPeople());
        System.out.println("\nPerforming additional operations:");
        elevator.exit();
        elevator.enter();
        elevator.up();
        System.out.println("\nFinal status:");
        System.out.println("Current floor: " + elevator.getCurrentFloor());
        System.out.println("Current number of people: " + elevator.getCurrentPeople());

        //13
        System.out.println("\n\n\n");
        System.out.println("13: ");
        int number1 = 123456789;
        int number2 = 987654321;
        String words1 = NumberTranslator.translate(number1);
        String words2 = NumberTranslator.translate(number2);

        System.out.println(number1 + " in words: " + words1);
        System.out.println(number2 + " in words: " + words2);

        //14
        System.out.println("\n\n\n");
        System.out.println("14: ");

        scanner.close();
    }
}
