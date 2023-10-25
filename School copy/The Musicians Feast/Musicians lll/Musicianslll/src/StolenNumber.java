class StolenNumber {

    public static void main(String args[]) {
        findStolenNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}); // should print 4
        findStolenNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}); // should print 9
        findStolenNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}); // should print "no number was stolen"
    }

    public static void findStolenNumber(int[] numbers) {
        // write your code here
        int[] arrayTotal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean stolen = false;

        if (numbers.length != arrayTotal.length) {
            for (int i = 0; i < arrayTotal.length; i++) {
                if (arrayTotal[i] != numbers[i]) {
                    System.out.println(arrayTotal[i]);
                    stolen = true;
                    break;
                }
            }
        }
        if (!stolen) {
            System.out.println("No number was stolen");
        }
    }
}