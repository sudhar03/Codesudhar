import javax.xml.transform.Source;

public class solution {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 9, 2 };
        duplicates(arr);
    }

    public static int duplicates(int arr[]) {
        int ch = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    ch = arr[j];
                    System.out.println(ch);

                }

        }
        if (ch == 0) {
            System.out.println(-1);
        }
        return 0;
    }
}
