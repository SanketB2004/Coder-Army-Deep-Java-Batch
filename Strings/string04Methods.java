package Strings;

public class string04Methods {

    public static void main(String[] args) {

        String s = "Hello Java";

        // 1. length()
        System.out.println(s.length());

        // 2. charAt()
        System.out.println(s.charAt(0));

        // 3. substring()
        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));

        // 4. equals()
        System.out.println(s.equals("Hello Java"));

        // 5. equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase("hello java"));

        // 6. compareTo()
        System.out.println(s.compareTo("Hello Java"));

        // 7. compareToIgnoreCase()
        System.out.println(s.compareToIgnoreCase("hello java"));

        // 8. contains()
        System.out.println(s.contains("Java"));

        // 9. startsWith()
        System.out.println(s.startsWith("Hello"));

        // 10. endsWith()
        System.out.println(s.endsWith("Java"));

        // 11. indexOf()
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("Java"));

        // 12. lastIndexOf()
        System.out.println(s.lastIndexOf('a'));

        // 13. toUpperCase()
        System.out.println(s.toUpperCase());

        // 14. toLowerCase()
        System.out.println(s.toLowerCase());

        // 15. trim()
        String x = "   Hello Java   ";
        System.out.println(x.trim());

        // 16. strip() Java 11+
        System.out.println(x.strip());

        // 17. replace()
        System.out.println(s.replace('a', 'A'));
        System.out.println(s.replace("Java", "World"));

        // 18. replaceFirst()
        System.out.println("Java Java".replaceFirst("Java", "Python"));

        // 19. replaceAll()
        System.out.println("Java123".replaceAll("\\d", ""));

        // 20. isEmpty()
        String a = "";
        System.out.println(a.isEmpty());

        // 21. isBlank() Java 11+
        String b = "   ";
        System.out.println(b.isBlank());

        // 22. concat()
        System.out.println("Hello ".concat("Java"));

        // 23. split()
        String names = "Ram,Sham,Ravi";
        String[] arr = names.split(",");

        for (String name : arr) {
            System.out.println(name);
        }

        // 24. join()
        System.out.println(String.join("-", "Java", "Spring", "SQL"));

        // 25. valueOf()
        int n = 100;
        String str = String.valueOf(n);
        System.out.println(str);

        // 26. toCharArray()
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            System.out.println(ch);
        }

        // 27. getBytes()
        byte[] bytes = s.getBytes();
        System.out.println(bytes.length);

        // 28. matches()
        System.out.println("12345".matches("\\d+"));

        // 29. intern()
        String c = new String("Java");
        String d = c.intern();
        System.out.println(d);

        // 30. repeat() Java 11+
        System.out.println("Hi ".repeat(3));
    }
}