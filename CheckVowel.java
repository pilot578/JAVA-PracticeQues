class CheckVowel {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("AyUshh");
        int count = 0;
        for(int i=0;i<sb.length();i++){
            char chh = Character.toLowerCase(sb.charAt(i));
if(chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh=='u'){
count++;
}
        }
        System.out.println("Total Vowels are: " + count); 
    }
    
}
