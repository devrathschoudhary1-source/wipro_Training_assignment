package class_assi_day6;

class ATM {
    public static void main(String[] args) {
        int enteredPin = 1223;
        int correctPin = 1234;

        try {
            System.out.println("Card inserted");

            System.out.println("Entering PIN");

            if (enteredPin != correctPin) {
                throw new Exception("Incorrect PIN");
            }

            System.out.println("PIN accepted");
            System.out.println("Transaction successful");

        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
           
            System.out.println("Transaction logged");
        }
    }
}