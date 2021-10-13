public class Shellsort {
    public static void main(String[] args) {
        int[] arr = {1,2,93,23,4,5,6,89,9,7,77};
        shell(arr);
        System.out.print("Your sorted array: ");
        for(int i = 0; i< arr.length-1; i++){
            System.out.print(arr[i]+",");
        }

    }
    public static void shell(int[] a) {
        int increment = a.length / 2;
        for (int c = 0; increment > 0; c++) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                int tmp = a[i];
                while (j >= increment && a[j - increment] > tmp) {
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = tmp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
	    }
    }
}
