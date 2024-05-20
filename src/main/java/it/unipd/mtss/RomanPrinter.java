////////////////////////////////////////////////////////////////////
// Matteo Mazzotti 2068245
// Davide Verzotto 2043679
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] output = new String[6];
        for (int i = 0; i < output.length; i++) {
            output[i] = "";
        }

        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);

            switch (c) {
                case 'I':
                    output[0] += "  _____   ";
                    output[1] += " |_   _|  ";
                    output[2] += "   | |    ";
                    output[3] += "   | |    ";
                    output[4] += "  _| |_   ";
                    output[5] += " |_____|  ";
                    break;

                case 'V':
                    output[0] += "__      __ ";
                    output[1] += "\\ \\    / / ";
                    output[2] += " \\ \\  / /  ";
                    output[3] += "  \\ \\/ /   ";
                    output[4] += "   \\  /    ";
                    output[5] += "    \\/     ";
                    break;

                case 'X':
                    output[0] += " __   __  ";
                    output[1] += " \\ \\ / /  ";
                    output[2] += "  \\ V /   ";
                    output[3] += "   > <    ";
                    output[4] += "  / . \\   ";
                    output[5] += " /_/ \\_\\  ";
                    break;

                case 'L':
                    output[0] += "  _       ";
                    output[1] += " | |      ";
                    output[2] += " | |      ";
                    output[3] += " | |      ";
                    output[4] += " | |____  ";
                    output[5] += " |______| ";
                    break;

                case 'C':
                    output[0] += "   _____  ";
                    output[1] += "  / ____| ";
                    output[2] += " | |      ";
                    output[3] += " | |      ";
                    output[4] += " | |____  ";
                    output[5] += "  \\_____| ";
                    break;

                case 'D':
                    output[0] += "   _____  ";
                    output[1] += "  |  __ \\ ";
                    output[2] += "  | |  | |";
                    output[3] += "  | |  | |";
                    output[4] += "  | |__| |";
                    output[5] += "  |_____/ ";
                    break;

                case 'M':
                    output[0] += "  __  __  ";
                    output[1] += " |  \\/  | ";
                    output[2] += " | \\  / | ";
                    output[3] += " | |\\/| | ";
                    output[4] += " | |  | | ";
                    output[5] += " |_|  |_| ";
                    break;
            }
        }

        StringBuilder asciiArt = new StringBuilder();
        for (int j = 0; j < 6; j++) {
            asciiArt.append(output[j]).append("\n");
        }
        return asciiArt.toString();
    }
}