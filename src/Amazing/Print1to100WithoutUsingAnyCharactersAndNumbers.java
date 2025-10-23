package Amazing;

public class Print1to100WithoutUsingAnyCharactersAndNumbers {
    public static void main(String[] args) {
        int one=" ".length();
        int hundred="          ".length()*"          ".length();
        for (int i = one; i <=hundred ; i++) {
            System.out.println(i);
        }
    }
}
