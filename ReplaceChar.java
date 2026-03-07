class ReplaceChar{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ayush");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == 'h'){
            sb.setCharAt(i, 'Y');}}
System.out.println(sb);
        }}
    
