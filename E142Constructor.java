package org.example.e142;

class SyntaxTechnologies {
    // Instance variables
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    // Non-argument constructor
    public SyntaxTechnologies() {
        // Initialize with default values
        this.schoolName = null;
        this.batch = 0;
        this.year = 0;
        this.lastDayOfClass = null;
    }

    // Parameterized constructor
    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    // Display method
    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}


public class E142Constructor {
    public static void main(String[] args) {
        // Create object using non-argument constructor
        SyntaxTechnologies tech1 = new SyntaxTechnologies();
        tech1.display(); // Output: null 0 0 null

        // Create object using parameterized constructor
        SyntaxTechnologies tech2 = new SyntaxTechnologies("Syntax", 6, 2020, "07302020");
        tech2.display(); // Output: Syntax 6 2020 07302020
    }
}
