package org.example.javaAdvanced.io_and_Strings.task3;

public class MyClass_task3 {
    private String text = "We use both first and third-party cookies to personalise web content, analyse visits to our websites and tailor advertisements.";

    public MyClass_task3(String arg) {
        /* version 1*/
        System.out.println(arg.substring(0, arg.length() / 2));
        System.out.println(arg.substring(arg.length() / 2));
        System.out.println();

        /* version 2*/
        String[] arrText = arg.split(" ");
        String text = "";
        for (int i = 0; i < arrText.length / 2; i++) {
            text += arrText[i] + " ";
        }
        System.out.println("text_1 = " + text);
        text = "";
        for (int i = arrText.length / 2; i < arrText.length; i++) {
            text += arrText[i] + " ";
        }
        System.out.println("text_2 = " + text);

    }
}


