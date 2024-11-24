import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class RecourseForMatrix {
    //StreamTokenizer быстрый считыватель данных
    StreamTokenizer streamTokenizer;
    //Массив данных
    int[][] matrix;
    //Матрица динамического программирования (Dynamic programing - dp). Записываем сюда посчитанные результаты.
    int[][] dp;
    //Матрица смежности. Adjacency matrix. Откуда куда можно идти.
    boolean[][] adjMatrix;
    //Матрица состояния. Statement matrix. Посчитана ли данная ячейка уже или нет.
    boolean[][] sm;
    int counter, maxSumm, minSumm, doomy;
    String s;


    public static void main(String[] args) throws IOException {
        new RecourseForMatrix().solution();
    }


    void solution() throws IOException {
        //Инициализация массивов.  Определяем размеры массивов
        matrix = new int[3][3];
        dp = new int[3][3];
        sm = new boolean[3][3];
        //Т.к. из каждой вершины теоретически мы можем пойти в каждую, то размер матрицы примем соответствующим (Из каждой из 9-ти вершин можем пойти в каждую из остальных)
        adjMatrix = new boolean[9][9];
        streamTokenizer = new StreamTokenizer(new FileReader("input.txt"));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            Arrays.fill(adjMatrix[i], true);
        }
        adjMatrix[0][1] = false;
        adjMatrix[1][0] = false;
        dp[0][0] = matrix[0][0];
        sm[0][0] = true;
        run();
    }


    void run() {
        System.out.println(dp(2, 2));
        System.out.println(counter(2,2));
        System.out.println(counterAM(2,2));
    }


    //Собираем максимум по пути до конца матрицы
    int dp(int x, int y) {
        if (x == 0 && y == 0)
            return dp[x][y];
        if (x == -1 || y == -1)
            return Integer.MIN_VALUE;
        int a = dp(x - 1, y);
        int b = dp(x, y - 1);
        dp[x][y] = matrix[x][y] + Math.max(a, b);
        return dp[x][y];
    }
    //Сколько всего вариантов пути. Если такой путь существует, то к счетчику прибавляем единицу.
    int counter(int x, int y){
        if (x == 0 && y == 0)
            return 1;
        if (x == -1 || y == -1)
            return 0;
        return counter(x - 1, y) + counter(x, y - 1);
    }
    int counterAM(int x, int y){
        if (x == 0 && y == 0)
            return 1;
        int count = 0;
        //Есть ли путь наверх
        boolean checkWayUp;
        if (x == 0)
            checkWayUp = false;
        else
            checkWayUp = adjMatrix[cellNumber(x,y)][cellNumber(x - 1, y)];
        //Есть ли путь налево
        boolean checkWayLeft;
        if (y == 0)
            checkWayLeft = false;
        else
            checkWayLeft = adjMatrix[cellNumber(x ,y)][cellNumber(x, y - 1)];
        //Тупик
        if (!checkWayUp && !checkWayLeft){
            return 0;
        }
        //Есть путь только вверх
        if (checkWayUp && !checkWayLeft){
            count = counterAM(x - 1, y);
            return count;
        }
        //Есть путь только налево
        if (!checkWayUp && checkWayLeft){
            count = counterAM(x, y - 1);
            return count;
        }
        //Пусть свободен по обеим дорогам
        count = counterAM(x - 1, y) + counterAM(x, y - 1);
        return count;




    }
    //Метод возвращает номер ячейки, где x и y - координаты в матрице, а z - ширина по горизонтальной координате (не забываем, что это y)
    int cellNumber(int x, int y) {
        int z = matrix.length;
        return x * z + y;
    }


    int nextInt() throws IOException {
        streamTokenizer.nextToken();
        return (int) streamTokenizer.nval;
    }


    String nextString() throws IOException {
        streamTokenizer.nextToken();
        return streamTokenizer.sval;
    }
}



