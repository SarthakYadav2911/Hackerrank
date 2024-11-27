import java.util.Scanner;
public class anagram 
{
    public static void main(String []args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first string ");
        String str=sc.nextLine();
        String s1=str.toLowerCase();
        System.out.println("enter the second string");
        String str1=sc.nextLine();
        String s2=str1.toLowerCase();
        int n =str.length();
        int arr[]=new int[26];
        int arr1[]=new int [26];
        int x;int i;
        int m= str1.length();
        if (n!=m)
        {
            System.out.println("not anagram");
        }
        else
        {
            for( i=0;i<n;i++)
            {
                  x=s1.charAt(i)- 'a';
                  arr[x]=arr[x]+1;
                  
            }
            
            for(i=0;i<n;i++)
            {
                x=s2.charAt(i)-'a';
                arr1[x]=arr1[x]+1;
               
            }
            
            
        }
         for(i=0;i<26;i++)
            {
                if(arr[i]==arr1[i])
                {
                continue;
                }
                else
                {
                    System.out.println("Not Anagrams");
                    break;

                }
        
            }
         if(i==26)
         {
            System.out.println("Anagrams");
         }
    }
        }



    
    

