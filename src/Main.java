import java.util.ArrayList;

class App {
    public static void main(String [] args){
        String greeting = "Hello";

        System.out.println( greeting.length() );
        System.out.println( greeting.charAt(0) );
        System.out.println( greeting.indexOf("llo"));
        System.out.println( greeting.indexOf("z"));
        System.out.println( greeting.substring(2));
        System.out.println( greeting.substring(1,3));


        //Casting & Converting
        System.out.println ( (int)3.14 );
        System.out.println ((double)3 );

        int intFromString = Integer.parseInt("50");
        double doubleFromString = Double.parseDouble("50.99");

        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);


        int num = 10;
        num *= 100;
        System.out.println(num);

        // Math class has useful math methods
        System.out.println( Math.pow(2,3) );
        System.out.println( Math.sqrt(144) );
        System.out.println( Math.round(2.7) );


        //USER INPUT

        //Scanner keyboardInput = new Scanner(System.in);

        //System.out.print("Enter username: ");
       // String username = keyboardInput.nextLine();
        //System.out.println("Hello, " + username);


        //ARRAYS

        int [] luckyNumbers = {4, 8, 15, 16, 23, 42};

        luckyNumbers[0] = 90;
        System.out.println(luckyNumbers[0]);
        System.out.println(luckyNumbers[4]);

        //ARRAY LIST
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Oscar");
        friends.add("Angela");
        friends.add("Kelvin");

        friends.remove("Oscar");
        System.out.println( friends.toString() );
        System.out.println( friends.get(0) );

    }
}