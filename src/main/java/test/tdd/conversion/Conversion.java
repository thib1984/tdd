package test.tdd.conversion;

public class Conversion {

    private static final String VIDE = "";
    private static final int BORNE_INF = 0;
    private static final int BORNE_SUP = 5000;

    public static String conversionArabeToRomain(int nombre) {
        String retour;
        if (nombre >= BORNE_SUP | nombre < BORNE_INF) {
            return VIDE;
        } else if (nombre >= 1000) {
            int nombremilliers = nombre / 1000;
            switch (nombremilliers) {
                case 1:
                    retour = "M";
                    break;
                case 2:
                    retour = "MM";
                    break;
                case 3:
                    retour = "MMM";
                    break;
                case 4:
                    retour = "MMMM";
                    break;
                default:
                    retour = VIDE;
                    break;
            }
            return retour + conversionArabeToRomain(nombre % 1000);
        } else if (nombre >= 100) {
            int nombrecentaine = nombre / 100;
            switch (nombrecentaine) {
                case 1:
                    retour = "C";
                    break;
                case 2:
                    retour = "CC";
                    break;
                case 3:
                    retour = "CCC";
                    break;
                case 4:
                    retour = "CD";
                    break;
                case 5:
                    retour = "D";
                    break;
                case 6:
                    retour = "DC";
                    break;
                case 7:
                    retour = "DCC";
                    break;
                case 8:
                    retour = "DCCC";
                    break;
                case 9:
                    retour = "CM";
                    break;
                default:
                    retour = VIDE;
                    break;
            }
            return retour + conversionArabeToRomain(nombre % 100);
        } else if (nombre >= 10) {
            int nombredizaine = nombre / 10;
            switch (nombredizaine) {
                case 1:
                    retour = "X";
                    break;
                case 2:
                    retour = "XX";
                    break;
                case 3:
                    retour = "XXX";
                    break;
                case 4:
                    retour = "XL";
                    break;
                case 5:
                    retour = "L";
                    break;
                case 6:
                    retour = "LX";
                    break;
                case 7:
                    retour = "LXX";
                    break;
                case 8:
                    retour = "LXXX";
                    break;
                case 9:
                    retour = "XC";
                    break;
                default:
                    retour = VIDE;
                    break;
            }
            return retour + conversionArabeToRomain(nombre % 10);
        } else {
            switch (nombre) {
                case 1:
                    retour = "I";
                    break;
                case 2:
                    retour = "II";
                    break;
                case 3:
                    retour = "III";
                    break;
                case 4:
                    retour = "IV";
                    break;
                case 5:
                    retour = "V";
                    break;
                case 6:
                    retour = "VI";
                    break;
                case 7:
                    retour = "VII";
                    break;
                case 8:
                    retour = "VIII";
                    break;
                case 9:
                    retour = "IX";
                    break;
                default:
                    retour = VIDE;
                    break;
            }
            return retour;
        }

    }

}
