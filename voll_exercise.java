public class voll_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array 1 dimensi
        String baris1[] = {"usman", "aep", "arya", "lutfi", "iskandar"};
        String baris2[] = {"rahul", "galang", "lucky", "faqih", "shihab", "anugrah"};
        String baris3[] = {"ricky", "putra", "bahri", "sakha"};
        
        
        //array 2 dimensi
        String posisi[][] = new String[3][6];
        posisi[0][0] = "usman";
        posisi[0][1] = "aep";
        posisi[0][2] = "arya";
        posisi[0][3] = "lutfi";
        posisi[0][4] = "iskandar";
        
        posisi[1][0] = "rahul";
        posisi[1][1] = "galang";
        posisi[1][2] = "lucky";
        posisi[1][3] = "faqih";
        posisi[1][4] = "shihab";
        posisi[1][5] = "triadi";
        
        posisi[2][0] = "ricky";
        posisi[2][1] = "putra";
        posisi[2][2] = "bahri";
        posisi[2][3] = "sakha";
        
        System.out.println(baris1[1] + " " + posisi[0][1]);
                
                
    }
    
}
