public class Xend {
    public static void Xendshift(String str, int idx, int count, StringBuilder newString) {
        if (idx == str.length()) {
            // Append 'x' count times at the end
            for (int i = 0; i < count; i++) {
                newString.append('x');
            }
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);
        if (curr == 'x') {
            count++;  // Increase count for 'x' and move to the next character
            Xendshift(str, idx + 1, count, newString);
        } else {
            newString.append(curr);  // Append non-'x' character
            Xendshift(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        Xendshift(str, 0, 0, new StringBuilder());
    }
}
