package öğrencilerPractice;

public class Q4_StringtekiSayilariTopla {
    //Verilen string ifadenin icindeki sayilarin toplamini yazan method yapalim.
// input= "Bu10islemin20sonucu30kac40olur."
// output=100
    public static void main(String[] args) {
        int toplam = 0;
        String input = "Bu5islemin137sonucu19kac90olur.";
        String yeni = "";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                yeni += input.charAt(i);
            } else {
                if (yeni.length() > 0)
                    toplam += Integer.parseInt(yeni);
                yeni = "";
            }
        }
        System.out.println(toplam);
    }
}

