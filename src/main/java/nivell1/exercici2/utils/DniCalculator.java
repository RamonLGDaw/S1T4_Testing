package nivell1.exercici2.utils;

public class DniCalculator {

    final static private String DNI_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public String calculateDniLetter(String dniStringNumber) {

        int dniIntNumber = Integer.parseInt(dniStringNumber);

        return dniStringNumber + this.DNI_LETTERS.charAt(dniIntNumber % 23);

    }

}