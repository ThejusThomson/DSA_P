package Leet;

public class DefangingIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String finalString = "";
        for(int i=0; i<address.length();i++) {
            if(address.charAt(i) == '.') {
                finalString = finalString + "[.]";
            }
            else {
                finalString = finalString + address.charAt(i);
            }
        }
        System.out.println(finalString);
    }
}
