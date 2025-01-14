package project22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TextAnalyzer2 {


    public static void main(String[] args) 
    {
        try {
            // Prompt the user to enter the filename to analyze
            String filename = getFilename();
            // Read the text from the specified file
            String text = getText(filename);
            // Analyze the text and print the results
            analyzeText(text);
             }
        catch (IOException e) 
             {
            // Handle IOException if file reading fails
            System.err.println("Error: " + e.getMessage());
            }
    }

    // Method to prompt the user to enter the filename
    public static String getFilename() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to analyze: ");
        return scanner.nextLine();
    }

    // Method to read text from a file
    public static String getText(String filename) throws IOException 
    {
        // Read the entire content of the file as a string
        return Files.readString(Paths.get(filename));
    }

    // Method to analyze the text and print the results
    public static void analyzeText(String text) 
    {
        // 1. Count the number of characters in the text
        int numChars = countCharacters(text);
        System.out.println("Number of characters in the text: " + numChars);

        // 2. Analyze the frequency of each character in the text
        analyzeCharacterFrequency(text);

        // 3. Count the number of words in the text
        int numWords = countWords(text);
        System.out.println("Number of words in the text: " + numWords);

        // 4. Analyze the lengths of words in the text
        analyzeWordLengths(text);

        // 5. Analyze the frequency of each individual word (uni-grams) in the text
        analyzeUnigrams(text);

        // 6. Analyze the frequency of each pair of consecutive words (bi-grams) in the text
        analyzeBigrams(text);
    }

    // Method to count the number of characters in the text
    public static int countCharacters(String text) 
    {
        // Simply return the length of the text string
        return text.length();
    }

    // Method to analyze the frequency of each character in the text
    public static void analyzeCharacterFrequency(String text) 
    {
        // Create a map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();
        // Convert text to lowercase and iterate over each character
        for (char c : text.toLowerCase().toCharArray()) 
        {
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') 
            {
                // Update the frequency of the character
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Sort the character frequencies in descending order
        List<Map.Entry<Character, Integer>> sortedFrequency = new ArrayList<>(charFrequency.entrySet());
        sortedFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print the sorted character frequencies
        System.out.println("Relative frequency of letters in the text (descending order):");
        for (Map.Entry<Character, Integer> entry : sortedFrequency)
        {
            System.out.println(entry.getKey() + " repeats " + entry.getValue() + " times.");
        }
    }

    // Method to count the number of words in the text
    public static int countWords(String text)
    {
        // Split the text into words using whitespace as delimiter and return the count
        return text.split("\\s+").length;
    }

    // Method to analyze the lengths of words in the text
    public static void analyzeWordLengths(String text) 
    {
        // Split the text into words
        String[] words = text.split("\\s+");
        // Initialize variables to track the maximum and minimum word lengths
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        // Iterate over each word
        for (String word : words) 
        {
            // Get the length of the current word
            int length = word.length();
            // Update maxLength if necessary
            if (length > maxLength) 
            {
                maxLength = length;
            }
            // Update minLength if necessary
            if (length < minLength)
            {
                minLength = length;
            }
        }

        // Print the longest and shortest word lengths
        System.out.println("Longest word length: " + maxLength);
        System.out.println("Shortest word length: " + minLength);
    }

    // Method to analyze the frequency of each individual word (uni-grams) in the text
    public static void analyzeUnigrams(String text) 
    {
        // Create a map to store word frequencies
        Map<String, Integer> unigramFrequency = new HashMap<>();
        // Split the text into words
        String[] words = text.split("\\s+");
        // Iterate over each word
        for (String word : words) 
        {
            // Update the frequency of the word
            unigramFrequency.put(word, unigramFrequency.getOrDefault(word, 0) + 1);
        }

        // Sort the word frequencies in descending order
        List<Map.Entry<String, Integer>> sortedFrequency = new ArrayList<>(unigramFrequency.entrySet());
        sortedFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print the top 20 most frequent words
        System.out.println("The twenty most repeated uni-grams (single words) in the text (descending order):");
        for (int i = 0; i < 20 && i < sortedFrequency.size(); i++) 
        {
            Map.Entry<String, Integer> entry = sortedFrequency.get(i);
            System.out.println(entry.getKey() + " repeats " + entry.getValue() + " times.");
        }
    }

    // Method to analyze the frequency of each pair of consecutive words (bi-grams) in the text
    public static void analyzeBigrams(String text) 
    {
        // Create a map to store bigram frequencies
        Map<String, Integer> bigramFrequency = new HashMap<>();
        // Split the text into words
        String[] words = text.split("\\s+");
        // Iterate over each word (up to the second to last word)
        for (int i = 0; i < words.length - 1; i++)
        {
            // Form the bigram using the current word and the next word
            String bigram = words[i] + " " + words[i + 1];
            // Update the frequency of the bigram
            bigramFrequency.put(bigram, bigramFrequency.getOrDefault(bigram, 0) + 1);
        }

        // Sort the bigram frequencies in descending order
        List<Map.Entry<String, Integer>> sortedFrequency = new ArrayList<>(bigramFrequency.entrySet());
        sortedFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print the top 20 most frequent bigrams
        System.out.println("The twenty most repeated bi-grams (pairs of words) in the text (descending order):");
        for (int i = 0; i < 20 && i < sortedFrequency.size(); i++) 
        {
            Map.Entry<String, Integer> entry = sortedFrequency.get(i);
            System.out.println(entry.getKey() + " repeats " + entry.getValue() + " times.");
        }
    }
}
