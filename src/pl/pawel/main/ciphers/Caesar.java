package pl.pawel.main.ciphers;

public class Caesar {

    public String encodeOrDecode(String message, int shift, int optionID){
        Option option;
        StringBuilder encoded = new StringBuilder();
        shift = shift % 26;

        option = Option.createFromInt(optionID);

        switch(option){
            case ENCODE:
                break;
            case DECODE:
                shift = (-shift);
                break;
            default:
                System.out.println("Sth happend");
        }

        final int len = message.length();

        for(int i = 0; i < len; i++) {

            char letterToEncode = message.charAt(i);

            if (shift >= 0) {
                if (isCapitalLetter(letterToEncode)) {

                    if (letterToEncode + shift <= 'Z') {

                        letterToEncode += shift;

                    } else {

                        letterToEncode += shift - 26;

                    }

                    encoded.append(letterToEncode);

                } else if (isSmallLetter(letterToEncode)) {
                    if (letterToEncode + shift <= 'z') {

                        letterToEncode += shift;

                    } else {

                        letterToEncode += shift - 26;

                    }

                    encoded.append(letterToEncode);

                } else
                    encoded.append(letterToEncode);

            } else {

                if (isCapitalLetter(letterToEncode)) {

                    if (letterToEncode + shift >= 'A') {

                        letterToEncode += shift;

                    } else {

                        letterToEncode += shift + 26;

                    }

                    encoded.append(letterToEncode);

                } else if (isSmallLetter(letterToEncode)) {
                    if (letterToEncode + shift >= 'a') {

                        letterToEncode += shift;

                    } else {

                        letterToEncode += shift + 26;

                    }

                    encoded.append(letterToEncode);

                } else
                    encoded.append(letterToEncode);
            }
        }

        return encoded.toString();

    }

    private boolean isCapitalLetter(char letter){
        return letter >= 'A' && letter <= 'Z';
    }

    private boolean isSmallLetter(char letter){
        return letter >= 'a' && letter <= 'z';
    }

    private enum Option{
        ENCODE(0, "encoding"),
        DECODE(1, "decoding");

        private final int id;
        private final String description;

        Option(int id, String description) {
            this.id = id;
            this.description = description;
        }

        @Override
        public String toString(){
            return id + " - " + description;
        }

        static Option createFromInt(int option){
            return Option.values()[option];
        }
    }

    public static void printOptions(){
        System.out.println("Choose options:");
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }

}
