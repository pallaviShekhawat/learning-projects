package dsa;

/*public class FindCharIndex {
    public static void main(String[] args) {
        String str = "Pallavi";
         int index = str.indexOf("v");
        System.out.println("Index value of 'V' is : " +index);
    }
}*/

//Time complexity : o(n)
// space : o(1)

public class FindCharIndex{
    public static void main(String[] args) {
        String str = "pallavi";
        char target = 'i';
        int index = -1;

        for (int i=0; i<str.length() ; i++)
        {
            if(str.charAt(i) == target){
                index = i;

                break;
            }
        }
        System.out.println("Index of '" + target + "' is: " + index);
    }}


/*
indexOF(): kisi string ke ander character ka index value deta h ;
charAt(index) : string ke andar se ek single character nikaal ke deta hai*/
