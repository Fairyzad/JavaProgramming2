package day11_Switch_Scanner;

/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */
public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {// 5 options
            if (browserName == "chrome") {
                result = " Chrome Browser is selected";

            } else if (browserName == "firefox") {
                result = "firefox is selected";

            } else if (browserName == "opera") {
                result = "Opera is selected";

            } else if (browserName == "safari") {
            } else {
                result = "Edge Browser is selected";
            }


        } else { //pre-condition result
            result = "Invalid Browser Name";

        }

        System.out.println(result);

    }
}
