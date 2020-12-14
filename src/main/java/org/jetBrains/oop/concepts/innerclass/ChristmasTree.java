package org.jetBrains.oop.concepts.innerclass;

class ChristmasTree {

    private String color;
    public ChristmasTree(String color) {
        this.color = color;
    }
    public void putTreeTopper(String color){
        TreeTopper treeTopper = new TreeTopper(color);
        //ChristmasTree christmasTree = new ChristmasTree(this.color);
        //ChristmasTree.TreeTopper spark = christmasTree.new TreeTopper(color);
       // spark.sparkle();
        treeTopper.sparkle(this.color);
    }

    class TreeTopper {

        private String color;
        public TreeTopper(String color) {
            this.color = color;
        }
        public void sparkle(String color){
            System.out.println("Sparkling " + this.color + " tree topper looks stunning with " + color + " Christmas tree!");
        }
    }
}

class CreateHoliday {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}

