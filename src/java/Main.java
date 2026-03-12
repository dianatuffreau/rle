
void main() {
    String input = "wwwwaaadexxxxxx";
    String encoded = encode(input);
    System.out.println("Encoded String: " + encoded);
}

public static String encode(String input) {
    if (input == null || input.isEmpty()) {
        return "";
    }

    StringBuilder result = new StringBuilder();
    int count = 1;
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        char c = chars[i];
        if (i + 1 < chars.length && c == chars[i + 1]) {
            count++;
        } else {
            result.append(c).append(count);
            count = 1;
        }
    }
    return result.toString();
}
