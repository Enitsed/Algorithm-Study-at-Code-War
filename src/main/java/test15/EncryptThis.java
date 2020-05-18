package test15;

/*
    Description:
    Encrypt this!

    You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
    The first letter needs to be converted to its ASCII code.
    The second letter needs to be switched with the last letter
    Keepin' it simple: There are no special characters in input.
    Examples:
    Kata.encryptThis("Hello") => "72olle"
    Kata.encryptThis("good") => "103doo"
    Kata.encryptThis("hello world") => "104olle 119drlo"
 */
public class EncryptThis {
    public static String encryptThis(String text) {
        // Implement me! :)
        String[] textArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String txt: textArr) {
            if(!txt.isEmpty()) {
                sb.append((int) txt.charAt(0));

                String tempText = txt.substring(1);

                if(!tempText.isEmpty()) {
                    char tempLastLetter = tempText.charAt(tempText.length() - 1);
                    sb.append(tempLastLetter);

                    if(tempText.length() > 1) {
                        char tempFirstLetter = tempText.charAt(0);
                        String tet = tempText.substring(1, tempText.length() - 1);
                        sb.append(tet);

                        sb.append(tempFirstLetter);
                    }
                }

                sb.append(" ");
            }
         }

        return sb.toString().trim();
    }
}
