import java.util.Scanner;

public class main {
    void main(){
        //opgave 1
        double totalPrice = 2761.0;
        double finalPrice;

        if (totalPrice >= 1000){
            finalPrice = totalPrice * 0.8;
            System.out.println("Discount valid! Your total will be " + finalPrice);
        } else {
            System.out.println("Discount not valid! Your total will be " + totalPrice);
        }


        //opgave 2
        double weight = 78.0;
        double height = 1.65;
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        if (bmi >= 25){
            System.out.println("You are overweight");
        } else if (bmi >= 18.5){
            System.out.println("You are normal weight");
        } else {
            System.out.println("You are underweight");
        }


        //opgave 3
        int time = 14;

        if (time >= 5 && time <= 11){
            System.out.println("It is now " + time + " o'clock. Good morning!");
        } else if (time >= 12 && time <= 17){
            System.out.println("It is now " + time + " o'clock. Good afternoon!");
        } else if (time >= 18 && time <= 21) {
            System.out.println("It is now " + time + " o'clock. Good evening!");
        } else {
            System.out.println("It is now " + time + " o'clock. Good night!");
        }


        //opgave 4
        int score = 88;
        char grade;
        String status;
        String comment;

        if (score >= 90) {
            grade = 'A';
            comment = "Excellent";
        } else if (score >= 80) {
            grade = 'B';
            comment = "Good";
        } else if (score >= 70) {
            grade = 'C';
            comment = "Satisfactory";
        } else if (score >= 60) {
            grade = 'D';
            comment = "Needs improvement";
        } else {
            grade = 'F';
            comment = "Failing";
        }

        if (score >= 60) {
            status = "PASS";
        } else {
            status = "FAIL";
        }

        System.out.println("=== STUDENT REPORT ===");
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("Comment: " + comment);


        //opgave 5
        double totalPrice2 = 350.0;
        boolean isMember = true;
        double shippingCost;

        if (totalPrice2 > 500 || (isMember && totalPrice2 > 200)) {
            shippingCost = 0.0;
            System.out.println("Free shipping!");
        } else {
            shippingCost = 50.0;
        }

        double finalTotal = totalPrice2 + shippingCost;
        System.out.println("Subtotal: " + totalPrice2 + " kr");
        System.out.println("Shipping: " + shippingCost + " kr");
        System.out.println("Total: " + finalTotal + " kr");


        // opgave 6
        int ageLimit = 15;
        int guestAge = 14;
        boolean hasParentalConsent = true;

        if (guestAge > ageLimit || (hasParentalConsent && guestAge >= 13)) {
            System.out.println("You are allowed to watch the movie");
        } else {
            System.out.println("You are not allowed to watch the movie");
        }


        // opgave 7
        int partySize = 4;
        int availableSeats = 6;
        boolean hasReservation = false;
        int waitTime = 20;
        boolean restaurantFull = false;

        if ((partySize <= availableSeats) && ((hasReservation || waitTime < 30) && !restaurantFull)) {
            System.out.println("Table available");
            System.out.println("Estimated wait: " + waitTime + " minutes");
        } else {
            System.out.println("No table available");
        }


        // opgave 8
        int age = 22;
        boolean hasAccidents = false;
        int accidents = 0;
        boolean riskZone = false;

        int basePremium = 5000;
        int premium;

        if ((age < 25 || age > 70) || (hasAccidents && accidents > 2) || riskZone) {
            premium = basePremium + 2000;
            System.out.println("Higher risk category");
        } else {
            premium = basePremium;
            System.out.println("Standard risk category");
        }

        System.out.println("Annual premium: " + premium + " kr");


        //opgave 9
        boolean isAdmin = true;
        boolean accountActive = true;
        boolean isSuperUser = false;
        boolean isUser = false;
        boolean suspended = false;
        boolean isGuest = false;
        boolean guestTimeValid = false;

        String accessLevel;

        if ((isAdmin && accountActive) || isSuperUser) {
            accessLevel = "FULL ACCESS";
        } else if ((isUser && accountActive && !suspended) || (isGuest && guestTimeValid)) {
            accessLevel = "LIMITED ACCESS";
        } else {
            accessLevel = "ACCESS DENIED";
        }

        System.out.println("=== ACCESS CONTROL ===");
        System.out.println("Admin: " + isAdmin);
        System.out.println("Active: " + accountActive);
        System.out.println("Result: " + accessLevel);


        //opgave 10
        String item = "pizza";
        int quantity = 2;
        double price;

        switch (item) {
            case "burger":
                price = 89.0;
                break;
            case "pizza":
                price = 95.0;
                break;
            case "salad":
                price = 65.0;
                break;
            case "pasta":
                price = 79.0;
                break;
            case "steak":
                price = 145.0;
                break;
            default:
                price = 0.0;
                System.out.println("Item not found");
        }

        double total = price * quantity;

        System.out.println("Item: " + item);
        System.out.println("Price: " + price + " kr");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total + " kr");


        // opgave 11
        String zone = "National";
        double weight2 = 7.0;
        double baseCost;
        double extraCost = 0.0;

