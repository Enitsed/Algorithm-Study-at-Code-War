package test13;

import org.junit.Test;


public class MakeComplement {

    public static String makeComplement(String dna) {
        String[] dnaArr = dna.split("");
        StringBuilder sb = new StringBuilder();

        for (String eachDna: dnaArr) {
            sb.append(switchDna(eachDna));
        }

        return sb.toString();
    }

    private static String switchDna(String dna) {
        String changedDna = "";
        switch(dna) {
            case "A":
                changedDna = "T";
                break;
            case "T":
                changedDna = "A";
                break;
            case "G":
                changedDna = "C";
                break;
            case "C":
                changedDna = "G";
                break;
        }

        return changedDna;
    }
}
