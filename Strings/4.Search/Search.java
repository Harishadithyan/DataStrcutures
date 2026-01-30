class Search{
    public static void main(String[] args){
        String str="harishadithyan";
        char ch='i';
        for (int i=0;i<str.length();i++){
            if (ch==str.charAt(i)){
                System.out.println("Matched "+ i);
                break;
            }
        }
    }
}