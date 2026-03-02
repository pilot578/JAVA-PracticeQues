class ReplaceChar{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == 'l'){
            sb.setCharAt(i, 'x');}}
System.out.println(sb);
        }}
    
