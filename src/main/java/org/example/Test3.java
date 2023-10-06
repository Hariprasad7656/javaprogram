package org.example;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {

        List<Employe> employesdata=Arrays.asList(
                new Employe("arun",66,634.0),
                new Employe("meghana",11,460.0),
                new Employe("suresh",46,256.0)
        );

        employesdata.stream().sorted(Comparator.comparing(Employe::getId)).forEach(System.out::println);
       // reverse("hello world");
        int[] ars={7,9,0,1,3,8,3,11,1};
       // sorting(ars);
       // twoPointerTechnique(ars);
      //  occurence("apple");
       // palindrome("apple");
        checkSubstringIsPalindromeOrNot("shdvhshracarh");

    }

    public static void reverse(String str){
        char[] ch=str.toCharArray();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }

    public static void twoPointerTechnique(int[] arr){

        Arrays.sort(arr);
        int left=0;
        int right= arr.length-1;
        int index=0;
        int temp[] = new int[arr.length];

        while(left<=right){
            if(index%2==0){
                temp[index]=arr[right];
                right--;
                index++;
            }else{
                temp[index]=arr[left];
                left++;
                index++;
            }
        }

        for(int temps:temp){
            System.out.print(temps+" ");
        }

    }

    public static void sorting(int[] arr){

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        for(int ars:arr){
            System.out.print(ars+" ");
        }
    }

    public static  void occurence(String str){
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> charCount= new HashMap<>();

        for(char c: ch){
            int count=charCount.getOrDefault(c,0);
            count++;
            charCount.put(c,count);
            //charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> mps:charCount.entrySet()){
            System.out.println(mps.getKey()+" occured "+mps.getValue()+" times");
        }
    }

    public static boolean palindrome(String str){

        boolean flag=true;
        int left=0;
        int right=str.length()-1;

        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false;
                break;
            }else
                left++;
            right--;
        }

        return flag;
        /*if(flag){
            System.out.println("it's palindrome "+str);
        }else
            System.out.println("not palindrome");*/
    }

    public static void checkSubstringIsPalindromeOrNot(String str){
        String longestSunstring="";
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                String subString= str.substring(i,j);//apple
                if(palindrome(subString) && subString.length()>longestSunstring.length()){
                    longestSunstring=subString;
                }
            }
        }
        if(longestSunstring!=null){
            System.out.println(" longest substring is "+longestSunstring);
        }else
            System.out.println("it is empty or null");
    }
}
