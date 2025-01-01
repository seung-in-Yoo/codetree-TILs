public class Main {
    public static void main(String[] args) {
        String[] inputs = new String[4];

        inputs[0] = "Orange";
        inputs[1] = "Black";
        inputs[2] = "Purple";
        inputs[3] = "White";
        
        for (int i = inputs.length - 1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }
    }
}
