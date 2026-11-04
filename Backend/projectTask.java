public class projectTask {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String star = "";
            for (int j = 5; j > i; j--) {
                star += " ";
            }

            for (int k = 0; k < i; k++) {
                star += " *";
            }
            System.out.println(star);
        }

    }
}

// 12345
// 1234
// 123
// 12
// 1

// *
// * *
// * * *