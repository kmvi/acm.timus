package t1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1100 {
	
	private static int[][] _tmp;
	
	public static void sort(int[][] array, int lo, int hi)
	{
		if (lo >= hi)
            return;

        int mid = lo + (hi - lo) / 2;

        int j = partition(array, lo, hi);
        sort(array, lo, j - 1);
        sort(array, j + 1, hi);
	}
	
	public static int partition(int[][] array, int lo, int hi)
    {
        int i = lo, j = hi + 1, m = (i + j) / 2;

        if ((array[lo][1] > array[m][1] && array[m][1] > array[hi][1]) ||
            (array[lo][1] < array[m][1] && array[m][1] > array[hi][1])) {
            int[] tmp = array[lo];
            array[lo] = array[m];
            array[m] = tmp;
        }  else if ((array[hi][1] < array[m][1] && array[hi][1] > array[lo][1]) ||
                    (array[hi][1] > array[m][1] && array[hi][1] > array[lo][1])) {
            int[] tmp = array[lo];
            array[lo] = array[hi];
            array[hi] = tmp;
        }

        int v = array[lo][1];
        int v0 = array[lo][0];

        while (true) {
            while (array[++i][1] > v) {
                if (i == hi)
                    break;
            }

            while (array[--j][1] < v);

            if (i >= j)
                break;

            int[] tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }

        //int[] tmp1 = array[lo];
        array[lo][0] = array[j][0];
        array[lo][1] = array[j][1];
        array[j][0] = v0;
        array[j][1] = v;

        return j;
    }

	
	public static void merge(int[][] array, int lo, int mid, int hi)
	{
		for (int v = 0; v < array.length; ++v) {
			_tmp[v][0] = array[v][0];
			_tmp[v][1] = array[v][1];
		}
		
		int i = lo, j = mid + 1;

        // копируем элементы из временного массива обратно
        for (int k = lo; k <= hi; ++k) {
            if (i > mid) { // закончились элементы в левой части, копируем из правой
                array[k][0] = _tmp[j][0];
                array[k][1] = _tmp[j++][1];
            } else if (j > hi) { // закончились элементы в правой части, копируем из левой
            	array[k][0] = _tmp[i][0];
                array[k][1] = _tmp[i++][1];
            } else if (_tmp[i][1] < _tmp[j][1]) { // слева больше, чем справа, берем справа
                array[k][0] = _tmp[j][0];
                array[k][1] = _tmp[j++][1];
            } else { // справа больше, чем слева, берем слева
                array[k][0] = _tmp[i][0];
                array[k][1] = _tmp[i++][1];
            }
        }
	}

	public static void main(String[] args) throws IOException {
		//try {
			StreamTokenizer inFile = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			inFile.nextToken();
			int n = (int)inFile.nval;
			int[][] array = new int[n][2];
			_tmp = new int[n][2];
			
			for (int i = 0; i < n; ++i) {
				inFile.nextToken();
				array[i][0] = (int)inFile.nval;
				inFile.nextToken();
				array[i][1] = (int)inFile.nval;
			}
			
			for (int size = 1; size < array.length; size += size) {
                // lo - нижнаяя граница текущего подмассива
                // mid - последний элемент текущего подмассива
                // hi - верхняя граница соседнего (справа) подмассива
                for (int lo = 0; lo < array.length - size; lo += 2 * size) {
                    merge(array, lo, lo + size - 1, Math.min(lo + 2 * size - 1, array.length - 1));
                }
            }
			
			for (int i = 0; i < n; ++i) {
				outFile.printf("%d %d\n", array[i][0], array[i][1]);
			}
			
			//inFile.close();
			outFile.flush();
		//} catch (Exception ex) {}
	}

}