        switch (zone) {
            case "Local":
                baseCost = 50.0;
                break;
            case "Regional":
                baseCost = 100.0;
                break;
            case "National":
                baseCost = 150.0;
                break;
            case "International":
                baseCost = 300;
                break;
            default:
                baseCost = 0.0;
                System.out.println("Invalid zone");
        }

        if (weight2 > 5.0) {
            double extraKg = weight2 - 5.0;
            extraCost = extraKg * 20.0;
        }

        double totalCost = baseCost + extraCost;

        System.out.println("Zone: " + zone);
        System.out.println("Weight: " + weight2 + " kg");
        System.out.println("Base cost: " + baseCost + " kr");
        System.out.println("Extra weight cost: " + extraCost + " kr");
        System.out.println("Total: " + totalCost + " kr");


        //opgave 12
        double balance = 5000.0;
        double amount = 1000.0;
        String operation = "withdraw";
        boolean success = true;

        switch (operation) {
            case "withdraw":
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount + " kr");
                } else {
                    System.out.println("Insufficient funds");
                    success = false;
                }
                break;
            case "deposit":
                balance += amount;
                System.out.println("Deposited: " + amount + " kr");
                break;
            case "balance":
                System.out.println("Current balance: " + balance + " kr");
                break;
            case "transer":
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Transferred: " + amount + " kr");
                } else {
                    System.out.println("Insufficient funds");
                    success = false;
                }
                break;
            default:
                System.out.println("Invalid operation");
                success = false;
        }

        if (success && !operation.equals("balance")) {
            System.out.println("New balance: " + balance + " kr");
        }


        // opgave 13
        String eventType = "concert";
        int quantity2 = 2;
        boolean isStudent = true;
        double basePrice;
        double studentDiscount = 0.0;

        switch (eventType) {
            case "movie":
                basePrice = 100.0;
                break;
            case "concert":
                basePrice = 250.0;
                if (isStudent) {
                    studentDiscount = 0.20;
                }
                break;
            case "sports":
                basePrice = 200.0;
                break;
            case "theater":
                basePrice = 150.0;
                if (isStudent) {
                    studentDiscount = 0.20;
                }
                break;
            default:
                basePrice = 0.0;
                System.out.println("Invalid event type");
        }

        double pricePerTicket = basePrice * (1 - studentDiscount);
        double total2 = pricePerTicket * quantity2;

        System.out.println("Event: " + eventType);
        System.out.println("Base price: " + basePrice + " kr");
        if (studentDiscount > 0) {
            System.out.println("Student discount: " + (studentDiscount * 100) + "%");
        }
        System.out.println("Price per ticket: " + pricePerTicket + " kr");
        System.out.println("Quantity: " + quantity2);
        System.out.println("Total: " + total2 + " kr");


        //opgave 14
        String item2 = "coffee";
        String size = "large";
        int quantity3 = 2;
        double basePrice2;
        double sizeMultiplier = 1.0;

        switch (item2) {
            case "coffee":
                basePrice2 = 25.0;
                break;
            case "tea":
                basePrice2 = 20.0;
                break;
            case "sandwich":
                basePrice2 = 45.0;
                break;
            case "cake":
                basePrice2 = 35.0;
                break;
            default:
                basePrice2 = 0.0;
                System.out.println("Invalid item");
        }

        if (item2.equals("coffee") || item2.equals("tea")) {
            switch (size) {
                case "small":
                    sizeMultiplier = 1.0;
                    break;
                case "medium":
                    sizeMultiplier = 1.2;
                    break;
                case "large":
                    sizeMultiplier = 1.5;
                    break;
                default:
                    System.out.println("Invalid size");
            }
        }

        double unitPrice = basePrice2 * sizeMultiplier;
        double total3 = unitPrice * quantity3;

        System.out.println("=== ORDER ===");
        System.out.println("Item: " + item2);
        if (item2.equals("coffee") || item2.equals("tea")) {
            System.out.println("Size: " + size);
        }
        System.out.println("Quantity: " + quantity3);
        System.out.println("Unit price: " + unitPrice + " kr");
        System.out.println("Total: " + total3 + " kr");


        //opgave 15
        double savings = 0.0;
        double monthlyDeposit = 500.0;
        double savingsGoal = 10000.0;
        int months = 0;

        while (savings < savingsGoal) {
            savings += monthlyDeposit;
            months++;
            System.out.println("Month " + months + ": " + savings + " kr");
        }

        System.out.println("Goal reached in " + months + " months");


        // opgave 16
        double loanRepayment = 5000.0;
        double monthlyPayment = 200.0;
        int months2 = 0;

        while (loanRepayment > 0) {
            loanRepayment -= monthlyPayment;
            months2++;

            if (loanRepayment < 0) {
                loanRepayment = 0;
            }

            System.out.println("Month " + months2 + ": " + loanRepayment + " kr left");
        }

        System.out.println("Loan paid off in " + months2 + " months");


        //opgave 17
        int celsius = 0;

        System.out.println("Celsius | Fahrenheit");
        System.out.println("--------|------------");

        while (celsius <= 100) {
            double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.println(celsius + "°C     | " + fahrenheit + "°F");
            celsius += 10;
        }


        //opgave 18
        double principal = 10000.0;
        double rate = 0.05;
        double target = 20000.0;
        int years = 0;

        while (principal < target) {
            principal = principal * (1 + rate);
            years++;
            System.out.println("Year " + years + ": " + principal + " kr");
        }

        System.out.println("Target reached in approximately " + years + " years");


        /*opgave 19
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secret123";
        int maxAttempts = 3;
        int attempts = 0;
        boolean success2 = false;

        while (attempts < maxAttempts && !success2) {
            System.out.println("Enter password: ");
            String input = scanner.nextLine();
            attempts++;

            if (input.equals(correctPassword)) {
                success2 = true;
                System.out.println("Access granted!");
            } else {
                System.out.println("Wrong password!");
                System.out.println("Attempts used: " + attempts + "/" + maxAttempts);
            }
        }

        if (!success2) {
            System.out.println("Account locked");
        } */


        //opgave 20
        double monthlySavings = 1000.0;
        double total4 = 0.0;

        System.out.println("Month | Total Savings");
        System.out.println("------|---------------");

        for (int month = 1; month <= 12; month++) {
            total4 += monthlySavings;
            System.out.println(month + "     | " + total4 + " kr");
        }

        System.out.println();
        System.out.println("Total after 1 year: " + total4 + " kr");


        //opgave 21
        for (int n = 1; n <= 10; n++) {
            System.out.println("=== Multiplication table for " + n + " ===");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " × " + i + " = " + (n * i));
            }
            System.out.println();
        }


        //opgave 22
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        //opgave 23
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }


        //opgave 24
        int[] scores = {85, 92, 78, 88, 95, 73, 90};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;

        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
        }

        int countAbove80 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 80) {
                countAbove80++;
            }
        }

        System.out.println("=== GRADE STATISTICS ===");
        System.out.println("Average: " + average);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Scores above 80: " + countAbove80);


        //opgave 25
        int[] temps = {18, 22, 20, 25, 19, 21, 23};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int sum2 = 0;
        for (int i = 0; i < temps.length; i++) {
            sum2 += temps[i];
        }

        double average2 = (double) sum2 / temps.length;

        int hottestIndex = 0;
        int coldestIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > temps[hottestIndex]) {
                hottestIndex = i;
            }
            if (temps[i] < temps[coldestIndex]) {
                coldestIndex = i;
            }
        }

        int countAbove20 = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 20) {
                countAbove20++;
            }
        }

        System.out.println("=== TEMPERATURE ANALYSIS ===");
        System.out.println("Average: " + average2 + "°C");
        System.out.println("Hottest: " + days[hottestIndex] + " (" + temps[hottestIndex] + "°C)");
        System.out.println("Coldest: " + days[coldestIndex] + " (" + temps[coldestIndex] + "°C)");
        System.out.println("Days above 20°C: " + countAbove20);


        //opgave 26
        int[] sales = {1200, 1500, 900, 2100, 1800, 1300, 2500};

        int total5 = 0;
        for (int i = 0; i < sales.length; i++) {
            total5 += sales[i];
        }

        double average3 = (double) total5 / sales.length;

        int bestDay = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[bestDay]) {
                bestDay = i;
            }
        }

        int countAbove1500 = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 1500) {
                countAbove1500++;
            }
        }

        System.out.println("=== SALES ANALYSIS ===");
        System.out.println("Total sales: " + total5 + " kr");
        System.out.println("Average daily: " + average3 + " kr");
        System.out.println("Best day: Day " + (bestDay + 1) + " (" + sales[bestDay] + " kr)");
        System.out.println("Days above 1500 kr: " + countAbove1500);


        //opgave 27
        double[] prices = {299.0, 149.0, 899.0, 49.0};
        double total6 = 0.0;

        for (double price2 : prices) {
            total6 += price2;
        }

        System.out.println("Total: " + total6 + " kr");


        //opgave 28
        String[] students = {"Emma", "Liam", "Olivia", "Noah", "Ava"};

        System.out.println("=== WELCOME ===");
        for (String student : students) {
            System.out.println("Welcome, " + student + "!");
        }

        int count4Letters = 0;
        for (String student : students) {
            if (student.length() == 4) {
                count4Letters++;
            }
        }

        String longest = students[0];
        for (String student : students) {
            if (student.length() > longest.length()) {
                longest = student;
            }
        }

        System.out.println("=== STATISTICS ===");
        System.out.println("4-letter names: " + count4Letters);
        System.out.println("Longest name: " + longest);


        //opgave 29
        int[] stock = {45, 12, 67, 8, 34, 5, 89};
        int reorderThreshold = 10;
        int reorderCount = 0;

        for (int level : stock) {
            if (level <= reorderThreshold) {
                reorderCount++;
            }
        }

        System.out.println("Products needing reorder: " + reorderCount);
    }
}
