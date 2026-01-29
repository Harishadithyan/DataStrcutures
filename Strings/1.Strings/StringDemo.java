class StringDemo {
    public static void main(String[] args) {

        String str = "Hello World";

        // 1. Length
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Char at index 1: " + str.charAt(1));

        // 3. substring()
        System.out.println("Substring(0,5): " + str.substring(0,5));

        // 4. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 5. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. equals()
        System.out.println("Equals Hello World: " + str.equals("Hello World"));

        // 7. equalsIgnoreCase()
        System.out.println("Equals ignore case: " + str.equalsIgnoreCase("hello world"));

        // 8. contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // 9. startsWith()
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));

        // 10. endsWith()
        System.out.println("Ends with World: " + str.endsWith("World"));

        // 11. indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // 12. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 13. replace()
        System.out.println("Replace World -> Java: " + str.replace("World", "Java"));

        // 14. trim()
        String s1 = "   Hello   ";
        System.out.println("Trim: '" + s1.trim() + "'");

        // 15. isEmpty()
        String s2 = "";
        System.out.println("Is empty: " + s2.isEmpty());

        // 16. concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // 17. split()
        String[] words = str.split(" ");
        System.out.println("Split:");
        for (String w : words)
            System.out.println(w);

        // 18. compareTo()
        System.out.println("CompareTo: " + "abc".compareTo("abd"));

        // 19. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("String value: " + numStr);

        // 20. toCharArray()
        char[] ch = str.toCharArray();
        System.out.print("Char array: ");
        for (char c : ch)
            System.out.print(c + " ");
        System.out.println();

        // 21. intern()
        String a = new String("Java").intern();
        String b = "Java";
        System.out.println("Intern check: " + (a == b));

        // 22. String immutability demo
        String x = "Hello";
        x.concat(" Java");
        System.out.println("Immutability: " + x); // Hello only

        // 23. Using StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);

    }
}
