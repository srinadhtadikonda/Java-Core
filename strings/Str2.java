String str = "State Bank of India";
int count = 0;

try {
    while (true) {
        str.charAt(count);  // throws exception when index is out of range
        count++;
    }
} catch (Exception e) {
    // end of string reached
}

System.out.println("Length = " + count);
