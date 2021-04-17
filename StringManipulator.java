public class StringManipulator {
// Objectives:
// ● Practice method signatures by implementing the tasks below.
// ● Implement some of the most used string methods.

// 1)
// String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. 
// Feel free to use the trim method of the String class.
    // StringManipulator manipulator = new StringManipulator();
    // String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    // System.out.println(str); // HelloWorld 
    

// 2)
// Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. 
// If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
    // StringManipulator manipulator = new StringManipulator();
    // char letter = 'o';
    // Integer a = manipulator.getIndexOrNull("Coding", letter);
    // Integer b = manipulator.getIndexOrNull("Hello World", letter);
    // Integer c = manipulator.getIndexOrNull("Hi", letter);
    // System.out.println(a); // 1
    // System.out.println(b); // 4
    // System.out.println(c); // null

// 3)
// Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. 
// Feel free to use the indexOf method of the String class.
    // StringManipulator manipulator = new StringManipulator();
    // String word = "Hello";
    // String subString = "llo";
    // String notSubString = "world";
    // Integer a = manipulator.getIndexOrNull(word, subString);
    // Integer b = manipulator.getIndexOrNull(word, notSubString);
    // System.out.println(a); // 2
    // System.out.println(b); // null

// 4)
// String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, 
// and concatenate that with the second string input to our method. 
// Feel free to use the substring method of the String class.
    // StringManipulator manipulator = new StringManipulator();
    // String word = manipulator.concatSubstring("Hello", 1, 2, "world");
    // System.out.println(word); // eworld

}