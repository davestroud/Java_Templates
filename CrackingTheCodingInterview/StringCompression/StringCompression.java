public class StringCompression {

  public String compress(String str) {
    int count = 1;
    StringBuilder builder = new StringBuilder();

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i-1) && i < str.length()-1) {
        count++;
      }
      // case when the last letter is in the sequence preceding it.
      // Add that sequence to the compressed string
      else if (i == str.length()-1 && str.charAt(i) == str.charAt(i-1)) {
        count++;
        builder.append(str.charAt(i));
        builder.append(count);
      }

      // case where the last letter is NOT in the sequence preceding it.
      // Add it to string.
      else if (i == str.length()-1 && str.charAt(i) != str.charAt(i-1)) {
        builder.append(str.charAt(i-1));
        builder.append(count);
        count = 1;
        builder.append(str.charAt(i));
        builder.append(count);
      }
      else {
        // Appending the char and THEN appending the count works.
        builder.append(str.charAt(i-1));
        builder.append(count);
        count = 1;
      }
    }
    str = builder.toString();
    System.out.println(str);

    return str;
  }

  public static void main(String[] args) {
    StringCompression test = new StringCompression();

    test.compress("aabcccccaaa");
    test.compress("aaaaa");
    test.compress("aaabbbccc");
    test.compress("abc");
    test.compress("a");
    test.compress("");
  }
}
