public class MergeVetores {
    public static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length) C[k++] = A[i++];
        while (j < B.length) C[k++] = B[j++];

        return C;
    }

    public static void main(String[] args) {
        int[] A = {12, 35, 52, 64};
        int[] B = {5, 15, 23, 55, 75};

        int[] C = merge(A, B);

        System.out.print("Vetor C (Merge): ");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}