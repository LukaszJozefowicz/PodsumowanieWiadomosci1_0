public class NameModulo {
    public static String name = "Lukasz Jozefowicz";

    public static void main(String[] args) {
        System.out.println("Name modulo 2 = " + calculate());
    }

    public static int calculate() {

        char[] letters = new char[26];
        int letterValuesSum = 0;

        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 97);
        }
        String[] split = name.split(" ");
        int nameValues[] = new int[name.length() - 1];

        for (int i = 0; i < split[0].length(); i++) {
            for (char c : letters) {
                if (Character.toLowerCase(split[0].charAt(i)) == c) {
                    letterValuesSum += (c - 96);
                    System.out.println(c + " = " + (c-96));
                }
            }
        }

        for (int i = 0; i < split[1].length(); i++) {
            for (char c : letters) {
                if (Character.toLowerCase(split[1].charAt(i)) == c) {
                    letterValuesSum += (c - 96);
                    System.out.println(c + " = " + (c-96));
                }
            }
        }

        return letterValuesSum % 2;
    }
}