public class SstringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Yashika!");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 3);
        
        System.out.println(sb);
    }
}

