public class linearkampus {
    public static void main(String[] args) {
        int[] arr = {75,3,6,34,3,43};  
        int key = 34;
        long startTime = System.nanoTime();
        int hasilCari = linearSearch(arr,key);
        long endTime = System.nanoTime();
        long subTime = endTime - startTime;

        if (hasilCari == -1) {
            System.out.println("array tidak ditemukan");
        } else {
            System.out.println("array di temukan di index = "+ hasilCari);
            
        }
        System.out.println(subTime);
    }

    private static int linearSearch(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
