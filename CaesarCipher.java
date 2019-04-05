//Autor: Aleksander Mojzych
//Data stworzenia: 05.04.2019

package RectanglePackage;

public class CaesarCipher {
    public String text;
    public int s;

    CaesarCipher(String text, int s){
        this.text = text;
        this.s = s;
    }
    public static StringBuffer encrypt (String text, int s){

        StringBuffer result = new StringBuffer();

        for (int i=0; i<text.length(); i++) {

            if (Character.isUpperCase(text.charAt(i))) {

                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

        void printcaesarCipher(){
        System.out.println("Text : " + text);
        System.out.println("Shift :" + s);
        System.out.println("Cipher :" + encrypt(text, s));
        }

}
