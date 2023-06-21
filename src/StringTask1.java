import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringTask1 {

	public static void main(String[] args) {
		String paragraph = "Java is Open Source which means its available free of cost. Java is simple and so easy to learn. Java has a large vibrant community. Java has powerful development tools.";
        
		System.out.println(paragraph);
		
		String words[]= paragraph.split(" ");
		System.out.println("Total no. of words in paragraph: " + words.length);
		
		/*int count =1;
		for(int i=0; i<paragraph.length()-1; i++)
		{
			if((paragraph.charAt(i)==' ') && (paragraph.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Total no. of words in paragraph: "+ count);*/
		
		System.out.println("-----Unique words--------");
		HashSet<String>uniqueword = new HashSet<String>(Arrays.asList(words));
		
		for(String word: uniqueword)
		{
			System.out.println("Unique word: "+ word);
		}
	
		System.out.println("--------Occurence of each unique word-----");
		HashMap<String, Integer>map = new HashMap<>();
		//String words[]=paragraph.split(" ");
		
		for(String word: words)
		{
			if(map.containsKey(word))
			{
			map.put(word, map.get(word)+1);
			}else
			{
				map.put(word, 1);
			}
		}
		System.out.println("Words of occurence: " +map);	
		
		System.out.println("-----Reverse of each word-------");
		String reverseword = "";
	    for(String word: words)
	    {
	    	StringBuilder sb= new StringBuilder(word);
	    	sb.reverse();
	    	reverseword=reverseword+sb.toString()+" ";
	    }
	    System.out.println("Reverse of each word: " +reverseword);
	}
	
	}

