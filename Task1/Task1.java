package Task1;

public class Task1 {
    public static void main(String[] args) throws NumberFormatException {
        String str ="neount5u03nrjf02jfnfj120i-ej1";
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isDigit(temp)) {
                int digit = Integer.parseInt(String.valueOf(temp));
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}
