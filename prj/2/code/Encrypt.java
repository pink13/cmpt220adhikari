import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Encrypt {
 
 public int[] key;
 static String str;
 static String data;
 public String cipherPath;
 public String decipheredPath;
 public String original1;
 public int[] cipher;
 public int[] c;
 public int[] d;
 public int[] plain1;
 public int[] plain2;
 public int[] ascii;
 public int[] plain;
 static char[] arrow;
 char[] original;

 /**
  * This function starts the encryption process
  * @param ascii contains ascii values of all the characters from the input file
  */
 public void encryptionLogic(int[] ascii) {
  c = new int[ascii.length / 2];
  d = new int[ascii.length / 2];
  if (ascii.length % 2 == 0) {
   for (int k = 0; k < ascii.length / 2; k++) {
    c[k] = ascii[k];
    c[k] = c[k] * (k + 2);
   }
   for (int f = 0; f < ascii.length / 2; f++) {
    d[f] = ascii[ascii.length / 2 + f];
    d[f] = d[f] * (f + 3);
   }
  }
  cipheredText(c, d);
 }

 /**
  * This function prepares the final cipher text(encrypted Text) and decryption key and writes it on to the persistent storage
  * @param c
  * @param d
  */
 public void cipheredText(int[] c, int[] d) {
  try {

   cipher = new int[c.length + d.length];

   for (int q = 0, l = 0, p = 0; q < c.length + d.length; q++) {

    if (q % 2 == 0 || q == 0) {
     cipher[q] = c[l];
     l++;
    }

    else {
     cipher[q] = d[p];
     p++;
    }
   }

   System.out
     .println("Enter The Location To Save The Encrypted Cipher Text And The Encryption Key");
   BufferedReader br2 = new BufferedReader(new InputStreamReader(
     System.in));
   cipherPath = br2.readLine();
   FileOutputStream file2 = new FileOutputStream(cipherPath
     + "cipher.ser");
   ObjectOutputStream obj2 = new ObjectOutputStream(file2);
   obj2.writeObject(cipher);
   obj2.close();
   System.out
     .println("Your files have been saved in:- "
       + cipherPath);

   key = new int[5];
   key[0] = cipher[0] + cipher[cipher.length - 2];
   key[1] = d[0];
   key[2] = d[0] + c[0];
   key[3] = c[c.length - 1];
   key[4] = (cipher.length - 1);

   FileOutputStream file3 = new FileOutputStream(cipherPath
     + "key.ser");
   ObjectOutputStream obj3 = new ObjectOutputStream(file3);
   obj3.writeObject(key);
   obj3.close();

  } catch (Exception e) {
   System.out.println("\nexception caught");
  }
 }
 
/**
 * 
 * @param cipher is the array containing cipher text
 * @param key is the decryption key
 */
 public void decryptionLogic(int[] cipher, int[] key) {
  try {
   plain1 = new int[cipher.length / 2];
   plain2 = new int[cipher.length / 2];

   if ((key[0] == (cipher[0] + cipher[cipher.length - 2]))
     && (key[4] == cipher.length - 1)
     && (key[2] == (cipher[0] + cipher[1]))
     && (key[1] == cipher[1])
     && (key[3] == cipher[cipher.length - 2])) {
    for (int p = 0, a = 0, z = 0; p < cipher.length; p++) {

     if (p % 2 == 0 || p == 0) {
      plain1[a] = cipher[p];
      plain1[a] = plain1[a] / (a + 2);
      a++;
     }

     else {
      plain2[z] = cipher[p];
      plain2[z] = plain2[z] / (z + 3);
      z++;
     }

    }
   }

   else {
    System.out.println("decryption key is not valid");
   }

   plain = new int[plain1.length + plain2.length];
   for (int e = 0, b = 0; e < (plain1.length + plain2.length); e++) {
    if (e < plain1.length) {
     plain[e] = plain1[e];
    } else {
     plain[e] = plain2[b];
     b++;
    }
   }
   decryptedWriter(plain);
  } catch (Exception u) {
   u.printStackTrace();
  }
 }

 /**
  * This function will write the original text to the text file after decryption and store the file at user specified location
  * @param plain
  * @return
  */
 public char[] decryptedWriter(int[] plain) {
  try {
   if (plain[plain.length - 1] == '?') {
    original = new char[plain.length - 1];
    System.out.println();

    for (int o = 0; o < (plain.length - 1); o++) {
     original[o] = (char) plain[o];
    }
   } else {
    original = new char[plain.length];
    System.out.println("\n");

    for (int o = 0; o < plain.length; o++) {
     original[o] = (char) plain[o];
    }
   }

   original1 = new String(original);
   System.out
     .println("Enter the location to store decrypted file \n");

   BufferedReader br4 = new BufferedReader(new InputStreamReader(
     System.in));
   decipheredPath = br4.readLine();
   File file4 = new File(decipheredPath + "decryptedText.txt");
   FileWriter fw = new FileWriter(file4);
   PrintWriter pw = new PrintWriter(fw);
   pw.write(original1);
   System.out.println("Your decrpyted file is stored at:- "
     + decipheredPath);
   pw.flush();
   pw.close();
  } catch (Exception q) {
   q.printStackTrace();
  }
  return original;
 }
/**
 * initializing an integer array with the ascii values of the characters from @arrow
 * @param arrow
 */
 public void asciiarray(char[] arrow) {
  int j;
  ascii = new int[arrow.length];
  System.out.print("\n");
  for (j = 0; j < arrow.length; j++) {
   ascii[j] = arrow[j];
  }
  encryptionLogic(ascii);
 }
/**
 * 
 * Here '?' is added at the last index of string if its length is not even to make the algorithm work
 * and initializing a character array with characters from @data
 * @param data contains whole input file data
 */
 public void initial(String data) {
  int i;
  
  if (data.length() % 2 != 0) {
   arrow = new char[data.length() + 1];
   arrow[data.length()] = '?';
  } else {
   arrow = new char[data.length()];
  }
  for (i = 0; i < data.length(); i++) {
   arrow[i] = data.charAt(i);
  }
 }

 /**
  * This function will take the file to be encrypted and store its whole content in a single String object.
  * @return
  */
 public String inputData() {
  System.out
    .print("Please Enter The Address Of the File To Be Encrypted\n");
  try {
   BufferedReader br6 = new BufferedReader(new InputStreamReader(
     System.in));
   str = br6.readLine();
   String[] fileExtension=str.split("\\.");
   if(!fileExtension[1].equals("txt")){
    System.out.println("File to be encrypted is not a text file ...Plese try again");
   }
   
   File file = new File(str);
   FileReader file1 = new FileReader(file);
   BufferedReader br = new BufferedReader(file1);
   String line = null;
   StringBuilder sb = new StringBuilder();
   String is = System.getProperty("line.separator");
   while ((line = br.readLine()) != null) {
    sb.append(line);
    sb.append(is);
   }
   data = sb.toString();
   br.close();

  } catch (Exception e) {
   e.printStackTrace();
  }
  return data;
 }

 public static void main(String args[]) {
  int choice;

  Encrypt ko = new Encrypt();
  try {
   BufferedReader br1 = new BufferedReader(new InputStreamReader(
     System.in));
   System.out
     .print("Enter 1 for encryption and 2 for decryption \n");
   choice = Integer.parseInt(br1.readLine());

   switch (choice) {
   case 1:
    ko.inputData();
    ko.initial(data);
    ko.asciiarray(arrow);
    break;

   case 2:
    String encryptedPath;
    String keyPath;
    BufferedReader br5 = new BufferedReader(new InputStreamReader(
      System.in));
    System.out
      .println("please enter the location of the cipher text\n");
    encryptedPath = br5.readLine();
    System.out
      .println("please enter the location of the decryption key\n");
    keyPath = br5.readLine();

    FileInputStream file5 = new FileInputStream(encryptedPath);
    ObjectInputStream read = new ObjectInputStream(file5);
    int[] cipher1 = (int[]) read.readObject();

    FileInputStream file6 = new FileInputStream(keyPath);
    ObjectInputStream read1 = new ObjectInputStream(file6);
    int[] key1 = (int[]) read1.readObject();
    ko.decryptionLogic(cipher1, key1);
    break;

   default:
    break;
   }
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}
       
 