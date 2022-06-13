public class something {

    public static boolean validatePin(String pin) {
        char[] tab = pin.toCharArray();
        int charCounter = 0;
        int digitCounter = 0;
        boolean result = true;

        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < tab.length; i++) {
                if (!Character.isDigit(tab[i])) {
                    charCounter++;
                }
            }
            if (charCounter > 0) {
                result = false;
            } else {
                result = true;
            }
        } else {
            result = false;
        }

        return result;
    }
}

