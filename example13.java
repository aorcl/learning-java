class Main13 {
    public static void main(String[] args) {
        boolean b1 = false; 
        boolean b2 = true;
        boolean b3 = false;
        System.out.println((b1 && b2) ? b1 : (b2 || b3) ? b2 : b3);
    }
}